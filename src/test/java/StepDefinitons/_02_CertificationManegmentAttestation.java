package StepDefinitons;

import Pages.POM_01;
import Pages.POM_02;
import Utilities.WBA;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static Utilities.WBA.driver;

public class _02_CertificationManegmentAttestation extends POM_02{

    POM_02 a=new POM_02();
    Faker an = new Faker();
    String newAttestation = an.job().keySkills();

    @Given("Navigate to Attestations")
    public void navigateToAttestations() {
        a.myClick(a.humanResources1);
        a.myClick(a.setup2);
        a.myClick(a.attestations);
    }

    @When("Create a new attestation")
    public void createANewAttestation() throws AWTException {

        a.myClick(a.addAttestationButton);
        a.mySendKeys(a.pcInput,newAttestation);

        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        //a.myClick(a.saveButton);
    }

    @And("user edit and delete attestation")
    public void userEditandDeleteAttestation() throws AWTException {
        a.editandDeleteAttestation(newAttestation);

    }}


