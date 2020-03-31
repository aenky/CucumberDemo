@demo
Feature: demoTest

  @demo
  Scenario: Verify cards are present on Home page
    Given I have open the browser
    When I open Facebook website
    Then Login button should exits
    Then Close the browser

  @demo
  Scenario: Verify nopcommerce login functionality
    Given I have open the browser
    When I open nopcommerce website
    Then Enter Email On Textbox
    Then Enter Password On Textbox
    Then Click On Login button
    And Verify that dashboard page is display
    Then Close the browser