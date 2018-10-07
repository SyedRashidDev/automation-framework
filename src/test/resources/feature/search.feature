Feature: Search

  @test
  Scenario: User searches for information on the internet with keyword
    Given I am on HomePage
    When I enter "blue" into searchField
    And I click on searchButton
    
    And I click on searchButton