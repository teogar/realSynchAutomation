package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import locator.FinishLocator;

import static org.testng.Assert.assertTrue;

public class FinishPage extends BaseTest {

    public FinishPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = FinishLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = FinishLocator.WIZARD_STEP_NAVIGATOR3)
    static WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_LOGO)
    static WebElement sourceImage;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_ACTIVATION_LINK)
    static WebElement sourceActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_LOGO)
    static WebElement targetImage;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_ACTIVATION_LINK)
    static WebElement targetActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.ADD_SYNCH_ICON)
    static WebElement addSynchIcon;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_CLIENT_ID)
    static WebElement sourceClientId;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_USER)
    static WebElement userName;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_TOKEN)
    static WebElement targetToken;

    @FindBy( how = How.XPATH, using = FinishLocator.OK_POPUP_BUTTON)
    static WebElement okPopupButton;

    public static boolean clickOnSourceActivationInstructions() {
        System.out.print("clickOnSourceActivationInstructions");
        assertTrue(sourceActivationLink.isDisplayed());
        sourceActivationLink.click();
        return true;
    }

    public static boolean clickOntargetActivationInstructions() {
        System.out.print("clickOntargetActivationInstructions");
        assertTrue(targetActivationLink.isDisplayed());
        targetActivationLink.click();
        return true;
    }

    public static boolean clickOnAddSynchIcon() {
        System.out.print("clickOnAddSynchIcon");
        assertTrue(addSynchIcon.isDisplayed());
        addSynchIcon.click();
        return true;
    }

    public static String getClientIdText() {
        System.out.print("getClientIdText");
        assertTrue(sourceClientId.isDisplayed());
        return sourceClientId.getText();
    }

    public static String getUserIdText() {
        System.out.print("getUserIdText");
        assertTrue(userName.isDisplayed());
        return userName.getText();
    }

    public static String getTokenText() {
        System.out.print("getTokenText");
        assertTrue(targetToken.isDisplayed());
        return targetToken.getText();
    }

    public static boolean clickOnOKPopupButton() {
        System.out.print("clickOnOKPopupButton");
        assertTrue(okPopupButton.isDisplayed());
        okPopupButton.click();
        return true;
    }
}
