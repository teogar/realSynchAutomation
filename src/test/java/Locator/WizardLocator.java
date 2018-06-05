package Locator;
import test.BaseTest;

//Target Selection for Synch
public class WizardLocator extends BaseTest {

    public static final String TITLE_PAGE = "//h2[contains(text(), \"New Synch\")]";
    public static final String WIZARD_STEP_NAVIGATOR2 = "(//div[@class='rs-wizard-step-innercircle'])[2]";
    public static final String REQUEST_NEW_PROVIDER_LINK = "//a[@class='request-provider align-r']";
    public static final String SALESFORCE_ICON = "//img[@src='/images/applications/salesforce.JPG']";
    public static final String FOLLOWUPBOSS_ICON = "//img[@src='/images/applications/followupboss.JPG']";
    public static final String CONTACTUALLY_ICON = "//img[@src='/images/applications/contactually.JPG']";
    public static final String BOOMTOWN_ICON = "//img[@src='/images/applications/boomtown.JPG']";
}

