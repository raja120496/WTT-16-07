package pages.OVRElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OVR_Modalities_page_Elements {

    WebDriver driver;

    public OVR_Modalities_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-modality//div[@class='treeViewScroll']//ul[@class='tree mt-2']")
    public WebElement text_OVR_Modalities_eventlist;

    //sudha


    // MODALITIES MODULE => +button elements

    @FindBy(xpath = "//label[@class='tree_label' and @for='M.SINGLES-----------']")
    public WebElement button_MS_sub_event_Modalities;

    @FindBy(xpath = "//label[@class='tree_label' and @for='W.SINGLES-----------']")
    public WebElement button_WS_subevent_Modalities;

    @FindBy(xpath = "//label[@class='tree_label' and @for='M.DOUBLES-----------']")
    public WebElement button_MD_subevent_Modalities;

    @FindBy(xpath = "//label[@class='tree_label' and @for='W.DOUBLES-----------']")
    public WebElement button_WD_subevent_Modalities;

    //Subevent names

    @FindBy(xpath = "//span[text()=\"Men's Singles\"]")
    public  WebElement text_MS_Subevent;

    @FindBy(xpath = "//span[text()=\"Women's Singles\"]")
    public WebElement text_WS_Subevent;

    @FindBy (xpath = "//span[text()=\"Men's Doubles\"]")
    public WebElement text_MD_Subevent;

    @FindBy (xpath = "//span[text()=\"Women's Doubles\"]")
    public WebElement text_WD_Subevent;

    @FindBy(xpath = "//span[text()=\"Women's Doubles\"]")
    public WebElement text_XD_Subevent;

    //Dropdown Arrow

    @FindBy (xpath = "//span[text()=\"Women's Singles\"]/parent::li/div/a")
    public WebElement button_dropdown_subevent;

    @FindBy (xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Create/Update Phase']")
    public WebElement text_subevent_createPhase;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Create/Update Modality']")
    public WebElement text_subevent_updatemodality;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Load Modality']")
    public WebElement text_subevent_Loadmodality;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Remove Progression']")
    public WebElement text_subevent_Removeprogression;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Pools']")
    public WebElement text_subevent_pools;

    //Event ID-3561
    //MODALITIES MODULE

    @FindBy(xpath = "//a[@class='modality-icon active']")
    public WebElement text_Modalities_module;

    @FindBy(xpath = "//span[text()=\"U15 Boys Singles\"]")
    public WebElement text_BS_U15_subevent;

    @FindBy(xpath = "//span[text()=\"U15 Boys Singles\"]/parent::li/div/a")
    public WebElement button_U15Subevent_dropdown;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//div//a[normalize-space()='Load Modality']")
    public WebElement text_U15Subevent_Loadmodality;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-3-radiobutton-id']")
    public WebElement button_KO16_Bo5;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-4-radiobutton-id']")
    public WebElement button_Ko32_Bo5;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-5-radiobutton-id']")
    public WebElement button_KO64_Bo5;

    @FindBy(xpath = "//label[@for='add-edit-loadModality-12-radiobutton-id']")
    public WebElement button_KO32_Bo7;

    @FindBy(xpath = "//button[normalize-space()='Load Modality']")
    public WebElement button_loadModality;

    @FindBy(xpath = "//label[@class='tree_label' and @for='M.SINGLES--------U15']")
    public WebElement button_sub_event_U15;

    @FindBy(xpath = "//label[@for='M.SINGLES--------U15.8FNL']")
    public WebElement button_U15Subevent_R16;

    @FindBy(xpath = "//span[text()='U15 Boys Singles - Round of 16']/parent::li/p/small/a")
    public WebElement text_drawKO_U15;

    @FindBy(xpath = "//label[normalize-space()='Main Draw']")
    public WebElement button_Maindraw_U15;

    @FindBy(xpath = "//label[normalize-space()='Live Draw']")
    public WebElement button_Livedraw_U15;

    @FindBy(xpath = "//button[text()=' Assign Seeds ']")
    public WebElement button_Assignseeds_U15;

    @FindBy(xpath = "//button[@title='Draw athletes by seed in KO phase']")
    public WebElement button_Draw_U15;

    @FindBy(xpath = "//div[@id='draw_athletes']//button[normalize-space()='Yes']")
    public WebElement button_Yes_Draw_U15;

    @FindBy(xpath = "//div[@id='draw_athletes']//button[normalize-space()='No']")
    public WebElement button_No_draw_U15;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    public WebElement button_Add_byes_U15;

    @FindBy(xpath = "//button[@title='Delete Byes of the Draw']")
    public WebElement button_Delete_byes_U15;

    @FindBy(xpath = "//button[normalize-space()='Publish']")
    public WebElement button_Publish_U15;

    @FindBy(xpath = "//a[normalize-space()='Back']")
    public WebElement button_Back_U15;

    @FindBy(xpath = "//div[@id='update_status']//button[normalize-space()='No']")
    public WebElement button_StartList_U15;

    //sudha end










}
