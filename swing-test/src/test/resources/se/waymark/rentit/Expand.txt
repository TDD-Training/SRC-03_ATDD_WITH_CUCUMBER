Feature: Fleet of rental cars should be possible to grow to support expanding market.

  As an owner of a car rental company
  I want to add cars to my fleet
  So I can take bigger market-share

  Scenario: Ad one care to fleet
    Given there are 18 cars available for rental
    When I add one
    Then there will only 19 cars available for rental