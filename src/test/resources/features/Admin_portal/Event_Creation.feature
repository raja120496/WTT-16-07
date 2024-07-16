Feature: Admin portal - event creation feature

  @Adminportal @Event_creation
  Scenario: To verify the admin portal event creation
    Given Login the admin Application
    When Admin portal event creation
    Then Logout admin portal application