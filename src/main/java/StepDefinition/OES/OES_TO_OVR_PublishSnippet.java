package StepDefinition.OES;

import StepDefinition.AdminPortal.EventCreationSnippet;
import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.OESelements.OES_Home_page_Elements;
import pages.OESelements.OES_Playerentries_page_Elements;
import pages.OESelements.OES_event_page_Elements;



public class OES_TO_OVR_PublishSnippet extends DriverInitialisation {

    @Given("^EVent Publish OES into OVR$")
    public void OES_To_OVR_Publish()throws Exception{
        String eventname="Event_nameBLTXRGW";
        OES_Home_page_Elements OEs_home =  PageFactory.initElements(driver,OES_Home_page_Elements.class);
        OES_event_page_Elements OEs_event =  PageFactory.initElements(driver,OES_event_page_Elements.class);
        OES_Playerentries_page_Elements OEs_player =  PageFactory.initElements(driver,OES_Playerentries_page_Elements.class);
        Commonmethods base=new Commonmethods(driver,wait);
        base.wait(1);
        if (EventCreationSnippet.eventid!= null) {
            EventCreationSnippet.eventname=EventCreationSnippet.eventname;
        }
        else {
            EventCreationSnippet.eventname=eventname;
        }
        OEs_home.text_OEs_searchbar.sendKeys(EventCreationSnippet.eventname.toString());
        base.wait(2);
        String Oesresult="(//div[text()='"+EventCreationSnippet.eventname+"']//parent::div)[1]";
        WebElement Oesresult_element=driver.findElement(By.xpath(Oesresult));
        Oesresult_element.click();
        base.wait(4);
        OEs_event.button_OEs_event_Actions.click();
        base.wait(2);
        OEs_event.button_OEs_event_Action_Step2.click();
        //Assert.assertEquals(driver.switchTo().alert().getText().toString(), "Would you like to set Supervisor Reviewed as YES ?");
        //base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(120);
        OEs_event.button_OEs_event_Actions.click();
        base.wait(2);
        OEs_event.button_OEs_event_Action_Step3.click();
        //Assert.assertEquals(driver.switchTo().alert().getText().toString(), "Would you like to set Supervisor Reviewed as YES ?");
        //base.wait(1);
        driver.switchTo().alert().accept();
        base.wait(12);

    }
}
