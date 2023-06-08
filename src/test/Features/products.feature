Feature: add product to cart

  Scenario: add item to cart
    Given a user is on the swag labs products page
    When  a user add a product to cart
    Then  user should be on a cart page