package StepDefinitons;

import Pages.POM_00;
import Utilities.WBA;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _00_LoginSteps{

        POM_00 lc=new POM_00();


        @Given("Navigate to campus")
        public void navigateToCampus() {
            WBA.getDriver().get("https://test.mersys.io/");
            WBA.getDriver().manage().window().maximize();
        }

        @When("Enter username and password and click login button")
        public void enterUsernameAndPasswordAndClickLoginButton() {
            lc.mySendKeys(lc.username,"username");
            lc.mySendKeys(lc.password,"password");
            lc.myClick(lc.loginButton);
        }

        @Then("User should login successfully")
         public void userShouldLoginSuccessfully() {
            lc.verifyContainsText(lc.schoolName, "Techno Study Intern School");
         }
}


