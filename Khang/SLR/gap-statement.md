# Gap Statement - Khang Google Scholar

## Summary from Evidence Table

From the 7 Google Scholar final included papers:

- 7/7 papers evaluate LLM-based unit test generation.
- 7/7 papers explicitly include GPT-family, ChatGPT, Codex, Gemini, or DeepSeek-style models.
- 7/7 papers evaluate structural adequacy through statement/code/branch coverage or coverage rate.
- 3/7 papers explicitly evaluate mutation coverage or mutation score (GS001, GS046, GS057).
- 2/7 papers include a human or practitioner baseline (GS001, GS030), but none directly compares against student-written tests for the same code.
- 7/7 papers focus on Java/Python or directly relevant unit-test subjects.

## GAP-T - Tool/LLM Gap

The Tool/LLM column shows that prior work evaluates ChatGPT, Codex, GPT-3.5-Turbo, GPT-4o, DeepSeek, Gemini, and LLM-based repair/generation frameworks. However, the evidence does not provide a controlled study of GPT-4/GPT-4o-generated unit tests against student-written tests on the same medium-complexity Java/Python functions.

## GAP-D - Dataset Gap

The Dataset column shows mixed datasets: small custom Python methods, Java benchmark classes, HumanEval/SF110, Defects4J-style Java classes, and TestART experimental datasets. Few studies isolate medium-complexity Java/Python functions/classes as the controlled population, and the evidence does not provide paired code samples with student-written tests for the same units.

## GAP-M - Metric Gap

The Metric and result columns show that coverage is common, but mutation score is less consistently reported. Only GS001 and GS046 explicitly report mutation score, so a dual-metric evaluation using both branch coverage and mutation score remains useful for measuring both path exercise and fault-detection strength.

## GAP-S - Shared Limitation Gap

At least 5/7 papers report limitations related to dataset scope, transfer to harder code, or generation/repair overhead: GS001 uses a small custom Python dataset and notes time/cost from sequential prompting; GS022 shows strong benchmark performance does not transfer to harder SF110 Java classes; GS046 uses only six Java classes and has invalid/non-applicable mutation reports; GS011 relies on iterative repair/coverage feedback and does not use a student-written/manual baseline; GS057 notes that the adversarial dual-agent loop has high generation cost.

## Proposed Contribution

This study will evaluate GPT-4/GPT-4o-generated unit tests for medium-complexity Java/Python functions using both branch coverage and mutation score, then compare the generated tests with student-written tests for the same code.
