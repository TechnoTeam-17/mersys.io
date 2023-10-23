package StepDefinitons;
import Pages.POM_04;
import Utilities.WBA;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_AddingNewFieldsToAdminPanel {

    POM_04 lc= new POM_04();
    Actions actions = new Actions(WBA.getDriver());
    @Given("Navigate to Fields Page")
    public void navigate_to_fields_page() {
        lc.myClick(lc.Setup);
        lc.myClick(lc.Parameters);
        lc.myClick(lc.Fields);
        WBA.getDriver().manage().window().maximize();
    }

    @When("Create a new Field")
    public void create_a_new_field() {
        lc.myClick(lc.addBtn);
        lc.mySendKeys(lc.Name, "Middle Europa");
        Action aksiyon = actions.moveToElement(lc.NumberBtn).build();
        aksiyon.perform();
        lc.myClick(lc.NumberBtn);
        lc.myClick(lc.SaveBtn);
    }

    @When("edit a Field")
    public void edit_a_field() {

    }

    @When("delete a Field")
    public void delete_a_field() {
       lc.myClick(lc.deletBtn);

    }

    @When("User should delete successfully")
    public void user_should_delete_successfully() throws InterruptedException{
         Thread.sleep(2000);
          lc.verifyContainsText(lc.successMessage,"deleted");
    }


    }




