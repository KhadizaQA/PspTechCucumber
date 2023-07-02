Feature: Registration Process

Background:
Given User enters the url of the Mercury Tours application
And User navigates to the registration page

Scenario: Successful Registration with entering valid data
When User enters the all required data
And User clicks on the submit button
Then  successfully registers into the Murcury Tours application
  
Scenario: UnSuccessful Registration without entering all required data
When User does not enter all required data
And User clicks on the submit button without all data
Then User fails to registers  into the Murcury Tours application
 
    
  