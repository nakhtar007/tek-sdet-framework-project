@12321235g
Feature: Order page

  Background: 
    Given User is on tek retail website
    When User click on signIn button
    And User enters email 'n@gmail.com' and password 'Jesus22@'
    And User click on login button
    And User should logged in into the page

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
      | country        | fullName   | phoneNumber | streetAddress   | apt | city    | state | zipCode |
      | United Kingdom | Zafar Asar |  3452342534 | 1345 houston dr |  35 | Houston | Angus |   77034 |
    And User click Add Your Address btn
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard    | expirationMonth | expirationYear | securityCode |
      | 4433212345432123 | Yasin Godarzi |               6 |           2025 |          123 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’

  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User change the category 'Electronics'
    And User search for an item 'Apex Legends'
    And User click on Search icon
    And User click on item option
    And User select quantity to 5
    And User click add to Cart button
    Then the cart icon quantity should changed to 5
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then Message should be displayed: ‘Order Placed, Thanks’

  Scenario: Verify User can cancel the order
    Given User click on Orders section
    When User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason ‘Bought wrong item’
    And User click on Cancel Order button
    Then a cancelation message should be displayed ‘Your Order Has Been Cancelled’

  Scenario: Verify User can Return the order
    Given User click on Orders section
    And User click on Return Items button
    And User select the Return Reason ‘Item damaged’
    And User select the drop off service ‘FedEx’
    And User click on Return Order button
    Then a cancelation message should be displayed ‘Return was successful’

  Scenario: Verify User can write a review on order placed
    And User click on Orders section
    And User click on first order in list
    And User click on Review button
    And User write Review headline ‘ headline value’ and ‘review text’
    And User click Add your Review button
    Then a review message should be displayed ‘Your review was added successfully’
