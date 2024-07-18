package StepDefinition.MatchHub;

import base.Commonmethods;
import base.DriverInitialisation;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.MatchHubElements.Matchhub_login_page_Elements;
import pages.OVRElements.OVR_login_page_Elements;

public class Matchhub_LogoutSnippet extends DriverInitialisation {

    @When("^Umpire Logouts MatchHub$")
    public void matchHub_Logout() throws Exception {
        Matchhub_login_page_Elements matchHub_Login =  PageFactory.initElements(driver,Matchhub_login_page_Elements.class);
        Commonmethods base = new Commonmethods(driver, wait);
        base.wait(1);
        matchHub_Login.button_MH_Logout.click();
        base.wait(1);
    }
}