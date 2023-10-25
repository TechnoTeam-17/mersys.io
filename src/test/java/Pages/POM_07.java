package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_07 extends Events {
    public POM_07(){ PageFactory.initElements(WBA.getDriver(),this);}

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "(//span[text()='School Setup'])[1]")
    public WebElement School_Setup;
    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    public WebElement Locations;
    @FindBy(xpath="//*[@id='ms-table-0_buttons']/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
    public WebElement addButton;
    @FindBy(css="[data-placeholder='Name']")
    public WebElement name;
    @FindBy(css="[data-placeholder='Short Name']")
    public WebElement sname;
    @FindBy(xpath="(//span[text()='Classroom'])")
    public WebElement location_type;
    @FindBy(xpath="(//span[text()=' Laboratory '])")
    public WebElement location_type1;
    @FindBy(css="[data-placeholder='Capacity']")
    public WebElement capacity;
    @FindBy(xpath="(//span[text()='Save'])")
    public WebElement Save;

    @FindBy(xpath="(//span[@class='mat-mdc-button-touch-target'])[11]")
    public WebElement Edit;

    @FindBy(xpath="(//span[@class='mat-ripple mat-mdc-button-ripple'])[3]")
    public WebElement Save2;

    @FindBy(xpath="(//ms-delete-button//button)[1]")
    public WebElement delete;

    @FindBy(xpath="(//strong[text()='Delete'])")
    public WebElement dialogdel;

    @FindBy(xpath="(//button[@type='submit'])")
    public WebElement delete2;

    @FindBy(xpath="(//div[@class='mdc-switch__handle'])[1]")
    public WebElement activate;
    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "School_Setup":
                return this.School_Setup;
            case "Locations":
                return this.Locations;
            case "addButton":
                return this.addButton;
            case "name":
                return this.name;
            case "sname":
                return this.sname;
            case "location Type":
                return this.location_type;
            case "capacity":
                return this.capacity;
            case "location_type1":
                return this.location_type1;
            case "Save":
                return this.Save;
            case "Edit":
                return this.Edit;
            case "Save2":
                return this.Save2;
            case "delete":
                return this.delete;
            case "delete2":
                return this.delete2;
            case "dialogdel":
                return this.dialogdel;
            case "activate":
                return this.activate;
        }
        return null;
    }

}
