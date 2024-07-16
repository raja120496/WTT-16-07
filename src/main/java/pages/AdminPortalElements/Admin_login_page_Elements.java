package pages.AdminPortalElements;

import groovy.transform.Field;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import pageobjectconfiguration.ElementName;



public class Admin_login_page_Elements {

	WebDriver driver;
/*
	public Admin_login_page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
*/
	// public EventcreationElements event =  PageFactory.initElements(driver,EventcreationElements.class);

	@FindBy(xpath = "//input[@name='username']")
	@ElementName("ittf_username")
	public WebElement ittf_username;

	@FindBy(xpath = "//input[@name='password']")
	@ElementName("ittf_password")
	public WebElement ittf_password;

	@FindBy(xpath = "//span[text()='Sign In']")
	@ElementName("ittf_Sign_button")
	public WebElement ittf_Sign_button;

	@FindBy(xpath = "//div[text()='Logout']")
	@ElementName("ittf_logout_button")
	public WebElement ittf_logout_button;



}
