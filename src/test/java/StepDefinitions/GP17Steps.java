package StepDefinitions;

import Pages.GP17;
import io.cucumber.java.en.And;

public class GP17Steps {

    GP17 gp17 = new GP17();

    @And("navigate to Bank accounts section")
    public void navigateToBankAccountsSection() {
        gp17.findAndClick("setupOne");
        gp17.findAndClick("parameters");
        gp17.findAndClick("bankAccounts");
        gp17.findAndClick("addButton");

    }

    @And("fill the inputs")
    public void fillTheInputs() {
        gp17.findAndSend("nameInput","Grup3");
    }
}
