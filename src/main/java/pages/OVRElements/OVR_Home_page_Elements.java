package pages.OVRElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OVR_Home_page_Elements {

    WebDriver driver;

    public OVR_Home_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='theme-switch']//a")
    public WebElement button_OVR_Homepage_SwitchEvent;

    @FindBy(xpath = "//b[@class='text-white']")
    public WebElement button_OVR_Homepage_eventname;

    @FindBy(xpath = "(//div[@id='discipineSwitchModal']//table)[1]//tbody")
    public WebElement button_OVR_Homepage_SwitchEvent_ITTF;

    @FindBy(xpath = "(//div[@id='discipineSwitchModal']//table)[2]//tbody")
    public WebElement button_OVR_Homepage_SwitchEvent_WTT;

    @FindBy(className = "discipline-icon")
    public WebElement button_OVR_Homepage_RightMenu_discipline;

    @FindBy(className = "incriptions-icon")
    public WebElement button_OVR_Homepage_RightMenu_incriptions;

    @FindBy(className = "event-icon")
    public WebElement button_OVR_Homepage_RightMenu_event;

    @FindBy(xpath = "//a[contains(@class,'modality-icon')]")
    public WebElement button_OVR_Homepage_RightMenu_modality;

    @FindBy(className = "schedule-icon")
    public WebElement button_OVR_Homepage_RightMenu_schedule;

    @FindBy(className = "umpire-icon")
    public WebElement button_OVR_Homepage_RightMenu_umpire;

    @FindBy(className = "result-icon")
    public WebElement button_OVR_Homepage_RightMenu_result;

    @FindBy(className = "match-icon")
    public WebElement button_OVR_Homepage_RightMenu_match;

    @FindBy(className = "video-icon")
    public WebElement button_OVR_Homepage_RightMenu_video;

    @FindBy(className = "advertisement-icon")
    public WebElement button_OVR_Homepage_RightMenu_advertisement;


    @FindBy(className = "unit-icon")
    public WebElement button_OVR_Homepage_RightMenu_unit;

    @FindBy(className = "ranking-icon")
    public WebElement button_OVR_Homepage_RightMenu_ranking;

    @FindBy(className = "communication-icon")
    public WebElement button_OVR_Homepage_RightMenu_communication;

    @FindBy(className = "database-icon")
    public WebElement button_OVR_Homepage_RightMenu_database;

    @FindBy(className = "settings-icon")
    public WebElement button_OVR_Homepage_RightMenu_settings;

    @FindBy(className = "btn btn-secondary btn-switch btn-sm language-select-button")
    public WebElement button_OVR_Homepage_topMenu_language;

    @FindBy(className = "nav-link white-icon")
    public WebElement button_OVR_Homepage_topMenu_print;

    @FindBy(id = "notificationDropdown")
    public WebElement button_OVR_Homepage_topMenu_notification;
}
