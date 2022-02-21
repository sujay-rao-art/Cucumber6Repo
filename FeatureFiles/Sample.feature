Feature: Check application basic steps

	@Sanity
  Scenario: Application social media links should work
    Given Application is up and running
    When User see home page
    And check footer section
    Then social media links should be present
    And all links should point to correct platforms
    
