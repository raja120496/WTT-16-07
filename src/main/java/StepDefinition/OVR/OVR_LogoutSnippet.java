package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.OVRElements.OVR_login_page_Elements;
import base.Commonmethods;

public class OVR_LogoutSnippet extends DriverInitialisation {

    @When("^Logout the OVR Application$")
    public void OVR_Logout() throws Exception {
        OVR_login_page_Elements OVR_Login = PageFactory.initElements(driver, OVR_login_page_Elements.class);
        Commonmethods base = new Commonmethods(driver, wait);
        base.wait(1);
        OVR_Login.button_OVR_Login_usericone.click();
        base.wait(1);
        OVR_Login.button_OVR_Logout.click();
        base.wait(1);

    }



}
