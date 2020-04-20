// API Automatic tests

Prerequisites: Download NodeJS and to have a local GIT Repository.

Steps to execute the automatic API tests:
- Install NodeJS
- Open a console prompt and type "node" and execute. Then write "npm install -g newman" and execute to install newman.
- Do a GIT clone command from the Github repository to your local repository
- Open GIT Bash in your local repository and type "newman run SEATCodeTest.postman_collection.json" and run it.
- Results of the test will appear in the GIT Bash console.

// UI Automatic Test

Prerequisites: Download IntelliJ Idea Community Edition, download Apache Maven 

Steps to execute UI Automatic Test:
- Install IntelliJ Idea
- Install Apache Maven
- Do a GIT clone command from the Github repository to your local repository (skip it if you done it for API Automatic Tests)
- Open IntelliJ and Import the project from "selenium" directory in your local repository. Select option "Import project from external model" as Maven and click on Finish.
- When project is imported, press right click in directory "SeatTechnicalTest" and then, click on "Run 'all tests'.
- There are 2 tests, one failed for adidas items (no adidas items in the shop), other one with another item selected, following the full flow for the adidas item test.
