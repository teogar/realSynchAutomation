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

    public LoginPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = LoginLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = LoginLocator.USER_INPUT)
    static WebElement userNameInput;

    @FindBy( how = How.XPATH, using = LoginLocator.PASSWORD_INPUT)
    static WebElement passwordInput;

    @FindBy( how = How.XPATH, using = LoginLocator.FORGOT_PASSWORD_LINK)
    static WebElement forgotPasswordLink;

    @FindBy( how = How.XPATH, using = LoginLocator.REGISTER_LINK)
    static WebElement RegisterLink;

    @FindBy( how = How.XPATH, using = LoginLocator.SUBMIT_BUTTON)
    static WebElement SubmitLink;

    public static boolean sendUsername(String username) {
        System.out.print("Looking for 'Username' input");
        if(userNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            userNameInput.sendKeys(username);
            System.out.println(" & STRING SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean sendPassword(String password) {
        System.out.print("Looking for 'Password' input");
        if(passwordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            passwordInput.sendKeys(password);
            System.out.println(" & STRING SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnRegisterLink() {
        System.out.print("Looking for register link");
        if(RegisterLink.isDisplayed()) {
            System.out.println(" : DONE");
            RegisterLink.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnForgotLink() {
        System.out.print("Looking for forgot password link");
        if(forgotPasswordLink.isDisplayed()) {
            System.out.println(" : DONE");
            forgotPasswordLink.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickSubmitButton() {
        System.out.print("Looking for submit button");
        if(SubmitLink.isDisplayed()) {
            System.out.println(" : DONE");
            SubmitLink.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnForgotPasswordButton() {
        System.out.print("Looking for 'Forgot Password' button");
        if(forgotPasswordLink.isDisplayed()) {
            System.out.print(" : FOUND");
            forgotPasswordLink.click();
            System.out.print(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
