# cucumberMasterclass

Complete this to become a Cucumber expert!! (ft. Selenium)

## Getting started
First clone this repo onto your machine so you have an appropriate file structure for testing!

## Feature Files
The first step for a cucumber test is writing out what you want your test to do in plain english in a feature file. I have made one for you to write in already at src/test/features/myFirstFeature.feature
Navigate to this file and write a test in english on what you want to do (it could be doing a search on google and checking the results contain your search; or entering incorrect login details on a form and checking the page doesn't login)

The feature file must be layed out using certain keywords so the step definitions can understand it later, here is how you should lay out your first test feature file:

`Feature:` (put a little title for the overall feature)

`Scenario:` (put a title for this test in the feature)

`Given` (put the pre conditions needed for the test to run ie loading a page)

`When` (put specific test requirements ie inputting certain data)

`Then` (the expected result of the test ie the page has loaded)

After you've written your feature click run!(Make sure you have the Cucumber java plugin installed on IntelliJ for ease)

## Step Definitions

You should be given some code snippets for your step definitions, you should copy and paste these snippets into your step defintions class located at: test/java/stepDefs/firstStepDefs.java

These snippets have a comment in pushing you to write code that will turn our text into actual tests. For this code we will be using Selenium!

## Selenium

Selenium allows us to drive our browser to load up pages and manipulate them to do what we want, I recommend doing some research into the different things Selenium can do before writing your code as it has many abilities and certain ones may be more helpful depending on what you're trying to do.

The first thing everyone will need to do is open up their browser, I have put a chromedriver in the file structure and it is important for us to point Selenium in the direction of this for it to work.

We can use this to do so: `System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");`

I also recommend the steps in your Given statement to be :

1. Opening a new Chrome and assigning it to a global variable for later manipulation

2. Using this to load up the webpage we want to test

For your when statement here are some steps you can think about:

1. Finding fields to input data using `findElement()`

2. Inputing data using `sendKeys()` or clicking on buttons using `click()`

Your then statement should include an Assert so we are actually making a test; make sure to include `yourvariablename.quit()` at the end to close your driver.

Once all this is done we can run our feature file again and see the outcome of our test!!!

## Further Work

Try paramitising your test so we can send multiple values to test at once

To do this we will need to use the `Examples:` keyword in our feature file and also write our inputs in our feature file in this format : `<input>`
