package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_00 extends Events {

    public POM_00() {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(id="mat-input-0")
    public WebElement username;
    @FindBy(id="mat-input-1")
    public WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "(//span[text()='Techno Study Intern School'])")
    public WebElement schoolName;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "loginButton":
                return this.loginButton;
        }
        return null;
    }

}