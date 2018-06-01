package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import Locator.ForgotPasswordLocator;
import Locator.LoginLocator;

public class ForgotPasswordPage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = LoginLocator.FORGOT_PASSWORD_LINK)
    static WebElement forgotPsw;

    @FindBy(how = How.XPATH,using = ForgotPasswordLocator.USERNAME_INPUT)
    static WebElement rsForgotPswBox;

    @FindBy(how = How.XPATH, using = ForgotPasswordLocator.SUBMIT_BUTTON)
    static WebElement forgotSubmit;

    public ForgotPasswordPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public static void pswRecovery() {
        if(forgotPsw.isDisplayed()) {
            System.out.println("The Forgot PSW link is Displayed");
        } else {
            System.out.println("There's not Link");
            throw new RuntimeException();
        }
        forgotPsw.click();
    }

    public static void sendPwd(String forgotPsw) {
        System.out.print("Looking for 'Username' input");
        if(rsForgotPswBox.isDisplayed()) {
            System.out.println("The Forgot PWD Box is Displayed");
        } else {
            System.out.println("The Forgot PWD Box is Not Displayed");
            throw new RuntimeException();
        }
        rsForgotPswBox.clear();
        rsForgotPswBox.sendKeys(forgotPsw);
        forgotSubmit.click();
    }
}
