package StepDefinitions;

import Pages.GP19Content;
import Pages.LeftNavBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GP19Steps {

    GP19Content gp19Content = new GP19Content();
    LeftNavBar leftNavBar = new LeftNavBar();

    @And("Navigate to Discounts")
    public void navigateToDiscounts() {

        leftNavBar.findAndClick("setupOne");
        leftNavBar.findAndClick("parameters");
        leftNavBar.findAndClick("discounts");

    }

    @Given("User add button in discount setup")
    public void userAddButtonInDiscountSetup() {

        gp19Content.findAndClick("addButton");

    }

    @When("User filled form and click save button in discount setup")
    public void userFilledFormAndClickSaveButtonInDiscountSetup() {

        gp19Content.findAndSend("formDescriptionInput", "higp19");
        gp19Content.findAndSend("formIntegrationCodeInput", "19");
        gp19Content.findAndSend("formPriorityInput", "01");

        gp19Content.findAndClick("saveButton");

    }

    @Given("User search a position and click edit button in discount setup")
    public void userSearchAPositionAndClickEditButtonInDiscountSetup() {

        gp19Content.findAndSend("searchDescriptionInput","higp19");
        gp19Content.findAndClick("searchButton");

        gp19Content.findAndClick("editButton");

    }

    @When("User filled form with different data and click save button in discount setup")
    public void userFilledFormWithDifferentDataAndClickSaveButtonInDiscountSetup() {

        gp19Content.findAndSend("formDescriptionInput", "hellogp19");
        gp19Content.findAndSend("formIntegrationCodeInput", "119");
        gp19Content.findAndSend("formPriorityInput", "001");

        gp19Content.findAndClick("saveButton");

    }

    @Given("User search a position and click delete button in discount setup")
    public void userSearchAPositionAndClickDeleteButtonInDiscountSetup() {

        gp19Content.findAndDelete("hellogp19");

    }


}
