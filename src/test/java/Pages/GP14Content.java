package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GP14Content extends Parent{
    public GP14Content(){PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath="(//span[text()='Education'])")
    private WebElement clickEducation;

    @FindBy(xpath="(//span[text()='Setup'])[4]")
    private WebElement clickSetup;

    @FindBy(xpath="(//span[text()='Subject Categories'])")
    private WebElement clickSubjectCategories;

    @FindBy(css="button[matbadgesize=\"small\"] ")
    private WebElement clickAddSubjectButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement writeName;

    @FindBy(css="[id=\"ms-text-field-3\"] input")
    private WebElement writeCode;

    @FindBy(css="[class=\"svg-inline--fa fa-floppy-disk\"]")
    private WebElement clickSaveButton;

    WebElement myElement;
    public void findAndClick (String strElement) {
        switch (strElement) {
            case "clickEducation":myElement = clickEducation; break;
            case "clickSetup":myElement = clickSetup; break;
            case "clickSubjectCategories":myElement = clickSubjectCategories; break;
            case "clickAddSubjectButton":myElement = clickAddSubjectButton; break;
            case "clickSaveButton":myElement = clickSaveButton; break;


        }
        clickFunction(myElement);
    }
    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "writeName":myElement = writeName; break;
            case "writeCode":myElement = writeCode; break;

        }
        sendKeysFunction(myElement, value);
    }
}


