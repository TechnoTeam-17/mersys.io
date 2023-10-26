package Pages;

import Utilities.Events;
import Utilities.WBA;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class POM_01 extends Events{

    public POM_01() {
        PageFactory.initElements(WBA.getDriver(), this);
    }
    @FindBy(id="mat-input-0")
    public WebElement humanResources;
    @FindBy(id="mat-input-1")
    public WebElement password;

    @FindBy(xpath="(//span[text()='Setup'])[3]")
    public WebElement setup2;

    @FindBy(xpath="(//span[text()='Human Resources'])[1]")
    public WebElement humanResources1;

    @FindBy(xpath="(//span[text()='Position Categories'])[1]")
    public WebElement positionCategories;

    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'POSITION_CATEGORY')]")
    public WebElement addPositionCategoryButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement pcInput;

    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath="//ms-edit-button[contains(@tooltip,'POSITION_CATEGORY')]")
    public WebElement editPositionCategory;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")

    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-edit-button//button)[1]")
    public WebElement editCategoryButton;
    @FindBy(xpath="//button [@type='submit']")
    public WebElement editDialogButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;
    @FindBy(xpath="//button [@type='submit']")
    public WebElement deleteDialogButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']")
    private WebElement editTypebar;

    Faker fk = new Faker();
    String categoryfaker2=fk.commerce().department();
    public void editandDeleteItem(String searchText) {


        mySendKeys(searchInput,searchText);
        myClick(searchButton);

      WebDriverWait wait=new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(10));
        myClick(editCategoryButton);
        mySendKeys(pcInput, categoryfaker2);
        myClick(saveButton);
        myClick(deleteImageButton);
        myClick(deleteDialogButton);


    }

}
