package pages.OVRElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OVR_Modalities_page_Elements {

    WebDriver driver;

    public OVR_Modalities_page_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//app-modality//div[@class='treeViewScroll']//ul[@class='tree mt-2']//li")
    public WebElement text_OVR_Modalities_eventlist;



}
