@Newt
Feature: Newtours
  // As a User, I want to be able to enter only accepted User information details so that I can register
  // https//demo.guru99.com/test/newtours/

#  @Newt
  Scenario: Flight finder Page
    Given I am on the Newtours Home page

    When I click on the Flights link on the left side menu

    Then The Flight Finder Page should be displayed

    And “RoundTrip” Flight details type is selected by default

    And “July 12” should be displayed by default for On and returning

    And “Economy Class” should be selected as default for the Service class


  Scenario Outline: Register by entering only User Information

   Given I am on the Newtours website
    When I click on the Register link
   And I enter "<Username>", password and confirm as "<Password>"
    And enter "<CountryName>"
    And I click submit button
    Then confirmation page is displayed with my "<Username>"

    Examples:
     | Username | Password    | CountryName |
     | Jose     | password120 | ANGOLA      |
#     | Late     | password2200 | ANGOLA      |

#     | Pause    | password983920 | ANGOLA      |


