# Areeb-Automation-Task

Project README - User Login Feature

Introduction
This README file provides detailed instructions for running and testing the "User Login" feature of the project. The project focuses on automating the user login process with valid data using Cucumber as the automation tool.

Prerequisites
Before you begin, make sure you have the following prerequisites:

IntelliJ IDEA: Download and install IntelliJ IDEA from the official website: IntelliJ IDEA

Cucumber Plugin: Install the Cucumber plugin for IntelliJ IDEA from the JetBrains Marketplace.

Getting Started
Follow these steps to set up and run the project:

Clone the Repository:

Go to the project's GitHub repository.
Copy the repository URL.
Open the Project in IntelliJ IDEA:

Launch IntelliJ IDEA.
Choose File > New > Project from Version Control.
Paste the repository URL you copied in step 1.
Click Clone.
Building the Project:

Make sure you have successfully cloned the project.
Open the project in IntelliJ IDEA.
Running the User Login Feature:

The user login feature is defined in the F01_login.feature file.

Before running the feature, you need to build the project.

You can build the project using the hammer icon in the top toolbar or by right-clicking on the F01_login.feature file and selecting "Build Module."
After building the project, you can run the feature file in one of the following ways:

a. Running from the Feature File:

Open the F01_login.feature file.
Click on the double green arrow to the left of "Scenario Outline." This will run the feature.
b. Running from the Context Menu:

Right-click on the F01_login.feature file.
Select "Run F01_login.feature" from the context menu.
Data-Driven Testing (DDT):

The user login feature is designed to perform Data-Driven Testing. It uses a scenario outline to test multiple valid user accounts with the same scenario.

You can find the data in the Examples section of the feature file, including usernames and passwords.

The feature will run three times, testing the three valid accounts specified in the examples.

Scenario Outline
User Can Login with Valid Username and Password
Given
Navigate to the homepage.
When
Enter <username> and <password>.
Click on the login button.
Then
Verify that you are logged in.
Examples
The following valid user accounts are included for testing:

 |username|	     |password|
standard_user	secret_sauce
visual_user	    secret_sauce
error_user	    secret_sauce