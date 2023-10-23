package StepDefinitons;

import Pages.POM_10;
import Utilities.WBA;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class _10_ParametersUnderSettingClassLevelsGradeLevels {

    POM_10 lc=new POM_10();


    String gradeNameStr = "techno17";
    String shortNameStr = "techno";
    String orderStr = "17";
    String maxApplicationCountStr = "17";
    String newGradeNameStr = "17";

    public WebDriverWait wait = new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(20));

    @When("the user navigates to grade levels")
    public void theUserNavigatesToGradeLevels(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lc.getWebElement(strLinkList.get(i));
            lc.myClick(linkWebElement);
        }
    }

    @And("the user adds a new grade level")
    public void theUserAddsANewGradeLevel() {
        lc.myClick(lc.addButton);
        lc.mySendKeys(lc.name, gradeNameStr);
        lc.mySendKeys(lc.shortName, shortNameStr);
        lc.mySendKeys(lc.order, orderStr);
        lc.mySendKeys(lc.maxApplicationCount, maxApplicationCountStr);
        lc.myClick(lc.saveButton);
    }

    @Then("the grade level should be added successfully")
    public void theGradeLevelShouldBeAddedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user edits a grade level")
    public void theUserEditsAGradeLevel() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));

        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(gradeNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-edit-button)[" + i + "]";
                WebElement gEdit = WBA.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                lc.mySendKeys(lc.name, newGradeNameStr);
                lc.myClick(lc.saveButton);
                break;
            }
        }
    }

    @Then("the grade level should be edited successfully")
    public void theGradeLevelShouldBeEditedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }

    @And("the user deletes a grade level")
    public void theUserDeletesAGradeLevel() {
        List<WebElement> allNames = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//tbody[@role='rowgroup']/tr/td[2]")));

        for (int i = 0; i <= allNames.size(); i++) {
            if (allNames.get(i).getText().contains(newGradeNameStr)) {
                i++;
                String editLocator = "(//tbody[@role='rowgroup']/tr/td[2]/following::td[5]/div/ms-delete-button)[" + i + "]";
                WebElement gEdit = WBA.getDriver().findElement(By.xpath(editLocator));
                gEdit.click();
                lc.myClick(lc.deleteDialogBtn);
                break;
            }
        }
    }

    @Then("the grade level should be deleted successfully")
    public void theGradeLevelShouldBeDeletedSuccessfully() {
        lc.verifyContainsText(lc.successMessage, "success");
    }
}

