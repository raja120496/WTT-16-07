Feature: MatchHub - login feature

  @OVR
  Scenario: To verify the OVR portal login
    Given Login the OVR Application
    When Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    And Umpire Login to the MatchHub
    Then Umpire Logouts MatchHub


#    Then Umpire Logout the OVR Application
