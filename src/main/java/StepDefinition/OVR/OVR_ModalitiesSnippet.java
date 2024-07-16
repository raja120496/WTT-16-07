package StepDefinition.OVR;

import base.Commonmethods;
import base.DriverInitialisation;
import org.openqa.selenium.support.PageFactory;
import pages.OVRElements.OVR_Home_page_Elements;
import pages.OVRElements.OVR_Modalities_page_Elements;

public class OVR_ModalitiesSnippet extends DriverInitialisation {

    OVR_Modalities_page_Elements OVR_Modalities = PageFactory.initElements(driver, OVR_Modalities_page_Elements.class);

    Commonmethods base = new Commonmethods(driver, wait);



}
