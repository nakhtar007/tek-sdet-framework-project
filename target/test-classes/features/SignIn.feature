
Feature: TEK Retail application SignIn feature

  
  Scenario: Verify user can signIn into retail application
    Given User is on tek retail website
    When User click on signIn button
    When User enters email 'pafar@gmail.com' and password 'Jafar22@'
    When User click on login button
    Then User should logged in into the page
     
