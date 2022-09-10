package StepDefinitions;

import Pages.GP11Content;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Random;

public class GP11Steps {

    GP11Content gp11 = new GP11Content();

    String randomName = RandomStringUtils.randomAlphabetic(8);
    String randomName2 = RandomStringUtils.randomAlphabetic(8);

    @And("Navigate to Document Types")
    public void navigateToDocumentTypes() {
        GWD.Bekle(1);
        gp11.findAndClick("setupOne");
        GWD.Bekle(1);
        gp11.findAndClick("parameters");
        GWD.Bekle(1);
        gp11.findAndClick("documentTypes");
    }

    @And("fill the Document Types inputs and save")
    public void fillTheDocumentTypesInputsAndSave() throws AWTException {
        GWD.Bekle(1);
        gp11.findAndClick("addButton");
        gp11.findAndSend("nameInput",randomName);
        gp11.findAndClick("stage");
        gp11.findAndClick("studentRegistration");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        GWD.Bekle(1);
        gp11.findAndSend("descriptionTextArea","Deneme1");
        gp11.findAndClick("saveButton");

    }

    @Then("Write the name in name search box for Document Types")
    public void writeTheNameInNameSearchBoxForDocumentTypes() {
        GWD.Bekle(1);
        gp11.findAndSend("nameSearch",randomName+ Keys.ENTER);
    }

    @And("Edit Document Types inputs and save")
    public void editDocumentTypesInputsAndSave() throws AWTException {
        GWD.Bekle(1);
        gp11.findAndClick("editButton");
        gp11.findAndSend("nameEdit",randomName2);
        gp11.findAndClick("stage");
        gp11.findAndClick("certificate");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
        GWD.Bekle(1);
        gp11.findAndSend("descriptionTextArea","Edited");
        gp11.findAndClick("saveButton");

    }

    @Then("Write the new name in name search box for Document Types")
    public void writeTheNewNameInNameSearchBoxForDocumentTypes() {
        GWD.Bekle(1);
        gp11.findAndSend("nameSearch",randomName2+ Keys.ENTER);

    }

    @When("Delete the Document Type")
    public void deleteTheDocumentType() {
        gp11.findAndClick("deleteButton");
        gp11.findAndClick("deleteSubmitButton");

    }

    @Then("{string} should be displayed in Document Types page")
    public void shouldBeDisplayedInDocumentTypesPage(String arg0) {
        GWD.Bekle(1);
        gp11.findAndContainsText("textDisplay","There is no data to display");
    }
}
