package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import test.BaseTest;
import utils.Locators;
import utils.Properties;

import static utils.Properties.SALES_FORCE_TOKEN;

public class VoicePadPage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.NEW_SYNCH_BTN)
    WebElement newSynchBtn;

    @FindBy(how = How.XPATH, using = Locators.VC_CLIENT_FIELD)
    WebElement clientId;

    @FindBy(how = How.XPATH, using = Locators.VC_USERNAME_FIELD)
    WebElement userName;

    @FindBy(how = How.XPATH, using = Locators.VC_PASSWORD_FIELD)
    WebElement password;

    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;

    @FindBy(how = How.XPATH, using = Locators.SOURCE_CREDENTIALS_BUTTON)
    WebElement vPInputCred;

    @FindBy(how = How.XPATH, using = Locators.CLOSE_BUTTON)
    WebElement vPCloseBtn;

    @FindBy(how = How.XPATH, using = Locators.VOICE_PAD_ICON)
    WebElement voicePadIcon;

    @FindBy(how = How.XPATH, using = Locators.SALES_FORCE_ICON)
    WebElement salesForceIcon;

    @FindBy(how = How.XPATH, using = Locators.INPUT_SOURCE_BUTTON)
    WebElement VoicePadInput;

    @FindBy(how = How.XPATH, using = Properties.VOICE_PAD_CLIENT_ID)
    WebElement voicePadId;

    @FindBy(how = How.XPATH, using = Locators.INPUT_TARGET_BUTTON)
    WebElement targetButton;

    @FindBy(how = How.XPATH, using = Properties.SALES_FORCE_TOKEN)
    WebElement salesForceToken;



    public VoicePadPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void voicePadCredentials(String id) {
        this.vPInputCred.click();
        Assert.assertTrue(clientId.isDisplayed(), "This assert is Passed");
        this.clientId.clear();
        this.clientId.sendKeys(id);
        this.vPCloseBtn.click();
    }

    public void voicePad() {
        System.out.print("Looking for New synch button");
        if (newSynchBtn.isDisplayed()) {
            System.out.println(" : FOUND");
            newSynchBtn.click();
        } else {
            System.out.println(" : NOT FOUND");
        }
        System.out.print("Looking for Show Case Icon");
        if (voicePadIcon.isDisplayed()) {
            System.out.println(" : FOUND");
            voicePadIcon.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for Sales force Icon");
        if (salesForceIcon.isDisplayed()) {
            System.out.println(" : FOUND");
            salesForceIcon.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for INPUT button");
        if (VoicePadInput.isDisplayed()) {
            System.out.println(" : FOUND");
            VoicePadInput.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for VOICEPAD CUSTOMER ID");
        if (voicePadId.isDisplayed()) {
            System.out.println(" : FOUND");
            voicePadId.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Entering Customer ID");

        System.out.print("Looking for Close Button");
        if (vPCloseBtn.isDisplayed()) {
            System.out.println(" : FOUND");
            vPCloseBtn.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for INPUT target button");
        if (targetButton.isDisplayed()) {
            System.out.println(" : FOUND");
            targetButton.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }

        System.out.print("Entering Sales force token");
        salesForceToken.sendKeys(SALES_FORCE_TOKEN);
        if (salesForceToken.isDisplayed()) {
            System.out.println(" : FOUND");
            salesForceToken.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for test URL");
        if (salesForceIcon.isDisplayed()) {
            System.out.println(" : FOUND");
            salesForceIcon.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for Verify credentials");
        if (salesForceIcon.isDisplayed()) {
            System.out.println(" : FOUND");
            salesForceIcon.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
    }
}

