Feature: Open example website

  Scenario: Navigate to example.com
    When I navigate to "https://example.com"
    Then the page title should contain "Example Domain"
