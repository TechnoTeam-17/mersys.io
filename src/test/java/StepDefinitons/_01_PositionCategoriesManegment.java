package StepDefinitons;

import Pages.POM_00;
import Pages.POM_01;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_PositionCategoriesManegment extends POM_01 {
    POM_01 pc=new POM_01();
    Faker fk = new Faker();
    String newCategory = fk.commerce().department();
    String categoryFaker=fk.commerce().department();
    @Given("Navigate to Position Categories")
    public void navigateToPositionCategories() {
        pc.myClick(pc.humanResources1);
        pc.myClick(pc.setup2);
        pc.myClick(pc.positionCategories);
    }

    @When("Create a new Category")
    public void createANewCategory() {

        pc.myClick(pc.addPositionCategoryButton);
        pc.mySendKeys(pc.pcInput,newCategory);
        pc.myClick(pc.saveButton);
    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        pc.verifyContainsText(pc.successMessage, "success");
    }

    @And("user edit and delete position category")
    public void userEditandDeletePositionCategory() {
        pc.editandDeleteItem(newCategory);
    }


}
