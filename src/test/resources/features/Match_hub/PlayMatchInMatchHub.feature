Feature: Matchhub - Play match feature

  @OVRSchedule
  Scenario Outline: To verify umpire playing matches in Matchhub
    Given Login the OVR Application
    When Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    And Umpire Login to the MatchHub
    And Umpire selects "<TableNo>" and selects "<Match>" and Plays "<BestOf>"
    Then Umpire Logouts MatchHub
    Examples:
      | TableNo |Match | BestOf |
      | 4 | U15 Boys Singles | 5 |
#      | U15 Girls Singles | 4 | 09:00 | 10     | 2          | 6      |