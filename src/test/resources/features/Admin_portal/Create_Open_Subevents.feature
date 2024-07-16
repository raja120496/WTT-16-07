Feature: Admin portal - create open sub events feature

  @Adminportal @Event_creation @opensubevents @subevents
  Scenario: To verify the admin portal create open sub events
    Given Login the admin Application
    And Admin portal event creation
    And Logout admin portal application
    When Login the admin Application
    Then create the subevent 'Open' in the admin portal
    And Logout admin portal application