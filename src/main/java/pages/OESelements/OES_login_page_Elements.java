package pages.OESelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OES_login_page_Elements {

	WebDriver driver;

	public OES_login_page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[text()='I have an account']//parent::div")
	public WebElement button_OEs_guest;

	@FindBy(xpath = "//input[@name='Email Address']")
	public WebElement text_OEs_username;

	@FindBy(xpath = "//input[@name='Password']")
	public WebElement text_OEs_Password;

	@FindBy(xpath = "//button[text()='Sign in' and @type='submit']")
	public WebElement button_OEs_signin;

	@FindBy(xpath = "(//div[text()='Logout'])")
	public WebElement button_OEs_logout;



}
