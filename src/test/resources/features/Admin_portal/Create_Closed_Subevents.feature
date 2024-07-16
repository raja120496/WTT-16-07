Feature: Admin portal - create closed sub events feature

  @Adminportal @Event_creation @closesubevents @subevents
  Scenario: To verify the admin portal create closed sub events
    Given Login the admin Application
    And Admin portal event creation
    And Logout admin portal application
    When Login the admin Application
    Then create the subevent 'Closed' in the admin portal
    And Logout admin portal application