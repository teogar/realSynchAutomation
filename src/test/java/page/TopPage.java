package page;

import locator.TopLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class TopPage extends BaseTest{

    public TopPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = TopLocator.GOTODASHBOARD_BUTTON)
    static WebElement goToDashboardButton;

    @FindBy(how = How.XPATH, using = TopLocator.CUSTOMERASSITANCE_BUTTON)
    static WebElement customerAssistanceButton;

    @FindBy(how = How.XPATH, using = TopLocator.AVATAR_USER_BUTTON)
    public static WebElement avatarUserButton;

    @FindBy( how = How.XPATH, using = TopLocator.ACCOUNT_SETTINGS_BUTTON)
    static WebElement accountSettingsButton;

    @FindBy(how = How.XPATH, using = TopLocator.CHANGE_PASSWORD_BUTTON)
    static WebElement changePasswordButtton;

    @FindBy(how = How.XPATH, using = TopLocator.LOGOUT_BUTTON)
    static WebElement logoutButton;

    @FindBy(how = How.XPATH, using = TopLocator.OK_BUTTTON)
    static WebElement okButton;

    public static void clickOnOkButton(){
        System.out.print("Looking for 'OK' button");
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

    public static void clickOnGoToDashboardButton(){
        System.out.print("Looking for 'Go To Dashboard' button");
        if(goToDashboardButton.isDisplayed()) {
            System.out.print(" : FOUND");
            goToDashboardButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnCustomerAssitanceButton() {
        System.out.print("Looking for 'Customer Assistance' button");
        if(customerAssistanceButton.isDisplayed()) {
            System.out.print(" : FOUND");
            customerAssistanceButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnUserAvatarButton() {
        System.out.print("Looking for 'User Avatar' button");
        if(avatarUserButton.isDisplayed()) {
            System.out.print(" : FOUND");
            avatarUserButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnChangePasswordButton() {
        System.out.print("Looking for 'Change Password' button");
        if(changePasswordButtton.isDisplayed()) {
            System.out.print(" : FOUND");
            changePasswordButtton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnLogoutButton() {
        System.out.print("Looking for 'LogOut' button");
        if(logoutButton.isDisplayed()) {
            System.out.print(" : FOUND");
            logoutButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnAccountSettings() {
        System.out.print("Looking for 'Account Settings' button");
        if(accountSettingsButton.isDisplayed()) {
            System.out.print(" : FOUND");
            accountSettingsButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
