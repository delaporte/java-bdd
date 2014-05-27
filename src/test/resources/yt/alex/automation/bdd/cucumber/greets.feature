Feature: Greets

  Scenario: hello maurice
    Given nothing
    And the name is "Maurice"
    When calling hello()
    Then I get "Hello Maurice !"