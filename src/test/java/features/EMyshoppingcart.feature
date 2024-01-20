@chilternoak
Feature: test add to cart

  Background: 
    Given User navigates to the URL

  Scenario: add to cart
    Given user search sofa
    Then add
    Then remove

  Scenario: add to cart1
    Given user search table
    Then add
