package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_08 extends Events {
    public POM_08() {
        PageFactory.initElements(WBA.getDriver(), this);
    }
    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;

    @FindBy(xpath = "//span[text()='School Setup'])[1]")
    public WebElement School_Setup;

    @FindBy(xpath = "//span[text()='Departments'])[1]")
    public WebElement Departments;
    @FindBy(xpath="//*[@id=\"ms-table-0_buttons\"]/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    public WebElement addButton;


   // @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
   @FindBy(id="ms-text-field-6")
    public WebElement nameInput;

   // @FindBy(xpath="//ms-text-field[@formcontrolname='code' ]//input")
    @FindBy(xpath="//*[@id='ms-text-field-7']")
    public WebElement codeInput;

    @FindBy(xpath="//*[@id='ms-text-field-8']")
    public WebElement SnameInput;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;






    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "parameters":
                return this.parameters;
            case "School_Setup":
                return this.School_Setup;
            case "Departments":
                return this.Departments;
            case "addButton":
                return this.addButton;

        }
        return null;
    }





}
