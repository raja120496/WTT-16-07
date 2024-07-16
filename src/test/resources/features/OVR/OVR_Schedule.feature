Feature: OVR portal - Schedule feature

  @OVRSchedule
  Scenario Outline: To verify the OVR Schedule
    Given Login the OVR Application
    When Switch into WTT event 'WTT Youth Contender Sulaymaniyah 2024'
    And User Create schedule for "<Sub event>" and Enters "<NoOfMatch>" and Enters "<Start time>" and Enters "<Duration>" and Enters "<FromTable>" and Enters "<ToTable>"
    And User Publish and move Schedule to StartList
    And User Verify Schedule in Units Board
    Then Logout the OVR Application
    Examples:
      | Sub event | NoOfMatch | Start time | Duration | FromTable | ToTable |
      | U15 Boys Singles | 4  | 06:00  | 10      | 1           | 6      |
      | U15 Girls Singles | 4 | 09:00 | 10     | 2          | 6      |