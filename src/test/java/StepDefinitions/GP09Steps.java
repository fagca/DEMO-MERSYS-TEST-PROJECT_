package StepDefinitions;

import Pages.GP09Content;
import Pages.LeftNavBar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GP09Steps {

    public GP09Content gp09Content = new GP09Content();
    public LeftNavBar leftNavBar = new LeftNavBar();

    @And("Navigate to Positions")
    public void navigateToPositions() {

        leftNavBar.findAndClick("humanResources");
        leftNavBar.findAndClick("humanResourcesSetup");
        leftNavBar.findAndClick("positions");
    }

    @Given("User add button in position setup")
    public void userUserAddButton() {

        gp09Content.findAndClick("addButton");


    }

    @When("User filled form and click save button in position setup")
    public void userFilledDataAndClickSaveForm() {

        gp09Content.findAndSend("formNameInput", "higp09");
        gp09Content.findAndSend("formShortNameInput", "higp09");

        gp09Content.findAndClick("saveButton");

    }

    @Then("User must to see successful alert")
    public void userMustToSeeSavedAlert() {

        gp09Content.findAndValidate("successAlert", "success");

    }

    @Given("User search a position and click edit button in position setup")
    public void userUserSearchAPosition() {

        gp09Content.findAndSend("searchNameInput","higp09");
        gp09Content.findAndClick("searchButton");

        gp09Content.findAndClick("editButton");

        
    }

    @When("User filled form with different data and click save button in position setup")
    public void userFilledFormWithDifferentDataAndClickSaveButton() {


        gp09Content.findAndSend("formNameInput", "hellogp09");
        gp09Content.findAndSend("formShortNameInput", "hellogp09");

        gp09Content.findAndClick("saveButton");

    }

    @Given("User search a position and click delete button in position setup")
    public void userUserSearchAPositionAndClickDeleteButton() {

       gp09Content.findAndDelete("hellogp09");
    }

    @When("User click delete button in form")
    public void userClickDeleteButtonInForm() {

        gp09Content.findAndClick("deleteButtonInForm");

    }
}
