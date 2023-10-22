
package StepDefinitons;

import Pages.POM_03;
import Utilities.WBA;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_DocumentTypesManegment {

    POM_03 lc=new POM_03();
    Actions actions = new Actions(WBA.getDriver());

    @Given("Navigate to Document Types")
    public void navigate_to_document_types() {
        lc.myClick(lc.Setup);
        lc.myClick(lc.Parameters);
        lc.myClick(lc.DocumentTypes);
        WBA.getDriver().manage().window().maximize();
    }
    @When("Create a new document")
    public void create_a_new_document() {
        lc.myClick(lc.addBtn);
        lc.mySendKeys(lc.Name, "Education");
        Action aksiyon = actions.moveToElement(lc.StageBtn).build();
        aksiyon.perform();
        lc.myClick(lc.StudentRegistrationBtn);
        lc.myClick(lc.SaveBtn);

    }
      @And("edit a document")
    public void user_edit_document() {

    }
    @Then("delete document")
    public void delete_document() {
        lc.myClick(lc.deletBtn);

    }
    @Then("document should be deleted")
    public void document_should_be_deleted() throws InterruptedException{
        Thread.sleep(2000);
        lc.verifyContainsText(lc.successMessage,"deleted");

    }

}
