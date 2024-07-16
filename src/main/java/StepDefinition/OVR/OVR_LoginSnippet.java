package StepDefinition.OVR;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import base.Commonmethods;
import pages.OVRElements.OVR_login_page_Elements;

public class OVR_LoginSnippet extends DriverInitialisation {
	@Given("^Login the OVR Application$")
	public static void OVR_login() throws Exception {
		OVR_login_page_Elements OVR_Login =  PageFactory.initElements(driver,OVR_login_page_Elements.class);
		Commonmethods.properties_file="OVR";
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(OVR_Login.text_OVR_Login_username, Commonmethods.getvaluefrompropertiesfile("OVR.username"));
		base.Sendkey(OVR_Login.text_OVR_Login_password, Commonmethods.getvaluefrompropertiesfile("OVR.password"));;
		base.click(OVR_Login.button_OVR_Login_login);



		//Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
		base.wait(2);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		base.takescreenshoot();

	}



}
