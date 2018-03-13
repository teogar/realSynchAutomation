import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

import java.security.Key;

public class SalesForcePage extends BaseTest {

    public WebDriver pageDriver;

    /**
     * Page Elements Locators
     */

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

    public SalesForcePage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void salesForceCredentials(String userN, String Psw, String sToken){

        /**
         * Instructions fot the SalesForce Credential Fields.
         */

        this.pBaseInputCed.click();
        this.sfUserfName.clear();
        this.sfUserfName.sendKeys(userN);
        this.sfPsw.clear();
        this.sfPsw.sendKeys(Psw);
        this.sfSecurityT.clear();
        this.sfSecurityT.sendKeys(sToken);

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.sFVerifyBtn.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.vPCloseBtn.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.nextButton.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.finishBtn.click();

        try{
            Thread.sleep(15000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}