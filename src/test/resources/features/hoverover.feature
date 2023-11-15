Feature: hover-over

  @hoverOver
  Scenario: As a user, when i hover-over on computers category link, color should be change for that link
    Given user is on NopeCommerce Homepage
    When user hover over on computers category link
    Then The text color should be change
