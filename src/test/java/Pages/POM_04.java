package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_04 extends Events {

    public POM_04 () {
        PageFactory.initElements(WBA.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c3380182179-6 ng-star-inserted']")
    public WebElement Setup;
    @FindBy(xpath="//span[@class='nav-link-title ng-tns-c3380182179-7 ng-star-inserted']")
    public WebElement Parameters;
    @FindBy(xpath="//span[@class='//span[@class='nav-link-title ng-star-inserted']']")
    public WebElement Fields;




}
