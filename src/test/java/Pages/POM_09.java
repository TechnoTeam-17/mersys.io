package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_09 extends Events {

    public POM_09() {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(css = "[class='nav-link-title ng-tns-c2089661534-6 ng-star-inserted']")
    public WebElement setup;
    @FindBy (css = "[class='ng-tns-c2089661534-7 ng-tns-c2089661534-6 nav-collapsable nav-item ng-star-inserted']")
    public WebElement parameters;
    @FindBy(css = "div > fuse-nav-vertical-item:nth-child(11) > a > span")
    public  WebElement bankAccounts;
    @FindBy(css = "ms-add-button > div > button > span.mat-mdc-button-touch-target")
    public WebElement create;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/div/div/bank-account-dialog/ms-dialog/ms-dialog-content/div/mat-form-field[1]/div/div[1]/div/ms-text-field/input")
    public  WebElement name;
    @FindBy(css = "[data-placeholder=\"IBAN\"]")
    public WebElement iban;
    @FindBy(xpath = "(//span[text()='Currency'])[3]")
    public WebElement currency;
    @FindBy(xpath = "/html/body/div[2]/div[4]/div/div/div/mat-option[1]/span")
    public  WebElement currencyEUR;
    @FindBy (css = "[data-placeholder='Integration Code']")
    public WebElement code;
    @FindBy (css = "ms-save-button > button > span.mdc-button__label > fa-icon > svg")
    public WebElement save;
    @FindBy(xpath = "//*[@class='mdc-data-table__content']/tr[1]")
    public WebElement update;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/mat-dialog-container/div/div/bank-account-dialog/ms-dialog/ms-dialog-content/div/mat-slide-toggle/div/label")
    public WebElement inActive;
    @FindBy(xpath = "//*[@id=\"cdk-drop-list-0\"]/tbody/tr[1]/td[7]/div[1]/ms-delete-button/button/span[3]")
    public WebElement delete;
    @FindBy(css = "[class='mdc-button mat-mdc-button mdc-button--raised mat-mdc-raised-button mat-accent mat-mdc-button-base']>[class='mdc-button__label']")
    public WebElement deleteEnd;
}
