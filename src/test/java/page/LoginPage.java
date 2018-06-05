package page;

import Locator.LoginLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class LoginPage extends BaseTest {
    public WebDriver pageDriver;
    public LoginPage(WebDriver driver){
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = LoginLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.NAME, using = LoginLocator.USER_INPUT)
    static WebElement userNameInput;

    @FindBy( how = How.NAME, using = LoginLocator.PASSWORD_INPUT)
    static WebElement passwordInput;

    @FindBy( how = How.CLASS_NAME, using = LoginLocator.FORGOT_PASSWORD_LINK)
    static WebElement forgotPasswordLink;

    @FindBy( how = How.CLASS_NAME, using = LoginLocator.REGISTER_LINK)
    static WebElement RegisterLink;

    @FindBy( how = How.XPATH, using = LoginLocator.SUBMIT_BUTTON)
    static WebElement SubmitLink;

    public static void sendUsername(String username) {
        System.out.print("Looking for 'Username' input");
        if(userNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            userNameInput.sendKeys(username);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendPassword(String password) {
        System.out.print("Looking for 'Password' input");
        if(passwordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            passwordInput.sendKeys(password);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnSubmitButton() {
        System.out.print("Looking for 'Submit' button");
        if(SubmitLink.isDisplayed()) {
            System.out.print(" : FOUND");
            SubmitLink.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnForgotPasswordButton() {
        System.out.print("Looking for 'Forgot Password' button");
        if(forgotPasswordLink.isDisplayed()) {
            System.out.print(" : FOUND");
            forgotPasswordLink.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnRegisterButton() {
        System.out.print("Looking for 'Register' button");
        if(RegisterLink.isDisplayed()) {
            System.out.print(" : FOUND");
            RegisterLink.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
