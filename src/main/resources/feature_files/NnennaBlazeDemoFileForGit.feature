


Feature:  Choosing Departure and destination cities  and finding flights

  Scenario Outline: : FINDING FLIGHTS
    Given I am on the the Welcome to simple Travel agency Landing page
    And I choose the "<departure city>" and "<destination city>" from the drop down
    When I click on "<Find Flights>"
    Then  I should see "<departure city>" and "<destination city>" on the reserve page  and 5 flight options
    Examples:

      | departure city | destination city |
      | Boston         | Rome             |
      | Portland       | London           |
      | Philadelphia   | New York         |
      | Mexico City   | Berlin           |
