package StepDefinitons;

import Pages.POM_11;
import Pages.POM_12;
import io.cucumber.java.en.*;

public class _12_ParametrelerAyariAltindaMilliyetleriDuzenlemeSteps {

    POM_12 lc=new POM_12();


    @When("the User is on the page to add nationalities.")
    public void theUserIsOnThePageToAddNationalities() {
        lc.myClick(lc.theUserIsOnThePageToAddNationalities());
    }

    @And("the User enters the required information to add a new nationality.")
    public void theUserEntersTheRequiredInformationToAddANewNationality() {
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");

    }


    @Then("the nationality should be added.")
    public void the_nationality_should_be_added() {
        lc.myClick(lc.);
    }

    @When("the User is on the page to edit nationalities")
    public void theUserIsOnThePageToEditNationalities() {
        lc.myClick(lc.theUserIsOnThePageToEditNationalities());
    }

    @And("the User updates the valid information for an existing nationality")
    public void theUserUpdatesTheValidInformationForAnExistingNationality() {
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");

    }

    @When("the User is on the page to delete nationalities")
    public void theUserIsOnThePageToDeleteNationalities() {
        lc.myClick(lc.);
    }

    @And("the User initiates the process to delete an existing nationality")
    public void theUserInitiatesTheProcessToDeleteAnExistingNationality() {
        lc.myClick(lc.theUserInitiatesTheProcessToDeleteAnExistingNationalit());
    }

    @Then("the nationality should be deleted, and the User completes the verification step")
    public void theNationalityShouldBeDeletedAndTheUserCompletesTheVerificationStep() {
        lc.verifyContainsText(lc.successMessage,"success");
    }
}
