package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;
import utils.Properties;

public class ShowCasePage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.NEW_SYNCH_BTN)
    WebElement newSynchBtn;

    @FindBy(how = How.XPATH, using = Locators.SIDX_ICON_BUTTON)
    WebElement showCaseIdx;

    @FindBy(how = How.XPATH, using = Locators.FUB_ICON_BUTTON)
    WebElement fUb;

    @FindBy(how = How.CLASS_NAME, using = Locators.FUB_IMG)
    WebElement fUbImg;

    @FindBy(how = How.XPATH, using = Locators.INPUT_SOURCE_BUTTON)
    WebElement sourceButton;

    @FindBy(how = How.XPATH, using = Locators.CLOSE_BUTTON)
    WebElement closeBtn;

    @FindBy(how = How.XPATH, using = Locators.FUB_CREDS_BUTTON)
    WebElement fuBCreds;

    @FindBy(how = How.XPATH, using = Locators.INPUT_TARGET_BUTTON)
    WebElement targetButton;

    @FindBy(how = How.XPATH, using = Locators.FUB_VERIFY_BUTTON)
    WebElement fUbVerify;

    @FindBy(how = How.XPATH, using = Locators.FINISH_BTN)
    WebElement finishBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;

    @FindBy(how = How.XPATH, using = Locators.RS_CONFIRM_BUTTON)
    WebElement confirmButton;

    @FindBy(how = How.XPATH, using = Locators.SIDX_PENCIL_BUTTON)
    WebElement sIdXPencil;


    public ShowCasePage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void sdIx() {
        System.out.print("Looking for New synch button");
        if (newSynchBtn.isDisplayed()) {
            System.out.println(" : FOUND");
            newSynchBtn.click();
        } else {
            System.out.println(" : NOT FOUND");
        }
        System.out.print("Looking for Show Case Icon");
        if (showCaseIdx.isDisplayed()) {
            System.out.println(" : FOUND");
            showCaseIdx.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for Follow Up Boss Icon");
        if (fUb.isDisplayed()) {
            System.out.println(" : FOUND");
            this.fUb.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for SIDX Credentials");
        if (sourceButton.isDisplayed()) {
            System.out.println(" : FOUND");
            this.sourceButton.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for API generation");
        if (closeBtn.isDisplayed()) {
            System.out.println(" : FOUND");
            this.closeBtn.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }

        System.out.print("Looking for closing credentials");
        if (targetButton.isDisplayed()) {
            System.out.println(" : FOUND");
            this.targetButton.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for Follow Up Boss Credentials");
        if (fuBCreds.isDisplayed()) {
            System.out.println(" : FOUND");
            this.fuBCreds.clear();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for Follow Up Boss API Key");
        if (fUb.isDisplayed()) {
            System.out.println(" : FOUND");
            this.fUb.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        this.fuBCreds.sendKeys(Locators.FUB_API_KEY);
        System.out.print("Looking for close button");
        if (fUb.isDisplayed()) {
            System.out.println(" : FOUND");
            this.fUb.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        this.fUbVerify.click();


        try {
            Thread.sleep(Properties.TIME_OFF_10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.closeBtn.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click activate");
        this.nextButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click OK");
        this.finishBtn.click();
        try {
            Thread.sleep(Properties.TIME_OFF_15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click Confirm Button");
        this.confirmButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
