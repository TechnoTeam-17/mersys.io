package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_05 extends Events {

    public POM_05() {
        PageFactory.initElements(WBA.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResource;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupUnderHR;

    @FindBy(xpath = "//span[text()='Positions']")
    public WebElement positionUnderHR;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortName;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "humanResource":
                return this.humanResource;
            case "setupUnderHR":
                return this.setupUnderHR;
            case "positionUnderHR":
                return this.positionUnderHR;
            case "addButton":
                return this.addButton;
            case "nameInput":
                return this.nameInput;
            case "shortName":
                return this.shortName;
            case "saveButton":
                return this.saveButton;
            case "successMessage":
                return this.successMessage;
        }
        return null;

    }


}
