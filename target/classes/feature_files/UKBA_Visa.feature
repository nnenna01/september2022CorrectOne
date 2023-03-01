@TestToRun
Feature: Confirm whether visa is required to visit UK.
#  As a Tourist/Student
#  I want to know if I require Visa to come to the UK from my country.
#  So that I can make a decision before I travel

Background:
Given I am on the UKBA Website

  Scenario: Japan nationalities coming to the Uk to study for more than 6 months require visa
    And I provide nationality of "Japan"
    And I click on the continue button
    And I select the reason "Study"
    And I click  on the continue button
    And I state I am intending to stay for more than 6 months
    And I click on the continue button
    Then I will be informed " You'll need a visa to study in the UK"

@scen2
Scenario: Japan nationalities coming to the Uk for Tourism do not require Visa

    And I provide nationality of "Japan"
    And I click on the continue button
    And I select the reason "Tourism" as reason for coming to the Uk
    And I click  on the continue button
    Then I will be informed " You will  not need a visa to study in the UK"


  Scenario Outline: Nationalities coming to the Uk to study for more than 6 months require visa using scenario outline

    And I provide nationality of "<CountryName>"
    And I click on the continue button
    And I select the reason "Study"
    And I click  on the continue button
    And I state I am intending to stay for more than 6 months
    And I click on the continue button
    Then I will be informed " You'll need a visa to study in the UK"
    Examples:

    |CountryName|
    |Japan      |
    |Ukraine    |
    |Morocco|
#    |USA|
#    |Australia|
#    |Canada|
