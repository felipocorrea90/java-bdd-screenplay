The purpose of this project is to clearly define the different layers of a test automation design that uses the ScreenPlay pattern.

In this case, Screenplay is used with Serenity and Cucumber, executing the test cases with the JUnit runner.

2 SOLID principles are applied to this project:

## Single Responsibility Principle (SRP)
A class should have only one responsibility and therefore only one reason to change. To achieve this each class in the model package represents a function/method.

## Open-Closed Principle (OCP)
A class should be open for extension but closed for modification, the meaning is possible to extend behavior by writing a new class without changing the working code.

There's a little compromise with OCP, at least one class per unit (page, module, or component) should hold the element locators of that given unit, so this class likely gets modified by updating or adding new locators. However, as defined by the principle this class is extended by the other classes that use these elements to perform a given function to them.

The design pattern mentioned above is all located within the test.java.model package. Each sub-package here represents a page unit.

## Runner
Use the TestRunner class under test/java to execute the test cases. Make sure to specify the feature files you want to run by using the @CucumberOptions.

## Steps
This is the place to add your Cucumber step definitions that will match via regular expression the content of your feature files.

## Resources
This is the place to add your Cucumber feature files, your drivers (chromedriver in this example), and the serenity configuration file to tweak driver options.

## Actors


### What is the current example

1. The driver goes to the El Tiempo website (a news site from Colombia, where I'm from).
2. Clicks the Colombia option from the site menu.
3. Validates that after the page redirection the driver is located where it should.

The behavior of the above example is very trivial however the point of this project is not to add a complex test scenario but instead represent an example of a ScreenPlay implementation.