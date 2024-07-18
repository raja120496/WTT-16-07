package pages.MatchHubElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjectconfiguration.ElementName;

public class Matchhub_Home_Elements {

    @FindBy(xpath = "//button[@id='btn-enter-match-hub']")
    @ElementName("MH_TableEnt")
    public WebElement MH_TableEnt;

    @FindBy(xpath = "//span[normalize-space()='Start']")
    @ElementName("MH_matchStart")
    public WebElement MH_matchStart;

    @FindBy(xpath = "//span[normalize-space()='Start Warm Up']")
    @ElementName("MH_startWarmup")
    public WebElement MH_startWarmup;

    @FindBy(xpath = "//div[@id='commonConfirmBtn']//span[contains(text(),'Confirm')]")
    @ElementName("MH_cnfmBtn")
    public WebElement MH_cnfmBtn;

    @FindBy(xpath = "//span[normalize-space()='Start Match']")
    @ElementName("MH_strtMatch")
    public WebElement MH_strtMatch;

    @FindBy(xpath = "//div[@id='div-btn-stp']")
    @ElementName("MH_strtOfPlay")
    public WebElement MH_strtOfPlay;

    @FindBy(xpath = "//div[@id='p1AddPoint']")
    @ElementName("MH_strtOfPlay")
    public WebElement MH_p1AddPoint;

    @FindBy(xpath = "//div[@id='p2AddPoint']")
    @ElementName("MH_strtOfPlay")
    public WebElement MH_p2AddPoint;

    @FindBy(xpath = "//div[@id='p1Cards']//div[@id='addCard']")
    @ElementName("MH_p1AddCard")
    public WebElement MH_p1AddCard;

    @FindBy(xpath = "//div[@id='p2Cards']//div[@id='addCard']")
    @ElementName("MH_p2AddCard")
    public WebElement MH_p2AddCard;

    @FindBy(xpath = "//div[@id='timeOutBtn']//div[@class='hitarea button']")
    @ElementName("MH_timeout")
    public WebElement MH_timeout;

    @FindBy(xpath = "//div[@id='timeoutPopup']//img")
    @ElementName("MH_closeTOut")
    public WebElement MH_closeTOut;

    @FindBy(xpath = "//div[@id='pYellowBtn']//div[@class='hitarea button']")
    @ElementName("MH_p2AddCard")
    public WebElement MH_pyellowbtn;

    @FindBy(xpath = "//div[@id='pYellowRed1Btn']//div[@class='hitarea button']")
    @ElementName("MH_p2AddCard")
    public WebElement MH_pYellowRed1Btn;

    @FindBy(xpath = "//div[@id='pYellowRed2Btn']//div[@class='hitarea button']")
    @ElementName("MH_p2AddCard")
    public WebElement MH_pYellowRed2Btn;

    @FindBy(xpath = "//span[normalize-space()='Next Game']")
    @ElementName("MH_nextGame")
    public WebElement MH_nextGame;

    @FindBy(xpath = "//span[normalize-space()='Confirm']")
    @ElementName("MH_confirm")
    public WebElement MH_confirm;

    @FindBy(xpath = "//div[@id='matchHubPopUpMessage']//span[contains(text(),'Close')]")
    @ElementName("MH_Decconfirm")
    public WebElement MH_Decconfirm;



}