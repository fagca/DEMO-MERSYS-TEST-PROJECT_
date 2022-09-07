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

    @FindBy(id="mat-option[role='option'] span")
    private WebElement currencyKZT;

    WebElement myElement;
    public void findAndClick (String strElement) {
        switch (strElement) {
            case "setupOne":myElement = setupOne; break;
            case "parameters":myElement = parameters; break;
            case "bankAccounts":myElement = bankAccounts; break;
            case "addButton":myElement = addButton; break;

        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "nameInput":myElement = nameInput; break;
            case "ibanInput":myElement = ibanInput; break;
        }
        sendKeysFunction(myElement, value);
    }
}
