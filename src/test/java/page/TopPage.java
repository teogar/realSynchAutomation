package page;

import Locator.TopPageLocator;
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

    @FindBy( how = How.XPATH, using = TopPageLocator.GOTODASHBOARD_BUTTON)
    static WebElement goToDashboardButton;

    @FindBy(how = How.XPATH, using = TopPageLocator.CUSTOMERASSITANCE_BUTTON)
    static WebElement customerAssistanceButton;

    @FindBy(how = How.XPATH, using = TopPageLocator.AVATAR_USER_BUTTON)
    static WebElement avatarUserButton;

    @FindBy( how = How.XPATH, using = TopPageLocator.ACCOUNT_SETTINGS_BUTTON)
    static WebElement accountSettingsButton;

    @FindBy(how = How.XPATH, using = TopPageLocator.CHANGE_PASSWORD_BUTTON)
    static WebElement changePasswordButtton;

    @FindBy(how = How.XPATH, using = TopPageLocator.LOGOUT_BUTTON)
    static WebElement logoutButton;

    @FindBy(how = How.XPATH, using = TopPageLocator.OK_BUTTTON)
    static WebElement okButton;

    public static void clickOnGoToDashboard() {
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

    public boolean clickOnCustomerAssitanceButton() {
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

    public boolean clickOnUserAvatarButton() {
        System.out.print("Looking for 'User Avatar' button");
        if(avatarUserButton.isDisplayed()) {
            System.out.print(" : FOUND");
            avatarUserButton.click();
            System.out.println(" & CLICKED");
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

    public static void clickOnLogoutButton() {
            System.out.print("Looking for 'Ok' button");
            if(logoutButton.isDisplayed()) {
                System.out.print(" : FOUND");
                okButton.click();
                System.out.println(" & CLICKED");
            }
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnAccountSettings() {
        System.out.print("Looking for 'Account Settings' button");
        if(accountSettingsButton.isDisplayed()) {
            System.out.print(" : FOUND");
            accountSettingsButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
