@team4
Feature: Testing searchfield by KR

  Scenario Outline: Search in product descriptions

    Given Open the webpage
    When I click on the searchField
    When Insert a product description: "<productDescription>"
    And press on the magnifying glass button
    And there is a no matches message: "There is no product that matches the search criteria."
    Then Click on Search in product descriptions checkbox
    Then press searchButton
    Then check that: "<productName>" is on the page


    Examples:
      | productDescription                                       | productName               |
      | an amazing 2560 x 1600 pixel resolution.                 | Apple Cinema 30           |
      | most powerful innovation                                 | Sony VAIO                 |
      | 1GHz dual-core Tegra 2 processor,                        | Samsung Galaxy Tab 10.1   |
      | It also automatically syncs all your contacts from a PC, | Iphone                    |
      | 005-segment sensor to recognize colors                   | Nikon D300                |
      | vivid color on the 320-by-480-pixel display              | iPod Touch                |


