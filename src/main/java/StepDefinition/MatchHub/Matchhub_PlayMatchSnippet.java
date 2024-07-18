package StepDefinition.MatchHub;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.MatchHubElements.Matchhub_Home_Elements;
import pages.OVRElements.OVR_SchedulePage_Elements;

import java.util.ArrayList;
import java.util.List;

public class Matchhub_PlayMatchSnippet extends DriverInitialisation {
    @Given("Umpire selects {string} and selects {string} and Plays {string}")
    public static void playMatchInMatchHub(String tableNo, String subEvent, String bestOf) throws Exception {
        Matchhub_Home_Elements mHub =  PageFactory.initElements(driver,Matchhub_Home_Elements.class);
        Commonmethods base=new Commonmethods(driver,wait);

        base.wait(1);
        driver.findElement(By.xpath("//button[normalize-space()='Table "+tableNo+"']")).click();
        mHub.MH_TableEnt.click();
        base.wait(1);
        driver.findElement(By.xpath("//td[@class='event' and text()=\""+subEvent+"\"]")).click();
        mHub.MH_matchStart.click();
        base.wait(1);
        mHub.MH_startWarmup.click();
        base.wait(1);
        mHub.MH_cnfmBtn.click();
        base.wait(1);
        mHub.MH_strtMatch.click();
        base.wait(1);
        int a=Integer.parseInt(bestOf);
        int bestOfM= a-1;
        for(int i=1; i<=bestOfM; i++){
            if(i == 1){
                base.wait(1);
                mHub.MH_p2AddCard.click();
                mHub.MH_pyellowbtn.click();
                base.wait(1);
                mHub.MH_p1AddCard.click();
                mHub.MH_timeout.click();
                base.wait(5);
                mHub.MH_closeTOut.click();
                base.wait(1);
            } else if (i==3){
                base.wait(1);
                mHub.MH_p2AddCard.click();
                mHub.MH_pYellowRed1Btn.click();
                base.wait(1);
                mHub.MH_p1AddCard.click();
                mHub.MH_pYellowRed1Btn.click();
                base.wait(1);
            }
            if(i == 1){
                for(int j=1; j<=11; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p1AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p2AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            } else if (i==2){
                mHub.MH_p1AddCard.click();
                mHub.MH_pyellowbtn.click();
                base.wait(1);
            } else if(i==3){
                for(int j=1; j<=10; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p1AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p2AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            }
            if (i == 2 || i == 4){
                for(int j=1; j<=11; j++){
                    base.wait(1);
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p2AddPoint.click();
                    base.wait(1);
                    if(j==1) {
                        for (int k = 1; k <= 4; k++) {
                            mHub.MH_strtOfPlay.click();
                            base.wait(1);
                            mHub.MH_p1AddPoint.click();
                            base.wait(1);
                        }
                    }
                }
            }
            if(i != 5){
                mHub.MH_nextGame.click();
                base.wait(1);
            }
        }
        for(int j=1; j<=11; j++){
            if(j==6){
                mHub.MH_Decconfirm.click();
                base.wait(1);
            }
            base.wait(1);
            mHub.MH_strtOfPlay.click();
            base.wait(1);
            mHub.MH_p1AddPoint.click();
            base.wait(1);
            if(j==1) {
                for (int k = 1; k <= 4; k++) {
                    mHub.MH_strtOfPlay.click();
                    base.wait(1);
                    mHub.MH_p2AddPoint.click();
                    base.wait(1);
                }
            }
        }
        mHub.MH_confirm.click();
    }
}