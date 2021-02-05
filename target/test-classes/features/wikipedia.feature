@wiki
Feature: Wikipedia search functionality

  Scenario: Wikipedia search functionality title verification
    Given User is on Wikipedia HomePage
    When User types "Steve Jobs" in the wikipedia search box
    And User clicks wikipedia search button
    Then User sees "Steve Jobs" is in the wikipedia title

  Scenario: Wikipedia search functionality title verification
    Given User is on Wikipedia HomePage
    When User types "Steve Jobs" in the wikipedia search box
    And User clicks wikipedia search button
    Then User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia search functionality title verification
    Given User is on Wikipedia HomePage
    When User types "Steve Jobs" in the wikipedia search box
    And User clicks wikipedia search button
    Then User sees "Steve Jobs" is in the image header
