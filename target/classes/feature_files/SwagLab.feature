@Swag

Feature:

  Scenario Outline:
    Given I am on the swag lab home page
    When I enter valid "<username>" and valid "<password>"
    And I click on login button
    And I click on the first item on the products page
    And I click on Add to cart button
    And I click on shopping cart
    And I click on checkout
    And I complete all the require fields "<firstName>", "<lastName>" and "<Zip/postCode>"
    And I click on Continue button link
    And I click on Finished button
    Then "THANK YOU FOR YOUR ORDER" is displaced
    Examples:
      | firstName | lastName | Zip/postCode | username      | password     |
      | Sheyi     | Odeleye  | K32           | standard_user | secret_sauce |
