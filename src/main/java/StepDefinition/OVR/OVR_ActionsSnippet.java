package StepDefinition.OVR;

import StepDefinition.AdminPortal.EventCreationSnippet;
import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.OVRElements.OVR_Home_page_Elements;
import pages.OVRElements.OVR_login_page_Elements;

import java.util.List;

public class OVR_ActionsSnippet extends DriverInitialisation {
    OVR_Home_page_Elements OVR_Home = PageFactory.initElements(driver, OVR_Home_page_Elements.class);

    Commonmethods base = new Commonmethods(driver, wait);

    @When("^Switch WTT event$")
    public void Switch_WTT_Event() throws Exception{
        base.wait(5);
        OVR_Home.button_OVR_Homepage_SwitchEvent.click();
        base.wait(5);
        String eventname="Event_nameBLTXRGW";
        if (EventCreationSnippet.eventid!= null) {
            EventCreationSnippet.eventname=EventCreationSnippet.eventname;
        }
        else {
            EventCreationSnippet.eventname=eventname;
        }

        List<WebElement> rws = OVR_Home.button_OVR_Homepage_SwitchEvent_WTT.findElements(By.tagName("tr"));
        int rws_cnt = rws.size();

        for (int i = 2;i <= rws_cnt; i++) {

            String text=OVR_Home.button_OVR_Homepage_SwitchEvent_WTT.findElement(By.xpath("//tr["+i+"]//td[5]")).getText();


            //String text=rws.get(i).findElement(By.xpath("//td[contains(text(),'"+EventCreationSnippet.eventname.toString()+"')]")).getText().trim();

            System.out.println("eventname="+text);
            if (text.equals(EventCreationSnippet.eventname)){
                OVR_Home.button_OVR_Homepage_SwitchEvent_WTT.findElement(By.xpath("//tr["+i+"]//td[6]")).click();

            }


        }

    }
}
