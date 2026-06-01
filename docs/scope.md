# Scope

## Selected Languages and Tools

- Selected languages: Java and Python.
- Java unit test framework: JUnit 5.
- Java coverage tool: JaCoCo.
- Java mutation testing tool: PIT/PiTest.
- Java build tool: Maven.
- Python unit test framework: pytest.
- Python coverage tool: coverage.py with branch coverage enabled.
- Python mutation testing tool: mutmut or Cosmic Ray.

## Dataset Scope

- Target size: 20 functions/classes total across Java and Python.
- Target cyclomatic complexity: 3-7.
- Function style: deterministic utility/service logic.
- Include: if/else, switch, loops, boundary cases, invalid inputs.
- Exclude: database calls, external APIs, network calls, UI logic.

## Study Boundary

- This project evaluates generated unit tests, not generated application code.
- The comparison baseline is student-written unit tests for the same functions/classes: JUnit tests for Java and pytest tests for Python.
- The main outcomes are branch coverage and mutation score; text similarity is not part of the study.
- UI, API, acceptance-test, and requirements-to-test tasks are out of scope unless converted into executable Java/Python unit tests and measured with the selected coverage/mutation tools.

## Later Experiment Fairness Rules

- Students must not view AI-generated tests before writing manual tests.
- AI tests must use one fixed prompt version.
- If AI tests are edited to compile in the later experiment phase, record the edit in a separate experiment log.
- Do not use coverage/mutation feedback to improve initial manual tests unless the study explicitly adds a second iteration.
