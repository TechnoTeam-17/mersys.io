package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_12 extends Events {

    public POM_12() {
        PageFactory.initElements(WBA.getDriver(), this);
    }


    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement textTechnoStudy;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;
    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogButton;
    @FindBy(xpath = "(//ms-edit-button)[1]")
    public WebElement editButton;
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupHumanResources;
    @FindBy(xpath = "//span[text()='Position Categories']")
    public WebElement positionCategories;

    public WebElement theUserIsOnThePageToAddNationalities() {
    }

    public WebElement theUserIsOnThePageToEditNationalities() {
    }

    public WebElement theUserInitiatesTheProcessToDeleteAnExistingNationalit() {
    }

}
