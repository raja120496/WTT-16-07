package pages.OESelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OES_Home_page_Elements {

	WebDriver driver;

	public OES_Home_page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Search by Event Name, Location, Organization']")
	public WebElement text_OEs_searchbar;

}
