import os
import re
import shutil

# Paths
workspace_dir = r"f:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation"
raw_project_dir = os.path.join(workspace_dir, "human-eval-java")
correct_source_dir = os.path.join(raw_project_dir, "src", "main", "java", "humaneval", "correct")
buggy_source_dir = os.path.join(raw_project_dir, "src", "main", "java", "humaneval", "buggy")
test_source_dir = os.path.join(raw_project_dir, "src", "test", "java", "humaneval")

new_project_dir = os.path.join(workspace_dir, "rbl-project")
new_correct_dir = os.path.join(new_project_dir, "src", "main", "java", "humaneval", "correct")
new_buggy_dir = os.path.join(new_project_dir, "src", "main", "java", "humaneval", "buggy")
new_test_dir = os.path.join(new_project_dir, "src", "test", "java", "humaneval")

# 1. Analyze CC for all Java files in the correct source directory
files = [f for f in os.listdir(correct_source_dir) if f.endswith(".java")]
results = []

for filename in files:
    file_path = os.path.join(correct_source_dir, filename)
    with open(file_path, "r", encoding="utf-8") as f:
        content = f.read()
    
    # Strip comments
    content_clean = re.sub(r'//.*', '', content)
    content_clean = re.sub(r'/\*.*?\*/', '', content_clean, flags=re.DOTALL)
    content_clean = re.sub(r'".*?"', '""', content_clean)
    
    # Count decision points
    ifs = len(re.findall(r'\bif\b', content_clean))
    fors = len(re.findall(r'\bfor\b', content_clean))
    whiles = len(re.findall(r'\bwhile\b', content_clean))
    cases = len(re.findall(r'\bcase\b', content_clean))
    catches = len(re.findall(r'\bcatch\b', content_clean))
    ands = len(re.findall(r'&&', content_clean))
    ors = len(re.findall(r'\|\|', content_clean))
    
    cc = 1 + ifs + fors + whiles + cases + catches + ands + ors
    results.append((filename, cc))

# Sort by CC descending, then by filename alphabetically
results.sort(key=lambda x: (x[1], x[0]), reverse=True)

# Select exactly 50 files
selected = results[:50]

print(f"Selected {len(selected)} classes for the experiment dataset (Top 50 by CC):")
for idx, (filename, cc) in enumerate(selected, 1):
    print(f"{idx:02d}. {filename:<35} | CC = {cc}")

# Create directories in the new project
os.makedirs(new_correct_dir, exist_ok=True)
os.makedirs(new_buggy_dir, exist_ok=True)
os.makedirs(new_test_dir, exist_ok=True)

# Copy files
for filename, cc in selected:
    # Source and dest paths for correct version
    src_correct = os.path.join(correct_source_dir, filename)
    dst_correct = os.path.join(new_correct_dir, filename)
    shutil.copy2(src_correct, dst_correct)

    # Source and dest paths for buggy version
    src_buggy = os.path.join(buggy_source_dir, filename)
    dst_buggy = os.path.join(new_buggy_dir, filename)
    if os.path.exists(src_buggy):
        shutil.copy2(src_buggy, dst_buggy)
    else:
        print(f"Warning: Buggy version for {filename} not found!")

    # Source and dest paths for test file
    test_filename = f"TEST_{filename}"
    src_test = os.path.join(test_source_dir, test_filename)
    dst_test = os.path.join(new_test_dir, test_filename)
    if os.path.exists(src_test):
        with open(src_test, "r", encoding="utf-8") as f:
            test_content = f.read()
        # Redirect the tests to call humaneval.correct classes so they pass
        test_content_correct = test_content.replace("humaneval.buggy.", "humaneval.correct.")
        with open(dst_test, "w", encoding="utf-8") as f:
            f.write(test_content_correct)
    else:
        print(f"Warning: Test file {test_filename} not found!")

# 2. Write pom.xml for the new rbl-project
pom_content = """<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>humaneval</groupId>
  <artifactId>rbl-project</artifactId>
  <version>1.0</version>
  <name>rbl-project</name>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>javax.xml.bind</groupId>
      <artifactId>jaxb-api</artifactId>
      <version>2.3.1</version>
    </dependency>
    <dependency>
      <groupId>org.glassfish.jaxb</groupId>
      <artifactId>jaxb-runtime</artifactId>
      <version>2.3.1</version>
    </dependency>
    <dependency>
      <groupId>org.evosuite</groupId>
      <artifactId>evosuite-standalone-runtime</artifactId>
      <version>1.0.6</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <!-- Compiler plugin -->
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
      
      <!-- Surefire plugin for running tests -->
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.22.1</version>
        <configuration>
          <includes>
            <include>**/TEST_*.java</include>
            <include>**/*_ESTest.java</include>
            <include>**/*_GPTTest.java</include>
          </includes>
        </configuration>
      </plugin>

      <!-- JaCoCo plugin for coverage -->
      <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.7</version>
        <executions>
          <execution>
            <id>prepare-agent</id>
            <goals>
              <goal>prepare-agent</goal>
            </goals>
          </execution>
          <execution>
            <id>report</id>
            <phase>test</phase>
            <goals>
              <goal>report</goal>
            </goals>
          </execution>
        </executions>
      </plugin>

      <!-- PiTest plugin for mutation testing -->
      <plugin>
        <groupId>org.pitest</groupId>
        <artifactId>pitest-maven</artifactId>
        <version>1.7.4</version>
        <configuration>
          <targetClasses>
            <param>humaneval.correct.*</param>
          </targetClasses>
          <targetTests>
            <param>humaneval.*</param>
          </targetTests>
          <outputFormats>
            <value>XML</value>
            <value>HTML</value>
          </outputFormats>
        </configuration>
      </plugin>
      
      <!-- EvoSuite plugin -->
      <plugin>
        <groupId>org.evosuite.plugins</groupId>
        <artifactId>evosuite-maven-plugin</artifactId>
        <version>1.0.6</version>
        <executions>
          <execution>
            <id>prepare</id>
            <phase>process-test-classes</phase>
            <goals>
              <goal>prepare</goal>
            </goals>
          </execution>
        </executions>
        <configuration>
          <timeInMinutesPerClass>1</timeInMinutesPerClass>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
"""

new_pom_path = os.path.join(new_project_dir, "pom.xml")
with open(new_pom_path, "w", encoding="utf-8") as f:
    f.write(pom_content)

print(f"\nCreated Maven project in {new_project_dir} successfully!")
