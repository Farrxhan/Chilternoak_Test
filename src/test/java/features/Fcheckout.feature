@chilternoak
Feature: Checkout In Chilternoak
  I want to Examin Checkout Functionality Of Chilternoak

  Scenario: Checkout Functionality Of Chilternoak
    Given User is on login page and add item to cart
    And User is able Proceed With Valid Checkout Details
    When User is Not able Proceed With All Null Checkout Details
    And User is Not able Proceed With Only One Null Checkout Details
    Then User is Not able To Enter With Invalid Phone Credentials
    And User is Able To Enter With Invalid Credentials
