package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


public class POM_04 extends Events {

    public POM_04 () {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement Setup;
    @FindBy(xpath = "//*[text()='Parameters']")
    public WebElement Parameters;
    @FindBy(xpath="//span[@class='nav-link-title ng-star-inserted']']")
    public WebElement Fields;

    @FindBy(css = "ms-add-button")
    public WebElement addBtn;

    @FindBy(css = "ms-dialog-content input[data-placeholder='Name']")
    public WebElement Name;

    @FindBy(css = "ms-dialog-content input[data-placeholder='Name']")
    public WebElement NumberBtn;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement SaveBtn;

    @FindBy(css = "ms-delete-button")
    public WebElement deletBtn;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

}





