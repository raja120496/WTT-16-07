package StepDefinition.AdminPortal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import StepDefinition.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.EventcreationElements;
import pages.AdminPortalElements.SubEventcreationElements;
import util.TestDataReader;

public class SubEventCreationSnippet extends DriverInitialisation {

	public static String[] subeventid;

	public static String subeventype1;

	@Given("^create the subevent '(.*)' in the admin portal$")
	public static void Adminportal_Subevent_creation(String subeventstype) throws Exception {

		subeventype1=subeventstype; 
		EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);
		SubEventcreationElements subevent =  PageFactory.initElements(driver,SubEventcreationElements.class);
		Commonmethods base=new Commonmethods(driver,wait);
		TestDataReader.tetsdatareader("SubEventcreation.xlsx" , subeventstype);

		subeventid= new String[TestDataReader.numberrows];
		for(int j=1;j<=TestDataReader.numberrows;j++) {

			Object cellvalue = null;
			Cell cell1;
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
			base.wait(2);


			WebElement b;
			//TestDataReader.tetsdatareader("SubEventcreation.xlsx");
			for(int i=0;i<TestDataReader.TestheaderArray.length;i++) {
				String[] a=TestDataReader.TestheaderArray[i].toString().split("_");
				switch(a[0].toString()) {
				case "tab":
					b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
					base.checkelementvisibility(b);
					base.wait(5);
					b.click();
					base.wait(1);
					break;			 
				case "button":
					try {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						b.click();
						base.wait(3);
					}
					catch(Exception e) {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						base.jclick(b);
						base.wait(3);
					}
					break;
				case "text":
					b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
					base.checkelementvisibility(b);
					b.clear();
					cell1=TestDataReader.sheet.getRow(j).getCell(i);
					switch (cell1.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						cellvalue=cell1.getNumericCellValue();
						//System.out.print(cell1.getNumericCellValue() + "\n");
						break;
					case Cell.CELL_TYPE_STRING:
						cellvalue=cell1.getStringCellValue();
						//System.out.print(cell1.getStringCellValue() + "\n");
						break;
					}

					b.sendKeys(cellvalue.toString());
					//b.sendKeys(TestDataReader.TestdataArray[i].toString());
					base.wait(1);
					break;
				case "textarea":
					b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
					base.checkelementvisibility(b);
					b.clear();
					cell1=TestDataReader.sheet.getRow(j).getCell(i);
					switch (cell1.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						cellvalue=cell1.getNumericCellValue();
						//System.out.print(cell1.getNumericCellValue() + "\n");
						break;
					case Cell.CELL_TYPE_STRING:
						cellvalue=cell1.getStringCellValue();
						//System.out.print(cell1.getStringCellValue() + "\n");
						break;
					}

					b.sendKeys(cellvalue.toString());
					// b.sendKeys(TestDataReader.TestdataArray[i].toString());
					base.wait(1);
					break;			 
				case "searchtext":
					b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
					base.checkelementvisibility(b);
					cell1=TestDataReader.sheet.getRow(j).getCell(i);
					switch (cell1.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						cellvalue=cell1.getNumericCellValue();
						//System.out.print(cell1.getNumericCellValue() + "\n");
						break;
					case Cell.CELL_TYPE_STRING:
						cellvalue=cell1.getStringCellValue();
						//System.out.print(cell1.getStringCellValue() + "\n");
						break;
					}

					b.sendKeys(cellvalue.toString());
					//b.sendKeys(TestDataReader.TestdataArray[i].toString());
					base.wait(1);
					b.sendKeys(Keys.ENTER);
					base.wait(1);
					break;
				case "toggle":
					try {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						b.click();
						base.wait(1);
					}
					catch(Exception e) {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						base.jclick(b);
						base.wait(1);
					}
					break;			 
				case "checkbox":
					b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
					base.checkelementvisibility(b);
					base.jclick(b);
					base.wait(1);
					break;
				case "bartext":
					b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
					base.checkelementvisibility(b);
					b.clear();
					cell1=TestDataReader.sheet.getRow(j).getCell(i);
					switch (cell1.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						cellvalue=cell1.getNumericCellValue();
						//System.out.print(cell1.getNumericCellValue() + "\n");
						break;
					case Cell.CELL_TYPE_STRING:
						cellvalue=cell1.getStringCellValue();
						//System.out.print(cell1.getStringCellValue() + "\n");
						break;
					}

					b.sendKeys(cellvalue.toString());
					//b.sendKeys(TestDataReader.TestdataArray[i].toString());
					base.wait(1);
					break;	 		 
				case "date":

					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyy, HH:mm:ss");
					if(a[a.length-1].contains("Start")) {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						LocalDateTime now = LocalDateTime.now(); 
						String date_var=dtf.format(now).toString();
						b.sendKeys(date_var);
						base.wait(2);
					}
					else if(a[a.length-1].contains("End")) {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						LocalDateTime now = LocalDateTime.now().plusDays(1); 
						String date_var=dtf.format(now).toString();
						b.sendKeys(date_var);
						base.wait(2);
					}
					else if(a[a.length-1].contains("From")) {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						LocalDateTime now = LocalDateTime.now(); 
						String date_var=dtf.format(now).toString();
						b.sendKeys(date_var);
						base.wait(2);
					}
					else if(a[a.length-1].contains("To")) {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						LocalDateTime now = LocalDateTime.now().plusDays(1); 
						String date_var=dtf.format(now).toString();
						b.sendKeys(date_var);
						base.wait(2);
					}
					else {
						b=(WebElement) SubEventcreationElements.class.getField(TestDataReader.TestheaderArray[i].toString()).get(subevent);
						base.checkelementvisibility(b);
						LocalDateTime now = LocalDateTime.now(); 
						String date_var=dtf.format(now).toString();
						b.sendKeys(date_var);
						base.wait(2);
					}
					break;	 	 
				default:
					break;
				}


			}


			String subreventsuccesspopmessage=subevent.text1_subevents_successpopupmessage.getText();

			Assert.assertEquals(subreventsuccesspopmessage, "Sub Event Added Successfully");

			base.wait(3);
			String tempsubeventid=subevent.text1_subevents_subeventdeails.getText();

			String[] tempsubeventid1=tempsubeventid.toString().split("#");

			subeventid[j-1]=tempsubeventid1[1].toString();

			System.out.println("Sub event id="+subeventid[j-1]);

			base.takescreenshoot(subeventid[j-1]+"subeventcreated");

			//admin.ittf_logout_button.click();

		}


	}

	public static void main(String[] args) {


	}

}
