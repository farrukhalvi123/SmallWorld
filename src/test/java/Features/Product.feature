Feature: Testing Products

  Scenario: Select and Product and Go to Checkout
    Given User is at Sauce Demo
    When User Logins with standard_user and secret_sauce
    Then User is on Product Page
    Then Select a Product
    Then Go to Cart
    Then Proceed to checkout
    Then Enter Information Farrukh Alvi 752390
    Then Verify Information and Finish
