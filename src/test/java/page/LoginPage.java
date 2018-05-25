package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;
import utils.Properties;

import static org.testng.Assert.assertTrue;

public class LoginPage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_NAME_BOX)
    WebElement userName;

    @FindBy(how = How.XPATH, using = Locators.RS_PSW_BOX)
    WebElement psw;

    @FindBy(how = How.XPATH,using = Locators.RE_SINGIN_BTN)
    WebElement singInBtn;

    public LoginPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public boolean logElements() {

        /**
         * Assertions "The login elements are in place "
         */

        if(userName.isDisplayed()
                && psw.isDisplayed()
                && singInBtn.isDisplayed()) {
            System.out.println("The Elements are Displayed and allows Interactions");
            return true;
        } else {
            System.out.println("Are Not Able to Interact");
            System.exit(-1);
            return false;
        }
    }

    /**
     * The login elements, triggers events
     */

    public void Login(String user, String password) {
        assertTrue(logElements());

        userName.clear();
        userName.sendKeys(user);
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        psw.clear();
        psw.sendKeys(password);
        singInBtn.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
