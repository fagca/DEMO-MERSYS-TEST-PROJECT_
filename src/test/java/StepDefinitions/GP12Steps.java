package StepDefinitions;

import Pages.GP12Content;
import Pages.GP20Content;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class GP12Steps {

    GP12Content dc = new GP12Content();

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

    @And("Navigate to Fields")
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

    @And("send fieldsname fieldsCode")
    public void sendFieldsnameFieldsCode(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("select fieldsType")
    public void selectFieldsType(DataTable elements) {
        GWD.Bekle(1);
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("click saveButton")
    public void clickSaveButton() {
        GWD.Bekle(1);
        dc.findAndClick("saveFields");
    }

    @And("check success text")
    public void checkSuccessText() {
        dc.findAndContainsText("successField", "success");
    }


    @And("send searchName")
    public void sendSearchName(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
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

    @And("send newFieldsName and newFieldsCode")
    public void sendNewFieldsNameAndNewFieldsCode(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("click delete")
    public void clickDelete(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
}
