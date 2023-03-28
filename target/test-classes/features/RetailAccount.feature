
Feature: Verify Account Page

  Background: 
    Given User is on tek retail website
    When User click on signIn button
    And User enters email "n@gmail.com" and password "Nn123456@"
    And User click on login button
    Then User should logged in into the page

  Scenario: Verify User can update Profile Information
    When user click on Account button
    When user update name 'Necytaar' and Phone '3309023332'
    When user click on updateButton
    Then user profile information should be updated

  Scenario: Verify user can add a payment method
    When user click on Account button
    And user click on add a Payment method link
    And user fill debit or credit card information
      | cardNumber       | nameOnCard    | expirationMonth | expirationYear | securityCode |
      | 4433603331013233 | Zafkarr Asarr |               5 |           2023 |          123 |
    And user click on add your card button
    Then a message should be displayed (paymentMethodAddedSuccessfully)

  Scenario: Verify User can edit Debit or Credit card
    When user click on Account button
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard   | expirationMonth | expirationYear | securityCode |
      | 4433678228044103 | zafartrr jan |               9 |           2024 |          123 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  Scenario: Verify user can remove a payment method
    When user click on Account button
    And user click on remove option of card section
    Then payment method should be removed

  Scenario: Verify User can add an Address
    When user click on Account button
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName  | phoneNumber | streetAddress | apt | city    | state   | zipCode |
      | Canada  | Zafar Ali |  3462625478 | 642 Ave H     |  38 | Houston | Alberta |   77469 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  Scenario: Verify user an update password
    When user click on Account button
    And User enters below information
      | previousPassword | newPassword | confirmPassword |
      | Nn123456@         | Jesus22@    | Jesus22@        |
    And User click on Change password button
    Then a message shoud be displayed (Password Updated Successfully)
