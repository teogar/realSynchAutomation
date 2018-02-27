

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

public class VoicePadPage extends BaseTest {

    public WebDriver pageDriver;

    /**
     * Page Elements Locators
     */

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

    public VoicePadPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void voicePadCredentials(String id, String user, String psw){

        this.vPInputCred.click();

        /**
         * Instructions for the VoicePad Credential Fileds
         *
         */

        this.clientId.clear();
        this.clientId.sendKeys(id);
        this.userName.clear();
        this.userName.sendKeys(user);
        this.password.clear();
        this.password.sendKeys(psw);
        this.vPCloseBtn.click();

    }

}

