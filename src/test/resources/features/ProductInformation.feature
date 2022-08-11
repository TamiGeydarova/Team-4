@Team4
Feature: Product information is displayed in different pages

  @Test8.5
  Scenario Outline: check all params big table version
    Given I am on the page: "<page>"
    And I check name: "<name>"
    And I check description: "<description>"
    And I check review: "<review>"
    And I check price: "<price>"
    And I check image: "<image>"
    And I check available options: "<options>"
    And I check specification: "<specification>"
    Examples:
      | page      | name    | description | review | price  | image | options | specification |
      | camera    | Canon   | description | review | 98.00  | image | options | specification |
      | tablet    | Samsung | description | review | 241.99 | image | options | specification |
      | monitor   | Apple   | description | review | 122.00 | image | options | specification |
