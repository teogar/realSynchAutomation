package page;
import Locator.ForgotPasswordLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import Locator.ForgotPasswordLocator;
import Locator.LoginLocator;

public class ForgotPasswordPage extends BaseTest {

    public ForgotPasswordPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy(how = How.NAME, using = ForgotPasswordLocator.USER_NAME_INPUT)
    static WebElement userName;

    @FindBy(how = How.XPATH,using = ForgotPasswordLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy(how = How.XPATH, using = ForgotPasswordLocator.SUBMIT_BUTTON)
    static WebElement submitButton;
    
    @FindBy(how = How.XPATH, using = LoginLocator.FORGOT_PASSWORD_LINK)
    static WebElement forgotPsw;

    @FindBy(how = How.XPATH,using = ForgotPasswordLocator.USERNAME_INPUT)
    static WebElement rsForgotPswBox;

    @FindBy(how = How.XPATH, using = ForgotPasswordLocator.SUBMIT_BUTTON)
    static WebElement forgotSubmit;

    @FindBy(how = How.XPATH, using = ForgotPasswordLocator.OK_BUTTON)
    static WebElement okButton;

    public static boolean sendUserName(String username) {
        System.out.print("Looking for 'User Name' text box");
        if(userName.isDisplayed()) {
            System.out.print(" : FOUND");
            userName.sendKeys(username);
            System.out.println(" & SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnCancelButton() {
        System.out.print("Looking for 'Cancel' button");
        if(cancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            cancelButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnSubmitButton() {
        System.out.print("Looking for 'Submit' button");
        if(submitButton.isDisplayed()) {
            System.out.print(" : FOUND");
            submitButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnOkButton() {
        System.out.print("Looking for 'OK' button");
        if(okButton.isDisplayed()) {
            System.out.print(" : FOUND");
            okButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
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
