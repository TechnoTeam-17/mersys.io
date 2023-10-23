
package StepDefinitons;

import Pages.POM_04;
import Utilities.WBA;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_AddingNewFieldsToAdminPanel extends POM_04{

    POM_04 lc= new POM_04();

    @Given("Navigate to Fields Page")
    public void navigate_to_fields_page() {
        lc.myClick(lc.Setup);
        lc.myClick(lc.Parameters);
        lc.myClick(lc.Fields);
          }

    @When("Create a new Field")
    public void create_a_new_field() {
        lc.myClick(lc.addBtn);
        lc.mySendKeys(lc.Name, "Nord Europa");
        lc.mySendKeys(lc.Code, "12345");
        lc.myClick(lc.FieldTypeBtn);
        lc.myClick(lc.LogicalBtn);
        new Actions(WBA.getDriver()).sendKeys(Keys.ESCAPE).perform();
        lc.myClick(lc.SaveBtn);
    }

    @And("edit a Field")
    public void edit_a_field() {
        lc.myClick(lc.EditBtn);
        lc.mySendKeys(lc.Name, "East Europa");
        lc.myClick(lc.SaveBtn);
    }

    @Then("delete a Field")
    public void delete_a_field() {
    lc.deleteItem("East Europa");

    }

    @Then("User should delete successfully")
    public void user_should_delete_successfully() throws InterruptedException{
         lc.verifyContainsText(lc.successMessage,"deleted");
    }

    }




