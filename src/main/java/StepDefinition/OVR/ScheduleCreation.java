package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
//import jdk.internal.org.jline.terminal.TerminalBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.OVRElements.OVR_SchedulePage_Elements;

import java.util.ArrayList;
import java.util.List;

public class ScheduleCreation extends DriverInitialisation {
       public static List l1;
       public static List l2;
    @Given("User Create schedule for {string} and Enters {string} and Enters {string} and Enters {string} and Enters {string} and Enters {string}")
    public static void createSchedule(String subEvent, String noOfMatch, String startTime, String duration, String fTable, String tTable) throws Exception {
        OVR_SchedulePage_Elements ovrSch =  PageFactory.initElements(driver,OVR_SchedulePage_Elements.class);
        Commonmethods base=new Commonmethods(driver,wait);

        ovrSch.OVR_ScheduleBtn.click();
        ovrSch.OVR_CrtScheduleBtn.click();
        ovrSch.OVR_SelectUnit.click();
        base.wait(2);
        driver.findElement(By.xpath("//b[normalize-space()=\""+subEvent+"\"]/parent::span/preceding-sibling::div")).click();
        int noOfMatches=Integer.parseInt(noOfMatch);
        for(int i=1; i<=noOfMatches; i++){
            driver.findElement(By.xpath("(//div[@class='item-list-scrol']/li)["+i+"]")).click();
        }
        ovrSch.OVR_AddUnits.click();
        base.wait(1);
        base.doubleClick(ovrSch.OVR_StartDate);
        base.wait(1);
        ovrSch.OVR_Calender.click();
        base.wait(1);
        ovrSch.OVR_TdyDate.click();
        base.wait(1);
        ovrSch.OVR_StartTime.clear();
        base.wait(1);
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
        base.wait(2);
        ovrSch.OVR_SelectDayDD_Board.click();
        base.wait(1);
        ovrSch.OVR_SelectDate_Board.click();
        base.wait(2);
        List<WebElement> ele= driver.findElements(By.xpath("//table[@id='main-table']/tbody/tr/td[contains(@class,'schedule')]//b[@data-toggle='tooltip']"));
        l1 = new ArrayList();
        for (WebElement ele1: ele){
            l1.add(ele1.getText());
        }
        base.wait(2);
        List<WebElement> sch= driver.findElements(By.xpath("//table[@id='main-table']/tbody/tr/td[contains(@class,'schedule') and contains(@data-schedule,\"Scheduled\")]//b[@data-toggle='tooltip']"));
        int totalMatches = sch.size();
        for(int i=1; i<=totalMatches; i++){
            WebElement elementToHover = driver.findElement(By.xpath("(//table[@id='main-table']/tbody/tr/td[contains(@class,'schedule') and contains(@data-schedule,\"Scheduled\")]//b[@data-toggle='tooltip'])["+i+"]"));
            act.keyDown(Keys.CONTROL).moveToElement(elementToHover).click().keyUp(Keys.CONTROL).perform();
        }
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
        base.wait(1);
    }

    @Given("User Verify Schedule in Units Board")
    public static void verifyScheduleInUnitsBoard() throws Exception {
        OVR_SchedulePage_Elements ovrSch = PageFactory.initElements(driver, OVR_SchedulePage_Elements.class);
        Commonmethods base = new Commonmethods(driver, wait);
        Actions act = new Actions(driver);

        ovrSch.OVR_unitsBoard.click();
        base.wait(2);
        ovrSch.OVR_unitsDayDD.click();
        base.wait(1);
        ovrSch.OVR_unitsSelDate.click();
        base.wait(1);
        List<WebElement> ele1= driver.findElements(By.xpath("//table[@id='id_of_table']/tbody/tr/td[contains(@class,'btn-success')]"));
        l2 = new ArrayList();
        for (WebElement ele2: ele1){
            l2.add(ele2.getText());
        }
        if(l1.equals(l2)){
            System.out.println("Matches Scheduled moved to start list and reflecting in Units board");
        }
    }
}