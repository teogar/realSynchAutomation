package page;

import Locator.WizardLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class WizardPage extends BaseTest {

    public WizardPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = WizardLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = WizardLocator.WIZARD_STEP_NAVIGATOR2)
    static WebElement stepNavigator;

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

    @FindBy( how = How.XPATH, using = WizardLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy( how = How.XPATH, using = WizardLocator.BACK_BUTTON)
    static WebElement backButton;

    @FindBy( how = How.XPATH, using = WizardLocator.NEXT_BUTTON)
    static WebElement nextButton;

    public static boolean clickOnStep2Navigator() {
        System.out.print("Looking for 'Step 2 Wizard Navigator' button");
        if(stepNavigator.isDisplayed()) {
            System.out.print(" : FOUND");
            stepNavigator.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnRequestNewProvider() {
        System.out.print("Looking for 'Request New Provider' button");
        if(newProviderLink.isDisplayed()) {
            System.out.print(" : FOUND");
            newProviderLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnSalesForceLogo() {
        System.out.print("Looking for 'SalesForce' button");
        if(salesForceLogo.isDisplayed()) {
            System.out.print(" : FOUND");
            salesForceLogo.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnFollowUpBossLogo() {
        System.out.print("Looking for 'FollowUp Boss' button");
        if(followUpBossLogo.isEnabled()) {
            System.out.print(" : FOUND");
            followUpBossLogo.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnContactuallyLogo() {
        System.out.print("Looking for 'Contactually' button");
        if(contactuallyLogo.isDisplayed()) {
            System.out.print(" : FOUND");
            contactuallyLogo.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnBoomTownLogo() {
        System.out.print("Looking for 'BoomTown' button");
        if(boomTowLogo.isDisplayed()) {
            System.out.print(" : FOUND");
            boomTowLogo.click();
            System.out.println(" & CLICKED");
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

    public static boolean clickOnBackButton() {
        System.out.print("Looking for 'Back' button");
        if(backButton.isDisplayed()) {
            System.out.print(" : FOUND");
            backButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnNextButton() {
        System.out.print("Looking for 'Next' button");
        if(nextButton.isDisplayed()) {
            System.out.print(" : FOUND");
            nextButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
