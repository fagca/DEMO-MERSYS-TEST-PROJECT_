package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GP13Content extends Parent {

    public GP13Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "//span[text()='Setup]")
    private WebElement Setup;

    @FindBy(xpath = "//span[text()='Positions]")
    private WebElement Positions;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(id = "ms-text-field-13")
    private WebElement nameInput;

    @FindBy(id ="ms-text-field-14")
    private WebElement ShortName;
    @FindBy (xpath = "//span[contains(text(),\"Save\")] ")
    private WebElement save;


    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogBtn;


    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;



    @FindBy(xpath = "(//span[contains(text(),\"Parameters\")])[1]")
    private WebElement parameters;

    // @FindBy(xpath = "(//span[contains(text(),\"Positions\")])")
    //private WebElement Positions;

    @FindBy (xpath = "//ms-add-button//div//button")
    private WebElement addbutton;

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')]//input)[2]")
    private WebElement name1;

    @FindBy (xpath = "//span[contains(text(),\"Save\")] ")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')]//input")
    private WebElement searchText;

    @FindBy (xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy (css = "span>fa-icon>svg[data-icon=\"pen-to-square\"]\n")
    private WebElement editButton;
    // @FindBy(xpath = "(//ms-delete-button//button)[1]")
    // private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),\"Delete\")]")
    private WebElement deleteButton2;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

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
            case "shortName":
                myElement = ShortName;
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

            case "searchButton":
                myElement = searchButton;
                break;

            case "deleteDialogBtn":
                myElement = deleteDialogBtn;
                break;

            case "setup":
                myElement = Setup;
                break;
            case "Human Resources":
                myElement = HumanResources;
                break;
            case "Positions":
                myElement = Positions;
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

