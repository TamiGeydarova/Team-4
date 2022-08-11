@Team4
Feature: Sorting list of products after search

  Scenario Outline: Test sorting list of products
    Given I am on Testing Demo Shop page
    When I search "sa"
    And I click to sort by "<value>"
    Then I verify That list of products is sorted "<value>"

    Examples:
      | value              |
      | Name (A - Z)       |
      | Name (Z - A)       |
      | Price (Low > High) |
      | Price (High > Low) |

  Scenario: Test visibility of pagination
    Given I am on Testing Demo Shop page
    When I search "0"
    Then I verify that pagination is visible