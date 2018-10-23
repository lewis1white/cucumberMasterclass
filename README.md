# cucumberMasterclass

Complete this to become a Cucumber expert!! (ft. Selenium)

## Getting started
First clone this repo onto your machine so you have an appropriate file structure for testing!

## Feature Files
The first step for a cucumber test is writing out what you want your test to do in plain english in a feature file. I have made one for you to write in already at src/test/features/myFirstFeature.feature
Navigate to this file and write a test in english on what you want to do (it could be doing a search on google and checking the results contain your search; or entering incorrect login details on a form and checking the page doesn't login)

The feature file must be layed out using certain keywords so the step definitions can understand it later, here is how you should lay out your first test:

Feature: (put a little title for the overall feature)
Scenario: (put a title for this test in the feature)
Given (put the pre conditions needed for the test to run ie loading a page)
When (put specific test requirements ie inputting certain data)
Then (the expected result of the test ie the page has loaded)

After you've written your feature click run!

## Step Definitions

Your test should warn you that you have an undefined step and should give you snippets that you can use to implement your feature file. You should copy and paste these snippets into your step defintions class located at: test/java/stepDefs/firstStepDefs.java

These snippets have a comment in pushing you to write code that will turn our text into actual tests. For this code we will be using Selenium!

## Selenium
