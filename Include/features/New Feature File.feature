Feature: Login to Amazon

  Scenario: Successful login with valid credentials
    Given the user opens the browser
    And navigates to "https://www.amazon.in/"
    When the user clicks on "Account & Lists"
    And enters the phone number "<UserPhoneNumber>"
    And enters the password "<Password>"
    Then the user should see the dashboard page

  Scenario: Login fails with invalid credentials
    Given the user opens the browser
    And navigates to "https://www.amazon.in/"
    When the user clicks on "Account & Lists"
    And enters the phone number "invalid_user"
    And enters the password "wrong_password"
    Then an error message should be displayed
