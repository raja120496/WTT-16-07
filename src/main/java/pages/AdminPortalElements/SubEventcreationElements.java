package pages.AdminPortalElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubEventcreationElements {

	WebDriver driver;



	public SubEventcreationElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	//search event 

	@FindBy(xpath = "//input[@placeholder='Search by Tournament Name,Type,Organization,Country,Status']")
	public WebElement text_event_globalsearch;

	@FindBy(xpath = "//table//tbody//tr[1]//td[1]//span")
	public WebElement button_event_searchresult;

	@FindBy(xpath = "//button//span[contains(text(),'Actions')]")
	public WebElement button_event_action;

	@FindBy(xpath = "//button[text()='Mark as Host Reviewed']")
	public WebElement button_event_action_MarkasHostReviewed;

	@FindBy(xpath = "//button[text()='Mark as Supervisor Reviewed']")
	public WebElement button_event_action_MarkasSupervisorReviewed;

	@FindBy(xpath = "//button[text()='Set Status as Published']")
	public WebElement button_event_action_SetStatusasPublished;

	@FindBy(xpath = "//span[text()='Status : ']//following-sibling::span")
	public WebElement text1_event_status;

	@FindBy(xpath = "(//simple-snack-bar//span)[1]")
	public WebElement text1_event_popupmessage;


	@FindBy(xpath = "//div[text()='Sub Events']")
	public WebElement tab_subevents;

	@FindBy(xpath = "//button[@class='prime_button mob-mt-10 ng-star-inserted']")
	public WebElement button_create_subevents;

	@FindBy(xpath = "//button//span[text()='Next']")
	public WebElement button_create_subevents_next;

	// 1.Basics

	@FindBy (xpath = "//div[text()='1: Basics']")
	public WebElement tab_subevents_basics;

	@FindBy (xpath = "//span[text()='Select Sub Event Type']")
	public WebElement button_sub_event_type;

	@FindBy (xpath = "//input[@placeholder='Search Sub Event Type']")
	public WebElement searchtext_sub_event_typesearch;

	@FindBy (xpath = "//textarea[@placeholder='Description']")
	public WebElement text_subevent_description;

	@FindBy (xpath = "//span[text()='Select Event Restriction']")
	public WebElement button_subevent_eventrestiction;

	@FindBy (xpath = "//input[@placeholder='Search Event Restriction']")
	public WebElement searchtext_subevent_eventrestictionsearch;

	@FindBy (xpath = "//div[contains(text(),'Is Optional')]//parent::div//following-sibling::div//label")
	public WebElement toggle_subevent_IsOptional;

	@FindBy (xpath = "//input[@name='Sub Event Name']")
	public WebElement text_subevent_name;

	@FindBy (xpath = "//span[text()='Select Entry Type']")
	public WebElement button_Entry_Type;

	@FindBy (xpath = "//input[@placeholder='Search Entry Type']")
	public WebElement searchtext_Entry_Typesearch;

	@FindBy (xpath = "//input[@name='NumberOfTotalMatches']")
	public WebElement text_subevent_totalmatches_no;

	@FindBy (xpath = "//span[text()='Select Paralympic Classes']")
	public WebElement text_subevent_paralympic_classes;

	//Entries/Seeding Ranking

	@FindBy (xpath = "//span[text()='Enter Entries Ranking Year']")
	public WebElement button_subevent_entriesranking_year;

	@FindBy (xpath = "//input[@placeholder='Search Entries Ranking Year']")
	public WebElement searchtext_subevent_entriesranking_yearsearch;

	@FindBy (xpath = "//input[@placeholder='Enter Entries Ranking Month']")
	public WebElement text_subevent_entriesranking_month;

	@FindBy (xpath = "//span[text()='Select Seeding Ranking Week']")
	public WebElement button_subevent_seedingranking_week;

	@FindBy (xpath = "//input[@placeholder='Search Seeding Ranking Week']")
	public WebElement searchtext_subevent_seedingranking_weeksearch;

	@FindBy (xpath = "//span[text()='Select Entries Ranking Week']")
	public WebElement button_subevent_entriesranking_week;

	@FindBy (xpath = "//input[@placeholder='Search Entries Ranking Week']")
	public WebElement searchtext_subevent_entriesranking_weeksearch;

	@FindBy (xpath = "//span[text()='Enter Seeding Ranking Year']")
	public WebElement button_subevent_seddingranking_year;

	@FindBy (xpath = "//input[@placeholder='Search Seeding Ranking Year']")
	public WebElement searchtext_subevent_seddingranking_yearsearch;

	@FindBy (xpath = "//input[@placeholder='Enter Seeding Ranking Month']")
	public WebElement text_subevent_seedingranking_month;

	//Entries Deadline

	@FindBy (xpath = "//input[@placeholder='Select Date']")
	public WebElement date_subevent_entries_deadline;

	//Age Category Information

	@FindBy (xpath = "//span[text()='Select Tournament Age Category']")
	public WebElement button_subevent_tournament_agecategory;

	@FindBy (xpath = "(//span[text()='Select Tournament Age Category']/../../parent::div[@class='cuppa-dropdown']//input)[1]")
	public WebElement text_subevent_tournament_agecategorysearch;

	@FindBy (xpath = "(//span[text()='Select Tournament Age Category']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	public WebElement checkbox_subevent_tournament_agecategorysearchresult;

	//Conducting Draws Information

	@FindBy (xpath = "//span[text()='Select Event Draws']")
	public WebElement button_subevent_draws;

	@FindBy (xpath = "(//div[contains(text(),'Draws')])[2]")
	public WebElement button_subevent_drawsss;

	@FindBy (xpath = "//input[@placeholder='Search Event Draws']")
	public WebElement text_subevent_drawssearch;

	@FindBy (xpath = "//mat-pseudo-checkbox[@class='mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted']")
	public WebElement checkbox_subevent_drawssearch;

	@FindBy (xpath = "//mat-icon[text()='close']")
	public WebElement button_subevent_drawsicon;

	//Playing Draws Information

	@FindBy (xpath = "//span[text()='Select Sub Event Playing Draw']")
	public WebElement button_subevent_playing_draw;

	@FindBy (xpath = "//input[@placeholder='Search Sub Event Playing Draw']")
	public WebElement searchtext_subevent_playing_drawsearch;

	/*
	 * @FindBy (xpath = "//span[text()='Next']") public WebElement
	 * tab_subevent_next;
	 */

	//2.Phases

	@FindBy (xpath = "//div[text()='2: Phases']")
	public WebElement tab_subevents_Phases;

	@FindBy (xpath = "//button[text()='Add New']")
	public WebElement button_subevent_addnew_phases;

	@FindBy (xpath = "//mat-dialog-container//span[text()='Select Phase']")
	public WebElement button_subevent_phases_AddPhase_selectphase;

	@FindBy (xpath = "(//mat-dialog-container//span[text()='Select Phase']/../../parent::div[@class='cuppa-dropdown']//input)[1]")
	public WebElement text_subevent_phases_AddPhase_selectphasesearch;

	@FindBy (xpath = "(//mat-dialog-container//span[text()='Select Phase']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	public WebElement checkbox_subevent_phases_AddPhase_selectphasesearchresult;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Draw')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_subevent_phases_AddPhase_Draw;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Draw')]//parent::div//parent::div//input[@type='text']")
	public WebElement text_subevent_phases_AddPhase_Drawsearch;

	@FindBy (xpath = "(//mat-dialog-container//div[contains(text(),'Draw')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_subevent_phases_AddPhase_Drawsearchresult;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Start Date Time')]//parent::div//parent::div//input")
	public WebElement date_subevent_phases_AddPhase_StartDateTime;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'End Date Time')]//parent::div//parent::div//input")
	public WebElement date_subevent_phases_AddPhase_EndDateTime;

	@FindBy (xpath = "//mat-dialog-container//span[text()='Proceed']")
	public WebElement button_subevent_phases_AddPhase_proceed;

	@FindBy (xpath = "//mat-dialog-container//span[text()='Cancel']")
	public WebElement button_subevent_phases_AddPhase_cancel;

	/*
	 * @FindBy (xpath = "//span[text()='Next']") public WebElement
	 * button_subevent_next;
	 */

	//3.Prize

	@FindBy (xpath = "//div[text()='3: Prize']")
	public WebElement tab_subevents_Prize;

	@FindBy (xpath = "//input[@placeholder='Search...'])")
	public WebElement text_subevents_prize_search;

	@FindBy (xpath = "//button[text()='Add New']")
	public WebElement button_subevent_addnew_prize;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Event Draw')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_subevents_prize_AddPrizeInformation_selecteventdraw;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Event Draw')]//parent::div//parent::div//input[@type='text']")
	public WebElement text_subevents_prize_AddPrizeInformation_selecteventdrawsearch;

	@FindBy (xpath = "(//mat-dialog-container//div[contains(text(),'Event Draw')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_subevents_prize_AddPrizeInformation_selecteventdrawsearchresult;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Phase')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_subevent_prize_AddPrizeInformation_selectphase;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Phase')]//parent::div//parent::div//input[@type='text']")
	public WebElement text_subevent_prize_AddPrizeInformation_selectphasesearch;

	@FindBy (xpath = "(//mat-dialog-container//div[contains(text(),'Phase')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_subevent_prize_AddPrizeInformation_selectphasesearchresult;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Prize Position')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_subevent_prize_AddPrizeInformation_prizeposition;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Prize Position')]//parent::div//parent::div//input[@type='text']")
	public WebElement text_subevent_prize_AddPrizeInformation_prizepositionsearch;

	@FindBy (xpath = "(//mat-dialog-container//div[contains(text(),'Prize Position')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_subevent_prize_AddPrizeInformation_prizepositionsearchresult;

	@FindBy (xpath = "//mat-dialog-container//input[@name='field.display']")
	public WebElement text_subevent_prize_AddPrizeInformation_prizemoney;

	@FindBy (xpath = "//mat-dialog-container//span[text()='Cancel']")
	public WebElement button_subevent_prize_AddPrizeInformation_cancel;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Currency')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_subevent_prize_AddPrizeInformation_selectcurrency;

	@FindBy (xpath = "//mat-dialog-container//div[contains(text(),'Currency')]//parent::div//parent::div//input[@type='text']")
	public WebElement text_subevent_prize_AddPrizeInformation_selectcurrencysearch;

	@FindBy (xpath = "(//mat-dialog-container//div[contains(text(),'Currency')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_subevent_prize_AddPrizeInformation_selectcurrencysearchresult;

	@FindBy (xpath = "//mat-dialog-container//span[text()='Proceed']")
	public WebElement button_subevent_prize_AddPrizeInformation_proceed;

	//4: Review

	@FindBy (xpath = "//div[text()='4: Review']")
	public WebElement tab_subevents_Review;

	@FindBy (xpath = "//span[text()='Create']")
	public WebElement button_subevent_Create;

	@FindBy (xpath = "//button[text()='Cancel']")
	public WebElement tab_subevent_Cancel;

	// success message 

	@FindBy (xpath = "//span[text()='Sub Event Added Successfully']")
	public WebElement text1_subevents_successpopupmessage;

	@FindBy (xpath = "//span[contains(text(),'Sub Event Details')]")
	public WebElement text1_subevents_subeventdeails;

}
