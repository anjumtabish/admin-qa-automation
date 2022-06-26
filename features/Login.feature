Feature: login feature

  Background:   Login to Admin
    Given  Admin user logins with valid credentials

    Scenario: Navigate to Dashboard
      When  Admin Navigates to Dashboard
      When   Admin clicks on Assigned to me button
      Then   Admin navigates to my Application page
