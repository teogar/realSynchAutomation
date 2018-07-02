package page;

import locator.CredentialsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;

public class CredentialsPage extends BaseTest {

    public CredentialsPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = CredentialsLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = CredentialsLocator.WIZARD_STEP_NAVIGATOR3)
    static WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = CredentialsLocator.SOURCE_IMAGE)
    static WebElement sourceImage;

    @FindBy( how = How.XPATH, using = CredentialsLocator.SOURCE_INSTRUCTIONS_LINK)
    static WebElement sourceInstructionsLink;

    @FindBy( how = How.XPATH, using = CredentialsLocator.SOURCE_INPUT_BUTTON)
    static WebElement sourceInputButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.TARGET_IMAGE)
    static WebElement targetImage;

    @FindBy( how = How.XPATH, using = CredentialsLocator.TARGET_INSTRUCTIONS_LINK)
    static WebElement targetInstructionsLink;

    @FindBy( how = How.XPATH, using = CredentialsLocator.TARGET_INPUT_BUTTON)
    static WebElement targetInputButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.BACK_BUTTON)
    static WebElement backButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.NEXT_BUTTON)
    static WebElement nextButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.NO_BUTON)
    static WebElement noButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.YES_BUTTON)
    static WebElement yesButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.OK_BUTTON)
    static public WebElement okButton;

    public static boolean clickOnStep3Navigator() {
        System.out.print("clickOnStep3Navigator");
        assertTrue(stepNavigator.isDisplayed());
        stepNavigator.click();
        return true;
    }

    public static boolean clickOnSourceVerificationInstructions() {
        System.out.print("clickOnSourceVerificationInstructions");
        assertTrue(sourceInstructionsLink.isDisplayed());
        sourceInstructionsLink.click();
        return true;
    }

    public static boolean clickOnSourceInputButton() {
        System.out.print("clickOnSourceInputButton");
        assertTrue(sourceInputButton.isDisplayed());
        sourceInputButton.click();
        return true;
    }

    public static boolean clickOnTargetVerificationInstructions() {
        System.out.print("clickOnTargetVerificationInstructions");
        assertTrue(targetInstructionsLink.isDisplayed());
        targetInstructionsLink.click();
        return true;
    }

    public static boolean clickOnTargetInputButton() {
        System.out.print("clickOnTargetInputButton");
        assertTrue(targetInputButton.isDisplayed());
        targetInputButton.click();
        return true;
    }

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(cancelButton.isDisplayed());
        cancelButton.click();
        return true;
    }

    public static boolean clickOnBackButton() {
        System.out.print("clickOnBackButton");
        assertTrue(backButton.isDisplayed());
        backButton.click();
        return true;
    }

    public static boolean clickOnNextButton() {
        System.out.print("clickOnNextButton");
        assertTrue(nextButton.isDisplayed());
        nextButton.click();
        return true;
    }

    public static boolean clickOnNoAlertButton() {
        System.out.print("clickOnNoAlertButton");
        assertTrue(noButton.isDisplayed());
        noButton.click();
        return true;
    }

    public static boolean clickOnYesAlertButton() {
        System.out.print("clickOnYesAlertButton");
        assertTrue(yesButton.isDisplayed());
        yesButton.click();
        return true;
    }

    public static boolean clickOnOkAlertButton() {
        System.out.print("clickOnOkAlertButton");
        assertTrue(okButton.isDisplayed());
        okButton.click();
        return true;
    }
}
