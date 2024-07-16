package StepDefinition.OES;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.TestClass;
import base.Commonmethods;
import pages.OESelements.OES_login_page_Elements;

public class OESLogoutSnippet  extends DriverInitialisation {

	@Given("^Logout the OES Application$")
	public static void logout() throws Exception {
		OES_login_page_Elements OEs =  PageFactory.initElements(driver,OES_login_page_Elements.class);
		Commonmethods base=new Commonmethods(driver,wait);
		base.wait(1);
		OEs.button_OEs_logout.click();
		base.wait(2);
	}

}
