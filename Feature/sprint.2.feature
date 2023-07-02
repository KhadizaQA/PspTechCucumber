
  Scenario: As a user, I want to loging to the webpage so that I can use my account.
    Given User has completed registration process
    And user is in login page
    
    When user enters valid username and valid password
    Then system navigates to homepage
    And system displays all features

  