

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Locators;
import utils.Properties;

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

    public void logElements() {

        /**
         * Assertions "The login elements are in place "
         */

        if(userName.isDisplayed()
                && psw.isDisplayed()
                && singInBtn.isDisplayed()) {
            System.out.println("The Elements are Displayed and allows Interactions");
        }else{
            System.out.println("Are Not Able to Interact");
            System.exit(-1);
        }
    }

    public void signIn(String user, String password) {

        /**
         * The login elements, triggers events
         */

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