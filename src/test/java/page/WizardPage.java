package page;

import locator.WizardLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;

public class WizardPage extends BaseTest {

    public WizardPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = WizardLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = WizardLocator.WIZARD_STEP_NAVIGATOR2)
    static public WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = WizardLocator.REQUEST_NEW_PROVIDER_LINK)
    static WebElement newProviderLink;

    @FindBy( how = How.XPATH, using = WizardLocator.SALESFORCE_LOGO)
    static WebElement salesForceLogo;

    @FindBy( how = How.XPATH, using = WizardLocator.FOLLOWUPBOSS_LOGO)
    static WebElement followUpBossLogo;

    @FindBy( how = How.XPATH, using = WizardLocator.CONTACTUALLY_LOGO)
    static WebElement contactuallyLogo;

    @FindBy( how = How.XPATH, using = WizardLocator.BOOMTOWN_LOGO)
    static WebElement boomTowLogo;

    public static boolean clickOnStep2Navigator() {
        System.out.print("clickOnStep2Navigator");
        assertTrue(stepNavigator.isDisplayed());
        stepNavigator.click();
        return true;
    }

    public static boolean clickOnRequestNewProvider() {
        System.out.print("clickOnRequestNewProvider");
        assertTrue(newProviderLink.isDisplayed());
        newProviderLink.click();
        return true;
    }

    public static boolean clickOnSalesForceLogo() {
        System.out.print("clickOnSalesForceLogo");
        assertTrue(salesForceLogo.isDisplayed());
        salesForceLogo.click();
        return true;
    }

    public static boolean clickOnFollowUpBossLogo() {
        System.out.print("clickOnFollowUpBossLogo");
        assertTrue(followUpBossLogo.isEnabled());
        followUpBossLogo.click();
        return true;
    }

    public static boolean clickOnContactuallyLogo() {
        System.out.print("clickOnContactuallyLogo");
        assertTrue(contactuallyLogo.isDisplayed());
        contactuallyLogo.click();
        return true;
    }

    public static boolean clickOnBoomTownLogo() {
        System.out.print("clickOnBoomTownLogo");
        assertTrue(boomTowLogo.isDisplayed());
        boomTowLogo.click();
        return true;
    }
}
