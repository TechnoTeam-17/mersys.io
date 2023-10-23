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
    @FindBy(css="input[formcontrolname='username']")
    private WebElement username;
    @FindBy(css="input[formcontrolname='password']")
    private WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(css="span[class='mat-mdc-tooltip-trigger logo-text']")
    private WebElement txtTechnoStudy;

    public WebElement getWebElement(String element){
        switch (element){
            case "username" : return this.username;
            case "password" : return this.password;
            case "loginButton" : return this.loginButton;
            case "txtTechnoStudy" : return this.txtTechnoStudy;
        }
        return null;
    }
}

