package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_03 extends Events {
    public POM_03 () {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement Setup;
    @FindBy (xpath = "//*[text()='Parameters']")
    public WebElement Parameters;
    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted']']")
    public WebElement DocumentTypes;

    @FindBy(css = "ms-add-button")
    public WebElement addBtn;

    @FindBy(css = "ms-dialog-content input[data-placeholder='Name']")
    public WebElement Name;

    @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c3082329526-61 ng-star-inserted']']")
    public WebElement StageBtn;

    @FindBy(xpath="//div[contains(text(),'Registration')]")
    public WebElement StudentRegistrationBtn;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement SaveBtn;

    @FindBy(css = "ms-delete-button")
    public WebElement deletBtn;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

}
