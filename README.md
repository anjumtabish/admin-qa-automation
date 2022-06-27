# Getting Started
Demo project containing boilerplate code to run cucumber integration tests having Spring Boot as base layer.

> To run integration tests execute in terminal: `mvn clean verify -PrunIntegrationTests`

Output will be generated in the `results` folder.

# Architecture
- Spring Boot
- Cucumber
- maven-clean-plugin (to clean dirty output directories before running integration-tests)
- cucable-plugin (to generate parallel features and parallel test runners)
- maven-failsafe-plugin (to run integration tests)
- cluecumber-report-plugin (to generate html test output from .json results)

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.0/maven-plugin/reference/html/)
* [Cucable Plugin](https://github.com/trivago/cucable-plugin)
* [Cucumber Parallel execution](https://cucumber.io/docs/guides/parallel-execution/)
