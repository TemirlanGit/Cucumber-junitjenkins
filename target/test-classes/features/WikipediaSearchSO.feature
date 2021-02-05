@so
Feature: Wikipedia search functionality

  Scenario Outline: Wikipedia search functionality title verification
    Given User is on Wikipedia HomePage
    When User types "<searchKey>" in the wikipedia search box
    And User clicks wikipedia search button
    Then User sees "<title>" is in the wikipedia title

    Examples: Test data for search functionality

    |searchKey    |title       |
    |Steve Jobs   |Steve Jobs  |
    |Ricky Martin |Ricky Martin|
    |Lady Gaga    |Lady Gaga   |
    |Lionel Messi |Lionel Messi|

    #optio command for aligning pipes automatically