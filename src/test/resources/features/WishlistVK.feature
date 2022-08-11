@Team4
Feature: Wishlist tests

  @addToWishlistFromSearchResultsAnonymous
  Scenario: Perform Search from search page _VK
    Given I am on the search page _VK
    When I perform search from search page with: "mac" _VK
    Then I am on Search result page _VK
    Then Search results are not empty _VK
    Then Add all items to wishlist _VK
    Then Alert is displayed _VK

  @addToWishlistFromSearchResultsAuthorized
  Scenario: Perform Search from search page _VK
    Given I am logged in _VK
    Given I am on the wishlist page _VK
    Then Remove wishlist items _VK
    And Wishlist is empty _VK
    Given I am on the search page _VK
    When I perform search from search page with: "mac" _VK
    Then Search results are not empty _VK
    Then Add all items to wishlist _VK
    Given I am on the wishlist page _VK
    Then All products added are present in the list _VK