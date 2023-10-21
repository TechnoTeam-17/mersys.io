package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_01 {

    @FindBy(id="mat-input-0")
    public WebElement humanResources;
    @FindBy(id="mat-input-1")
    public WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

}
