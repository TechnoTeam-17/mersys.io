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
    @FindBy(xpath = "(//span[text()='Document Types'])[1]")
    public WebElement DocumentTypes;

    @FindBy(css = "ms-add-button")
    public WebElement addBtn;

    @FindBy(css = "ms-dialog-content input[data-placeholder='Name']")
    public WebElement Name;

   @FindBy(xpath="//div[@class='mat-select-arrow-wrapper ng-tns-c3082329526-133')]")
   public WebElement StageBtn;

    @FindBy(xpath="//*[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox mat-pseudo-checkbox-full ng-star-inserted mat-pseudo-checkbox-checked')]")
    public WebElement StudentRegistrationBtn;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement SaveBtn;

    @FindBy(css = "ms-edit-button[class='ng-star-inserted']")
    public WebElement EditBtn;

    @FindBy(css = "ms-delete-button")
    public WebElement deletBtn;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

}
