Feature: OVR portal - Schedule feature

  @OVRSchedule
  Scenario Outline: To verify the OVR Schedule
    Given Login the OVR Application
    And User Create schedule for "<Sub event>" and Enters "<Start time>" and Enters "<Duration>" and Enters "<FromTable>" and Enters "<ToTable>"
    And User Publish and move Schedule to StartList
    And User Verify Schedule in Units Board
    Then Logout the OVR Application
    Examples:
      | Sub event | Start time | Duration | FromTable | ToTable |
      | Men's singles | 06:00  | 10      | 1           | 1      |
#      | Women's Singles | 09:00 | 10     | 1           | 1      |