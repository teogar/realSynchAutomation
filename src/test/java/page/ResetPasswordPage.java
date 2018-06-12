package page;

import locator.ResetPasswordLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ResetPasswordPage extends BaseTest {

    public ResetPasswordPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = ResetPasswordLocator.TITLE_PAGE)
    static WebElement titlePage;

    @FindBy( how = How.XPATH, using = ResetPasswordLocator.NEW_PASSWORD_INPUT)
    static WebElement newPasswordInput;

    @FindBy( how = How.XPATH, using = ResetPasswordLocator.CONFIRM_PASSWORD_INPUT)
    static WebElement confirmPasswordInput;

    @FindBy( how = How.XPATH, using = ResetPasswordLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy( how = How.XPATH, using = ResetPasswordLocator.SUBMIT_BUTTON)
    static WebElement submitButton;

    public static boolean sendNewPassword(String data) {
        System.out.print("sendNewPassword");
        assertTrue(newPasswordInput.isDisplayed());
        newPasswordInput.clear();
        newPasswordInput.sendKeys(data);
        assertEquals(newPasswordInput.getText(), data);
        return true;
    }

    public static boolean sendConfirmPassword(String data) {
        System.out.print("sendConfirmPassword");
        confirmPasswordInput.clear();
        assertTrue(confirmPasswordInput.isDisplayed());
        confirmPasswordInput.sendKeys(data);
        assertEquals(confirmPasswordInput.getText(), data);
        return true;
    }

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(cancelButton.isDisplayed());
        cancelButton.click();
        return true;
    }

    public static boolean clickOnSubmitButton() {
        System.out.print("clickOnSubmitButton");
        assertTrue(submitButton.isDisplayed());
        submitButton.click();
        return true;
    }
}
