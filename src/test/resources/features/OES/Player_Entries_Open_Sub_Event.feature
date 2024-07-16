Feature: Create OES Player Entry Details Open Sub events

  @OES @player_entries @open_sub_events_player_entries
  Scenario: To Create OES Player Entry Details Open Sub events
    Given Login the admin Application
    And Admin portal event creation
    And Logout admin portal application
    When Login the admin Application
    And create the subevent 'Open' in the admin portal
    And Logout admin portal application
    Then Login the admin Application
    And Event publish into the admin portal to OES
    And Logout admin portal application
    Given Login the OES Application
    When OEs player entry details
    Then Logout the OES Application
    Given Login the OES Application
    When EVent Publish OES into OVR
    Then Logout the OES Application