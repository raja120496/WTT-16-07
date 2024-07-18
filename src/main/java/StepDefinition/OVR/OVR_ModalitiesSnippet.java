package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.OVRElements.OVR_Home_page_Elements;
import pages.OVRElements.OVR_Modalities_page_Elements;

import java.util.List;

public class OVR_ModalitiesSnippet extends DriverInitialisation {

    OVR_Modalities_page_Elements OVR_Modalities = PageFactory.initElements(driver, OVR_Modalities_page_Elements.class);
    OVR_Home_page_Elements OVR_Home = PageFactory.initElements(driver, OVR_Home_page_Elements.class);
    Commonmethods base = new Commonmethods(driver, wait);

    public static int event_list_index;

    public static WebElement particular_event_element;
    @When("^create draw for subevent of '(.*)' operation '(.*)'$")
    public void create_draw(String Subeventname, String operation) throws Exception{

        base.wait(2);
        OVR_Home.button_OVR_Homepage_RightMenu_modality.click();
        base.wait(2);

        List<WebElement> Event_list=OVR_Modalities.text_OVR_Modalities_eventlist.findElements(By.xpath("//span[contains(@id,'Event')]"));
        System.out.println("Size="+Event_list.size());
        for (int i=0;i<Event_list.size();i++){
            base.wait(1);
            System.out.println(i);
            String eventname=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+i+"')]")).getText();
            //String eventname=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//li["+i+"]//span[contains(@class,'tree-label')]")).getText();
            System.out.println(eventname);
               if(eventname.equals(Subeventname)){
                System.out.println("listnumber="+i);
                event_list_index=i;
                break;
            }

        }
        base.wait(2);
        WebElement Dynamic_event_element=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]"));
        Dynamic_event_element.click();
        String Dynamic_event_name=Dynamic_event_element.getText();
        if(Subeventname.equals(Dynamic_event_name)) {
            base.wait(3);
            //WebElement DropdownElement=particular_event_element.findElement(By.xpath("//a[@id='dropdownMenuButton']//img"));
            WebElement DropdownElement=OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[@id='dropdownMenuButton']"));
            base.wait(3);
            base.jclick(DropdownElement);
            base.wait(3);
            switch (operation) {

                case "Create/Update Phase":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Create/Update Phase')]")).click();
                   // particular_event_element.findElement(By.xpath("//a[contains(text(),'Create/Update Phase')]")).click();
                    base.wait(1);
                    break;
                case "Create/Update Modality":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Create/Update Phase')]")).click();

                    //particular_event_element.findElement(By.xpath("//a[contains(text(),'Create/Update Modality")).click();
                    base.wait(1);
                    break;
                case "Load Modality":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Load Modality')]")).click();

                   // particular_event_element.findElement(By.xpath("//a[contains(text(),'Load Modality]")).click();
                    base.wait(1);
                    break;
                case "Remove Progression":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Remove Progression')]")).click();

                   // particular_event_element.findElement(By.xpath("//a[contains(text(),'Remove Progression')]")).click();
                    base.wait(1);
                    break;
                case "Pools":
                    OVR_Modalities.text_OVR_Modalities_eventlist.findElement(By.xpath("//span[contains(@id,'Event"+event_list_index+"')]//parent::li//a[contains(text(),'Pools')]")).click();

                    //particular_event_element.findElement(By.xpath("//a[contains(text(),'Pools")).click();
                    base.wait(1);
                    break;

            }
        }
        else {
            Assert.fail("Sub-Event not available");
        }

    }

}
