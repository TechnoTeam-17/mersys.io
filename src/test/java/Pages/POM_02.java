package Pages;

import Utilities.Events;
import Utilities.WBA;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class POM_02 extends Events {

    public POM_02() {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    Faker faker = new Faker();
    String categoryfakerattestation=faker.job().keySkills();
    @FindBy(xpath="(//span[text()='Setup'])[3]")
    public WebElement setup2;

    @FindBy(xpath="(//span[text()='Human Resources'])[1]")
    public WebElement humanResources1;

    @FindBy(xpath="(//span[text()='Attestations'])[1]")
    public WebElement attestations;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'ATTESTATION')]")
    public WebElement addAttestationButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    public WebElement pcInput;

    @FindBy(xpath="//ms-save-button/save")
    public WebElement saveButton;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")

    public WebElement searchInput;

    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath="(//ms-edit-button//button)[1]")
    public WebElement editCategoryButton;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement deleteImageButton;
    @FindBy(xpath="//button [@type='submit']")
    public WebElement deleteDialogButton;

    public void editandDeleteAttestation(String searchText) throws AWTException {


        mySendKeys(searchInput,searchText);
        myClick(searchButton);


        myClick(editCategoryButton);
        mySendKeys(pcInput, categoryfakerattestation);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
       // myClick(saveButton);
        myClick(deleteImageButton);
        WebDriverWait wait=new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(10));
        myClick(deleteDialogButton);


    }
}
