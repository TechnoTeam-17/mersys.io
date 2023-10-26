package StepDefinitons;
import Pages.POM_09;
import Utilities.WBA;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _09_UnderParametersSettingBankEditingYourAccounts {
    
    POM_09 lc=new POM_09();

    @Then("Click setup")
    public void clickSetup() {
        lc.myClick(lc.setup);
    }

    @Then("Click parameters")
    public void clickParameters() {
        lc.myWait.until(ExpectedConditions.elementToBeClickable(lc.parameters));
        lc.parameters.click();

    }
    @And("Click bank accounts")
    public void clickBankAccounts() {
        lc.myClick(lc.bankAccounts);
    }

    @Then("Add new account")
    public void addNewAccount() {
        lc.myClick(lc.create);
        lc.myClick(lc.name);
        lc.name.sendKeys("Team17");
        lc.mySendKeys(lc.iban,"1234");
        lc.myClick(lc.currency);
        lc.myWait.until(ExpectedConditions.elementToBeClickable(lc.currencyEUR));
        lc.myClick(lc.currencyEUR);
        lc.code.sendKeys("1234");
        lc.myWait.until(ExpectedConditions.elementToBeClickable(lc.save));
        lc.myClick(lc.save);
    }

    @Then("Account update")
    public void accountUpdate() {
        lc.wait(2);
        WBA.getDriver().navigate().refresh();
        lc.myClick(lc.update);
        lc.wait(1);
        lc.iban.clear();
        lc.mySendKeys(lc.iban,"5678");
        lc.myClick(lc.save);

    }

    @Then("Account will be inactive")
    public void accountWillBeInactive() {
        lc.wait(2);
        lc.myClick(lc.update);
        lc.myClick(lc.inActive);
        lc.myClick(lc.save);
    }

    @Then("the bank account should be deleted and removed from the list")
    public void theBankAccountShouldBeDeletedAndRemovedFromTheList() {
        lc.wait(2);
        lc.myClick(lc.delete);
        lc.myClick(lc.deleteEnd);
    }
}
