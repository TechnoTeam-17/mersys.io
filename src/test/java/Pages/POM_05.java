package Pages;

import Utilities.Events;
import Utilities.WBA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_05 extends Events {

    public POM_05 () {
        PageFactory.initElements(WBA.getDriver(), this);
    }



    @FindBy(xpath="//span[text()='Positions']")
    public WebElement positionUnderHR;





}
