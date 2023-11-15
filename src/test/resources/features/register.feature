Feature: Register

  @register
  Scenario: As a user, I should able to register successfully

    Given user is on Nopecommerce Homepage
    When user click on Register button
    And user enter all required registration details
    Then user should able to register successfully