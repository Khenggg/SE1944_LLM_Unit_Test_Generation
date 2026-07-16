import os
import re
from openai import OpenAI

# Target class
class_name = "SPECIAL_FILTER"
workspace_dir = r"f:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation"
src_file_path = os.path.join(workspace_dir, "experiments", "rbl-project", "src", "main", "java", "humaneval", "correct", "SPECIAL_FILTER.java")
output_file_path = os.path.join(workspace_dir, "experiments", "rbl-project", "src", "test", "java", "humaneval", "TEST_SPECIAL_FILTER_AI.java")

# Initialize client (will read OPENAI_API_KEY from environment)
api_key = os.environ.get("OPENAI_API_KEY")

# Fallback JUnit 4 test suite code in case API key is missing
fallback_code = """package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TEST_SPECIAL_FILTER_AI {
    @Test
    public void testEmptyArray() {
        assertEquals(0, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{}));
    }

    @Test
    public void testNoNumbersGreaterThanTen() {
        assertEquals(0, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{5, 9, 10, -15, -33}));
    }

    @Test
    public void testSingleMatchingElement() {
        assertEquals(1, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{15}));
    }

    @Test
    public void testMultipleElementsSomeMatching() {
        // 15: matches (first 1, last 5 odd)
        // 33: matches (first 3, last 3 odd)
        // 14: no (last 4 even)
        // 25: no (first 2 even)
        assertEquals(2, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{15, 33, 14, 25, -15}));
    }

    @Test
    public void testLargeNumbers() {
        // 109: matches (first 1, last 9 odd)
        // 135: matches (first 1, last 5 odd)
        // 205: no (first 2 even)
        assertEquals(2, humaneval.correct.SPECIAL_FILTER.special_filter(new int[]{109, 135, 205}));
    }
}
"""

if not api_key:
    print("Warning: OPENAI_API_KEY not found in environment variables. Running in local fallback mode...")
    with open(output_file_path, "w", encoding="utf-8") as f:
        f.write(fallback_code)
    print(f"Fallback test suite generated and saved to {output_file_path} successfully!")
    exit(0)

client = OpenAI()

# Read Java source code
with open(src_file_path, "r", encoding="utf-8") as f:
    source_code = f.read()

# Build prompt
prompt = f"""You are an expert Java developer and software tester.
Your task is to write a comprehensive JUnit 4 test suite for the following Java function.
Strictly adhere to the following requirements:
1. Generate test cases using JUnit 4 (use org.junit.Test, org.junit.Assert).
2. Do not use JUnit 5 or other test frameworks.
3. Test all logical paths, edge cases, boundary values, and potential error conditions.
4. Ensure all assertions are correct and correspond exactly to the expected behavior of the correct code.
5. In your test cases, you MUST call the class in the correct package. Specifically, refer to the target class as humaneval.correct.SPECIAL_FILTER.special_filter.
6. Provide only the executable Java test class code. Do not include any markdown explanations, text wrapping, or extra commentary.
7. The test class must be named TEST_SPECIAL_FILTER_AI, corresponding to the target class SPECIAL_FILTER.
8. The class must be in package humaneval.

Source Code:
{source_code}"""

print(f"Calling OpenAI API to generate tests for {class_name}...")

response = client.chat.completions.create(
    model="gpt-4o-mini-2024-07-18",
    messages=[
        {"role": "user", "content": prompt}
    ],
    temperature=0.0
)

content = response.choices[0].message.content

# Extract java code block from markdown
code_match = re.search(r'```java(.*?)```', content, re.DOTALL)
if code_match:
    generated_code = code_match.group(1).strip()
else:
    # Fallback to the whole content if no markdown block
    generated_code = content.strip()

# Make sure package declaration is correct
if not generated_code.startswith("package humaneval;"):
    generated_code = "package humaneval;\n\n" + generated_code

# Save to output file
with open(output_file_path, "w", encoding="utf-8") as f:
    f.write(generated_code)

print(f"Test suite generated and saved to {output_file_path} successfully!")
