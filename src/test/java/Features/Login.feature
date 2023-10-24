Feature: Testing Sauce Demo Login
  Scenario Outline: Testing Login
#    Given User is at Sauce Demo
    Given User Logins with <username> and <password>
    Then User is on Product Page
    Examples:
    |username|password|
    |standard_user|secret_sauce|
    |standard_user         |        123534    |


