package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;
import utils.Properties;

public class SalesForcePage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.SF_USERNAME_FIELD)
    WebElement sfUserfName;

    @FindBy(how = How.XPATH, using = Locators.SF_PASSWORD_FIELD)
    WebElement sfPsw;

    @FindBy(how = How.XPATH, using = Locators.SF_SECURITY_TOKEN_FIELD)
    WebElement sfSecurityT;

    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;

    @FindBy(how = How.XPATH, using = Locators.FINISH_BTN)
    WebElement finishBtn;

    @FindBy(how=How.XPATH, using = Locators.S_FORCE_VERIFY_BTN)
    WebElement sFVerifyBtn;

    @FindBy(how = How.XPATH, using = Locators.TARGET_CREDETIALS_BUTTON)
    WebElement pBaseInputCed;

    @FindBy(how = How.XPATH, using = Locators.CLOSE_BUTTON)
    WebElement vPCloseBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_SUCCESS_BUTTON)
    WebElement success;

    @FindBy(how = How.XPATH,using = Locators.RS_TEST_SF_CHECKBOX)
    WebElement testSalesFrorceCheck;

    @FindBy(how = How.XPATH, using = Locators.RS_PLAN_CONFIRM_BUTTON)
    WebElement planConfrimBtn;

    public SalesForcePage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    /**
     * Instructions fot the SalesForce Credential Fields.
     */

    public void salesForceCredentials(String userN, String Psw, String sToken) {
        System.out.println("Click on Base Input");
        this.pBaseInputCed.click();
        System.out.println("Sending Name");
        this.sfUserfName.clear();
        this.sfUserfName.sendKeys(userN);
        System.out.println("Sending PWD");
        this.sfPsw.clear();
        this.sfPsw.sendKeys(Psw);
        System.out.println("Click Security");
        this.sfSecurityT.clear();
        this.sfSecurityT.sendKeys(sToken);
        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Check Sales Force");
        this.testSalesFrorceCheck.click();
        System.out.println("Click Verify button");
        this.sFVerifyBtn.click();
        try {
            Thread.sleep(Properties.TIME_OFF_8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click close button");
        this.vPCloseBtn.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click next button");
        this.nextButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click finish button");
        this.finishBtn.click();
        try {
            Thread.sleep(Properties.TIME_OFF_16);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(success.isDisplayed()){
            System.out.println("Yor Synch was correctly saved and will try to activate");
            try {
                Thread.sleep(Properties.TIME_OFF_3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.success.click();
        } else {
            System.out.println("Error something is wrong");
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
