package page;

import locator.LoginLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

    public static boolean sendUsername(String username) {
        System.out.println("sendUserName");
        assertTrue(userNameInput.isDisplayed());
        userNameInput.clear();
        userNameInput.sendKeys(username);
        assertEquals(userNameInput.getAttribute("value"), username);
        return true;
    }

    public static boolean sendPassword(String password) {
        System.out.println("sendPassword");
        assertTrue(passwordInput.isDisplayed());
        passwordInput.clear();
        passwordInput.sendKeys(password);
        assertEquals(passwordInput.getAttribute("value"), password);
        return true;
    }

    public static boolean clickOnSubmitButton() {
        System.out.println("clickOnSubmitButton");
        assertTrue(SubmitLink.isDisplayed());
        SubmitLink.click();
        return true;
    }

    public static boolean clickOnForgotPasswordButton() {
        System.out.print("clickOnForgotPasswordButton");
        assertTrue(forgotPasswordLink.isDisplayed());
        forgotPasswordLink.click();
        System.out.println(" & CLICKED");
        return true;
    }

    public static boolean clickOnRegisterButton() {
        System.out.print("clickOnRegisterButton");
        assertTrue(RegisterLink.isDisplayed());
        RegisterLink.click();
        return true;
    }
}
