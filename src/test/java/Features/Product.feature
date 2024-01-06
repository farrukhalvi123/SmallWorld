Feature: Testing Products
  Background:
    Given User Logins with standard_user and secret_sauce
    Then User is on Product Page

  Scenario: Select and Product and Go to Checkout
    Then Select a Product
    Then Go to Cart
    Then Proceed to checkout
    Then Enter Information Farrukh Alvi 752390
    Then Verify Information and Finish

  Scenario: Remove a Product
    Then Select a Product
    Then Go to Cart
    Then Remove item from the cart

  Scenario: Filtering and verifying products
    Then Selecting filter
    Then select filter from low to high
    Then verifies product prices order