package page;

import locator.BoomTownLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import javax.annotation.Nonnull;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
        System.out.print("enterEmail");
        assertTrue(enterEmail.isDisplayed());
        enterEmail.clear();
        enterEmail.sendKeys(data);
        assertEquals(enterEmail.getText(), data);
        return true;
    }

    public static boolean  enterPassword(@Nonnull String data) {
        System.out.print("enterPassword");
        assertTrue(enterPassword.isDisplayed());
        enterPassword.clear();
        enterPassword.sendKeys(data);
        assertEquals(enterPassword.getText(), data);
        return true;
    }

    public static boolean clickOnLogin() {
        System.out.print("clickOnLogin");
        assertTrue(loginButton.isDisplayed());
        loginButton.click();
        return true;
    }
}
