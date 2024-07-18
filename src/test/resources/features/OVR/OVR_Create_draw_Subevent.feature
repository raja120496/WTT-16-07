Feature: OVR portal - Create the draw for the Sub event

  @OVR
  Scenario: To verify the create the draw for the sub event
    Given Login the OVR Application
    And Switch into WTT event 'Event_nameRLLXVNG'
    When create draw for subevent of 'Women's Singles' operation 'Load Modality'
    Then Logout the OVR Application