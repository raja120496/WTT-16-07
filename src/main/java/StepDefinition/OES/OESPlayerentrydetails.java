package StepDefinition.OES;


import java.util.List;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import StepDefinition.TestClass;
import StepDefinition.AdminPortal.EventCreationSnippet;
import StepDefinition.AdminPortal.SubEventCreationSnippet;
import base.Commonmethods;
import pages.OESelements.OES_Home_page_Elements;
import pages.OESelements.OES_Playerentries_page_Elements;
import pages.OESelements.OES_event_page_Elements;
import util.Fileuploadrobotclass;


public class OESPlayerentrydetails extends DriverInitialisation {

	@Given("^OEs player entry details$")
	public static void OEs_playerentrydetails() throws Exception {

		//EventCreationSnippet.eventname="Event_nameFONTIZG";
		 //SubEventCreationSnippet.subeventype1="Closed";
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
		OEs_event.button_OEs_event_PlayerEntries.click();
		base.wait(3);
		//OEs_player.button_OEs_event_playerentries_subeventslist.click();

		List<WebElement> listOfElements=driver.findElements(By.xpath("//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card']"));

		System.out.println("list of number="+listOfElements.size());
		base.wait(1);

		String listevent;
		WebElement listdeventelement;
		String subevent_name;
		if(SubEventCreationSnippet.subeventype1.equals("Closed")) {
			for(int i=0;i<listOfElements.size();i++) {
				base.wait(2);
				listevent="(//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card'])"+"["+(i+1)+"]"+"//div[@class='eventscard-title']";
				listdeventelement=driver.findElement(By.xpath(listevent));

				subevent_name=listdeventelement.getText();

				base.wait(1);
				base.checkelementvisibility(listdeventelement);
				base.wait(2);
				listdeventelement.click();
				base.wait(6);
				OEs_player.button_OEs_event_playerentries_Actions.click();
				base.wait(2);
				OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries.click();
				base.wait(4);
				OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_PullfromRanking.click();
				base.wait(2);
				OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_MainDraw.click();
				base.wait(2);
				OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_QualificationDraw.click();
				base.wait(2);
				OEs_player.button_OEs_event_playerentries_Actions_PrefillEntries_UpdateEntries.click();
				base.wait(2);
				Assert.assertEquals(driver.switchTo().alert().getText(), "Are you sure want to update entries ? (Caution : this will clear your existing entries)");
				base.wait(1);
				driver.switchTo().alert().accept();
				base.wait(16);
				OEs_player.button_OEs_event_playerentries_Actions.click();
				base.wait(2);
				OEs_player.button_OEs_event_playerentries_Actions_AcceptEntries.click();
				base.wait(5);
				Assert.assertEquals("Published",OEs_player.text_OEs_event_playerentries_status.getText());
				base.wait(2);
				base.takescreenshoot(EventCreationSnippet.eventname+subevent_name+"_playerdetailsentry");
				OEs_player.button_OEs_event_playerentries_Back.click();
				base.wait(8);


			}
		}
		else if(SubEventCreationSnippet.subeventype1.equals("Open")) {
			for(int i=0;i<listOfElements.size();i++) {

				base.wait(2);
				listevent="(//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card'])"+"["+(i+1)+"]"+"//div[@class='eventscard-title']";
				listdeventelement=driver.findElement(By.xpath(listevent));

				//System.out.println(listdeventelement.getText());
				subevent_name=listdeventelement.getText();

				base.wait(1);
				base.checkelementvisibility(listdeventelement);
				base.wait(2);
				listdeventelement.click();
				base.wait(6);
				OEs_player.button_OEs_event_playerentries_Actions.click();
				base.wait(2);
				OEs_player.button_OEs_event_playerentries_Actions_ImportRecords.click();
				base.wait(2);
				OEs_player.filebutton_OEs_event_playerentries_Actions_ImportRecords_ChooseFile.click();
				base.wait(6);
				switch(subevent_name) {

				case "men's singles":
					Fileuploadrobotclass.fileuploadmethod("SamplePlayerEntries_Men'sOpenevent.xlsx");
					break;

				case "Women's Singles":
					Fileuploadrobotclass.fileuploadmethod("SamplePlayerEntries_Women'sOpenevent.xlsx");
					break;

				case "Men's Doubles":
					Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
					break;

				case "Women's Doubles":
					Fileuploadrobotclass.fileuploadmethod("PLE_Doubles_Template.xlsx");
					break;
				default:
					break;

				}


				base.wait(6);
				base.jclick(OEs_player.checkbox_OEs_event_playerentries_Actions_ImportRecords_SkipAll);
				base.wait(2);


				OEs_player.button_OEs_event_playerentries_Actions_ImportRecords_ImportRecords.click();
				base.wait(2);
				Assert.assertEquals( driver.switchTo().alert().getText(), "All old entries will be deleted. Can proceed?");
				driver.switchTo().alert().accept();
				base.wait(8);
				OEs_player.button_OEs_event_playerentries_Actions.click();
				base.wait(2);
				OEs_player.button_OEs_event_playerentries_Actions_AcceptEntries.click();
				base.wait(5);
				Assert.assertEquals("Published",OEs_player.text_OEs_event_playerentries_status.getText());
				base.wait(2);
				base.takescreenshoot(EventCreationSnippet.eventname+subevent_name+"_playerdetailsentry");
				OEs_player.button_OEs_event_playerentries_Back.click();
				base.wait(8);
			}

		}
		else {

		}
	}





}
