package StepDefinitions;



import Pages.GP13Content;

import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class GP13Steps {

    GP13Content dc = new GP13Content();
    String randomGenName= RandomStringUtils.randomAlphabetic(8);
    String randomGenShortName= RandomStringUtils.randomAlphabetic(8);

    @Given("Navigate to mersys{int}")
    public void navigateToMersys(int arg0) {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button{int}")
    public void enterUsernameAndPasswordAndClickLoginButton(int arg0) {
        dc.findAndSend("username", "richfield.edu");
        dc.findAndSend("password", "Richfield2020!");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfuly{int}")
    public void userShouldLoginSuccessfuly(int arg0) {
        dc.findAndContainsText("dashboard", "Dashboard");
        dc.findAndClick("acceptCookies");
    }

    @And("Navigate to Positions")
    public void navigateToFields(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("Click addbutton")
    public void clickAddbutton(DataTable elements) {
        GWD.Bekle(1);

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }


    @And("send Positionsname Code")
    public void sendFieldsnameFieldsCode() {
        dc.findAndSend("Positionsname", randomGenName);
        dc.findAndSend("Shortname", randomGenShortName);
    }


    @And("click saveButton")
    public void clickSaveButton() {
        GWD.Bekle(1);
        dc.findAndClick("savePositions");
    }

    @And("check success text")
    public void checkSuccessText() {
        dc.findAndContainsText("successField", "success");
    }


    @And("send searchName")
    public void sendSearchName() {

        dc.findAndSend("searchName", randomGenName);
        dc.findAndSend("searchcode", randomGenShortName);

    }

    @Then("Search button")
    public void searchButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("click editbutton")
    public void clickEditbutton(DataTable elements) {
        GWD.Bekle(2);
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("send newPositionsName and newCode")
    public void sendNewFieldsNameAndNewFieldsCode() {
        dc.findAndSend("Positions", randomGenName);
        dc.findAndSend("Shortname", randomGenShortName);
    }

    @And("click delete")
    public void clickDelete(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }

    }

    @And("send Positionsname Shortname")
    public void sendPositionsnameShortname() {

    }
}

