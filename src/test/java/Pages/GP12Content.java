package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GP12Content extends Parent {

    public GP12Content() {
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

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'GENERAL.BUTTON.ADD')]//button")
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

    @FindBy(xpath = "//ms-text-field[@formcontrolname=\"name\"]")
    private WebElement name;

    @FindBy (xpath = "//span[contains(text(),\"Save\")] ")
    private WebElement save;

    @FindBy (xpath = "(//span[contains(text(), \"Fields\")])[1]")
    private WebElement fields;

    @FindBy (xpath = "(//ms-text-field[contains(@placeholder,\"GENERAL.FIELD.NAME\")]//input)[2]")
    private WebElement fieldsname;

    @FindBy (xpath = "(//ms-text-field[contains(@placeholder,\"GENERAL.FIELD.CODE\")]//input)[2]")
    private WebElement fieldsCode;

    @FindBy (xpath = "//span[contains(text(),\"Text\")]")
    private WebElement fieldsTypeMain;

    @FindBy (xpath = "//span[contains(text(),\" Integer \")]")
    private WebElement fieldsTypeSelect;

    @FindBy (xpath = "//ms-save-button//button")
    private WebElement saveFields;

    @FindBy (xpath = "//div[contains(text(),\"successfully\")]")
    private WebElement successField;

    @FindBy (xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
    private WebElement searchName;

    @FindBy (xpath = "//ms-text-field[contains(@placeholder,'GENERAL.FIELD.CODE')]//input")
    private WebElement searchcode;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "(//td[@role=\"cell\"])[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement trashButton;

    @FindBy(xpath = "//span[contains(text(),\"Delete\")]")
    private WebElement deleteButtonFinal;











    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
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

            case "name":
                myElement = name;
                break;

            case "fieldsname":
                myElement = fieldsname;
                break;

            case "fieldsCode":
                myElement = fieldsCode;
                break;

            case "searchcode":
                myElement = searchcode;
                break;

            case "searchName":
                myElement = searchName;
                break;



        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
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

            case "fields":
                myElement =fields;
                break;

            case "fieldsTypeMain":
                myElement =fieldsTypeMain;
                break;

            case "fieldsTypeSelect":
                myElement =fieldsTypeSelect;
                break;

            case "saveFields":
                myElement =saveFields;
                break;

            case "editButton":
                myElement =editButton;
                break;

            case "trashButton":
                myElement =trashButton;
                break;

            case "deleteButtonFinal":
                myElement =deleteButtonFinal;
                break;


        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
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
            case "successField":
                myElement = successField;
                break;
        }

        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) {
        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas

//        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.stalenessOf(deleteButton));

        waitUntilLoading();

        // GWD.Bekle(2); // TODO: incelenecek
        //findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas
    }


}