package page;

import Locator.ResetPaswordLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class ResetPasswordPage extends BaseTest {

    public ResetPasswordPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = ResetPaswordLocator.TITLE_PAGE)
    static WebElement titlePage;

    @FindBy( how = How.XPATH, using = ResetPaswordLocator.NEW_PASSWORD_INPUT)
    static WebElement newPasswordInput;

    @FindBy( how = How.XPATH, using = ResetPaswordLocator.CONFIRM_PASSWORD_INPUT)
    static WebElement confirmPasswordInput;

    @FindBy( how = How.XPATH, using = ResetPaswordLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy( how = How.XPATH, using = ResetPaswordLocator.SUBMIT_BUTTON)
    static WebElement submitButton;

    public static boolean sendNewPassword(String newPassword) {
        System.out.print("Looking for 'New Password' text box");
        if(newPasswordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            newPasswordInput.sendKeys(newPassword);
            System.out.println(" & FILLED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean sendConfirmPassword(String confirmPassword) {
        System.out.print("Looking for 'Confirm Password' text box");
        if(confirmPasswordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            confirmPasswordInput.sendKeys(confirmPassword);
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
}
