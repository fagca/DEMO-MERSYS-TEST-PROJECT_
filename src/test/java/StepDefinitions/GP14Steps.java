package StepDefinitions;

import Pages.GP14Content;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;

public class GP14Steps {
    GP14Content gp14=new GP14Content();
    String randomName = RandomStringUtils.randomAlphabetic(8);

    @Then("Click the Education-Setup-Subject Categories")
    public void clickTheEducationSetupSubjectCategories() {
        GWD.Bekle(1);
        gp14.findAndClick("clickEducation");
        GWD.Bekle(1);
        gp14.findAndClick("clickSetup");
        GWD.Bekle(1);
        gp14.findAndClick("clickSubjectCategories");
        GWD.Bekle(2);
        gp14.findAndClick("clickAddSubjectButton");

    }

    @And("Click to Add button and write name and code")
    public void clickToAddButtonAndWriteNameAndCode() {
        GWD.Bekle(2);
        gp14.findAndSend("writeName",randomName);
        GWD.Bekle(2);
        gp14.findAndSend("writeCode",randomName);

    }

    @And("Click to Save button")
    public void clickToSaveButton() {
    }

    @Then("{string} should be wrinting displayed")
    public void shouldBeWrintingDisplayed(String arg0) {
    }

    @Then("Click to Edit button and write a new name and new code")
    public void clickToEditButtonAndWriteANewNameAndNewCode() {
    }

    @And("Click to edit save button")
    public void clickToEditSaveButton() {
    }

    @Then("Click to Delete Button and confirm the delete")
    public void clickToDeleteButtonAndConfirmTheDelete() {
    }


}
