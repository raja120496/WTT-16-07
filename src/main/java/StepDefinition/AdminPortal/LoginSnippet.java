package StepDefinition.AdminPortal;

import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import StepDefinition.TestClass;
import base.Commonmethods;
import pages.AdminPortalElements.Admin_login_page_Elements;
import util.AnnotationProcessor;

public class LoginSnippet extends DriverInitialisation {

	//private static final Logger LOG = LogManager.getLogger(LoginSnippet.class);


	@Given("^Login the admin Application$")
	public static void login() throws Exception {

		Admin_login_page_Elements admin =  PageFactory.initElements(driver,Admin_login_page_Elements.class);
		Commonmethods.properties_file="Adminportal";
		String url=base.Commonmethods.getvaluefrompropertiesfile("url");
		driver.get(url);
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		Commonmethods base=new Commonmethods(driver,wait1);
		base.Sendkey(admin.ittf_username, Commonmethods.getvaluefrompropertiesfile("admin.username"));
		//base.Sendkey(AnnotationProcessor.get_the_element("ittf_username"), Commonmethods.getvaluefrompropertiesfile("admin.username"));
		base.Sendkey(admin.ittf_password, Commonmethods.getvaluefrompropertiesfile("admin.password"));;	        
		base.click(admin.ittf_Sign_button);
		//LOG.info("login");



		Assert.assertEquals("ITTF-Admin Center", driver.getTitle());
		base.wait(2);


		base.takescreenshoot("loginpage");



	}



}
