package StepDefinition.AdminPortal;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import StepDefinition.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;
import util.Fileuploadrobotclass;
import util.TestDataReader;


public class EventCreationSnippet extends DriverInitialisation
//public class EventCreationSnippet
{

	public static String eventid;
	public static String eventname;

	@Given("^Admin portal event creation$")
	public static void Adminportal_event_creation() throws Exception {
		//LoginSnippet.login();
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);	


		WebElement b;
		TestDataReader.tetsdatareader("Eventcreation.xlsx" , "EventCreation");
		for(int i=0;i<TestDataReader.TestheaderArray.length;i++) {
			String[] a=TestDataReader.TestheaderArray[i].toString().split("_");
			switch(a[0].toString()) {
			case "tab":
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.checkelementvisibility(b);
				base.wait(3);
				b.click();
				base.wait(1);
				break;			 
			case "button":
				try {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					base.wait(1);
					b.click();
					base.wait(1);
				}
				catch(Exception e) {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					base.wait(1);
					base.jclick(b);
					base.wait(1);
				}
				break;
			case "text":
				if(TestDataReader.TestheaderArray[i].toString().equals("text_event_core_tab_creation_EventName")) {

					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					b.clear();
					String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";				    
					StringBuilder sb = new StringBuilder();
					Random random = new Random();
					int length = 7;
					for(int k = 0; k < length; k++) {
						int index = random.nextInt(alphabet.length());
						char randomChar = alphabet.charAt(index);
						sb.append(randomChar);
					}

					String randomString = sb.toString();
					eventname=TestDataReader.TestdataArray[i].toString()+randomString;
					System.out.println("event name="+eventname);
					b.sendKeys(eventname);
					base.wait(1);

				}
				else {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					b.clear();
					b.sendKeys(TestDataReader.TestdataArray[i].toString());
					base.wait(1);
				}
				break;
			case "textsearchbar":
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.checkelementvisibility(b);
				b.clear();
				b.sendKeys(TestDataReader.TestdataArray[i].toString());
				base.wait(6);
				break;	 
			case "textarea":
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.checkelementvisibility(b);
				b.clear();
				b.sendKeys(TestDataReader.TestdataArray[i].toString());
				base.wait(1);
				break;			 
			case "searchtext":
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.checkelementvisibility(b);
				b.sendKeys(TestDataReader.TestdataArray[i].toString());
				base.wait(2);
				b.sendKeys(Keys.ENTER);
				base.wait(1);
				break;
			case "toggle":
				try {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					b.click();
					base.wait(1);
				}
				catch(Exception e) {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					base.jclick(b);
					base.wait(1);
				}
				break;			 
			case "checkbox":
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.checkelementvisibility(b);
				base.jclick(b);
				base.wait(1);
				break;
			case "bartext":
				b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
				base.checkelementvisibility(b);
				b.clear();
				b.sendKeys(TestDataReader.TestdataArray[i].toString());
				base.wait(1);
				break;	 		 
			case "date":

				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy, HH:mm:ss");
				if(a[a.length-1].contains("Start")) {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					LocalDateTime now = LocalDateTime.now(); 
					String date_var=dtf.format(now).toString();
					b.sendKeys(date_var);
				}
				else if(a[a.length-1].contains("End")) {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					LocalDateTime now = LocalDateTime.now().plusDays(1); 
					String date_var=dtf.format(now).toString();
					b.sendKeys(date_var);
				}
				else if(a[a.length-1].contains("From")) {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					LocalDateTime now = LocalDateTime.now(); 
					String date_var=dtf.format(now).toString();
					b.sendKeys(date_var);
				}
				else if(a[a.length-1].contains("To")) {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					LocalDateTime now = LocalDateTime.now().plusDays(1); 
					String date_var=dtf.format(now).toString();
					b.sendKeys(date_var);
				}
				else {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					LocalDateTime now = LocalDateTime.now(); 
					String date_var=dtf.format(now).toString();
					b.sendKeys(date_var);
				}
				break;

			case "filebutton":
				try {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					b.click();
					base.wait(3);
					Fileuploadrobotclass.fileuploadmethod(TestDataReader.TestdataArray[i].toString());
					base.wait(3);
				}
				catch(Exception e) {
					b=(WebElement) EventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(event);
					base.checkelementvisibility(b);
					base.jclick(b);
					base.wait(3);
					Fileuploadrobotclass.fileuploadmethod(TestDataReader.TestdataArray[i].toString());
					base.wait(3);
				}

			default:
				break;
			}


		}

		base.wait(5);
		base.jclick(event.button_event_creation_cCreate);
		base.wait(30);
		//      String eventsuccesspopmessage=event.text1_event_successpopupmessage.getText();
		//		
		//		Assert.assertEquals(eventsuccesspopmessage, "Event Added Successfully");

		base.wait(3);

		try {
			if(event.text1_event_eventdeails.isDisplayed()==true) {
				String tempeventid=event.text1_event_eventdeails.getText();

				String[] tempsubeventid1=tempeventid.toString().split("#");

				eventid=tempsubeventid1[1].toString();

				System.out.println("event id="+eventid);
				base.takescreenshoot("eventcreation");
			}
			else {
				base.takescreenshoot("eventcreationerror");	
			}
		}
		catch(NoSuchElementException e) {
			base.takescreenshoot("eventcreationerror");	

		}
		catch(Exception e) {
			base.takescreenshoot("eventcreationerror");	
			//e.printStackTrace();
		}
		base.wait(3);
		//admin.ittf_logout_button.click();





	}



}
