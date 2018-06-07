package page;

import locator.ChangePasswordLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

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

    public static void clickOnCancelButton() {
        System.out.print("Looking for 'cancelButton' button");
        if(cancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            cancelButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnSaveButton() {
        System.out.print("Looking for 'saveButton' button");
        if(saveButton.isDisplayed()) {
            System.out.print(" : FOUND");
            saveButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendNewPassword(String newPassword) {
        System.out.print("Looking for 'password' input");
        if(newPasswordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            newPasswordInput.sendKeys(newPassword);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendConfirmNewPassword(String newPassword) {
        System.out.print("Looking for 'confirmpassword' input");
        if(confirmNewPasswordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            confirmNewPasswordInput.sendKeys(newPassword);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnOkButton() {
        System.out.print("Looking for 'okButton' button");
        if(okButton.isDisplayed()) {
            System.out.print(" : FOUND");
            okButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
