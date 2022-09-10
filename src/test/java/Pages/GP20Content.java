package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GP20Content extends Parent {

    public GP20Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;
    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchInput;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//span[contains(text(),\"Setup\")])[1]")
            private WebElement setup;

    @FindBy(xpath = "(//span[contains(text(),\"Parameters\")])[1]")
            private WebElement parameters;

    @FindBy(xpath = "(//span[contains(text(),\"Nationalities\")])")
            private WebElement nationalities;

    @FindBy (xpath = "//ms-add-button//div//button")
            private WebElement addbutton;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')]//input)[2]")
    private WebElement name1;

    @FindBy (xpath = "//span[contains(text(),\"Save\")] ")
            private WebElement save;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')]//input")
    private WebElement searchText;

   @FindBy (xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy (css = "span>fa-icon>svg[data-icon=\"pen-to-square\"]\n")
    private WebElement editButton;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),\"Delete\")]")
    private WebElement deleteButton2;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama

        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "shortName":
                myElement = shortName;
                break;
            case "searchInput":
                myElement = searchInput;
                break;
            case "integrationCode":
                myElement = integrationCode;
                break;
            case "priorityCode":
                myElement = priorityCode;
                break;
            case "name1":
                myElement = name1;
                break;
            case "searchText":
                myElement =searchText;
                break;
        }

        sendKeysFunction(myElement, value);
    }



    public void findAndClick(String strElement) {  



        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
           case "searchButton":
                myElement = searchButton;
                break;

            case "deleteDialogBtn":
                myElement = deleteDialogBtn;
                break;

            case "setup":
                myElement = setup;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "nationalities":
                myElement = nationalities;
                break;

            case "addbutton":
                myElement = addbutton;
                break;

            case "save":
                myElement =save;
                break;

            case "editButton":
               myElement =editButton;
               break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "deleteButton2":
                myElement =deleteButton2;
                break;




        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "successMessage":
                myElement = successMessage;
                break;
            case "alreadyExist":
                myElement = alreadyExist;
                break;
        }

        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) {
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        waitUntilLoading();


        waitUntilLoading();

        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }
}
