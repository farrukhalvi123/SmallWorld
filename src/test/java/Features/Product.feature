Feature: Testing Products
  Background:
    Given User is at Sauce Demo
    When User Logins with <username> and <password>
    Then User is on Product Page

  Scenario: Select and Product and Go to Checkout
    Then Select a Product
    Then Go to Cart
    Then Proceed to checkout
    Then Enter Information Farrukh Alvi 752390
    Then Verify Information and Finish
