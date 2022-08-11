@team4

Feature: Testing add to cart button by KR

  Scenario Outline: Add to cart button in product page

    Given open the page
    Then insert "<product>" in the search field
    Then press search
    When Click on the product
    And enter a product quantity: "<quantity>"
    Then click on the "Add to Cart" button
    Then Check that in the cart button is displayed right "<quantity>"

    Examples:

      | product                  | quantity |
      | Palm Treo Pro            | 1        |
      | Sony VAIO                | 2        |
      | Samsung SyncMaster 941BW | 3        |
      | MacBook Air              | 4        |
      | MacBook                  | 5        |
      | Ipod Classic             | 6        |
      | Iphone                   | 7        |


  Scenario Outline: ADD TO CART button without entering to the product page

    Given open the page
    Then insert "<product>" in the search field
    Then press search
    And Click on the add to cart button
    Then Check that in the cart summary is displayed: "<sum>"
    Then Check that success message is displayed


    Examples:

      | product       | sum |
      | Palm Treo Pro | 1   |
      | Sony VAIO     | 1   |
      | Iphone        | 1   |
      | MacBook Pro   | 1   |


  Scenario Outline: All cart buttons are displayed on different pages

    Given open the page
    When insert "<product>" in the search field
    And press search
    And Click on the product
    Then check that cart button is displayed on page

    Examples:

      | product            |
      | Apple Cinema 30    |
      | Samsung Galaxy Tab |
      | Canon EOS 5D       |
      | Nikon D300         |


  Scenario Outline: Add -5 items

    Given open the page
    When insert "<product>" in the search field
    And press search
    And Click on the product
    And enter a product quantity: "<quantity>"
    Then click on the "Add to Cart" button
    Then enter a product negative quantity "<negQuantity>"
    Then Check that in the cart button is displayed right "<result>"

    Examples:


      | product       | quantity | negQuantity | result |
      | Palm Treo Pro | 6        | -7          | 0      |
      | Sony VAIO     | 3        | -4          | 0      |
      | Iphone        | 1        | -2          | 0      |
