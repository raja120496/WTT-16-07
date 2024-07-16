package pageobjectconfiguration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Specify retention policy
@Target({ElementType.FIELD}) // Specify where the annotation can be used (field, method, etc.)
public @interface ElementName {
    String value(); // Define properties or methods as needed
}