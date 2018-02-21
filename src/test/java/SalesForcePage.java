

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

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

    public SalesForcePage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void salesForceCredentials(String userN, String Psw, String sToken){

        /**
         * Assertions
         */

        if (sfUserfName.isDisplayed()
                && sfPsw.isDisplayed()
                && sfSecurityT.isDisplayed()) {
            System.out.println("The SalesForce Credentialas Fields are Displayed");
        }else{
            System.out.println("The Elements Are Not Displayed");
            System.exit(-1);
        }

        /**
         * Instructions fot the SalesForce Credential Fields.
         */

        this.sfUserfName.clear();
        this.sfUserfName.sendKeys(userN);
        this.sfPsw.clear();
        this.sfPsw.sendKeys(Psw);
        this.sfSecurityT.clear();
        this.sfSecurityT.sendKeys(sToken);
        this.nextButton.click();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.nextButton.click();

        this.finishBtn.click();

    }

}