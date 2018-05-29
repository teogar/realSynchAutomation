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
}
