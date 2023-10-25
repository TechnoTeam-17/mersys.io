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
    @FindBy(xpath = "(//span[text()='School Setup'])[1]")
    public WebElement School_Setup;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement Departments;
  //  @FindBy(xpath="//*[@id='ms-table-0_buttons']/ms-table-toolbar/div/ms-add-button/div/button/span[3]")
  //  public WebElement addButton;

  // @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")

    @FindBy(css="[data-placeholder='Name']")
    public WebElement name;

    @FindBy(css="[formcontrolname='name']")
    public WebElement name2;
    @FindBy(css="[data-placeholder='Code']")
    public WebElement code;

    @FindBy(xpath="(//span[text()='Section'])")
    public WebElement Section;

    @FindBy(css="[data-placeholder='Short Name']")
    public WebElement Shortname;

    @FindBy(xpath="//span[text()='Add']")
    public WebElement addButton;
    @FindBy(xpath="(//span[text()='Add'])")
    public WebElement addButton2;

    @FindBy(xpath="//span[text()='Department Parameters']")
    public WebElement DepartmantsP;

    @FindBy(css="[data-placeholder='Key']")
    public WebElement key;

    @FindBy(css="[data-placeholder='Value']")
    public WebElement value;




    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;



    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup":
                return this.setup;
            case "School_Setup":
                return this.School_Setup;
            case "Departments":
                return this.Departments;
            case "addButton":
                return this.addButton;
            case "name":
                return this.name;
            case "code":
                return this.code;
            case "Shortname":
                return this.Shortname;
            case "key":
                return this.key;
                case "value":
                return this.value;
        }
        return null;
    }





}
