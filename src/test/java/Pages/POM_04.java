package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class POM_04 extends Events {

    public POM_04 () {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c3380182179-6 ng-star-inserted']")
    public WebElement Setup;
    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-7 ng-star-inserted']")
    public WebElement Parameters;
    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted']']")
    public WebElement Fields;

    @FindBy(xpath="//*[@id=\"ms-table-0_buttons\"]/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    public WebElement addBtn;

    @FindBy(xpath="//div[@class='mat-form-field-infix ng-tns-c2794762957-55']']")
    public WebElement Name;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement SaveBtn;

    @FindBy(css = "ms-delete-button")
    public WebElement deletBtn;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "Setup" : return this.Setup;
            case "Parameters" : return this.Parameters;
            case "Fields" : return this.Fields;
            case "addBtn" : return this.addBtn;
            case "Name" : return this.Name;
            case "SaveBtn" : return this.SaveBtn;
            case "deletBtn" : return this.deletBtn;
            case "successMessage" : return this.successMessage;
            default: return null;
        }
}
}




