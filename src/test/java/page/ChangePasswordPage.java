package page;

import locator.ChangePasswordLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ChangePasswordPage extends BaseTest {
    public ChangePasswordPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = ChangePasswordLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy( how = How.XPATH, using = ChangePasswordLocator.SAVE_BUTTON)
    static WebElement saveButton;

    @FindBy( how = How.XPATH, using = ChangePasswordLocator.NEW_PASSWORD_INPUT)
    static WebElement newPasswordInput;

    @FindBy( how = How.XPATH, using = ChangePasswordLocator.CONFIRM_NEW_PASSWORD_INPUT)
    static WebElement confirmNewPasswordInput;

    @FindBy( how = How.XPATH, using = ChangePasswordLocator.OK_BUTTON)
    static WebElement okButton;

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(cancelButton.isDisplayed());
        cancelButton.click();
        return true;
    }

    public static boolean clickOnSaveButton() {
        System.out.print("clickOnSaveButton");
        assertTrue(saveButton.isDisplayed());
        saveButton.click();
        return true;
    }

    public static boolean sendNewPassword(String newPassword) {
        System.out.print("sendNewPassword");
        assertTrue(newPasswordInput.isDisplayed());
        newPasswordInput.sendKeys(newPassword);
        assertEquals(newPasswordInput.getText(), newPassword);
        return true;
    }

    public static boolean sendConfirmNewPassword(String newPassword) {
        System.out.print("sendConfirmNewPassword");
        assertTrue(confirmNewPasswordInput.isDisplayed());
        confirmNewPasswordInput.sendKeys(newPassword);
        assertEquals(confirmNewPasswordInput.getText(), newPassword);
        return true;
    }

    public static boolean clickOnOkButton() {
        System.out.print("clickOnOkButton");
        assertTrue(okButton.isDisplayed());
        okButton.click();
        return true;
    }
}
