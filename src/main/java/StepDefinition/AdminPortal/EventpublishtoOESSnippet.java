package StepDefinition.AdminPortal;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import StepDefinition.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;
import pages.AdminPortalElements.SubEventcreationElements;

public class EventpublishtoOESSnippet extends DriverInitialisation {

@Given("^Event publish into the admin portal to OES$")
	public static void Adminportal_event_publish_into_OEs() throws Exception {

		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		SubEventcreationElements subevent =  PageFactory.initElements(driver,SubEventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);

		base.wait(3);
		String static_eventid="3565";
		event.tab_event.click();
		base.wait(2);
		if (EventCreationSnippet.eventid!= null) {
			subevent.text_event_globalsearch.sendKeys(EventCreationSnippet.eventid);
		}
		else {
			subevent.text_event_globalsearch.sendKeys(static_eventid);
		}
		String successpopmessage;
		base.wait(1);
		subevent.button_event_searchresult.click();
		base.wait(1);
		subevent.button_event_action.click();
		base.wait(1);
		subevent.button_event_action_MarkasHostReviewed.click();
		base.wait(1);
		Assert.assertEquals(driver.switchTo().alert().getText().toString(), "Would you like to set Host Reviewed as YES ?");
		base.wait(1);
		driver.switchTo().alert().accept();
		base.wait(1);
		successpopmessage=subevent.text1_event_popupmessage.getText();
		Assert.assertEquals(successpopmessage, "Review status has been updated");
		base.wait(1);
		subevent.button_event_action.click();
		base.wait(1);
		subevent.button_event_action_MarkasSupervisorReviewed.click();
		base.wait(1);
		Assert.assertEquals(driver.switchTo().alert().getText().toString(), "Would you like to set Supervisor Reviewed as YES ?");
		base.wait(1);
		driver.switchTo().alert().accept();
		base.wait(1);
		successpopmessage=subevent.text1_event_popupmessage.getText();
		Assert.assertEquals(successpopmessage, "Review status has been updated");
		base.wait(1);

		base.wait(1);
		subevent.button_event_action.click();
		base.wait(1);
		subevent.button_event_action_SetStatusasPublished.click();
		base.wait(1);
		Assert.assertEquals(driver.switchTo().alert().getText().toString(), "Are you sure want to publish this event ?");
		base.wait(1);
		driver.switchTo().alert().accept();
		base.wait(1);
		successpopmessage=subevent.text1_event_popupmessage.getText();
		Assert.assertEquals(successpopmessage, "Status has been updated as Published");
		base.wait(1);

		Assert.assertEquals(subevent.text1_event_status.getText().toString(), "Published");
		base.wait(1);
		base.takescreenshoot(static_eventid+"_event_published");

	}

}
