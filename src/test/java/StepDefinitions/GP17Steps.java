package StepDefinitions;

import Pages.GP17;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class GP17Steps {
    GP17 gp17 = new GP17();

    @And("Navigate to Bank accounts")
    public void navigateToBankAccounts() {
        GWD.Bekle(1);
        gp17.findAndClick("setupOne");
        gp17.findAndClick("parameters");
        GWD.Bekle(1);

        gp17.findAndClick("bankAccounts");
        GWD.Bekle(1);
        gp17.findAndClick("addButton");

    }

    @And("fill the inputs and save")
    public void fillTheInputsSave() {
        gp17.findAndSend("nameInput","GP17");
        gp17.findAndSend("ibanInput","TR00000000000000000032");
        gp17.findAndClick("currencyInput");
        gp17.findAndClick("currencyKZT");
        gp17.findAndSend("integrationCodeInput","11112");
        gp17.findAndClick("saveButton");

    }

    @Then("Write the name in name search box")
    public void writeTheNameInNameSearchBox() {
        gp17.findAndSend("nameSearch","GP17");
        gp17.findAndClick("searchButton");
    }

    @And("Edit bank account inputs and save")
    public void editBankAccountInputsAndSave() {
        GWD.Bekle(2);
        gp17.findAndClick("editButton");
        gp17.findAndSend("nameInput","GP17_2");
        gp17.findAndSend("ibanInput","TR00000000000000000033");
        gp17.findAndClick("currencyInputEdit");
        gp17.findAndClick("currencyUSD");
        gp17.findAndSend("integrationCodeInput","2");
        gp17.findAndClick("saveButton");

    }

    @Then("Write the new name in name search box")
    public void writeTheNewNameInNameSearchBox() {
        gp17.findAndSend("nameSearch","GP17_2"+ Keys.ENTER);
    }

    @When("Delete the bank account")
    public void deleteTheBankAccount() {
        GWD.Bekle(2);
        gp17.findAndClick("deleteButton");
        gp17.findAndClick("deleteSubmitButton");
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String arg0) {
        GWD.Bekle(2);
        gp17.findAndContainsText("textDisplay","There is no data to display");
    }
}
