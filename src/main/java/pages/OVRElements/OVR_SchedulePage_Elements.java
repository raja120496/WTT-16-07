package pages.OVRElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjectconfiguration.ElementName;

public class OVR_SchedulePage_Elements {

    @FindBy(xpath = "//a[@href='/schedule']")
    @ElementName("OVR_ScheduleBtn")
    public WebElement OVR_ScheduleBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm ml-4 p-0']")
    @ElementName("OVR_CrtScheduleBtn")
    public WebElement OVR_CrtScheduleBtn;

    @FindBy(xpath = "(//a[@data-target='#select_unit'])[last()]")
    @ElementName("OVR_SelectUnit")
    public WebElement OVR_SelectUnit;

    @FindBy(xpath = "//button[normalize-space()='Add Units']")
    @ElementName("OVR_AddUnits")
    public WebElement OVR_AddUnits;

    @FindBy(xpath = "(//table[@class='e-table']/tbody/tr/td)[6]")
    @ElementName("OVR_StartDate")
    public WebElement OVR_StartDate;

    @FindBy(xpath = "//span[@aria-label='select']")
    @ElementName("OVR_Calender")
    public WebElement OVR_Calender;

    @FindBy(xpath = "//button[normalize-space()='Today']")
    @ElementName("OVR_TdyDate")
    public WebElement OVR_TdyDate;

    @FindBy(xpath = "//input[contains(@id,'duration')]")
    @ElementName("OVR_Duration")
    public WebElement OVR_Duration;

    @FindBy(xpath = "//a[normalize-space()='Create Schedule']")
    @ElementName("OVR_CreateScdl")
    public WebElement OVR_CreateScdl;

    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Yes'])[4]")
    @ElementName("OVR_YesBtn")
    public WebElement OVR_YesBtn;

    @FindBy(xpath = "//input[@id='startTime_input']")
    @ElementName("OVR_StartTime")
    public WebElement OVR_StartTime;

    @FindBy(xpath = "//b[text()='Board']")
    @ElementName("OVR_BoardTab")
    public WebElement OVR_BoardTab;

    @FindBy(xpath = "//label[@for='btnControl']//img")
    @ElementName("OVR_ShowFil")
    public WebElement OVR_ShowFil;

    @FindBy(xpath = "//label[normalize-space()='Days']/parent::div//ejs-dropdownlist[contains(@id,'ej2_dropdownlist_')]")
    @ElementName("OVR_SelectDayDD_Board")
    public WebElement OVR_SelectDayDD_Board;

    @FindBy(xpath = "(//div[contains(@id,'ej2_dropdownlist')]//li)[last()]")
    @ElementName("OVR_SelectDate_Board")
    public WebElement OVR_SelectDate_Board;

    @FindBy(xpath = "//button[normalize-space()='Publish']")
    @ElementName("OVR_PublishBtn_Board")
    public WebElement OVR_PublishBtn_Board;

    @FindBy(xpath = "//button[@title='Show Schedule Properties']")
    @ElementName("OVR_ShowScheProp_Board")
    public WebElement OVR_ShowScheProp_Board;

    @FindBy(xpath = "//label[normalize-space()='Status']/parent::div//ejs-dropdownlist[contains(@id,'ej2_dropdownlist_')]")
    @ElementName("OVR_StatusDD_Board")
    public WebElement OVR_StatusDD_Board;

    @FindBy(xpath = "//li[@data-value='Start List']")
    @ElementName("OVR_SelStartList_Board")
    public WebElement OVR_SelStartList_Board;

    @FindBy(xpath = "//button[normalize-space()='Update']")
    @ElementName("OVR_UpdateBtn_Board")
    public WebElement OVR_UpdateBtn_Board;

    @FindBy(xpath = "//ejs-dropdownlist[@id='to']")
    @ElementName("OVR_ToTable")
    public WebElement OVR_ToTable;

    @FindBy(xpath = "//ejs-dropdownlist[@id='from']")
    @ElementName("OVR_fromTable")
    public WebElement OVR_fromTable;

    @FindBy(xpath = "//a[contains(@class,'unit-icon')]")
    @ElementName("OVR_unitsBoard")
    public WebElement OVR_unitsBoard;

    @FindBy(xpath = "//label[text()='Day']/parent::div/div/ejs-dropdownlist")
    @ElementName("OVR_unitsDayDD")
    public WebElement OVR_unitsDayDD;

    @FindBy(xpath = "(//ul[@id='ddlelement_options']/li)[last()-1]")
    @ElementName("OVR_unitsSelDate")
    public WebElement OVR_unitsSelDate;

    //table[@id='main-table']/tbody/tr/td[contains(@class,'schedule') and contains(@data-schedule,"Scheduled")]//b[@data-toggle='tooltip']

}