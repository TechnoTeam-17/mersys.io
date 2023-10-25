package StepDefinitons;

import Pages.POM_07;
import Utilities.WBA;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _07_SchoolSetupUnderLocationsAddingSection {
    public WebDriverWait wait = new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(20));
    Actions aksiyonlar=new Actions(WBA.getDriver());
    POM_07 lc=new POM_07();
    @Given("Click on the elements in Setup")
    public void clickOnTheElementsInSetup(DataTable links){

        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lc.getWebElement(strLinkList.get(i));
            lc.myClick(linkWebElement);
        }
    }

    @And("Click to addbutton")
    public void clickToAddbutton() {
        lc.myClick(lc.addButton);
    }

    @Then("User create the keys in Locations")
    public void userCreateTheKeysInLocations(DataTable value) {

        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = lc.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            lc.mySendKeys(element, word);
        }

    }
    @And("choose location_type is Laboratory")
    public void chooseLocation_typeIsLaboratory() {
        lc.myJsClick(lc.location_type);
        lc.myJsClick(lc.location_type1);
    }
    @And("save locations info")
    public void saveLocationsInfo() {
        lc.myJsClick(lc.Save);

    }
    @Then("edit in Locations")
    public void editInLocations() throws InterruptedException {

       Thread.sleep(1000);
        lc.myClick(lc.Edit);
        lc.mySendKeys(lc.capacity,"10");
        lc.mySendKeys(lc.name,"lab8" );
        lc.mySendKeys(lc.sname,"l8" );

        Action aksiyon= aksiyonlar.moveToElement(lc.Save).click().build();
       aksiyon.perform();
    }

    @Then("click delete as name {string}")
    public void clickDeleteAsName(String arg0) throws InterruptedException {

        Thread.sleep(1000);
        lc.myJsClick(lc.delete);
    }

    @And("User must be able to enable and disable Partitions")
    public void userMustBeAbleToEnableAndDisablePartitions() throws InterruptedException {
      lc.myClick(lc.activate);
        Thread.sleep(3000);

    }

    @And("delete as name {string}  in Locations")
    public void deleteAsNameInLocations(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        lc.myClick(lc.delete2);
    }





}
