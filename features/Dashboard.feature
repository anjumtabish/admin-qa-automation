Feature:  Dashboard feature

  Background:   Login to Admin
    Given  Admin user logins with valid credentials

  Scenario:  Dashboard features
    Given   Admin Navigates to Dashboard
    When    Admin clicks on Add person tab
    Then    Add Person application gets initiated