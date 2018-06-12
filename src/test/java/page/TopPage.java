package page;

import locator.TopLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;

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

    public static boolean clickOnOkButton(){
        System.out.print("clickOnOkButton");
        assertTrue(okButton.isDisplayed());
        okButton.click();
        return true;
    }

    public static boolean clickOnGoToDashboardButton(){
        System.out.print("clickOnGoToDashboardButton");
        assertTrue(goToDashboardButton.isDisplayed());
        goToDashboardButton.click();
        return true;
    }

    public static boolean clickOnCustomerAssitanceButton() {
        System.out.print("clickOnCustomerAssitanceButton");
        assertTrue(customerAssistanceButton.isDisplayed());
        customerAssistanceButton.click();
        return true;
    }

    public static boolean clickOnUserAvatarButton() {
        System.out.print("clickOnUserAvatarButton");
        assertTrue(avatarUserButton.isDisplayed());
        avatarUserButton.click();
        return true;
    }

    public static boolean clickOnChangePasswordButton() {
        System.out.print("clickOnChangePasswordButton");
        assertTrue(changePasswordButtton.isDisplayed());
        changePasswordButtton.click();
        return true;
    }

    public static boolean clickOnLogoutButton() {
        System.out.print("clickOnLogoutButton");
        assertTrue(logoutButton.isDisplayed());
        logoutButton.click();
        return true;
    }

    public static boolean clickOnAccountSettings() {
        System.out.print("clickOnAccountSettings");
        assertTrue(accountSettingsButton.isDisplayed());
        accountSettingsButton.click();
        return true;
    }
}
