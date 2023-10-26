package Pages;

import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Events;


public class POM_06 extends Events {

    public POM_06() {
        PageFactory.initElements(WBA.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Education']")
    public WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    public WebElement setupUnderEducation;
    @FindBy(xpath = "//span[text()='Subject Categories']")
    public WebElement subjectCategories;


    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(css = "ms-dialog-content input[data-placeholder='Code']")
    public WebElement code;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "education":
                return this.education;
            case "setupUnderEducation":
                return this.setupUnderEducation;
            case "subjectCategories":
                return this.subjectCategories;
            case "addButton":
                return this.addButton;
            case "nameInput":
                return this.nameInput;
            case "code":
                return this.code;
            case "saveButton":
                return this.saveButton;
            case "successMessage":
                return this.successMessage;
        }
        return null;

    }
}
