Feature: Search tests

  @searchFromHomePage
  Scenario Outline: Perform Search from home page _VK
    Given I am on the home page _VK
    When I perform search from home page with: "<value>" _VK
    Then I am on Search result page _VK
    Then Search query matches the: "<value>" _VK

    Examples:
      | value       |
      | abracadabra |
      | ip          |
      | iph         |
      | IPHONE      |
      | IpHonE      |
      | .           |

  @searchFromSearchPageValid
  Scenario Outline: Perform Search from search page
    Given I am on the search page _VK
    When I perform search from search page with: "<searchValue>" _VK
    Then I am on Search result page _VK
    Then Search query matches the: "<searchValue>" _VK
    Then Search results are not empty _VK
    Then No search results display is not present _VK

    Examples:
      | searchValue |
      | ip          |
      | iph         |
      | IPHONE      |
      | IpHonE      |
      | .           |

  @searchFromSearchPageInvalid
  Scenario Outline: Perform Search from search page with no results
    Given I am on the search page _VK
    When I perform search from search page with: "<searchValue>" _VK
    Then I am on Search result page _VK
    Then Search query matches the: "<searchValue>" _VK
    Then Search results are empty _VK
    Then No search results display is present _VK

    Examples:
      | searchValue |
      | afsdfsdfd   |
      | 34t34434    |
      | {}4#$$#}    |