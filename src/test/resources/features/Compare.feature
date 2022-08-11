@compare
Feature: Compare button

  Scenario: Test if compare button adds products to the compare list
    Given I am on Testing Demo Shop page
    When I click on Phones and PDAs menu button
    And I click on "HTC Touch HD" and "iPhone" products compare button
    And I click on product comparison link
    Then I verify that products "HTC Touch HD" and "iPhone" are in compare list

  Scenario: Test if compare button adds products to the compare list from product page
    Given I am on Testing Demo Shop page
    When I click on Phones and PDAs menu button
    And I click on first product
    And I click on comparison button
    And I click on Phones and PDAs menu button from products page
    And I click on second product
    And I click on comparison button
    And I click on product comparison link from product
    Then I verify that chosen products for comparison is displayed