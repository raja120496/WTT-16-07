package StepDefinition.MatchHub;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MatchHubElements.Matchhub_login_page_Elements;
import pages.OVRElements.OVR_login_page_Elements;

import java.util.ArrayList;

import static java.awt.SystemColor.window;

public class Matchhub_LoginSnippet extends DriverInitialisation {
	@Given("^Umpire Login to the MatchHub$")
	public static void matchHub_login() throws Exception {
		Matchhub_login_page_Elements matchHub_Login =  PageFactory.initElements(driver,Matchhub_login_page_Elements.class);
		Commonmethods.properties_file="Match_Hub";
//		String url= Commonmethods.getvaluefrompropertiesfile("url");
//		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
//		base.Sendkey(matchHub_Login.text_MH_Login_username, Commonmethods.getvaluefrompropertiesfile("MH.username"));
//		base.Sendkey(matchHub_Login.text_MH_Login_password, Commonmethods.getvaluefrompropertiesfile("MH.password"));;
//		base.click(matchHub_Login.button_MH_Login_login);
		String url1= Commonmethods.getvaluefrompropertiesfile("url1");
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(url1);
		//Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
		base.wait(2);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		base.takescreenshoot();
	}
}