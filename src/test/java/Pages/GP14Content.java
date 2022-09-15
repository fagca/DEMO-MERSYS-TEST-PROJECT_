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

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement writeName;

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement writeCode;

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement clickSaveButton;

    WebElement myElement;
    public void findAndClick (String strElement) {
        switch (strElement) {
            case "clickEducation":myElement = clickEducation; break;
            case "clickSetup":myElement = clickSetup; break;
            case "clickSubjectCategories":myElement = clickSubjectCategories; break;
            case "clickAddSubjectButton":myElement = clickAddSubjectButton; break;

        }
        clickFunction(myElement);
    }
}


