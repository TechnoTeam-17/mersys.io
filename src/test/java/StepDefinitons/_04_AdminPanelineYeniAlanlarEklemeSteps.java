package StepDefinitons;
import Pages.POM_04;
import Utilities.WBA;
import io.cucumber.java.en.*;

public class _04_AdminPanelineYeniAlanlarEklemeSteps {

    POM_04 lc= new POM_04();
    @Given("Navigate to Set Up Categories")
    public void navigate_to_set_up_categories() {
    WBA.getDriver().get("https://test.mersys.io/");
    WBA.getDriver().manage().window().maximize();
    }
    @When("Create new Fields")
    public void create_new_fields() {

    }
    @When("add a Field")
    public void add_a_field() {lc.myClick(lc.Setup); }
    @When("edit a Field")
    public void edit_a_field() {lc.myClick(lc.addBtn); }
    @When("delete a Field")
    public void delete_a_field() {lc.myClick(lc.addBtn); }
    @When("User should delete successfully")
    public void user_should_delete_successfully() {
        lc.verifyContainsText(lc.Fields, "successfully");}
}
