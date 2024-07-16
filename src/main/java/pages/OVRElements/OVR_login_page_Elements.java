package pages.OVRElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OVR_login_page_Elements {

    WebDriver driver;

    public OVR_login_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "txtUserName")
    public WebElement text_OVR_Login_username;

    @FindBy(id = "txtPassword")
    public WebElement text_OVR_Login_password;

    @FindBy(xpath = "//button[text()=' Login ']")
    public WebElement button_OVR_Login_login;

    @FindBy(xpath = "//a[@id='userDropdown']")
    public WebElement button_OVR_Login_usericone;

    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement button_OVR_Logout;

}
