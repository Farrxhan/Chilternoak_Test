@chilternoak
Feature: Product Search Functionality

  Scenario Outline: Enter  search term and verify  results
    Given I open the browser and enter the URL
    When I enter a  product name as '<productName>' in the search bar
    And I click on the search button
    Then results should be found for the search term
    Then no results should be found for the search term

    Examples: 
      | productName                            |
      | sofa                                   |
      |                                        |
      | perfumes                               |
      | chopa                                  |
      | Industrial Tan 90cm Studded Back Bench |
