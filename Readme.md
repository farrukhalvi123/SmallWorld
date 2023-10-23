Guidelines for Running this Project and configuration and 
Project Composition

1. Install all POM.xml file dependencies
2. Project consist of Three Sections
    - Feature Files
      - Contains all the tests into Gherkin Language(Given, When and Then)
      - \SmallWorld\src\test\java\Features
    - Step Definition
      - Contains the Glue code that works as a bridge for running the test
      - SmallWorld\src\test\java\StepDefinition
    - Pages Files
      - Contains all the elements and the methods. 
      - C:\Users\Hp\IdeaProjects\SmallWorld\src\test\java\Pages
3. To Run Individual Tests Go to any Feature File and CLick on Play Button
   \SmallWorld\src\test\java\Features
4. To Run all the tests Go to Test Runner file and execute it. It will Run all in a sequence
5. To Execute tests in Allure Reports.
   Run the command "allure serve allure-results"
   