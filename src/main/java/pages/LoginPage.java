package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import base.ActionFunctions;
import base.Commonmethods;

public class LoginPage extends Commonmethods{

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	//Page Elements:
	public static By username = By.className("username");
	public static By password = By.className("password");
	public static By loginBtn = By.xpath("//input[@type='submit']");
	public static By crmLogo = By.xpath("//img[contains(@class,'img-responsive')]");
	public static By signUpBtn = By.xpath("//button[contains(text(),'Sign Up')]");

	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}


	public void demo() throws Exception {
		// Object declaration.
		//				CommonLocators FN1 = new CommonLocators();
		ActionFunctions FN2 = new ActionFunctions(driver, wait);

		try {
			FN2.getSheet("contacts");
			String data1 = FN2.getcelldata(1, 1);
			System.out.println(data1);
		}
		catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}