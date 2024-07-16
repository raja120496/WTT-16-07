package util;

import org.openqa.selenium.WebElement;
import pageobjectconfiguration.ElementName;
import pages.AdminPortalElements.Admin_login_page_Elements;

import java.lang.reflect.Field;

public class AnnotationProcessor {

    public static WebElement get_the_element(String elementname) throws IllegalAccessException {
        WebElement b = null;
        Admin_login_page_Elements loginPage = new Admin_login_page_Elements();

        Field[] fields = loginPage.getClass().getDeclaredFields();
        for (Field field : fields) {

            if (field.isAnnotationPresent(ElementName.class)) {
                ElementName pageElementAnnotation = field.getAnnotation(ElementName.class);
                String elementName = pageElementAnnotation.value();
                if (elementName.contentEquals(elementname)) {
                    System.out.println("Field: " + field.getGenericType() + ", Element Name: " + elementName);
                     b = (WebElement) field.getGenericType();


                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        String elementname1="ittf_logout_button";
        Admin_login_page_Elements loginPage = new Admin_login_page_Elements();

        Field[] fields = loginPage.getClass().getDeclaredFields();
        for (Field field : fields) {

            if (field.isAnnotationPresent(ElementName.class)) {
                ElementName pageElementAnnotation = field.getAnnotation(ElementName.class);
                String elementName = pageElementAnnotation.value();
                if(elementName.contentEquals(elementname1)) {
                    System.out.println("Field: " + field.getGenericType() + ", Element Name: " + elementName );
                    WebElement b=(WebElement) field.getGenericType();
                    System.out.println(b);


                }
                }
        }
    }


}
