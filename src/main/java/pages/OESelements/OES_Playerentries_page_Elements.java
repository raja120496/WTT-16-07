package pages.OESelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OES_Playerentries_page_Elements {

	WebDriver driver;

	public OES_Playerentries_page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//sub-event-entries-list//div[@class='row m0']//div[@class='eventslist-card'])")
	public WebElement button_OEs_event_playerentries_subeventslist;

	@FindBy(xpath = "//button[contains(text(),'Actions')]")
	public WebElement button_OEs_event_playerentries_Actions;

	@FindBy(xpath = "//button[contains(text(),'Back')]")
	public WebElement button_OEs_event_playerentries_Back;

	@FindBy(xpath = "//button[contains(text(),'Prefill Entries')]")
	public WebElement button_OEs_event_playerentries_Actions_PrefillEntries;

	@FindBy(xpath = "//mat-dialog-container//button[contains(text(),'Pull from Ranking')]")
	public WebElement button_OEs_event_playerentries_Actions_PrefillEntries_PullfromRanking;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Main Draw')]")
	public WebElement button_OEs_event_playerentries_Actions_PrefillEntries_MainDraw;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Qualification Draw')]")
	public WebElement button_OEs_event_playerentries_Actions_PrefillEntries_QualificationDraw;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Cancel']")
	public WebElement button_OEs_event_playerentries_Actions_PrefillEntries_Cancel;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Exclude and Recompute']")
	public WebElement button_OEs_event_playerentries_Actions_PrefillEntries_ExcludeandRecompute;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Update Entries']")
	public WebElement button_OEs_event_playerentries_Actions_PrefillEntries_UpdateEntries;

	@FindBy(xpath = "//button[contains(text(),'Import Records')]")
	public WebElement button_OEs_event_playerentries_Actions_ImportRecords;

	@FindBy(xpath = "//mat-dialog-container//label[text()=' Choose File (.xlsx) ']")
	public WebElement filebutton_OEs_event_playerentries_Actions_ImportRecords_ChooseFile;

	@FindBy(xpath = "//mat-dialog-container//b[text()='Skip All']//following-sibling::input[@type='checkbox']")
	public WebElement checkbox_OEs_event_playerentries_Actions_ImportRecords_SkipAll;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Cancel']")
	public WebElement button_OEs_event_playerentries_Actions_ImportRecords_Cancel;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Import Records ']")
	public WebElement button_OEs_event_playerentries_Actions_ImportRecords_ImportRecords;

	@FindBy(xpath = "//button[text()='Accept Entries']")
	public WebElement button_OEs_event_playerentries_Actions_AcceptEntries;

	@FindBy(xpath = "//button[text()='Global Status : ']//span")
	public WebElement text_OEs_event_playerentries_status;

}
