package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class POM_04 extends Events {

    public POM_04() {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement Setup;
    @FindBy(xpath = "//*[text()='Parameters']")
    public WebElement Parameters;
    @FindBy(xpath = "(//span[text()='Fields'])[1]")
    public WebElement Fields;
    @FindBy(css = "ms-add-button")
    public WebElement addBtn;
    @FindBy(css = "ms-dialog-content input[data-placeholder='Name']")
    public WebElement Name;
    @FindBy(css = "ms-dialog-content input[data-placeholder='Code']")
    public WebElement Code;

    @FindBy(xpath = "//ms-save-button/button")
    public WebElement SaveBtn;
    @FindBy(css = "ms-edit-button[class='ng-star-inserted']")
    public WebElement EditBtn;
    @FindBy(xpath = "//div[contains(text(),'Field successfully deleted')]")
    public WebElement successMessage;
    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchNameBtn;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "//button [@type='submit']")
    public WebElement deleteDialogBtn;

    public void deleteItem(String searchText) {
        mySendKeys(searchInput, searchText);
        myClick(searchNameBtn);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
        // bu kodlar bir sitede belirlenen birseyi silmeyi sagliyor. once search yapiyor
        // sonra bulduktan sonra delete yapiyor.

    }
}





