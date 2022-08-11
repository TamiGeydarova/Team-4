#@test7.4.1
#Feature: Team 4 task 7.4.1
#  Scenario Outline:i test search by  subcategories with all requirements
#    Given open Home page
#
#    When click  search icon in homepage
#    Then i am on search page
#     And user use search box to write item
#       |item|<item>|
#    And select categories from dropdown
#     Then check mark  serach by subcategories
#     And click search blue button
#    Then  Ensure i got the item
#    Examples:
#      |item|
#      |Apple Cinema|

##
#@test7.4.2
#Feature: Team 4 task 7.4.2
#  Scenario Outline:i test search by  subcategories with Wrong subcategory
#    Given open Home page
#    When click  search icon in homepage
#    And user use search box to write item
#      |item|<item>|
#    And select wrong categories from dropdown
#    Then check mark  serach by subcategories
#    And click search blue button
#    Then   Assert Error message
#    Examples:
#      |item|
#   |Apple Cinema|

#  @task8.2.1
#      Feature: this Tasks to check capability to user to put his review
#      Scenario Outline: this scenario will check review with all input
#      Given open Home page
#      Then search box in home page to write item
#        |item|<item>|
#       Then click  search icon in homepage
#        Then select your item
#        Then  click on review button
#        Then assert review page
#        Then  user write his name
#          |name|<name>|
#        And write review in text box
#        |text|<text> |
#
#        And  select rating from radio button
#        Then click continue button
#        Then user can see sucsses message
#      Examples:
#      |     name  |              text                   |item|
#      |Myname|goodtestmakegoodproductandgoodquality|iphone|

#@task8.2.2
#          Feature: this scenario will check review without any inputs
#          Scenario Outline:this scenario will check review without any inputs
#          Given open Home page
#          Then search box in home page to write item
#          |item|<item>|
#          Then click  search icon in homepage
#          Then select your item
#          Then  click on review button
#            Then click continue button
#          Then user can see Error message to fill all inputs message
#          Examples:
#          |item|
#          |iphone|

#            @test8.2.3
#                Feature: this Tasks to check capability to user to put his review
#      Scenario Outline: this scenario will check review with name less than 3 characters
#      Given open Home page
#      Then search box in home page to write item
#        |item|<item>|
#       Then click  search icon in homepage
#        Then select your item
#        Then  click on review button
#        Then assert review page
#        Then  user write his name
#          |name|<name>|
#        And write review in text box
#        |text|<text> |
#
#        And  select rating from radio button
#        Then click continue button
#        Then user can see Error message
#      Examples:
#      |     name  |              text                   |item|
#      |   M          |goodtestmakegoodproductandgoodquality|iphone|

@test8.2.4
        Feature: this Tasks to check capability to user to put his review
      Scenario Outline: this scenario will check review without review text
      Given open Home page
      Then search box in home page to write item
        |item|<item>|
       Then click  search icon in homepage
        Then select your item
        Then  click on review button
        Then assert review page
        Then  user write his name
          |name|<name>|
        And  select rating from radio button
        Then click continue button
        Then user can see error message for review text
      Examples:
        |   name  |   item|
        |Myname|  iphone|



