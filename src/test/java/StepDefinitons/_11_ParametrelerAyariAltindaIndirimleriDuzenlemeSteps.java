package StepDefinitons;

import Pages.POM_00;
import Pages.POM_11;
import io.cucumber.java.en.*;

public class _11_ParametrelerAyariAltindaIndirimleriDuzenlemeSteps {

    POM_11 lc=new POM_11();
    @Given("User click on the Setup und Parameters tabs")
    public void userClickOnTheSetupUndParametersTabs() {
        lc.myClick(lc.userClickOnTheSetupUndParametersTabs());
    }


    @When("the User clicks on the Discounts tab")
    public void theUserClicksOnTheDiscountsTab() {
        lc.myClick(lc.theUserClicksOnTheDiscountsTab());
    }

    @And("the User fills in the necessary information to add a new discount")
    public void theUserFillsInTheNecessaryInformationToAddANewDiscount() {
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
    }

    @Then("the discount should be added")
    public void theDiscountShouldBeAdded() {
        lc.mySendKeys(lc."early registration discount %25");

    }

    @And("the User updates the necessary information for an existing discount")
    public void theUserUpdatesTheNecessaryInformationForAnExistingDiscount() {
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
        lc.mySendKeys(lc."");
    }

    @Then("the changes should be saved")
    public void theChangesShouldBeSaved() {
        lc.myClick(lc.theChangesShouldBeSaved());

    }

    @And("the User initiates the process to delete an existing discount")
    public void theUserInitiatesTheProcessToDeleteAnExistingDiscount() {
        lc.myClick(lc.theUserInitiatesTheProcessToDeleteAnExistingDiscount());
    }

    @Then("the discount should be deleted, and the User completes the verification step")
    public void theDiscountShouldBeDeletedAndTheUserCompletesTheVerificationStep() {
            lc.verifyContainsText(lc.successMessage, "success");
        }
    }
}