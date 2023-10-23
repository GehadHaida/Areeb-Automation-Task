Feature: Login | user login with valid data

  Scenario Outline: user can login with valid user name and password
    Given Navigate to homepage
     When user enter <username> and <password>
      And user click on login button
     Then Verify that I am logged
Examples:
    | username      | password     |
    | standard_user | secret_sauce |
    | visual_user   | secret_sauce |
    | error_user    | secret_sauce |