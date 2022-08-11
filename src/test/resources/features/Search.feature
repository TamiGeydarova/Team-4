Feature: Search tests

  @homePageTests
  Scenario Outline: Perform Search from home page
    Given I am on the home page
    When I perform search from home page with: "<value>"
    Then I am on Search result page
    Then Search query matches the: "<value>"

    Examples:
      | value       |
      | abracadabra |
      | ip          |
      | iph         |
      | IPHONE      |
      | IpHonE      |
      | .           |

  @performFromSearchPage
  Scenario Outline: Perform Search from search page
    Given I am on the search page
    When I perform search from search page with: "<searchValue>"
    Then I am on Search result page
    Then Search query matches the: "<searchValue>"
    Then Search results are not empty
    Then No search results display is not present

    Examples:
      | searchValue |
      | ip          |
      | iph         |
      | IPHONE      |
      | IpHonE      |
      | .           |

  Scenario Outline: Perform Search from search page with no results
    Given I am on the search page
    When I perform search from search page with: "<searchValue>"
    Then I am on Search result page
    Then Search query matches the: "<searchValue>"
    Then Search results are empty
    Then No search results display is present

    Examples:
      | searchValue |
      | afsdfsdfd   |
      | 34t34434    |
      | {}4#$$#}    |