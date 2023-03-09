
Feature: This feature is used for testing UI of Retial Page
@smoking
  Scenario: Verify user can search a product
    Given User is on tek retail website
    When User search for "pokemon" product
    Then The product should be displayed
    Then User click on product
    Then User add the product to cart

  Scenario: Verify Shop by Department sidebar
    Given User is on tek retail website
    When user click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  
  Scenario Outline: Verify department sidebar options
    Given User is on tek retail website
    When user click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

  Scenario: Verify User can add an item to cart
    Given User is on tek retail website
    When User click on signIn button
    When User enters email 'jesus@gmail.com' and password 'Jesus22@'
    And User click on login button
    Then User should logged in into the page
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity 2
    And User click add to Cart button
    Then the cart icon quantity should change to 2
