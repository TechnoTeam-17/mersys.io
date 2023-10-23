package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_10 extends Events {
    public POM_10() {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(css = "input[data-placeholder='Name']")
    public WebElement name;
    @FindBy(css = "input[type='number']")
    public WebElement order;
    @FindBy(css = "input[data-placeholder='Max Application Count']")
    public WebElement maxApplicationCount;
    @FindBy(css = "input[data-placeholder='Short Name']")
    public WebElement shortName;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "grade levels":
                return this.gradeLevels;
        }
        return null;
    }

}
