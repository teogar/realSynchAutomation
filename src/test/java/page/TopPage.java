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
    WebElement goToDashboardButton;

    @FindBy(how = How.XPATH, using = TopPageLocator.CUSTOMERASSITANCE_BUTTON)
    WebElement customerAssistanceButton;

    @FindBy(how = How.XPATH, using = TopPageLocator.AVATAR_USER_BUTTON)
    WebElement avatarUserButton;

    @FindBy( how = How.XPATH, using = TopPageLocator.ACCOUNT_SETTINGS_BUTTON)
    WebElement accountSettingsButton;

    @FindBy(how = How.XPATH, using = TopPageLocator.CHANGE_PASSWORD_BUTTON)
    WebElement changePasswordButtton;

    @FindBy(how = How.XPATH, using = TopPageLocator.LOGOUT_BUTTON)
    WebElement logoutButton;

    public boolean clickOnGoToDashboard() {
        System.out.print("Looking for 'Go To Dashboard' button");
        if(goToDashboardButton.isDisplayed()) {
            System.out.print(" : FOUND");
            goToDashboardButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
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
            return false;
        }
    }

    public boolean clickOnUserAvatarButton() {
        System.out.print("Looking for 'User Avatar' button");
        if(avatarUserButton.isDisplayed()) {
            System.out.print(" : FOUND");
            avatarUserButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnChangePasswordButton() {
        System.out.print("Looking for 'Change Password' button");
        if(changePasswordButtton.isDisplayed()) {
            System.out.print(" : FOUND");
            changePasswordButtton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickOnLogoutButton() {
        System.out.print("Looking for 'LogOut' button");
        if(logoutButton.isDisplayed()) {
            System.out.print(" : FOUND");
            logoutButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickOnAccountSettings() {
        System.out.print("Looking for 'Account Settings' button");
        if(accountSettingsButton.isDisplayed()) {
            System.out.print(" : FOUND");
            accountSettingsButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
/*
    public boolean clickOn(WebElement button){
        System.out.print("Looking for '" + button.name + "' button");
        if(button.isDisplayed()) {
            System.out.print(" : FOUND");
            button.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
*/
}
