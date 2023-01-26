Feature: Search articles

  Scenario: Search articles and take a href value from first found article
    Given Open the main page
    When Type the search article
    And Get href attribute of first found article
    Then Check that href of the first found article contains expected value