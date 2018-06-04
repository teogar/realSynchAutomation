package page;

import Locator.BoomTownLocator;
import Locator.InputCredentialsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import javax.annotation.Nonnull;

public class BoomTownPage extends BaseTest {

    public BoomTownPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.NAME, using = BoomTownLocator.EMAIL_INPUT)
    static WebElement enterEmail;

    @FindBy( how = How.NAME, using = BoomTownLocator.PASSWORD_INPUT)
    static WebElement  enterPassword;

    @FindBy( how = How.XPATH, using = BoomTownLocator.FORGOT_PASSWORD_LINK)
    static WebElement  forgotPasswordLink;

    @FindBy( how = How.NAME, using = BoomTownLocator.LOGIN_BUTTON)
    static WebElement  loginButton;

    public static boolean  enterEmail(@Nonnull String data) {
        System.out.print("Looking for Email text box");
        if(enterEmail.isDisplayed()) {
            System.out.print(" : DONE");
            enterEmail.clear();
            enterEmail.sendKeys(data);
            System.out.println(" & SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  enterPassword(@Nonnull String data) {
        System.out.print("Looking for Password text box");
        if(enterPassword.isDisplayed()) {
            System.out.print(" : DONE");
            enterPassword.clear();
            enterPassword.sendKeys(data);
            System.out.println(" & SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnLogin() {
        System.out.print("Looking for login button");
        if(loginButton.isDisplayed()) {
            System.out.print(" : DONE");
            loginButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
