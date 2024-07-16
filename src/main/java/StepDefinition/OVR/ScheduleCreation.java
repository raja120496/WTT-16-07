package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.OVRElements.OVR_SchedulePage_Elements;

public class ScheduleCreation extends DriverInitialisation {

    @Given("User Create schedule for {string} and Enters {string} and Enters {string} and Enters {string} and Enters {string}")
    public static void createSchedule(String subEvent, String startTime, String duration, String fTable, String tTable) throws Exception {
        OVR_SchedulePage_Elements ovrSch =  PageFactory.initElements(driver,OVR_SchedulePage_Elements.class);
        Commonmethods base=new Commonmethods(driver,wait);

        ovrSch.OVR_ScheduleBtn.click();
        ovrSch.OVR_CrtScheduleBtn.click();
        ovrSch.OVR_SelectUnit.click();
        base.wait(2);
        driver.findElement(By.xpath("//b[normalize-space()=\""+subEvent+"\"]/parent::span/preceding-sibling::div")).click();
        for(int i=1; i<=6; i++){
            driver.findElement(By.xpath("(//div[@class='item-list-scrol']/li)["+i+"]")).click();
        }
        ovrSch.OVR_AddUnits.click();
        base.doubleClick(ovrSch.OVR_StartDate);
        ovrSch.OVR_Calender.click();
        ovrSch.OVR_TdyDate.click();
        ovrSch.OVR_StartTime.clear();
        ovrSch.OVR_StartTime.sendKeys(startTime);
        ovrSch.OVR_fromTable.click();
        base.wait(2);
        int i=Integer.parseInt(fTable);
        int fromTable = i+1;
        driver.findElement(By.xpath("(//div[@id='from_popup']/div/ul/li)["+fromTable+"]")).click();
        ovrSch.OVR_ToTable.click();
        base.wait(2);
        int j=Integer.parseInt(tTable);
        int toTable = j+1;
        driver.findElement(By.xpath("(//div[@id='to_popup']/div/ul/li)["+toTable+"]")).click();
        ovrSch.OVR_Duration.clear();
        ovrSch.OVR_Duration.sendKeys(duration);
        ovrSch.OVR_Duration.sendKeys(Keys.ENTER);
        base.wait(2);
        ovrSch.OVR_CreateScdl.click();
        base.wait(2);
        ovrSch.OVR_YesBtn.click();
        base.wait(2);
    }

    @Given("User Publish and move Schedule to StartList")
    public static void publishAndPushToStartList() throws Exception {
        OVR_SchedulePage_Elements ovrSch = PageFactory.initElements(driver, OVR_SchedulePage_Elements.class);
        Commonmethods base = new Commonmethods(driver, wait);
        Actions act = new Actions(driver);

        ovrSch.OVR_BoardTab.click();
        ovrSch.OVR_ShowFil.click();
        ovrSch.OVR_SelectDayDD_Board.click();
        ovrSch.OVR_SelectDate_Board.click();
        base.wait(2);
        int noOfTables = driver.findElements(By.xpath("//table[@id='main-table']/thead/tr/th")).size()-2;
        System.out.println(noOfTables);
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        base.wait(2);
        ovrSch.OVR_PublishBtn_Board.click();
        base.wait(2);
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        base.wait(2);
        ovrSch.OVR_ShowScheProp_Board.click();
        base.wait(1);
        ovrSch.OVR_StatusDD_Board.click();
        base.wait(1);
        ovrSch.OVR_SelStartList_Board.click();
        base.wait(1);
        ovrSch.OVR_UpdateBtn_Board.click();
    }

    @Given("User Verify Schedule in Units Board")
    public static void verifyScheduleInUnitsBoard() throws Exception {
        OVR_SchedulePage_Elements ovrSch = PageFactory.initElements(driver, OVR_SchedulePage_Elements.class);
        Commonmethods base = new Commonmethods(driver, wait);
        Actions act = new Actions(driver);


    }
}
