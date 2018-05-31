package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import Locator.WizardLocator;

public class WizardPage extends BaseTest {

    public WizardPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = WizardLocator.TITLE_PAGE)
    WebElement title;

    @FindBy( how = How.XPATH, using = WizardLocator.WIZARD_STEP_NAVIGATOR2)
    WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = WizardLocator.REQUEST_NEW_PROVIDER_LINK)
    WebElement newProviderLink;

    @FindBy( how = How.XPATH, using = WizardLocator.SALESFORCE_ICON)
    WebElement salesForceIcon;

    @FindBy( how = How.XPATH, using = WizardLocator.FOLLOWUPBOSS_ICON)
    WebElement followUpBossIcon;

    @FindBy( how = How.XPATH, using = WizardLocator.CONTACTUALLY_ICON)
    WebElement contactuallyIcon;

    @FindBy( how = How.XPATH, using = WizardLocator.BOOMTOWN_ICON)
    WebElement boomTowIcon;

    @FindBy( how = How.XPATH, using = WizardLocator.CANCEL_BUTTON)
    WebElement cancelButton;

    @FindBy( how = How.XPATH, using = WizardLocator.BACK_BUTTON)
    WebElement backButton;

    @FindBy( how = How.XPATH, using = WizardLocator.NEXT_BUTTON)
    WebElement nextButton;

    public boolean clickOnStep2Navigator() {
        System.out.print("Looking for 'Step 2 Wizard Navigator' button");
        if(stepNavigator.isDisplayed()) {
            System.out.print(" : FOUND");
            stepNavigator.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnRequestNewProvider() {
        System.out.print("Looking for 'Request New Provider' button");
        if(newProviderLink.isDisplayed()) {
            System.out.print(" : FOUND");
            newProviderLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnSalesForce() {
        System.out.print("Looking for 'SalesForce' button");
        if(salesForceIcon.isDisplayed()) {
            System.out.print(" : FOUND");
            salesForceIcon.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnFollowUpBoss() {
        System.out.print("Looking for 'FollowUp Boss' button");
        if(followUpBossIcon.isDisplayed()) {
            System.out.print(" : FOUND");
            followUpBossIcon.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnContactually() {
        System.out.print("Looking for 'Contactually' button");
        if(contactuallyIcon.isDisplayed()) {
            System.out.print(" : FOUND");
            contactuallyIcon.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnBoomTown() {
        System.out.print("Looking for 'BoomTown' button");
        if(boomTowIcon.isDisplayed()) {
            System.out.print(" : FOUND");
            boomTowIcon.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnCancelButton() {
        System.out.print("Looking for 'Cancel' button");
        if(cancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            cancelButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnBackButton() {
        System.out.print("Looking for 'Back' button");
        if(backButton.isDisplayed()) {
            System.out.print(" : FOUND");
            backButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
    public boolean clickOnNextButton() {
        System.out.print("Looking for 'Next' button");
        if(nextButton.isDisplayed()) {
            System.out.print(" : FOUND");
            nextButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
}
