Feature: Order page

  Background: 
    Given User is on tek retail website
    When User click on signIn button
    And User enters email 'zafar@gmail.com' and password 'Jafar22@'
    And User click on login button
    And User should logged in into the page

  @testtest
  Scenario: user can place an order witout Shipping address and payment method on file
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity 2
    And User click add to Cart button
    And the cart icon quantity should change to 2
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | United Kingdom   | value    | value       | value         | value | value | value | value   |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | value      | value      | value           | value          | value        |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’
