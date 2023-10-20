
package StepDefinitons;

import Pages.POM_04;
import Utilities.WBA;
import io.cucumber.java.en.*;


public class _04_AdminPanelineYeniAlanlarEklemeSteps extends POM_04 {


    POM_04 lc = new POM_04();

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
        lc.mySendKeys(lc.name, "Middle Europa");
        lc.myClick(lc.speichern);
    }

    @When("edit a Field")
    public void edit_a_field() {
        lc.findAndSend("searchInput", "EnginUser4");
        lc.findAndClick("searchButton");
        waitUntilLoading();
        lc.findAndClick("editButton");
        lc.findAndSend("nameInput", "EditUser4");
        lc.findAndClick("saveButton");
    }

    @When("delete a Field")
    public void delete_a_field() {

    }

    @When("User should delete successfully")
    public void user_should_delete_successfully() {
        lc.SearchAndDelete(worth);
    }
}
}










