package StepDefinition.OES;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


import StepDefinition.TestClass;
import base.Commonmethods;
import pages.OESelements.OES_login_page_Elements;

public class OESLoginSnippet extends DriverInitialisation {

	@Given("^Login the OES Application$")
	public static void login() throws Exception {
		OES_login_page_Elements OEs =  PageFactory.initElements(driver,OES_login_page_Elements.class);
		Commonmethods.properties_file="OES";
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.wait(2);
		OEs.button_OEs_guest.click();
		base.wait(2);
		base.Sendkey(OEs.text_OEs_username, Commonmethods.getvaluefrompropertiesfile("admin.username"));
		base.wait(1);
		base.Sendkey(OEs.text_OEs_Password, Commonmethods.getvaluefrompropertiesfile("admin.password"));;	        
		base.click(OEs.button_OEs_signin);

		base.wait(8);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//base.takescreenshoot();

		Assert.assertEquals("Online Entry System - World Table Tennis", driver.getTitle());
		base.wait(2);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		base.takescreenshoot("OESloginscreen");

		//base.wait(2);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}



}
