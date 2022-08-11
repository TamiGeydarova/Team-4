@Team4
Feature: Search Bar is displayed in different pages

  @Test7.1
  Scenario: Search field is displayed on selected item Mac
    Given I am on the home page
    When I go to Desktops
    And I go to dropdown menu
    And I select item Mac
    Then I check that search field is displayed
  @Test7.2
  Scenario: Search field is displayed on selected list of items
    Given I am on the home page
    When I navigate to Laptops and Notebooks
    And I go to second dropdown menu
    And I select all laptops and notebooks
    Then I check that search field is displayed
  @Test7.3
  Scenario: Search field is displayed on selected item in section cameras
    Given I am on the home page
    When I go to Cameras
    And I select Canon EOS item
    And I click on selected item
    Then I check that search field is displayed
  @Test7.4
  Scenario: Search field is displayed on register field
    Given I am on the home page
    When I go to my account menu
    And I go to My Account
    And I go to dropdown menu
    And I click on register
    Then I check that search field is displayed

