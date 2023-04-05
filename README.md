# Mythical Creatures Java

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Sonarlint](https://img.shields.io/badge/SonarLint-CB2029?style=for-the-badge&logo=sonarlint&logoColor=white)


## Table of Contents

- [Introduction](#introduction)
- [Getting Started](#getting-started)  
- [Further Improvements](#further-improvements)  
- [Built With](#built-with)  
- [Coverage](#coverage)  
- [Authors](#authors)  

## Introduction

Mythical Creatures is a [Turing School of Software & Design](https://github.com/turingschool-examples) project that is done in Ruby.  The intent of the project is to practice both basic Ruby and TDD.  I have taken this project and re-written it in Java for my own practice.  The project is located at [Mythical Creatures](https://github.com/turingschool-examples/ruby-exercises/tree/main/mythical-creatures).

## Getting Started   

For someone wishing to convert the project from Ruby to Java, I started by taking each RSpec test and converting it to an equivalent test in Java using JUnit and AssertJ.  I would write out the test in Java, and then proceed with the normal red-green-refactor TDD process to write out the classes and code under test.

For someone wanting to just practice Java TDD, copy the creaturesTest package, and then try to write your own code to make the tests pass.

## Further Improvements

I used AssertJ later on in the project.  One thing I would like to do is go back and see if there are other previous tests where I can use this library to make the tests more succinct.  

## Built With

Java version 17.0.6

JUnit 5 

AssertJ 3.24.2 

Eclipse 2020-06  

## Coverage

With JUnit 5, coverage was 100%.  Using SonarLint, there were no issues found.

## Authors

[Earl Stephens](https://github.com/earl-stephens)
