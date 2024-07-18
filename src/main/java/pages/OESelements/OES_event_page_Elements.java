package pages.OESelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OES_event_page_Elements {

	WebDriver driver;

	public OES_event_page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='Event Details']")
	public WebElement button_OEs_event_EventDetails;

	@FindBy(xpath = "//div[text()='Player Entries']")
	public WebElement button_OEs_event_PlayerEntries;

	@FindBy(xpath = "//div[text()='Sub Events']")
	public WebElement button_OEs_event_SubEvents;

	@FindBy(xpath = "//div[text()='Prospectus']")
	public WebElement button_OEs_event_Prospectus;

	@FindBy(xpath = "//div[text()='Participant Registration & Hospitality']")
	public WebElement button_OEs_event_ParticipantRegistrationHospitality;

	@FindBy(xpath = "//div[text()='URC']")
	public WebElement button_OEs_event_URC;

	@FindBy(xpath = "//div[text()='Reports']")
	public WebElement button_OEs_event_Reports;

	@FindBy(xpath = "//div[text()='Non-MA Entries']")
	public WebElement button_OEs_event_NonMAEntries;

	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	public WebElement button_OEs_event_Actions;

	@FindBy(xpath = "//button[text()='(Step 2) OVR - Send Participant Details']")
	public WebElement button_OEs_event_Action_Step2;

	@FindBy(xpath = "//button[text()='(Step 3) OVR - Transfer Control To OVR']")
	public WebElement button_OEs_event_Action_Step3;

}
