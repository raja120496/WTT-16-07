package StepDefinition.AdminPortal;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;

public class LogoutSnippet extends DriverInitialisation {
	//private static final Logger LOG = LogManager.getLogger(LogoutSnippet.class);
	@Given("^Logout admin portal application$")
	public static void Adminportal_logout() throws Exception {

		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);

		Commonmethods base=new Commonmethods(driver,wait);

		base.wait(2);

		admin.ittf_logout_button.click();

	}
}
