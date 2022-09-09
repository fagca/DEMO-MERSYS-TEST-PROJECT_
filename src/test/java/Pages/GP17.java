package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GP17 extends Parent{

    public GP17() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath="(//span[text()='Parameters'])")
    private WebElement parameters;

    @FindBy(xpath="(//span[text()='Bank Accounts'])")
    private WebElement bankAccounts;

    @FindBy(css="button[matbadgeoverlap='false']")
    private WebElement addButton;

    @FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement nameInput;

    @FindBy(xpath="(//input[@type='text'])[3]")
    private WebElement ibanInput;

    @FindBy(id="mat-select-value-11")
    private WebElement currencyInput;

    @FindBy(css="mat-option[role='option'] span")
    private WebElement currencyKZT;

    @FindBy(xpath="(//input[@type='text'])[4]")
    private WebElement integrationCodeInput;

    @FindBy(xpath="//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(css="input[type='text']")
    private WebElement nameSearch;

    @FindBy(css=".control-full>button")
    private WebElement searchButton;

    @FindBy(css="[table='true']>button svg")
    private WebElement editButton;

    @FindBy(css="[formcontrolname='currency']")
    private WebElement currencyInputEdit;

    @FindBy(css="div[role='listbox'] mat-option:nth-of-type(2) span")
    private WebElement currencyUSD;

    @FindBy(css="ms-delete-button[table='true']>button svg")
    private WebElement deleteButton;

    @FindBy(css="button[type='submit'] span")
    private WebElement deleteSubmitButton;

    @FindBy(xpath="//*[text()=' There is no data to display ']")
    private WebElement textDisplay;




    WebElement myElement;
    public void findAndClick (String strElement) {
        switch (strElement) {
            case "setupOne":myElement = setupOne; break;
            case "parameters":myElement = parameters; break;
            case "bankAccounts":myElement = bankAccounts; break;
            case "addButton":myElement = addButton; break;
            case "currencyInput":myElement = currencyInput; break;
            case "currencyKZT":myElement = currencyKZT; break;
            case "saveButton":myElement = saveButton; break;
            case "searchButton":myElement = searchButton; break;
            case "editButton":myElement = editButton; break;
            case "currencyInputEdit":myElement = currencyInputEdit; break;
            case "currencyUSD":myElement = currencyUSD; break;
            case "deleteButton":myElement = deleteButton; break;
            case "deleteSubmitButton":myElement = deleteSubmitButton; break;



        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "nameInput":myElement = nameInput; break;
            case "ibanInput":myElement = ibanInput; break;
            case "integrationCodeInput":myElement = integrationCodeInput; break;
            case "nameSearch":myElement = nameSearch; break;

        }
        sendKeysFunction(myElement, value);
    }
    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "textDisplay" : myElement =textDisplay; break;
        }

        verifyContainsText(myElement,text);
    }
}
