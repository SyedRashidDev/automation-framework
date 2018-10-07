Feature: Search

  @test
  Scenario: User searches for information on the internet with keyword
    Given I am on googleHomePage
    When I enter "blue" in searchField
    And I click on searchButton