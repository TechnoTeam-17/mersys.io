package StepDefinitons;

import Pages._00_LoginPOM;
import Utilities.Events;
import Utilities.WBA;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _00_LoginSteps{

        _00_LoginPOM lc=new _00_LoginPOM();


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


