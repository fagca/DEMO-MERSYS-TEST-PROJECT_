package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GP11Content extends Parent{

    public GP11Content() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath="(//span[text()='Parameters'])")
    private WebElement parameters;

    @FindBy(xpath="//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(css="button[matbadgeoverlap='false']")
    private WebElement addButton;

    @FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement nameInput;

    @FindBy(css="mat-select[formcontrolname='attachmentStages'] div span")
    private WebElement stage;

    @FindBy(xpath="//span[text()=' Student Registration ']")
    private WebElement studentRegistration;

    @FindBy(css="textarea[formcontrolname='description']")
    private WebElement descriptionTextArea;

    @FindBy(xpath="//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(css="[placeholder='GENERAL.FIELD.NAME'] input")
    private WebElement nameSearch;

    @FindBy(css="ms-edit-button[table='true'] button")
    private WebElement editButton;

    @FindBy(css="[formcontrolname=\"name\"] input")
    private WebElement nameEdit;

    @FindBy(xpath="//span[text()=' Certificate ']")
    private WebElement certificate;

    @FindBy(css="ms-delete-button[table='true'] button svg")
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
            case "documentTypes":myElement = documentTypes; break;
            case "addButton":myElement = addButton; break;
            case "stage":myElement = stage; break;
            case "studentRegistration":myElement = studentRegistration; break;
            case "saveButton":myElement = saveButton; break;
            case "editButton":myElement = editButton; break;
            case "certificate":myElement = certificate; break;
            case "deleteButton":myElement = deleteButton; break;
            case "deleteSubmitButton":myElement = deleteSubmitButton; break;
        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "nameInput":myElement = nameInput; break;
            case "descriptionTextArea":myElement = descriptionTextArea; break;
            case "nameSearch":myElement = nameSearch; break;
            case "nameEdit":myElement = nameEdit; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndContainsText(String strElement, String text){
        if (strElement.equalsIgnoreCase("textDisplay"))
            myElement=textDisplay;
//        switch (strElement)
//        {
//            case "textDisplay":myElement=textDisplay;break;
//        }
        verifyContainsText(myElement,text);
    }
}
