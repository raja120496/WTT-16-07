package pages.AdminPortalElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventcreationElements {



	WebDriver driver;



	public EventcreationElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}




	@FindBy(xpath = "//a[@href='#/list/events/tournaments']")
	public WebElement tab_event;


	@FindBy(xpath = "//button[@class='prime_button mob-mt-10 ng-star-inserted']")
	public WebElement button_event_core_tab_creation;


	@FindBy(xpath = "//div[contains(text(),'Event Name')]//parent::div//parent::div//input")
	public  WebElement text_event_core_tab_creation_EventName;

	@FindBy(xpath = "//span[text()='All Event Core Types']/../../parent::mat-select")
	public WebElement button_event_core_tab_creation_EventCoreType;


	@FindBy(xpath = "//input[@placeholder='Search Event Core Type']")
	public WebElement searchtext_event_core_tab_creation_searchEventCoreType;

	@FindBy(xpath = "//div[contains(text(),'Is Closed Event')]//parent::div//following-sibling::div//label")
	public WebElement toggle_event_core_tab_creation_IsClosedEvent;

	@FindBy(xpath = "//div[contains(text(),'Is AI Enabled')]//parent::div//following-sibling::div//label")
	public WebElement toggle_event_core_tab_creation_IsAIEnabled;

	@FindBy(xpath = "//div[contains(text(),'Is Betting Enabled')]//parent::div//following-sibling::div//label")
	public WebElement toggle_event_core_tab_creation_IsBettingEnabled;

	@FindBy(xpath = "//div[contains(text(),'Is Front End Platform Visible')]//parent::div//following-sibling::div//label")
	public WebElement toggle_event_core_tab_creation_IsFrontEndPlatformVisible;

	@FindBy(xpath = "//div[contains(text(),'Active')]//parent::div//following-sibling::div//label")
	public WebElement toggle_event_core_tab_creation_Active;

	@FindBy(xpath = "//div[contains(text(),'Show Organizer in OES')]//parent::div//following-sibling::div//label")
	public WebElement toggle_event_core_tab_creation_ShowOrganizerinOES;

	@FindBy(xpath = "//span[text()='Select Organization']")
	public WebElement button_event_core_tab_creation_SelectOrganization;

	@FindBy(xpath = "//span[text()='Select Organization']/../../parent::div[@class='cuppa-dropdown']//input")
	public WebElement searchtext_event_core_tab_creation_SelectOrganizationsearch;

	@FindBy(xpath ="(//span[text()='Select Organization']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_core_tab_creation_SelectOrganizationsearchresult;


	@FindBy(xpath = "//span[text()='Select Currency']")
	public WebElement button_event_core_tab_creation_SelectCurrency;

	@FindBy(xpath = "//span[text()='Select Currency']/../../parent::div[@class='cuppa-dropdown']//input")
	public WebElement searchtext_event_creation_SelectCurrencysearch;

	@FindBy(xpath = "(//span[text()='Select Currency']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_SelectCurrencysearchresult;

	@FindBy(xpath = "//div[contains(text(),'Tags')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_Tags;

	@FindBy(xpath = "//div[contains(text(),'Website')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_Website;

	@FindBy(xpath = "//div[contains(text(),'WYC Deadline Hours')]/../parent::div//input")
	public WebElement text_event_creation_WYCDeadlineHours;

	@FindBy(xpath = "//span[text()='Select Time Zone']")
	public WebElement button_event_core_tab_creation_SelectTimeZone;

	@FindBy(xpath = "//span[text()='Select Time Zone']/../../parent::div[@class='cuppa-dropdown']//input")
	public WebElement searchtext_event_core_tab_creation_SelectTimeZonesearch;

	@FindBy(xpath = "(//span[text()='Select Time Zone']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_core_tab_creation_SelectTimeZonesearchresult;

	@FindBy(xpath = "//div[contains(text(),'Tournament Logo')]/../parent::div//label")
	public WebElement filebutton_event_core_tab_creation_TournamentLogo;

	//		@FindBy(xpath = "//span[text()='Select Venue']/../../parent::mat-select")
	//	    public WebElement button_event_core_tab_creation_SelectVenue;

	@FindBy(xpath = "//span[text()='Select Venue']")
	public WebElement button_event_core_tab_creation_SelectVenue;

	@FindBy(xpath = "//input[@placeholder='Search Venue']")
	public WebElement searchtext_event_core_tab_creation_SelectVenuesearch;

	@FindBy(xpath = "//div[contains(text(),'GPS Co-Ordinates')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_GPSCoOrdinates;

	@FindBy(xpath = "//div[contains(text(),'Address Line1')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_AddressLine1;

	@FindBy(xpath = "//div[contains(text(),'Address Line2')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_AddressLine2;

	@FindBy(xpath = "//div[contains(text(),'Address Line3')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_AddressLine3;

	@FindBy(xpath = "//div[contains(text(),'City')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_City;

	@FindBy(xpath = "//div[contains(text(),'State')]/../parent::div//input")
	public WebElement text_event_core_tab_creation_State;

	@FindBy(xpath = "//div[contains(text(),'Country')]/../parent::div//mat-select")
	public WebElement button_event_core_tab_creation_Country;


	@FindBy(xpath = "//input[@placeholder='Search Country']")
	public WebElement searchtext_event_core_tab_creation_Countrysearch;


	@FindBy(xpath = "//div[contains(text(),'Postcode')]/../parent::div//input")
	public WebElement text_event_creation_Postcode;

	@FindBy(xpath = "//div[contains(text(),'Tournament Category Group')]/../parent::div//mat-select")
	public WebElement button_event_creation_TournamentCategoryGroup;

	@FindBy(xpath = "//input[@placeholder='Search Tournament Category Group']")
	public WebElement searchtext_event_creation_TournamentCategoryGroupsearch;

	@FindBy(xpath = "(//div[contains(text(),'Tournament Category')]/../parent::div//mat-select)[2]")
	public WebElement button_event_creation_TournamentCategory;

	@FindBy(xpath = "//input[@placeholder='Search Tournament Category']")
	public WebElement searchtext_event_creation_TournamentCategory;

	@FindBy(xpath = "//div[contains(text(),'Tournament Category Group') and contains(text(),'Select Tournament Category')]//parent::div/../parent::div//mat-select")
	public WebElement button_event_creation_TournamentCategoryGroup1;


	@FindBy(xpath = "//input[@placeholder='Search Tournament Category']")
	public WebElement searchtext_event_creation_TournamentCategoryGroupsearch1;


	@FindBy(xpath = "(//div[contains(text(),'Tournament Age Category')]/../parent::div//span)[1]")
	public WebElement button_event_creation_TournamentAgeCategory;

	@FindBy(xpath = "(//span[text()='Select Tournament Age Category']/../../parent::div[@class='cuppa-dropdown']//input)[2]")
	public WebElement searchtext_event_creation_TournamentAgeCategorysearch;

	@FindBy(xpath = "(//span[text()='Select Tournament Age Category']/../../parent::div[@class='cuppa-dropdown']//input[@type='checkbox'])[3]")
	public WebElement checkbox_event_creation_TournamentAgeCategorysearchresult;

	@FindBy(xpath = "//div[contains(text(),'Tournament Age Category')]/../parent::div//span[@class='c-angle-up ng-star-inserted']//c-icon")
	public WebElement button_event_creation_TournamentAgeCategoryupicon;

	@FindBy(xpath = "//button[text()='Next']")
	public WebElement button_event_creation_next;

	//Event creation - 2: Competition

	@FindBy(xpath = "//div[text()='2: Competition']")
	public WebElement tab_event_creation_Competition;

	@FindBy(xpath = "//div[contains(text(),'Prefill from Tournament Competition Round Templates')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_PrefillfromTournamentCompetitionRoundTemplates;

	@FindBy(xpath = "//input[@placeholder='Search Tournament Competition Round']")
	public WebElement searchtext_event_creation_Competition_PrefillfromTournamentCompetitionRoundTemplatessearch;

	@FindBy(xpath = "//div[contains(text(),'No. of Qualification Rounds')]/../parent::div//input")
	public WebElement text_event_creation_Competition_NofQualificationRounds;

	@FindBy(xpath = "//div[contains(text(),'No. of Total Matches')]/../parent::div//input")
	public WebElement text_event_creation_Competition_NoofTotalMatches;

	@FindBy(xpath = "//div[contains(text(),'Entries Ranking Year')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_EntriesRankingYear;

	@FindBy(xpath = "//input[@placeholder='Search Entries Ranking Year']")
	public WebElement searchtext_event_creation_Competition_EntriesRankingYearsearch;

	@FindBy(xpath = "//div[contains(text(),'Entries Ranking Week')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_EntriesRankingWeek;

	@FindBy(xpath = "//input[@placeholder='Search Entries Ranking Week']")
	public WebElement searchtext_event_creation_Competition_EntriesRankingWeeksearch;    

	@FindBy(xpath = "//div[contains(text(),'Count Ranking Year')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_CountRankingYear;

	@FindBy(xpath = "//input[@placeholder='Search Count Ranking Year']")
	public WebElement searchtext_event_creation_Competition_CountRankingYear;

	@FindBy(xpath = "//div[contains(text(),'Count Ranking Week')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_CountRankingWeek;

	@FindBy(xpath = "//input[@placeholder='Search Count Ranking Week']")
	public WebElement searchtext_event_creation_Competition_CountRankingWeeksearch;

	@FindBy(xpath = "//div[contains(text(),'Seeding Ranking Year')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_SeedingRankingYear;

	@FindBy(xpath = "//input[@placeholder='Search Seeding Ranking Year']")
	public WebElement searchtext_event_creation_Competition_SeedingRankingYearsearch;

	@FindBy(xpath = "//div[contains(text(),'Seeding Ranking Week')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_SeedingRankingWeek;

	@FindBy(xpath = "//input[@placeholder='Search Seeding Ranking Week']")
	public WebElement searchtext_event_creation_Competition_SeedingRankingWeeksearch;

	@FindBy(xpath = "//div[contains(text(),'Ranking Expiry Year')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_RankingExpiryYear;

	@FindBy(xpath = "//input[@placeholder='Search Ranking Expiry Year']")
	public WebElement searchtext_event_creation_Competition_RankingExpiryYearsearch;

	@FindBy(xpath = "//div[contains(text(),'Ranking Expiry Week')]/../parent::div//mat-select")
	public WebElement button_event_creation_Competition_RankingExpiryWeek;

	@FindBy(xpath = "//input[@placeholder='Search Ranking Expiry Week']")
	public WebElement searchtext_event_creation_Competition_RankingExpiryWeeksearch;

	@FindBy(xpath = "//div[contains(text(),'System of Play')]/../parent::div//span")
	public WebElement button_event_creation_Competition_SystemofPlay;

	@FindBy(xpath = "//div[contains(text(),'System of Play')]/../../parent::div//input[@type='text']")
	public WebElement text_event_creation_Competition_SystemofPlaysearch;

	@FindBy(xpath = "//div[contains(text(),'System of Play')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Group Based']")
	public WebElement checkbox_event_creation_Competition_SystemofPlayGroupBased;

	@FindBy(xpath = "//div[contains(text(),'System of Play')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Knockout']")
	public WebElement checkbox_event_creation_Competition_SystemofPlayKnockout;

	@FindBy(xpath = "(//div[contains(text(),'Playing System')])[2]/../parent::div//div[@data-placeholder='Enter Content...']")
	public WebElement text_event_creation_Competition_PlayingSystem;

	@FindBy(xpath = "//div[contains(text(),'Overall Prize Money')]/../parent::div//input")
	public WebElement text_event_creation_Competition_OverallPrizeMoney;

	@FindBy(xpath = "//div[contains(text(),'Prize Money Tax')]/../parent::div//textarea")
	public WebElement text_event_creation_Competition_PrizeMoneyTax;

	@FindBy(xpath = "//div[contains(text(),'Prize Comments')]/../parent::div//div[@data-placeholder='Enter Content...']")
	public WebElement text_event_creation_Competition_PrizeComments;






	//Event creation - 3: Participant Organizations

	@FindBy(xpath = "//div[text()='3: Participant Organizations']")
	public WebElement tab_event_creation_ParticipantOrganizations;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_ParticipantOrganizations_AddNew;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_ParticipantOrganizations_DeleteAll;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_ParticipantOrganizations_searchText;

	@FindBy(xpath = "//div[contains(text(),'Organization')]/../parent::div//mat-select")
	public WebElement button_event_creation_ParticipantOrganizations_Organization;

	@FindBy(xpath = "//input[@placeholder='Search Organization']")
	public WebElement bartext_event_creation_ParticipantOrganizations_Organizationsearch;

	@FindBy(xpath = "//mat-pseudo-checkbox[@class='mat-option-pseudo-checkbox mat-pseudo-checkbox ng-star-inserted']")
	public WebElement checkbox_event_creation_ParticipantOrganizations_Organizationsearchresult;

	@FindBy(xpath = "//mat-icon[text()='close']")
	public WebElement button_event_creation_ParticipantOrganizations_Organizationclose;

	@FindBy(xpath = "//div[@class='mat-checkbox-frame']")
	public WebElement checkbox_event_creation_selectallcontitent;

	@FindBy(xpath = "(//span[contains(text(),'Deselect')])[1]")
	public WebElement checkbox_event_creation_deselectallcontitent;

	@FindBy(xpath = "//span[text()='Proceed']")
	public WebElement button_event_creation_Proceed;

	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement button_event_creation_Cancel;

	//Event creation - 4: Profile Quotas

	@FindBy(xpath = "//div[text()='4: Profile Quotas']")
	public WebElement tab_event_creation_ProfileQuotas;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_ProfileQuotas_AddNew;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_ProfileQuotas_DeleteAll;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../parent::div//span")
	public WebElement button_event_creation_ProfileQuotas_Profile;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../parent::div//span[@class='c-angle-up ng-star-inserted']//c-icon")
	public WebElement button_event_creation_ProfileQuotas_Profilearrowicon;


	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='text']")
	public WebElement text_event_creation_ProfileQuotas_Profilesearch;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Coach']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchCoach;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Daughter']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchDaughter;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Father']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchFather;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Mother']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchMother;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Player']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchPlayer;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Player Guest']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchPlayerGuest;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Referee']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchReferee;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Son']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchSon;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Spouse']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchSpouse;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Umpire']")
	public WebElement checkbox_event_creation_ProfileQuotas_ProfilesearchUmpire;

	@FindBy(xpath = "//div[contains(text(),'Accreditation Code')]/../parent::div//input")
	public WebElement text_event_creation_ProfileQuotas_ProfilesearchAccreditationCode;

	@FindBy(xpath = "//div[contains(text(),'Host Count')]/../parent::div//input")
	public WebElement text_event_creation_ProfileQuotas_ProfilesearchHostCount;

	@FindBy(xpath = "//div[contains(text(),'General Count')]/../parent::div//input")
	public WebElement text_event_creation_ProfileQuotas_ProfilesearchGeneralCount;

	@FindBy(xpath = "//span[text()='Proceed']")
	public WebElement button_event_creation_ProfileQuotas_ProfileProceed;

	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement button_event_creation_ProfileQuotas_ProfileCancel;

	//Event creation - 5: Key Persons

	@FindBy(xpath = "//div[text()='5: Key Persons']")
	public WebElement tab_event_creation_KeyPersons;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_KeyPersonsAddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_KeyPersonssearchbar;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../parent::div//span")
	public WebElement button_event_creation_KeyPersonsProfile;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='text']")
	public WebElement text_event_creation_KeyPersonsProfilesearch;

	@FindBy(xpath = "//div[contains(text(),'Profile')]/../../parent::div//input[@type='checkbox']//following-sibling::label[text()='Tournament Supervisor']")
	public WebElement checkbox_event_creation_KeyPersonsProfileTournamentSupervisor;

	@FindBy(xpath = "//div[contains(text(),'Individual Name')]/../../parent::div//span[text()='Select Individual Name']")
	public WebElement button_event_creation_KeyPersonsIndividualName;

	@FindBy(xpath = "//div[contains(text(),'Individual Name')]/../parent::div//span[@class='c-angle-down ng-star-inserted']//c-icon")
	public WebElement button_event_creation_KeyPersonsIndividualNamedownarrowicon;

	@FindBy(xpath = "//div[contains(text(),'Individual Name')]/../parent::div//span[@class='c-angle-up ng-star-inserted']//c-icon")
	public WebElement button_event_creation_KeyPersonsIndividualNameuparrowicon;

	@FindBy(xpath = "//div[contains(text(),'Individual Name')]/../../parent::div//input[@type='text']")
	public WebElement textsearchbar_event_creation_KeyPersonsIndividualNamesearch;

	@FindBy(xpath = "(//div[contains(text(),'Individual Name')]/../../parent::div//li)[1]")
	public WebElement checkbox_event_creation_KeyPersonsIndividualNamesearchresult;

	@FindBy(xpath = "//div[contains(text(),'Active')]//parent::div//following-sibling::div//label")
	public WebElement toggle_event_creation_KeyPersonsactive;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_KeyPersonsdeleteall;

	@FindBy(xpath = "//span[text()='Proceed']")
	public WebElement button_event_creation_KeyPersonsProceed;

	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement button_event_creation_KeyPersonsCancel;

	//Event creation - 6: Dates

	@FindBy(xpath = "//div[text()='6: Dates']")
	public WebElement tab_event_creation_Dates;


	@FindBy(xpath = "//div[contains(text(),'Start Date')]//parent::div//parent::div//input")
	public WebElement button_event_creation_Dates_Startingdate;

	@FindBy(xpath = "//mat-datepicker-content//td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted']")
	public WebElement button_event_creation_Dates_Startingdatedatepicker;

	@FindBy(xpath = "//div[contains(text(),'End Date')]//parent::div//parent::div//input")
	public WebElement button_event_creation_Dates_Enddate;

	@FindBy(xpath = "//mat-datepicker-content//td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted']//following-sibling::td")
	public WebElement button_event_creation_Dates_Enddatedatedatepicker;


	//Event creation - 7: Draws

	@FindBy(xpath = "//div[text()='7: Draws']")
	public WebElement tab_event_creation_Draws;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Draws_AddNew;

	@FindBy(xpath = "//div[contains(text(),'Draw Name')]//parent::div//parent::div//mat-select")
	public WebElement button_event_creation_Draws_DrawName;

	@FindBy(xpath = "//input[@placeholder='Search Draw Name']")
	public WebElement searchtext_event_creation_Draws_SearchDrawName;

	@FindBy(xpath = "//div[contains(text(),'Start Date Time')]//parent::div//parent::div//input")
	public WebElement date_event_creation_Draws_StartDateTime;

	@FindBy(xpath = "//div[contains(text(),'Time Zone')]/../parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_Draws_TimeZone;

	@FindBy(xpath = "//div[contains(text(),'Time Zone')]/../parent::div//div[@class='cuppa-dropdown']//input")
	public WebElement text_event_creation_Draws_TimeZonesearch;

	@FindBy(xpath = "(//div[contains(text(),'Time Zone')]/../parent::div//div[@class='cuppa-dropdown']//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_Draws_TimeZonesearchresult;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Venue')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Draws_Venue;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'End Date')]//parent::div//parent::div//input")
	public WebElement date_event_creation_Draws_EndDate;

	@FindBy(xpath = "//mat-dialog-container//button[text()='Add New']")
	public WebElement button_event_creation_Draws_DrawNames_AddNew;

	@FindBy(xpath = "//mat-dialog-container//input[@placeholder='Enter Draw Name']")
	public WebElement searchtext_event_creation_Draws_DrawNames_EnterDrawName;

	@FindBy(xpath = "//mat-dialog-container//span[text()='Select Default Language Code']")
	public WebElement button_event_creation_Draws_DrawNames_SelectDefaultLanguageCode;

	@FindBy(xpath = "//mat-dialog-container//span[text()='Select Default Language Code']/../parent::div//parent::div//label[text()='English - US']//parent::li//input[@type='checkbox']")
	public WebElement checkbox_event_creation_Draws_DrawNames_SelectDefaultLanguageCode_EnglishUS;

	@FindBy(xpath = "//mat-dialog-container//span[text()='Select Default Language Code']/../parent::div//parent::div//label[text()='English - Zimbawe']//parent::li//input[@type='checkbox']")
	public WebElement checkbox_event_creation_Draws_DrawNames_SelectDefaultLanguageCode_EnglishZimbawe;

	@FindBy(xpath = "//mat-dialog-container//button[text()='Remove']")
	public WebElement button_event_creation_Draws_DrawNames_Remove;

	@FindBy(xpath = "//mat-dialog-container//button/span[text()='Proceed']")
	public WebElement button_event_creation_Draws_Proceed;

	@FindBy(xpath = "//mat-dialog-container//button/span[text()='Cancel']")
	public WebElement button_event_creation_Draws_Cancel;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Draws_DeleteAll;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Draws_searchbar;

	@FindBy(xpath = "//table//button[@mattooltip='View']")
	public WebElement button_event_creation_Draws_table_view;

	@FindBy(xpath = "//table//button[@mattooltip='Edit']")
	public WebElement button_event_creation_Draws_table_Edit;

	@FindBy(xpath = "//table//button[@mattooltip='Delete']")
	public WebElement button_event_creation_Draws_table_Delete;

	@FindBy(xpath = "//div[text()='Draw Name']//parent::div//parent::div//span")
	public WebElement text_event_creation_Draws_view_DrawName;

	@FindBy(xpath = "//div[text()='Start Date Time']//parent::div//parent::div//span")
	public WebElement text_event_creation_Draws_view_StartDateTime;

	@FindBy(xpath = "//div[text()='Time Zone']//parent::div//parent::div//span")
	public WebElement text_event_creation_Draws_view_TimeZone;

	@FindBy(xpath = "//div[text()='Venue']//parent::div//parent::div//span")
	public WebElement text_event_creation_Draws_view_Venue;

	@FindBy(xpath = "//div[text()='End Date Time']//parent::div//parent::div//span")
	public WebElement text_event_creation_Draws_view_EndDateTime;

	@FindBy(xpath = "((//table)[2]//td)[1]")
	public WebElement text_event_creation_Draws_view_table_drawname;

	@FindBy(xpath = "((//table)[2]//td)[2]")
	public WebElement text_event_creation_Draws_view_table_Language;

	@FindBy(xpath = "//span[text()='Close']")
	public WebElement button_event_creation_Draws_view_close;

	//Event creation - 8: Match Configuration

	@FindBy(xpath = "//div[text()='8: Match Configuration']")
	public WebElement tab_event_creation_MatchConfiguration;

	@FindBy(xpath = "//i[@mattooltip='Quick Action']")
	public WebElement button_event_creation_MatchConfiguration_QuickAction;

	@FindBy(xpath = "//i[@mattooltip='Refresh']")
	public WebElement text_event_creation_MatchConfiguration_Refresh;

	@FindBy(xpath = "//div[contains(text(),'Prefill from Match Configuration Templates')]//parent::div//parent::div//span")
	public WebElement button_event_creation_MatchConfiguration_PrefillfromMatchConfigurationTemplates;

	@FindBy(xpath = "//input[@placeholder='Search Match Configuration']")
	public WebElement searchtext_event_creation_MatchConfiguration_PrefillfromMatchConfigurationTemplatessearch;

	@FindBy(xpath = "//div[contains(text(),'Individual Match Type')]//parent::div//parent::div//div[@class='mat-select-value']")
	public WebElement button_event_creation_MatchConfiguration_IndividualMatchType;

	@FindBy(xpath = "//input[@placeholder='Search Individual Match Type']")
	public WebElement searchtext_event_creation_MatchConfiguration_IndividualMatchType;

	@FindBy(xpath = "//div[contains(text(),'Best Of X Games')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_BestOfXGames;

	@FindBy(xpath = "//div[contains(text(),'Max Games/Individual Match')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MaxGamesIndividualMatch;

	@FindBy(xpath = "//div[contains(text(),'Max Points/Game')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration__MaxPointsGame;

	@FindBy(xpath = "//div[contains(text(),'Advantage/Game')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration__AdvantageGame;

	@FindBy(xpath = "//div[contains(text(),'Sudden Death Point')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration__SuddenDeathPoint;

	@FindBy(xpath = "//div[contains(text(),'Best Of X Games')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration__BestOfXGames;

	@FindBy(xpath = "//div[contains(text(),'Max Challenges/Competitor')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration__MaxChallengesCompetitor;

	@FindBy(xpath = "//div[contains(text(),'Team Match Total(For XT)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration__TeamMatchTotalForXT;

	@FindBy(xpath = "//div[contains(text(),'Team Match Best Of X Games(For XT)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration__TeamMatchBestOfXGamesForXT;

	@FindBy(xpath = "//div[contains(text(),'Team Match Winner Number Of Games(For XT)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_TeamMatchWinnerNumberOfGamesForXT;


	@FindBy(xpath = "//div[contains(text(),'Team Match Sequence(For XT)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_TeamMatchSequenceForXT;

	@FindBy(xpath = "//div[contains(text(),'TTR Review')]//parent::div//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_TTRReview;

	@FindBy(xpath = "//div[contains(text(),'Yellow Card')]//parent::div//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_YellowCard;

	@FindBy(xpath = "//div[contains(text(),'Yellow Red 1')]//parent::div//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_YellowRed1;

	@FindBy(xpath = "//div[contains(text(),'Yellow Red 2')]//parent::div//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_YellowRed2;

	@FindBy(xpath = "//div[contains(text(),'Active')]//parent::div//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_Active;


	@FindBy(xpath = "//input[@placeholder='Search by Match Config Name']")
	public WebElement searchtext_event_creation_MatchConfiguration_MatchConfigurations_searchbar;

	@FindBy(xpath = "//span[text()='Close']")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_Close;

	@FindBy(xpath = "//button[contains(text(),' Match Configuration')]")
	public WebElement button_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration;

	@FindBy(xpath = "(//div[contains(text(),' Match Config Name')])[2]//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_MatchConfigName;

	@FindBy(xpath = "(//div[contains(text(),' Best Of X Games')])[2]//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_BestOfXGames;

	@FindBy(xpath = "(//div[contains(text(),' Max Points/Game')])[2]//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_MaxPointsGame;

	@FindBy(xpath = "(//div[contains(text(),' Advantage/Game')])[2]//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_AdvantageGame;

	@FindBy(xpath = "(//div[contains(text(),' Sudden Death Point')])[2]//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_SuddenDeathPoint;

	@FindBy(xpath = "(//div[contains(text(),' Max Challenges/Competitor')])//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_MaxChallengesCompetitor;

	@FindBy(xpath = "(//div[contains(text(),' Team Match Total(For XT)')])//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_TeamMatchTotalForXT;

	@FindBy(xpath = "(//div[contains(text(),' Team Match Best Of X Games(For XT)')])//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_TeamMatchBestOfXGamesForXT;

	@FindBy(xpath = "(//div[contains(text(),' Team Match Sequence(For XT)')])//parent::div//input")
	public WebElement text_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_TeamMatchSequenceForXT;

	@FindBy(xpath = "//div[contains(text(),' TTR Review')]//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_TTRReview;

	@FindBy(xpath = "//div[contains(text(),' Yellow Card')]//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_YellowCard;

	@FindBy(xpath = "//div[contains(text(),' Yellow Red 1')]//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_YellowRed1;

	@FindBy(xpath = "//div[contains(text(),' Yellow Red 2')]//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_YellowRed2;

	@FindBy(xpath = "//div[contains(text(),' Active')]//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_Active;

	@FindBy(xpath = "//span[text()='Save']")
	public WebElement button_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_Save;

	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement button_event_creation_MatchConfiguration_MatchConfigurations_createMatchConfiguration_Cancel;




	//Event creation - 9: Logos

	@FindBy(xpath = "//div[text()='9: Logos']")
	public WebElement tab_event_creation_Logos;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Logos_additem;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Logos_search;

	@FindBy(xpath = "//div[contains(text(),'Logo Name')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Logos_AddLogos_LogoName;

	@FindBy(xpath = "//div[contains(text(),'Logo Area')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Logos_AddLogos_LogoArea;

	@FindBy(xpath = "//div[contains(text(),'Logo Type')]//parent::div//parent::div//span")
	public WebElement button_event_creation_Logos_AddLogos_LogoType;

	@FindBy(xpath = "//div[contains(text(),'Logo Type')]//parent::div//parent::div//i[@mattooltip='Quick Action']")
	public WebElement button_event_creation_Logos_AddLogos_LogoType_QuickAction;

	@FindBy(xpath = "//input[@placeholder='Search by Logo Type']")
	public WebElement searchtext_event_creation_Logos_AddLogos_LogoType_addLogoTypes_SearchbyLogoType;

	@FindBy(xpath = "//span[text()='Close']")
	public WebElement button_event_creation_Logos_AddLogos_LogoType_addLogoTypes_Close;

	@FindBy(xpath = "//button[contains(text(),' Logo Type')]")
	public WebElement button_event_creation_Logos_AddLogos_LogoType_addLogoTypes_createLogoType;

	@FindBy(xpath = "//div[text()=' Type']//parent::div//input")
	public WebElement text_event_creation_Logos_AddLogos_LogoType_addLogoTypes_createLogoType_Type;

	@FindBy(xpath = "//div[text()=' Width']//parent::div//input")
	public WebElement text_event_creation_Logos_AddLogos_LogoType_addLogoTypes_createLogoType_Width;

	@FindBy(xpath = "//div[text()=' Height']//parent::div//input")
	public WebElement text_event_creation_Logos_AddLogos_LogoType_addLogoTypes_createLogoType_Height;

	@FindBy(xpath = "//div[text()=' Active']//parent::div//input[@type='checkbox']")
	public WebElement toggle_event_creation_Logos_AddLogos_LogoType_addLogoTypes_createLogoType_Active;

	@FindBy(xpath = "//span[text()='Save']")
	public WebElement button_event_creation_Logos_AddLogos_LogoType_addLogoTypes_createLogoType_Save;


	@FindBy(xpath = "//input[@placeholder='Search Logo Type']")
	public WebElement searchtext_event_creation_Logos_AddLogos_SearchLogoType;

	@FindBy(xpath = "//label[text()=' Select Image ']")
	public WebElement filebutton_event_creation_Logos_AddLogos_SelectImage;

	@FindBy(xpath = "//span[text()='Proceed']")
	public WebElement button_event_creation_Logos_AddLogos_Proceed;

	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement button_event_creation_Logos_AddLogos_Cancel;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Logos_DeleteAll;

	@FindBy(xpath = "//table//button[@mattooltip='View']")
	public WebElement button_event_creation_Logos_table_view;

	@FindBy(xpath = "//table//button[@mattooltip='Edit']")
	public WebElement button_event_creation_Logos_table_Edit;

	@FindBy(xpath = "//table//button[@mattooltip='Delete']")
	public WebElement button_event_creation_Logos_table_Delete;

	@FindBy(xpath = "//div[text()='Logo Name']//parent::div//parent::div//span")
	public WebElement text_event_creation_Logos_table_view_LogoName;

	@FindBy(xpath = "//div[text()='Logo Type']//parent::div//parent::div//span")
	public WebElement text_event_creation_Logos_table_view_LogoType;

	@FindBy(xpath = "//div[text()='Logo Area']//parent::div//parent::div//span")
	public WebElement text_event_creation_Logos_table_view_LogoArea;

	@FindBy(xpath = "//div[text()='Logo']//parent::div//parent::div//span")
	public WebElement text_event_creation_Logos_table_view_Logo;

	@FindBy(xpath = "//span[text()='Close']")
	public WebElement button_event_creation_Logos_table_view_Close;

	//Event creation - 10: Equipment

	@FindBy(xpath = "//div[text()='10: Equipment']")
	public WebElement tab_event_creation_Equipment;

	@FindBy(xpath = "//div[contains(text(),'Selected Balls')]//parent::div//parent::div//div[@class='selected-list']")
	public WebElement button_event_creation_Equipment_SelectedBalls;

	@FindBy(xpath = "//div[contains(text(),'Selected Balls')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Equipment_SelectedBallssearch;


	@FindBy(xpath = "(//div[contains(text(),'Selected Balls')]//parent::div//parent::div//input[@type='checkbox'])[3]")
	public WebElement checkbox_event_creation_Equipment_SelectedBallssearchresult;

	@FindBy(xpath = "//div[contains(text(),'Selected Balls')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedBallsuparrowicon;

	@FindBy(xpath = "//div[contains(text(),'Selected Balls')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedBallsdownarrowicon;

	@FindBy(xpath = "//div[contains(text(),'Selected Tables')]//parent::div//parent::div//div[@class='selected-list']")
	public WebElement button_event_creation_Equipment_SelectedTables;

	@FindBy(xpath = "//div[contains(text(),'Selected Tables')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Equipment_SelectedTablessearch;

	@FindBy(xpath = "(//div[contains(text(),'Selected Tables')]//parent::div//parent::div//input[@type='checkbox'])[3]")
	public WebElement checkbox_event_creation_Equipment_SelectedTablessearchresult;

	@FindBy(xpath = "//div[contains(text(),'Selected Tables')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedTablessearchuparrowicon;

	@FindBy(xpath = "//div[contains(text(),'Selected Tables')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedTablessearchdownarrowicon;

	@FindBy(xpath = "//div[contains(text(),'Selected Nets')]//parent::div//parent::div//div[@class='selected-list']")
	public WebElement button_event_creation_Equipment_SelectedNets;

	@FindBy(xpath = "//div[contains(text(),'Selected Nets')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Equipment_SelectedNetssearch;

	@FindBy(xpath = "(//div[contains(text(),'Selected Nets')]//parent::div//parent::div//input[@type='checkbox'])[3]")
	public WebElement checkbox_event_creation_Equipment_SelectedNetsresult;

	@FindBy(xpath = "//div[contains(text(),'Selected Nets')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedNetsuparrowicon;

	@FindBy(xpath = "//div[contains(text(),'Selected Nets')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedNetsdownarrowicon;

	@FindBy(xpath = "//div[contains(text(),'Selected Flooring')]//parent::div//parent::div//div[@class='selected-list']")
	public WebElement button_event_creation_Equipment_SelectedFlooring;

	@FindBy(xpath = "//div[contains(text(),'Selected Flooring')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Equipment_SelectedFlooringsearch;

	@FindBy(xpath = "(//div[contains(text(),'Selected Flooring')]//parent::div//parent::div//input[@type='checkbox'])[3]")
	public WebElement checkbox_event_creation_Equipment_SelectedFlooringsearchresult;

	@FindBy(xpath = "//div[contains(text(),'Selected Flooring')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedFlooringsearchuparrowicon;

	@FindBy(xpath = "//div[contains(text(),'Selected Flooring ')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement button_event_creation_Equipment_SelectedFlooringsearchdownarrowicon;

	@FindBy(xpath = "//div[contains(text(),'Number of Competition Tables')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Equipment_NumberofCompetitionTables;

	@FindBy(xpath = "//div[contains(text(),'Number of Practice Tables')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Equipment_NumberofPracticeTables;

	@FindBy(xpath = "//div[contains(text(),'Number of Warm-Up Tables')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Equipment_NumberofWarmUpTables;

	//Event creation - 11: Online Entry System

	@FindBy(xpath = "//div[text()='11: Online Entry System']")
	public WebElement tab_event_creation_OnlineEntrySystem;

	@FindBy(xpath = "//div[contains(text(),'Deadline Time Zone')]//parent::div//parent::div//div[@class='selected-list']")
	public WebElement button_event_creation_OnlineEntrySystem_DeadlineTimeZone;

	@FindBy(xpath = "//div[contains(text(),'Deadline Time Zone')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_OnlineEntrySystem_DeadlineTimeZonessearch;

	@FindBy(xpath = "(//div[contains(text(),'Deadline Time Zone')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_OnlineEntrySystem_DeadlineTimeZonessearchresult;

	@FindBy(xpath = "//div[contains(text(),'Travel Details Deadline')]//parent::div//parent::div//input")
	public WebElement date_event_creation_OnlineEntrySystem_TravelDetailsDeadline;

	@FindBy(xpath = "//div[contains(text(),'Cancellation Deadline')]//parent::div//parent::div//input")
	public WebElement date_event_creation_OnlineEntrySystem_CancellationDeadline;

	@FindBy(xpath = "//div[contains(text(),'Participant Registration Deadline')]//parent::div//parent::div//input")
	public WebElement date_event_creation_OnlineEntrySystem_ParticipantRegistrationDeadline;

	@FindBy(xpath = "//div[contains(text(),'Accommodation Details Deadline')]//parent::div//parent::div//input")
	public WebElement date_event_creation_OnlineEntrySystem_AccommodationDetailsDeadline;

	@FindBy(xpath = "//div[contains(text(),'Visa Details Deadline')]//parent::div//parent::div//input")
	public WebElement date_event_creation_OnlineEntrySystem_VisaDetailsDeadline;

	@FindBy(xpath = "//div[contains(text(),'Enable OES')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_OnlineEntrySystem_EnableOES;

	@FindBy(xpath = "//div[contains(text(),'Max No. Of Profiles per Person')]//parent::div//parent::div//input")
	public WebElement text_event_creation_OnlineEntrySystem_MaxNoOfProfilesperPerson;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_AddNew;

	@FindBy(xpath = "//div[contains(text(),'Deadline Name')]//parent::div//parent::div//input")
	public WebElement text_event_creation_OnlineEntrySystem_AdditionalDeadlines_DeadlineName;

	@FindBy(xpath = "//div[contains(text(),' Start Date Time')]//parent::div//parent::div//input")
	public WebElement date_event_creation_OnlineEntrySystem_AdditionalDeadlines_StartDateTime;

	@FindBy(xpath = "//div[contains(text(),'End Date Time')]//parent::div//parent::div//input")
	public WebElement date_event_creation_OnlineEntrySystem_AdditionalDeadlines_EndDateTime;

	@FindBy(xpath = "//span[text()='Proceed']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_Proceed;

	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_Cancel;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_DeleteAll;

	@FindBy(xpath = "//button[@mattooltip='View']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_table_view;

	@FindBy(xpath = "((//mat-dialog-container//div[contains(text(),'Deadline Name')]//parent::div//parent::div)[1]//span)[6]")
	public WebElement text_event_creation_OnlineEntrySystem_AdditionalDeadlines_table_view_DeadlineName;

	@FindBy(xpath = "(//mat-dialog-container//div[contains(text(),'Start Date Time')]//parent::div//parent::div//span)[8]")
	public WebElement text_event_creation_OnlineEntrySystem_AdditionalDeadlines_table_view_StartDateTime;

	@FindBy(xpath = "(//mat-dialog-container//div[contains(text(),'End Date Time')]//parent::div//parent::div//span)[8]")
	public WebElement text_event_creation_OnlineEntrySystem_AdditionalDeadlines_table_view_EndDateTime;

	@FindBy(xpath = "//button//span[text()='Close']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_table_view_Close;

	@FindBy(xpath = "//button[@mattooltip='Edit']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_table_Edit;

	@FindBy(xpath = "//button[@mattooltip='Delete']")
	public WebElement button_event_creation_OnlineEntrySystem_AdditionalDeadlines_table_Delete;

	//Event creation - 12: Payment Options

	@FindBy(xpath = "//div[text()='12: Payment Options']")
	public WebElement tab_event_creation_PaymentOptions;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_PaymentOptions_AddNew;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Payment Account')]//parent::div//parent::div//span")
	public WebElement button_event_creation_PaymentOptions_PaymentAccount;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Payment Account')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_PaymentOptions_PaymentAccountsearch;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Payment Account')]//parent::div//parent::div//input[@type='checkbox']//parent::div//label//span[text()='Select All']")
	public WebElement checkbox_event_creation_PaymentOptions_PaymentAccountsearchSelectAll;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Payment Account')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Cash Collection ']")
	public WebElement checkbox_event_creation_PaymentOptions_PaymentAccountsearchCashCollection;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Payment Account')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Stripe']")
	public WebElement checkbox_event_creation_PaymentOptions_PaymentAccountsearchStripe;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Payment Account')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Transfer to WTT Bank Account']")
	public WebElement checkbox_event_creation_PaymentOptions_PaymentAccountsearchTransfertoWTTBankAccount;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Comments')]//parent::div//parent::div//textarea")
	public WebElement checkbox_event_creation_PaymentOptions_Comments;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Active')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_PaymentOptions_active;

	@FindBy(xpath = "//mat-dialog-container//span[text()='Proceed']")
	public WebElement button_event_creation_PaymentOptions_Proceed;

	@FindBy(xpath = "//mat-dialog-container//span[text()='Cancel']")
	public WebElement button_event_creation_PaymentOptions_Cancel;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_PaymentOptions_DeleteAll;

	@FindBy(xpath = "//button[@mattooltip='View']")
	public WebElement button_event_creation_PaymentOptions_view;

	@FindBy(xpath = "(//mat-dialog-container//div[text()='Payment Account']//parent::div//parent::div//span)[6]")
	public WebElement text_event_creation_PaymentOptions_view_PaymentAccount;

	@FindBy(xpath = "(//mat-dialog-container//div[text()='Comments']//parent::div//parent::div//span)[6]")
	public WebElement text_event_creation_PaymentOptions_view_Comments;

	@FindBy(xpath = "(//mat-dialog-container//div[text()='Active']//parent::div//parent::div//span)[2]")
	public WebElement text_event_creation_PaymentOptions_view_Active;

	@FindBy(xpath = "//mat-dialog-container//Span[text()='Close']")
	public WebElement button_event_creation_PaymentOptions_view_Close;

	@FindBy(xpath = "//button[@mattooltip='Edit']")
	public WebElement button_event_creation_PaymentOptions_Edit;

	@FindBy(xpath = "//button[@mattooltip='Delete']")
	public WebElement button_event_creation_PaymentOptions_Delete;

	//Event creation - 13: Tournament Fee

	@FindBy(xpath = "//div[text()='13: Tournament Fee']")
	public WebElement tab_event_creation_TournamentFee;

	@FindBy(xpath = "//div[contains(text(),'Fee Deposit (%)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_TournamentFee_FeeDeposit;

	@FindBy(xpath = "//div[contains(text(),'Turn Off Fee')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_TournamentFee_TurnOffFee;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_TournamentFee_AddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_TournamentFee_searchbar;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_TournamentFee_AddFeebyProfileType_Profile;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_TournamentFee_AddFeebyProfileType_Profilesearch;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::div//label//span[text()='Select All']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_Profileselectall;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Coach']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileCoach;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Daughter']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileDaughter;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Father']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileFather;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Mother']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileMother;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Player']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfilePlayer;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Player Guest']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfilePlayerGuest;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Referee']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileReferee;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Son']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileSon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Spouse']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileSpouse;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Umpire']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileUmpire;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileUparrowicon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement checkbox_event_creation_TournamentFee_AddFeebyProfileType_ProfileDownarrowicon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Participation Fee')]//parent::div//parent::div//input")
	public WebElement text_event_creation_TournamentFee_AddFeebyProfileType_ParticitionFee;

	@FindBy(xpath = "//mat-dialog-content//button[text()='Add New']")
	public WebElement button_event_creation_TournamentFee_AddFeebyProfileType_CancellationInformation_AddNew;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[1]//input")
	public WebElement text_event_creation_TournamentFee_AddFeebyProfileType_CancellationInformation_BeforeXDays;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[2]//mat-radio-button//span[text()='Amount']")
	public WebElement radio_event_creation_TournamentFee_AddFeebyProfileType_CancellationInformation_AmountPercentageAmount;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[2]//mat-radio-button//span[text()='Percentage']")
	public WebElement radio_event_creation_TournamentFee_AddFeebyProfileType_CancellationInformation_AmountPercentagePercentage;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[3]//input")
	public WebElement text_event_creation_TournamentFee_AddFeebyProfileType_CancellationInformation_Value;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[4]//input")
	public WebElement toggle_event_creation_TournamentFee_AddFeebyProfileType_CancellationInformation_active;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[5]//button[text()='Remove']")
	public WebElement button_event_creation_TournamentFee_AddFeebyProfileType_CancellationInformation_Remove;

	@FindBy(xpath = "//button//span[text()='Proceed']")
	public WebElement button_event_creation_TournamentFee_AddFeebyProfileType_Proceed;

	@FindBy(xpath = "//button//span[text()='Cancel']")
	public WebElement button_event_creation_TournamentFee_AddFeebyProfileType_Cancel;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_TournamentFee_DeleteAll;

	@FindBy(xpath = "//span[text()=' Profile ']//ancestor::table")
	public WebElement table_event_creation_TournamentFee_table;


	//Event creation - 14: Non-MA Tournament Fee

	@FindBy(xpath = "//div[text()='14: Non-MA Tournament Fee']")
	public WebElement tab_event_creation_NonMATournamentFee;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_NonMATournamentFee_AddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_NonMATournamentFee_searchbar;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_Profile;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_ProfileSearch;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//span[text()='Select All']")
	public WebElement checkbox_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_ProfileSelectAll;

	@FindBy(xpath = "(//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox'])[3]")
	public WebElement checkbox_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_Profileresult;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement button_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_Profiledownarrowicon;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement button_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_Profileuparrowicon;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Participation Fee')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_ParticipationFee;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Cancel']")
	public WebElement button_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_Cancel;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Proceed']")
	public WebElement button_event_creation_NonMATournamentFee_AddNonMAFeebyProfileType_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_NonMATournamentFee_DeleteAll;

	@FindBy(xpath = "//span[text()=' Profile ']//ancestor::table")
	public WebElement table_event_creation_NonMATournamentFee_table;

	//Event creation - 15: Hospitality

	@FindBy(xpath = "//div[text()='15: Hospitality']")
	public WebElement tab_event_creation_Hospitality;

	@FindBy(xpath = "//div[contains(text(),'Allowed First Arrival Date')]//parent::div//parent::div//input")
	public WebElement date_event_creation_Hospitality_AllowedFirstArrivalDate;

	@FindBy(xpath = "//div[contains(text(),'Allowed Last Departure Date')]//parent::div//parent::div//input")
	public WebElement date_event_creation_Hospitality_AllowedLastDepartureDate;

	@FindBy(xpath = "//div[contains(text(),'Force Hospitality')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Hospitality_ForceHospitality;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Hospitality_AddNew;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_Hospitality_AddHospitalityInformation_Profile;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Hospitality_AddHospitalityInformation_Profilesearch;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::div//label//span[text()='Select All']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_Profileselectall;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Coach']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileCoach;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Daughter']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileDaughter;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Father']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileFather;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Mother']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileMother;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Player']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfilePlayer;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Player Guest']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfilePlayerGuest;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Referee']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileReferee;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Son']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileSon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Spouse']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileSpouse;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::li//label[text()='Umpire']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileUmpire;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileUparrowicon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_ProfileDownarrowicon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Accommodation')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_Hospitality_AddHospitalityInformation_Accommodation;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Accommodation')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearch;

	@FindBy(xpath = "(//mat-dialog-content//div[contains(text(),'Accommodation')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_Accommodationsearchresult;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Room Type')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_Hospitality_AddHospitalityInformation_RoomType;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Room Type')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearch;

	@FindBy(xpath = "(//mat-dialog-content//div[contains(text(),'Room Type')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_Hospitality_AddHospitalityInformation_RoomTypesearchresult;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Cost(per night/person)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_Costpernightperson;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Cost(whole event/person)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_Costwholeeventperson;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Cost Extra Night/Person')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_CostExtraNightPerson;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Min. Nights')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_MinNights;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Early Check In Cost')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_EarlyCheckInCost;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Late CheckOut Cost')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_LateCheckOutCost;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Complimentary Nights')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_ComplimentaryNights;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Description')]//parent::div//parent::div//textarea")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_Description;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Filled')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Hospitality_AddHospitalityInformation_Filled;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Active')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Hospitality_AddHospitalityInformation_Active;

	@FindBy(xpath = "//mat-dialog-content//button[text()='Add New']")
	public WebElement button_event_creation_Hospitality_AddHospitalityInformation_CancellationInformation_AddNew;


	@FindBy(xpath = "//mat-dialog-content//table//tr//td[1]//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_CancellationInformation_BeforeXDays;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[2]//mat-radio-button//span[text()='Amount']")
	public WebElement radio_event_creation_Hospitality_AddHospitalityInformation_CancellationInformation_AmountPercentageAmount;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[2]//mat-radio-button//span[text()='Percentage']")
	public WebElement radio_event_creation_Hospitality_AddHospitalityInformation_CancellationInformation_AmountPercentagePercentage;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[3]//input")
	public WebElement text_event_creation_Hospitality_AddHospitalityInformation_CancellationInformation_Value;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[4]//input")
	public WebElement toggle_event_creation_Hospitality_AddHospitalityInformation_CancellationInformation_active;

	@FindBy(xpath = "//mat-dialog-content//table//tr//td[5]//button[text()='Remove']")
	public WebElement button_event_creation_Hospitality_AddHospitalityInformation_CancellationInformation_Remove;

	@FindBy(xpath = "//mat-dialog-actions//button//span[text()='Cancel']")
	public WebElement button_event_creation_Hospitality_AddHospitalityInformation_Cancel;

	@FindBy(xpath = "//mat-dialog-actions//button//span[text()='Proceed']")
	public WebElement button_event_creation_Hospitality_AddHospitalityInformation_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Hospitality_DeleteAll;

	@FindBy(xpath = "//span[text()=' Profile ']//ancestor::table")
	public WebElement table_event_creation_Hospitality_table;


	//Event creation - 16: Non-MA Hospitality

	@FindBy(xpath = "//div[text()='16: Non-MA Hospitality']")
	public WebElement tab_event_creation_NonMAHospitality;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_NonMAHospitality_AddNew;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_NonMAHospitality_AddHospitalityInformation_Profile;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Profile')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_NonMAHospitality_AddHospitalityInformation_Profilesearch;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox']//parent::div//label//span[text()='Select All']")
	public WebElement checkbox_event_creation_NonMAHospitality_AddHospitalityInformation_Profileselectall;

	@FindBy(xpath = "(//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//input[@type='checkbox'])[3]")
	public WebElement checkbox_event_creation_NonMAHospitality_AddHospitalityInformation_Profilesearchresult;


	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-up ng-star-inserted']")
	public WebElement checkbox_event_creation_NonMAHospitality_AddHospitalityInformation_ProfileUparrowicon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Profile')]//parent::div//parent::div//span[@class='c-angle-down ng-star-inserted']")
	public WebElement checkbox_event_creation_NonMAHospitality_AddHospitalityInformation_ProfileDownarrowicon;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Accommodation')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_NonMAHospitality_AddHospitalityInformation_Accommodation;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Accommodation')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_NonMAHospitality_AddHospitalityInformation_Accommodationsearch;

	@FindBy(xpath = "(//mat-dialog-content//div[contains(text(),'Accommodation')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_NonMAHospitality_AddHospitalityInformation_Accommodationsearchresult;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Room Type')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_NonMAHospitality_AddHospitalityInformation_RoomType;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Room Type')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_NonMAHospitality_AddHospitalityInformation_RoomTypesearch;

	@FindBy(xpath = "(//mat-dialog-content//div[contains(text(),'Room Type')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_NonMAHospitality_AddHospitalityInformation_RoomTypesearchresult;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Cost(per night/person)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_Costpernightperson;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Cost(whole event/person)')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_Costwholeeventperson;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Cost Extra Night/Person')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_CostExtraNightPerson;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Min. Nights')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_MinNights;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Early Check In Cost')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_EarlyCheckInCost;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Late CheckOut Cost')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_LateCheckOutCost;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Complimentary Nights')]//parent::div//parent::div//input")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_ComplimentaryNights;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Description')]//parent::div//parent::div//textarea")
	public WebElement text_event_creation_NonMAHospitality_AddHospitalityInformation_Description;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Filled')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_NonMAHospitality_AddHospitalityInformation_Filled;

	@FindBy(xpath = "//mat-dialog-content//div[contains(text(),'Active')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_NonMAHospitality_AddHospitalityInformation_Active;

	@FindBy(xpath = "//mat-dialog-actions//button//span[text()='Cancel']")
	public WebElement button_event_creation_NonMAHospitality_AddHospitalityInformation_Cancel;

	@FindBy(xpath = "//mat-dialog-actions//button//span[text()='Proceed']")
	public WebElement button_event_creation_NonMAHospitality_AddHospitalityInformation_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_NonMAHospitality_DeleteAll;

	@FindBy(xpath = "//span[text()=' Profile ']//ancestor::table")
	public WebElement table_event_creation_NonMAHospitality_table;

	//Event creation - 17: Miscellaneous

	@FindBy(xpath = "//div[text()='17: Miscellaneous']")
	public WebElement tab_event_creation_Miscellaneous;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Miscellaneous_AddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Miscellaneous_searchbar;

	@FindBy(xpath = "//div[contains(text(),'Name')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Miscellaneous_AddMiscellaneous_Name;

	@FindBy(xpath = "//div[contains(text(),'Description')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Miscellaneous_AddMiscellaneous_Description;

	@FindBy(xpath = "//div[contains(text(),'Cost')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Miscellaneous_AddMiscellaneous_Cost;

	@FindBy(xpath = "//div[contains(text(),'Is Active')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Miscellaneous_AddMiscellaneous_IsActive;

	@FindBy(xpath = "//button//span[text()='Cancel']")
	public WebElement button_event_creation_Miscellaneous_AddMiscellaneous_Cancel;

	@FindBy(xpath = "//button//span[text()='Proceed']")
	public WebElement button_event_creation_Miscellaneous_AddMiscellaneous_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Miscellaneous_DeleteAll;

	@FindBy(xpath = "//span[text()=' Name ']//ancestor::table")
	public WebElement table_event_creation_Miscellaneous_table;

	//Event creation - 18: Travel

	@FindBy(xpath = "//div[text()='18: Travel']")
	public WebElement tab_event_creation_Travel;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Travel_AddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Travel_searchbar;

	@FindBy(xpath = "//div[contains(text(),'Location')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Travel_AddTravelInformation_Location;

	@FindBy(xpath = "//div[contains(text(),'Is Active')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Travel_AddTravelInformation_IsActive;

	@FindBy(xpath = "//button//span[text()='Cancel']")
	public WebElement button_event_creation_Travel_AddTravelInformation_Cancel;

	@FindBy(xpath = "//button//span[text()='Proceed']")
	public WebElement button_event_creation_Travel_AddTravelInformation_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Travel_DeleteAll;

	@FindBy(xpath = "//span[text()=' Location ']//ancestor::table")
	public WebElement table_event_creation_Travel_table;

	//Event creation - 19: Transportation

	@FindBy(xpath = "//div[text()='19: Transportation']")
	public WebElement tab_event_creation_Transportation;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Transportation_AddNew;

	@FindBy(xpath = "//div[contains(text(),'Name')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Transportation_AddTransportationInformation_Name;

	@FindBy(xpath = "//div[contains(text(),'Pickup Place')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Transportation_AddTransportationInformation_PickupPlace;

	@FindBy(xpath = "//div[contains(text(),'Cost')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Transportation_AddTransportationInformation_Cost;

	@FindBy(xpath = "//div[contains(text(),'Drop Place')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Transportation_AddTransportationInformation_DropPlace;

	@FindBy(xpath = "//div[contains(text(),'Seating Capacity')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Transportation_AddTransportationInformation_SeatingCapacity;

	@FindBy(xpath = "//div[contains(text(),'In Hospitality Pack')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Transportation_AddTransportationInformation_InHospitalityPack;

	@FindBy(xpath = "//div[contains(text(),'Is Active')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Transportation_AddTransportationInformation_IsActive;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Transport Type')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_Transportation_AddTransportationInformation_TransportType;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Transport Type')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Transportation_AddTransportationInformation_TransportTypesearch;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Transport Type')]//parent::div//parent::div//label[text()='Car (Standard Sedan / Hatchback)']//parent::li//input[@type='checkbox']")
	public WebElement checkbox_event_creation_Transportation_AddTransportationInformation_TransportTypeCarStandardSedanHatchback;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Transport Type')]//parent::div//parent::div//label[text()='Limosine (Stretch / Luxury Sedan)']//parent::li//input[@type='checkbox']")
	public WebElement checkbox_event_creation_Transportation_AddTransportationInformation_TransportTypeLimosineStretchLuxurySedan;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Transport Type')]//parent::div//parent::div//label[text()='Shuttle Bus']//parent::li//input[@type='checkbox']")
	public WebElement checkbox_event_creation_Transportation_AddTransportationInformation_TransportTypeShuttleBus;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Cancel']")
	public WebElement button_event_creation_Transportation_AddTransportationInformation_Cancel;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Proceed']")
	public WebElement button_event_creation_Transportation_AddTransportationInformation_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Transportation_DeleteAll;

	@FindBy(xpath = "//span[text()=' Name ']//ancestor::table")
	public WebElement table_event_creation_Transportation_table;

	//Event creation - 20: Sponsors

	@FindBy(xpath = "//div[text()='20: Sponsors']")
	public WebElement tab_event_creation_Sponsors;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Sponsors_AddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Sponsors_searchbar;

	@FindBy(xpath = "//div[contains(text(),'Sponsor Name')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Sponsors_AddSponsorInformation_SponsorName;

	@FindBy(xpath = "//div[contains(text(),'Sponsor Link')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Sponsors_AddSponsorInformation_SponsorLink;

	@FindBy(xpath = "//div[contains(text(),'Priority')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Sponsors_AddSponsorInformation_Priority;

	@FindBy(xpath = "//div[contains(text(),'Sponsor Core Type')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_SponsorCoreType;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Sponsor Core Type')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Sponsors_AddSponsorInformation_SponsorCoreTypesearch;

	@FindBy(xpath = "(//mat-dialog-container//div[contains(text(),'Sponsor Core Type')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_Sponsors_AddSponsorInformation_SponsorCoreTypesearchresult;

	@FindBy(xpath = "//div[contains(text(),'Sponsor Type')]//parent::div//parent::div//div[@class='cuppa-dropdown']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_SponsorType;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Sponsor Type')]//parent::div//parent::div//input[@placeholder='Search']")
	public WebElement bartext_event_creation_Sponsors_AddSponsorInformation_SponsorTypesearch;

	@FindBy(xpath = "(//mat-dialog-container//div[contains(text(),'Sponsor Type')]//parent::div//parent::div//input[@type='checkbox'])[2]")
	public WebElement checkbox_event_creation_Sponsors_AddSponsorInformation_SponsorTypesearchresult;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Organization')]//parent::div//parent::div//div[@class='mat-select-trigger']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_Organization;

	@FindBy(xpath = "//input[@placeholder='Search Organization']")
	public WebElement searchtext_event_creation_Sponsors_AddSponsorInformation_SearchOrganization;

	@FindBy(xpath = "//div[contains(text(),'Light Logo')]//parent::div//parent::div//label[@class='file_upload_button']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_LightLogofileuploadbutton;

	@FindBy(xpath = "//div[contains(text(),'Light Logo')]//parent::div//parent::div//label[@class='file_upload_button' and text()=' Change ']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_LightLogofileuploadChangebutton;

	@FindBy(xpath = "//div[contains(text(),'Light Logo')]//parent::div//parent::div//span[text()='Remove']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_LightLogoRemove;

	@FindBy(xpath = "//div[contains(text(),'Dark Logo')]//parent::div//parent::div//label[@class='file_upload_button']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_DarkLogo;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Cancel']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_Cancel;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Proceed']")
	public WebElement button_event_creation_Sponsors_AddSponsorInformation_Proceed;

	@FindBy(xpath = "//div[@class='mat-select-value']//span[text()='Select Sponsor Template Name']")
	public WebElement button_event_creation_Sponsors_SelectSponsorTemplateName;

	@FindBy(xpath = "//input[@placeholder='Search Sponsor Template']")
	public WebElement searchtext_event_creation_Sponsors_SelectSponsorTemplateNamesearch;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Sponsors_DeleteAll;

	@FindBy(xpath = "//span[text()=' Sponsor Name ']//ancestor::table")
	public WebElement table_event_creation_Sponsors_table;


	//Event creation - 21: Documents

	@FindBy(xpath = "//div[text()='21: Documents']")
	public WebElement tab_event_creation_Documents;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Documents_AddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Documents_searchbar;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Documents_AddDocuments;

	@FindBy(xpath = "//div[contains(text(),'Document Title')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Documents_AddDocuments_DocumentTitle;

	@FindBy(xpath = "//div[contains(text(),'Place')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Documents_AddDocuments_Place;

	@FindBy(xpath = "//div[contains(text(),'Version')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Documents_AddDocuments_Version;

	@FindBy(xpath = "//div[contains(text(),'Notes')]//parent::div//parent::div//textarea")
	public WebElement text_event_creation_Documents_AddDocuments_Notes;

	@FindBy(xpath = "//div[contains(text(),'Active')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Documents_AddDocuments_Active;

	@FindBy(xpath = "//div[contains(text(),'Public Document')]//parent::div//parent::div//input")
	public WebElement toggle_event_creation_Documents_AddDocuments_PublicDocument;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Document Type')]//parent::div//parent::div//div[@class='mat-select-value']")
	public WebElement button_event_creation_Documents_AddDocuments_DocumentType;

	@FindBy(xpath = "//input[@placeholder='Search Document Type']")
	public WebElement searchtext_event_creation_Documents_AddDocuments_DocumentTypesearch;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Category')]//parent::div//parent::div//div[@class='mat-select-value']")
	public WebElement button_event_creation_Documents_AddDocuments_Category;

	@FindBy(xpath = "//input[@placeholder='Search Category']")
	public WebElement searchtext_event_creation_Documents_AddDocuments_Categorysearch;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Valid From')]//parent::div//parent::div//input")
	public WebElement button_event_creation_Documents_AddDocuments_ValidFrom;

	@FindBy(xpath = "//mat-datepicker-content//td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted']")
	public WebElement button_event_creation_Documents_AddDocuments_ValidFrom_datepicker;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Valid To')]//parent::div//parent::div//input")
	public WebElement button_event_creation_Documents_AddDocuments_ValidTo;

	@FindBy(xpath = "//mat-datepicker-content//td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted']//following-sibling::td")
	public WebElement button_event_creation_Documents_AddDocuments_ValidTo_datepicker;

	@FindBy(xpath = "//div[contains(text(),'Document')]//parent::div//parent::div//label[@class='file_upload_button']")
	public WebElement button_event_creation_Documents_AddDocuments_Documentuploadbutton;


	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Cancel']")
	public WebElement button_event_creation_Documents_AddDocuments_Cancel;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Proceed']")
	public WebElement button_event_creation_Documents_AddDocuments_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Documents_DeleteAll;

	@FindBy(xpath = "//span[text()=' Document Title ']//ancestor::table")
	public WebElement table_event_creation_Documents_table;

	//Event creation - 22: Accreditation

	@FindBy(xpath = "//div[text()='22: Accreditation']")
	public WebElement tab_event_creation_Accreditation;

	@FindBy(xpath = "//button[text()='Add New']")
	public WebElement button_event_creation_Accreditation_AddNew;

	@FindBy(xpath = "//input[@name='searchText']")
	public WebElement text_event_creation_Accreditation_searchbar;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Start Date')]//parent::div//parent::div//input")
	public WebElement date_event_creation_Accreditation_AddAccreditationInformation_StartDate;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'End Date')]//parent::div//parent::div//input")
	public WebElement date_event_creation_Accreditation_AddAccreditationInformation_EndDate;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Location')]//parent::div//parent::div//input")
	public WebElement text_event_creation_Accreditation_AddAccreditationInformation_Location;

	@FindBy(xpath = "//mat-dialog-container//div[contains(text(),'Comments')]//parent::div//parent::div//textarea")
	public WebElement text_event_creation_Accreditation_AddAccreditationInformation_Comments;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Cancel']")
	public WebElement button_event_creation_Accreditation_AddAccreditationInformation_Cancel;

	@FindBy(xpath = "//mat-dialog-container//button//span[text()='Proceed']")
	public WebElement button_event_creation_Accreditation_AddAccreditationInformation_Proceed;

	@FindBy(xpath = "//button[text()='Delete All']")
	public WebElement button_event_creation_Accreditation_DeleteAll;

	@FindBy(xpath = "//span[text()=' Start Date ']//ancestor::table")
	public WebElement table_event_creation_Accreditation_table;


	//Event creation - 23: Visa

	@FindBy(xpath = "//div[text()='23: Visa']")
	public WebElement tab_event_creation_Visa;

	@FindBy(xpath = "//div[contains(text(),'Visa Information')]//parent::div//parent::div//p")
	public WebElement textarea_event_creation_Visa_VisaInformation;

	//Event creation - 24: Comments

	@FindBy(xpath = "//div[text()='24: Comments']")
	public WebElement tab_event_creation_Comments;

	@FindBy(xpath = "//div[contains(text(),'Comments')]//parent::div//parent::div//p")
	public WebElement textarea_event_creation_Comments_Comments;

	//Event creation - 25: Review

	@FindBy(xpath = "//div[text()='25: Review']")
	public WebElement tab_event_creation_Review;

	@FindBy(xpath = "(//div[contains(text(),'Event Name ')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_EventName;

	@FindBy(xpath = "(//div[contains(text(),'Event Core Type ')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_EventCoreType;

	@FindBy(xpath = "(//div[contains(text(),'Is Closed Event ')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_IsClosedEvent;

	@FindBy(xpath = "(//div[contains(text(),'Is Front End Platform Visible ')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_IsFrontEndPlatformVisible;

	@FindBy(xpath = "(//div[contains(text(),'Is Betting Enabled')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_IsBettingEnabled;

	@FindBy(xpath = "(//div[contains(text(),'Is AI Enabled')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_IsAIEnabled;

	@FindBy(xpath = "(//div[contains(text(),'Is Masters Event')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_IsMastersEvent;

	@FindBy(xpath = "(//div[contains(text(),'Active')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Active;

	@FindBy(xpath = "(//div[contains(text(),'Organizer')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Organizer;

	@FindBy(xpath = "(//div[contains(text(),'Show Organizer in OES')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_ShowOrganizerinOES;

	@FindBy(xpath = "(//div[contains(text(),'Currency')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Currency;

	@FindBy(xpath = "(//div[contains(text(),'Website')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Website;

	@FindBy(xpath = "(//div[contains(text(),'Tags')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Tags;

	@FindBy(xpath = "(//div[contains(text(),'Tournament Logo')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_TournamentLogo;

	@FindBy(xpath = "(//div[contains(text(),'Time Zone')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_TimeZone;

	@FindBy(xpath = "(//div[contains(text(),'WYC Deadline Hours')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_WYCDeadlineHours;

	@FindBy(xpath = "(//div[contains(text(),'Venue')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Venue;

	@FindBy(xpath = "(//div[contains(text(),'GPS Co-Ordinates')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_GPSCoOrdinates;

	@FindBy(xpath = "(//div[contains(text(),'Address Line1')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_AddressLine1;

	@FindBy(xpath = "(//div[contains(text(),'Address Line2')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_AddressLine2;

	@FindBy(xpath = "(//div[contains(text(),'Address Line3')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_AddressLine3;

	@FindBy(xpath = "(//div[contains(text(),'City')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_City;

	@FindBy(xpath = "(//div[contains(text(),'State')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_State;

	@FindBy(xpath = "(//div[contains(text(),'Country')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Country;

	@FindBy(xpath = "(//div[contains(text(),'Postcode')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_Postcode;

	@FindBy(xpath = "(//div[contains(text(),'Tournament Category Group')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_TournamentCategoryGroup;

	@FindBy(xpath = "(//div[contains(text(),'Tournament Category')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_TournamentCategory;

	@FindBy(xpath = "(//div[contains(text(),'Tournament Age Category')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Core_TournamentAgeCategory;

	@FindBy(xpath = "(//div[contains(text(),'No. of Qualification Rounds')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Competition_NoofQualificationRounds;

	@FindBy(xpath = "(//div[contains(text(),'No. of Total Matches')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Competition_NoofTotalMatches;

	@FindBy(xpath = "(//div[contains(text(),'Entries Ranking Year')]//parent::div//parent::div//span)")
	public WebElement text1_event_creation_Review_Competition_EntriesRankingYear;

	@FindBy(xpath = "//div[contains(text(),'Entries Ranking Week')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_EntriesRankingWeek;

	@FindBy(xpath = "//div[contains(text(),'Entries Ranking Month')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_EntriesRankingMonth;

	@FindBy(xpath = "//div[contains(text(),'Count Ranking Year')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_CountRankingYear;

	@FindBy(xpath = "//div[contains(text(),'Count Ranking Week')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_CountRankingWeek;

	@FindBy(xpath = "//div[contains(text(),'Count Ranking Month')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_CountRankingMonth;

	@FindBy(xpath = "//div[contains(text(),'Seeding Ranking Year')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_SeedingRankingYear;

	@FindBy(xpath = "//div[contains(text(),'Seeding Ranking Week')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_SeedingRankingWeek;

	@FindBy(xpath = "//div[contains(text(),'Seeding Ranking Month')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_SeedingRankingMonth;

	@FindBy(xpath = "//div[contains(text(),'Ranking Expiry Year')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_RankingExpiryYear;

	@FindBy(xpath = "//div[contains(text(),'Ranking Expiry Week')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_RankingExpiryWeek;

	@FindBy(xpath = "//div[contains(text(),'Ranking Expiry Month')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_RankingExpiryMonth;

	@FindBy(xpath = "//div[contains(text(),'System of Play')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_SystemofPlay;

	@FindBy(xpath = "//div[contains(text(),'Prize Currency')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_PrizeCurrency;

	@FindBy(xpath = "//div[contains(text(),'Overall Prize Money')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_OverallPrizeMoney;

	@FindBy(xpath = "//div[contains(text(),'Prize Money Tax')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Competition_PrizeMoneyTax;

	@FindBy(xpath = "//div[contains(text(),'Prize Comments')]//parent::div//parent::div//div[@class='view-input']")
	public WebElement text1_event_creation_Review_Competition_PrizeComments;

	@FindBy(xpath = "//th[text()=' Draw Name ']//ancestor::table")
	public WebElement table1_event_creation_Review_Draws_table;

	@FindBy(xpath = "//div[contains(text(),'Max Points/Game')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_MaxPointsGame;

	@FindBy(xpath = "//div[contains(text(),'Advantage/Game')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_AdvantageGame;

	@FindBy(xpath = "//div[contains(text(),'Sudden Death Point')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_SuddenDeathPoint;

	@FindBy(xpath = "//div[contains(text(),'Best Of X Games')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_BestOfXGames;

	@FindBy(xpath = "//div[contains(text(),'Max Challenges/Competitor')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_MaxChallengesCompetitor;

	@FindBy(xpath = "//div[contains(text(),'Team Match Total(For XT)')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_TeamMatchTotalForXT;

	@FindBy(xpath = "//div[contains(text(),'Team Match Best Of X Games(For XT)')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_TeamMatchBestOfXGamesForXT;

	@FindBy(xpath = "//div[contains(text(),'Team Match Winner Number Of Games(For XT)')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_TeamMatchWinnerNumberOfGamesForXT;

	@FindBy(xpath = "//div[contains(text(),'Team Match Sequence(For XT)')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_TeamMatchSequenceForXT;

	@FindBy(xpath = "//div[contains(text(),'TTR Review')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_TTRReview;

	@FindBy(xpath = "//div[contains(text(),'Yellow Card')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_YellowCard;

	@FindBy(xpath = "//div[contains(text(),'Yellow Red 1')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_YellowRed1;

	@FindBy(xpath = "//div[contains(text(),'Yellow Red 2')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_YellowRed2;

	@FindBy(xpath = "//div[contains(text(),'Active')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_MatchConfiguration_Active;

	@FindBy(xpath = "//th[text()=' Start Date ']//ancestor::table")
	public WebElement table1_event_creation_Review_Accreditation_table;

	@FindBy(xpath = "(//div[text()='Profile Quotas']//following-sibling::common_sub_table_view)[1]//th[text()=' Profile ']//ancestor::table")
	public WebElement table1_event_creation_Review_ProfileQuotas_table;

	@FindBy(xpath = "(//div[text()='Payment Options']//following-sibling::common_sub_table_view)[1]//th[text()=' Payment Account ']//ancestor::table")
	public WebElement table1_event_creation_Review_PaymentOptions_table;

	@FindBy(xpath = "//div[text()='Key Persons']//following-sibling::div//th[text()=' Profile ']//ancestor::table")
	public WebElement table1_event_creation_Review_KeyPersons_table;

	@FindBy(xpath = "//div[contains(text(),'Start Date')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Dates_StartDate;

	@FindBy(xpath = "//div[contains(text(),'End Date')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Dates_EndDate;

	@FindBy(xpath = "(//div[text()='Associations']//following-sibling::common_sub_table_view)[1]//th[text()=' Organization ']//ancestor::table")
	public WebElement table1_event_creation_Review_Associations_table;

	@FindBy(xpath = "(//div[text()='Sponsors']//following-sibling::common_sub_table_view)[1]//th[text()=' Sponsor Name ']//ancestor::table")
	public WebElement table1_event_creation_Review_Sponsors_table;

	@FindBy(xpath = "(//div[text()='Documents']//following-sibling::common_sub_table_view)[1]//th[text()=' Document Title ']//ancestor::table")
	public WebElement table1_event_creation_Review_Documents_table;

	@FindBy(xpath = "(//div[text()='Logos']//following-sibling::common_sub_table_view)[1]//th[text()=' Logo Name ']//ancestor::table")
	public WebElement table1_event_creation_Review_Logos_table;

	@FindBy(xpath = "//div[contains(text(),'Selected Balls')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Equipments_SelectedBalls;

	@FindBy(xpath = "//div[contains(text(),'Selected Tables')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Equipments_SelectedTables;

	@FindBy(xpath = "//div[contains(text(),'Selected Nets')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Equipments_SelectedNets;

	@FindBy(xpath = "//div[contains(text(),'Selected Flooring')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Equipments_SelectedFlooring;

	@FindBy(xpath = "//div[contains(text(),'Number of Competition Tables')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Equipments_NumberofCompetitionTables;

	@FindBy(xpath = "//div[contains(text(),'Number of Practice Tables')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Equipments_NumberofPracticeTables;

	@FindBy(xpath = "//div[contains(text(),'Number of Warm-Up Tables')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Equipments_NumberofWarmUpTables;

	@FindBy(xpath = "//div[contains(text(),'Currency')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_Currency;

	@FindBy(xpath = "//div[contains(text(),'Enable OES')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_EnableOES;

	@FindBy(xpath = "//div[contains(text(),'Deadline Time Zone')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_DeadlineTimeZone;

	@FindBy(xpath = "//div[contains(text(),'Participant Registration Deadline')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_ParticipantRegistrationDeadline;

	@FindBy(xpath = "//div[contains(text(),'Travel Details Deadline')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_TravelDetailsDeadline;

	@FindBy(xpath = "//div[contains(text(),'Accommodation Details Deadline')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_AccommodationDetailsDeadline;

	@FindBy(xpath = "//div[contains(text(),'Cancellation Deadline')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_CancellationDeadline;

	@FindBy(xpath = "//div[contains(text(),'Visa Details Deadline')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_VisaDetailsDeadline;

	@FindBy(xpath = "//div[contains(text(),'Max No. Of Profiles per Person')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_OES_MaxNoOfProfilesperPerson;

	@FindBy(xpath = "(//div[text()='Additional Deadlines']//following-sibling::common_sub_table_view)[1]//ancestor::table")
	public WebElement table1_event_creation_Review_AdditionalDeadlines_table;

	@FindBy(xpath = "//div[text()='Fee Details']//following-sibling::app-inner-sub-view//div[contains(text(),'Currency')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_FeeDetails_Currency;

	@FindBy(xpath = "//div[text()='Fee Details']//following-sibling::app-inner-sub-view//div[contains(text(),'Fee Deposit (%)')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_FeeDetails_FeeDeposit;

	@FindBy(xpath = "//div[text()='Fee Details']//following-sibling::app-inner-sub-view//div[contains(text(),'Turn Off Fee')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_FeeDetails_TurnOffFee;

	@FindBy(xpath = "(//div[text()='Fee Details']//following-sibling::common_sub_table_view)[1]//ancestor::table")
	public WebElement table1_event_creation_Review_FeeDetails_table;

	@FindBy(xpath = "//div[text()='Hospitality']//following-sibling::app-inner-sub-view//div[contains(text(),'Allowed First Arrival Date')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Hospitality_AllowedFirstArrivalDate;

	@FindBy(xpath = "//div[text()='Hospitality']//following-sibling::app-inner-sub-view//div[contains(text(),'Allowed Last Departure Date')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Hospitality_AllowedLastDepartureDate;

	@FindBy(xpath = "//div[text()='Hospitality']//following-sibling::app-inner-sub-view//div[contains(text(),'Force Hospitality')]//parent::div//parent::div//span")
	public WebElement text1_event_creation_Review_Hospitality_ForceHospitality;

	@FindBy(xpath = "(//div[text()='Hospitality']//following-sibling::common_sub_table_view)[1]//ancestor::table")
	public WebElement table1_event_creation_Review_Hospitality_table;

	@FindBy(xpath = "(//div[text()='Miscellaneous']//following-sibling::common_sub_table_view)[1]//ancestor::table")
	public WebElement table1_event_creation_Review_Miscellaneous_table;

	@FindBy(xpath = "(//div[text()='Travel']//following-sibling::common_sub_table_view)[1]//ancestor::table")
	public WebElement table1_event_creation_Review_Travel_table;

	@FindBy(xpath = "(//div[text()='Transportations']//following-sibling::common_sub_table_view)[1]//ancestor::table")
	public WebElement table1_event_creation_Review_Transportations_table;

	@FindBy(xpath = "//div[text()='Visa']//following-sibling::app-inner-sub-view//div[contains(text(),'Visa Information')]//parent::div//parent::div//div[@class='view-input']")
	public WebElement text1_event_creation_Review_Visa_VisaInformation;

	@FindBy(xpath = "//div[text()='Comments']//following-sibling::app-inner-sub-view//div[contains(text(),'Comments')]//parent::div//parent::div//div[@class='view-input']")
	public WebElement text1_event_creation_Review_Comments_Comments;

	//common

	@FindBy(xpath = "//button//span[text()='Create']")
	public WebElement button_event_creation_cCreate;

	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement button_event_creation_Cancels;

	// success message 

	@FindBy (xpath = "//span[text()='Event Added Successfully']")
	public WebElement text1_event_successpopupmessage;

	@FindBy (xpath = "//span[contains(text(),'Tournament Details')]")
	public WebElement text1_event_eventdeails;


}
