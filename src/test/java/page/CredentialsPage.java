package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import Locator.CredentialsLocator;

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
    static WebElement okButton;

    public static boolean clickOnStep3Navigator() {
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

    public static boolean clickOnSourceVerificationInstructions() {
        System.out.print("Looking for 'Source Verification Instructions' button");
        if(sourceInstructionsLink.isDisplayed()) {
            System.out.print(" : FOUND");
            sourceInstructionsLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnSourceInputButton() {
        System.out.print("Looking for 'Source Input' button");
        if(sourceInputButton.isDisplayed()) {
            System.out.print(" : FOUND");
            sourceInputButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnTargetVerificationInstructions() {
        System.out.print("Looking for 'Target Verification Instructions' button");
        if(targetInstructionsLink.isDisplayed()) {
            System.out.print(" : FOUND");
            targetInstructionsLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnTargetInputButton() {
        System.out.print("Looking for 'Target Input' button");
        if(targetInputButton.isDisplayed()) {
            System.out.print(" : FOUND");
            targetInputButton.click();
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
        System.out.print("Looking for 'Back' button");
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

    public static boolean clickOnNoAlertButton() {
        System.out.print("Looking for 'No' button on alert Popup");
        if(noButton.isDisplayed()) {
            System.out.print(" : FOUND");
            noButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnYesAlertButton() {
        System.out.print("Looking for 'Yes' button on alert Popup");
        if(yesButton.isDisplayed()) {
            System.out.print(" : FOUND");
            yesButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnOkAlertButton() {
        System.out.print("Looking for 'OK' button on alert Popup");
        if(okButton.isDisplayed()) {
            System.out.print(" : FOUND");
            okButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
