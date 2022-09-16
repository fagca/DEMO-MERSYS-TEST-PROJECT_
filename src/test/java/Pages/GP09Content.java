package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GP09Content extends Parent {

    public GP09Content() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(xpath = "//ms-add-button[@tooltip='EMPLOYEE_POSITION.TITLE.ADD']//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement formNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement formShortNameInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement searchshortNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@color='warn']")
    private WebElement deleteButton;

    @FindBy(xpath = "(//*[@class=\"mat-row cdk-row ng-tns-c328-358 remove-background ng-star-inserted\"]//*[@role='cell'])[2]")
    private WebElement firstItem;

    @FindBy(xpath = "//*[contains(text(),'success')]")
    private WebElement successAlert;
    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;
    @FindBy(css = "[type='submit']")
    private WebElement deleteButtonInForm;

    public WebElement mainElement;

    public void findAndClick(String element) {
        switch (element) {
            case "addButton":
                mainElement = addButton;
                break;
            case "saveButton":
                mainElement = saveButton;
                break;
            case "deleteButton":
                mainElement = deleteButton;
                break;
            case "searchButton":
                mainElement = searchButton;
                break;
            case "editButton":
                mainElement = editButton;
                break;
            case "deleteButtonInForm":
                mainElement = deleteButtonInForm;
                break;

        }

        clickFunction(mainElement);
    }


    public void findAndSend(String element, String value) {
        switch (element) {
            case "formNameInput":
                mainElement = formNameInput;
                break;
            case "formShortNameInput":
                mainElement = formShortNameInput;
                break;
            case "searchNameInput":
                mainElement = searchNameInput;
                break;
            case "searchshortNameInput":
                mainElement = searchshortNameInput;
                break;
        }

        sendKeysFunction(mainElement, value);
    }

    public void findAndValidate(String element, String value) {
        switch (element) {
            case "firstItem":
                mainElement = firstItem;
                break;
            case "successAlert":
                mainElement = successAlert;
                break;
        }

        verifyContainsText(mainElement, value);

    }

    public void findAndDelete(String searchText) {
        findAndSend("searchNameInput", searchText);
        findAndClick("searchButton");

        waitUntilLoading();

        findAndClick("deleteButton");
    }

}
