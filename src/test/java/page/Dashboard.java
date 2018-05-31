package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;
import utils.Properties;

public class Dashboard extends BaseTest{
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_AVATAR_BUTTON)
    WebElement avatarButton;

    @FindBy(how = How.XPATH, using = Locators.RS_ACCOUNT_SET_BUTTON)
    WebElement accountSettingsButton;

    @FindBy(how = How.XPATH, using = Locators.RS_ACCOUNT_CHANGEPASSWORD_BUTTON)
    WebElement changePasswordButton;

    @FindBy(how = How.XPATH, using = Locators.RS_EDIT_FIRST_NAME)
    WebElement editFirstNameInput;

    @FindBy(how = How.XPATH, using = Locators.RS_EDIT_LAST_NAME)
    WebElement editLastNameInput;

    @FindBy(how = How.XPATH, using = Locators.RS_EDIT_EMAIL)
    WebElement editEmailInput;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_PASSWORD)
    WebElement changePasswordInput;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_CONFIRM_PASSWORD)
    WebElement confirmPasswordInput;

    @FindBy(how = How.XPATH, using = Locators.RS_CHANGEPASS_SUBMIT_BUTTON)
    WebElement submitButton;

    @FindBy(how = How.XPATH, using = Locators.RS_CHANGEPASS_CANCEL_BUTTON)
    WebElement cancelButton;

    @FindBy(how = How.XPATH, using = Locators.RS_OK_BTN)
    WebElement okButton;

    public Dashboard(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    /**
     * Display Verification for Static Elements
     */
    public void editAccountInfo() {
        System.out.print("Looking for Avatar button ");
        if(avatarButton.isDisplayed()) {
            System.out.println(": FOUND");
            this.avatarButton.click();
        } else {
            System.out.println(("NOT FOUND"));
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for Change Account Settings button ");
        if(accountSettingsButton.isDisplayed()) {
            System.out.println(": FOUND");
            this.accountSettingsButton.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for Account Information inputs ");
        if(editFirstNameInput.isDisplayed()
                && editLastNameInput.isDisplayed()
                && editEmailInput.isDisplayed()) {
            System.out.println("The Elements are Displayed and allows Interactions");
            editEmailInput.click();
            // Do nothing since the inputs are currently read-only inputs, test is blocked until this change
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void changePassword() {
        System.out.print("Looking for Avatar button ");
        if(avatarButton.isDisplayed()) {
            System.out.println(": FOUND");
            this.avatarButton.click();
        } else {
            System.out.println(("NOT FOUND"));
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for Change Password button");
        if(changePasswordButton.isDisplayed()) {
            System.out.println(": FOUND");
            this.changePasswordButton.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Logging elements in the change password page");
        if(changePasswordInput.isDisplayed()
                && confirmPasswordInput.isDisplayed()
                && submitButton.isDisplayed()
                && cancelButton.isDisplayed()) {
            System.out.println("The Elements are Displayed and allows Interactions");
            System.out.println("Sending password");
            this.changePasswordInput.clear();
            this.changePasswordInput.sendKeys(Properties.NEW_PASSWORD);

            try {
                Thread.sleep(Properties.TIME_OFF_3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Sending confirmation password");
            this.confirmPasswordInput.clear();
            this.confirmPasswordInput.sendKeys(Properties.NEW_PASSWORD);
            System.out.print("Submit new password");
            this.submitButton.click();

            try {
                Thread.sleep(Properties.TIME_OFF_3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Click on OK to go to the Dashboard");
        if(okButton.isDisplayed()) {
            System.out.println(": Clicked");
            this.okButton.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
