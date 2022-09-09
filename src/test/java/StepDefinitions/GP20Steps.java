package StepDefinitions;


import Pages.GP20Content;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class GP20Steps {
    String randomName= RandomStringUtils.randomAlphabetic(8);
    GP20Content dc = new GP20Content();


    @Given("Navigate to mersys")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        dc.findAndSend("username", "richfield.edu");
        dc.findAndSend("password", "Richfield2020!");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {

        dc.findAndContainsText("dashboard", "Dashboard");
        dc.findAndClick("acceptCookies");
    }

    @And("Navigate to Nationality page")
    public void navigateToNationalityPage() {
        dc.findAndClick("setup");
        dc.findAndClick("parameters");
        dc.findAndClick("nationalities");

    }

    @When("User create a Nationality name as")
    public void userCreateANationalityNameAs() {
        GWD.Bekle(1);
        dc.findAndClick("addbutton");
        dc.findAndSend("name1",randomName);


    }

   @Then("User should click save buttons")
    public void userShouldClickSaveButtons(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));

        }


    }

    @When("User should enter name")
    public void userShouldEnterName() {
      GWD.Bekle(1);
        dc.findAndSend("searchText",randomName);
       // List<List<String>> listElement = elements.asLists(String.class);

        //for (int i = 0; i < listElement.size(); i++)
         //   dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }

    @And("User should search button")
    public void userShouldSearchButton(DataTable elements) {
        GWD.Bekle(1);
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
           dc.findAndClick(listElement.get(i));
        }
   }


    @And("User should click edit buttons")
    public void userShouldClickEditButtons(DataTable elements) {
        GWD.Bekle(1);
       List<String> listElement = elements.asList(String.class);

       for (int i = 0; i < listElement.size(); i++) {
           dc.findAndClick(listElement.get(i));
        }
    }

    @And("Success messeage sould be displayed")
    public void successMesseageSouldBeDisplayed() {
        dc.findAndContainsText("success","success");
    }

    @And("User should click delete buttons")
    public void userShouldClickDeleteButtons() {
        GWD.Bekle(2);
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteButton2");
//        List<String> listElement = elements.asList(String.class);
//
//        for (int i = 0; i < listElement.size(); i++) {
//            dc.findAndClick(listElement.get(i));
        //}
    }
}



