# RBL-4 Data Provenance

Generated: 2026-07-16T09:30:50.827405+00:00

- **GPT class metrics:** `F:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation\results\metrics\gpt_class_metrics.csv`  
  SHA-256: `fe63015bb6aff4f18ec31f05666933c8697075d7733ab233368cda0ae633839a`
- **GPT suite status:** `F:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation\results\full_compile_status.csv`  
  SHA-256: `1f0e0fb167fae857d3e45ea1b9f05efcaf7f4cc17ef861de9c39a3148eae1a5c`
- **GPT initial API usage:** `F:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation\results\full_llm_output.csv`  
  SHA-256: `3d47543e0b6b5eb61b30683a6a0f7c534daa4d5b1f0f3d5d4025e712c44d2330`
- **GPT repair API usage:** `F:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation\results\full_repair_output.csv`  
  SHA-256: `be1875c085294f3a4995dea5e6e18248dd6638c77c2fb0fe3a04e17a14859ff8`
- **EvoSuite 1-minute class metrics:** `F:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation\results\metrics\evosuite_1p_class_metrics.csv`  
  SHA-256: `3a124932d272b323286cf030822505e9ef312c677ead819c5331788f2bea4bbc`
- **EvoSuite 3-minute class metrics:** `F:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation\results\metrics\evosuite_3p_class_metrics.csv`  
  SHA-256: `a5076599bd80b754120ad972d85905edc292d7596222d38ce97bda175cb99ad0`
- **EvoSuite 5-minute class metrics:** `F:\Ky 5\SWT301\Github\SE1944_LLM_Unit_Test_Generation\results\metrics\evosuite_5p_class_metrics.csv`  
  SHA-256: `ce9722a42b0cf30f9a934fbc9fdac6d472c307d631ac8fca950d1ae7c7dfb767`

## Comparator method

EvoSuite tests were taken from the existing 1/3/5-minute archives; no EvoSuite generation was run. Each archive was measured on the same SUT set with Maven, JaCoCo, and PIT using Temurin JDK 8 because EvoSuite 1.0.6 requires `tools.jar`. RQ3 pairs only SUT suites that passed in both tools.
