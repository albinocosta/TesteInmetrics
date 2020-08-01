# TesteInmetrics
Versão inicial de automacao para teste Inmetrics


Test was created in Page Object Model Pattern
This version are not implemented in BDD, but a new version will be launched with BDD in a new repository soon

# Setup

To be able to run this project you will need:

1 - Eclipse IDE 2 - Java version 1.8.0 - Cucumber dependencies (it's at pom file) 4 - If necessary, update the libraries needed to run the tests.

# Runing the tests

Open the project at Eclipse. >> Execute the tests at this order: 1- SignUpUser.java; 2- SignInUser.java; 3-CreateEditEraseUser.java. Before start execution, don't forget to update the path for chromedriver in right folder.

# The pom must be

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>automacao</groupId>
  <artifactId>foradacaixa</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
  	<dependency>
  		<groupId>info.cukes</groupId>
  		<artifactId>cucumber-java</artifactId>
  		<version>1.2.6</version>
  	</dependency>
  	<dependency>
  		<groupId>org.seleniumhq.selenium</groupId>
  		<artifactId>selenium-java</artifactId>
  		<version>3.141.59</version>
  	</dependency>
  	<dependency>
  		<groupId>info.cukes</groupId>
  		<artifactId>cucumber-junit</artifactId>
  		<version>1.2.6</version>
  	</dependency>
  </dependencies>
</project>
