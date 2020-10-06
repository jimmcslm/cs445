# Implementation Examples

This repository contains some example implementations that go with
Chapter 15: Implementation in Schach. Your assignment is described [below](#assignment).

## What's in the project?
### Methods

The first example `Calculator` contains a simple method which implements
a "safe divide" function where division by zero is handled by returning zero.
This example is tested thoroughly in its corresponding test file.

The second example `CharConverter` implements a method to convert an integer
into a letter based on its ASCII value (if it isn't a letter it returns an empty
string).

### Repository setup
#### Gradle
This project uses gradle as its build tool. To build the project, run
```
// linux/macox
./gradlew build

//windows
gradlew.bat build
```
in a terminal while in the project directory.

#### Spotless
This project uses spotless, which checks your code against some standards. If you run into an error
when you run build and it indicates that it is an issue that spotless detected, you may need to run
```./gradlew :spotlessApply``` to automatically fix your code.

#### Github Actions for Continuous Integration
The repository is configured automatically run `gradle build` whenever you push any commits to Github. This means that
spotless and all unit tests are run whenever any commit is pushed, and the success/failure result is shown in the Github
UI. The config files that set this up are found in the `.github` directory.

## Assignment
The method `CharConverter.convertIntToLetter` contains a defect. Your job is to find
and correct this defect. The goal of the method is to only convert letters (a-z, A-Z) from an integer
if it is actually a letter, otherwise it returns an empty string. Looking at an
[ASCII table](http://www.asciitable.com/), you see that a-z and A-Z are two separate continuous runs of integers.

### Tasks
1. Use equivalence testing and boundary value analysis (Schach 15.11.1, pg. 521) to write a more comprehensive set of
test cases.
2. Use these test cases that you write to find and correct the defect.
3. Commit your changes to git, and push those results to Github.
4. Make sure your Github CI build is passing. Github CI runs `./gradlew build` and requires it to complete successfully.

### About the readme
This readme is written in Markdown ([guide to Markdown](https://www.markdownguide.org/)).
