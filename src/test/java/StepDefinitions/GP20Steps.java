package StepDefinitions;


import Pages.GP20Content;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class GP20Steps {
    GP20Content dc = new GP20Content();


    @Given("Navigate to mersys")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        // waitleri var
//        dc.username.sendKeys("richfield.edu");
//        dc.password.sendKeys("Richfield2020!");
//        dc.loginButton.click();
        // 1 .aşama
        dc.findAndSend("username", "richfield.edu");
        dc.findAndSend("password", "Richfield2020!");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {
//        dc.waitUntilVisible(dc.dashboard);
//        Assert.assertTrue(dc.dashboard.getText().contains("Dashboard"));

        dc.findAndContainsText("dashboard", "Dashboard");
        dc.findAndClick("acceptCookies");
    }

    @And("Navigate to Nationality page")
    public void navigateToNationalityPage() {
        dc.findAndClick("setup");
        dc.findAndClick("parameters");
        dc.findAndClick("nationalities");

        GWD.Bekle(3);
        dc.findAndClick("addbutton");
    }

    @When("Enter user a Nationality name as")
    public void enterUserANationalityNameAs() {
        dc.findAndSend("name", "esra1");
    }


    @Then("User should click save buttons")
    public void userShouldClickSaveButtons() {
        dc.findAndClick("save");
    }
}



