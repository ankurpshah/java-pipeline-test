# Selenium setup with TestNG using Maven and Allure reports

## Project Status

![GitHub Project Status](https://github.com/qlitelabs/selenium-testng-allure-maven/workflows/Java%20CI%20with%20Maven/badge.svg)
[![CircleCI Status](https://circleci.com/gh/qlitelabs/selenium-testng-allure-maven/tree/master.svg?style=svg)](https://circleci.com/gh/qlitelabs/selenium-testng-allure-maven/tree/master)

## Pre-requisite

- JDK 1.8 or higher must be installed.
- Maven must be installed.

## Installation

- Clone this repo.
- Make sure working directory is repo root directory.
- Run command: `mvn clean verify allure:report -P grid -Dbrowser=chrome -DsuiteXmlFile=smoke.suite.xml`

## Customizations

- Four profile available:

    * `grid` - execute tests on Selenium Grid. Grid Hub can be set in pom in `seleniumGridURL` property
    * `nogrid` - execute tests locally
    * `parallelSuite` - run parallel suite
    * `singleThreaded` - execute tests sequentially, omits parallel execution

- For example, invoking 
  ```
  mvn clean verify allure:report -P grid -Dthreads=3 -Dbrowser=chrome -DsuiteXmlFile=smoke.suite.xml
  ``` 
  will execute tests in parallel 3 threads on local machine and using *cucumber-jvm-parallel-plugin* plugin. In addition, `-Dbrowser` setting will set browser to Chrome.
  
## Reports
- Allure Reports will be generated in `target/allure-results` folder.

