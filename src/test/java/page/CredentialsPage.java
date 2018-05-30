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
    WebElement title;

    @FindBy( how = How.XPATH, using = CredentialsLocator.WIZARD_STEP_NAVIGATOR3)
    WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = CredentialsLocator.SOURCE_IMAGE)
    WebElement sourceImage;

    @FindBy( how = How.XPATH, using = CredentialsLocator.SOURCE_INSTRUCTIONS_LINK)
    WebElement sourceInstructionsLink;

    @FindBy( how = How.XPATH, using = CredentialsLocator.SOURCE_INPUT_BUTTON)
    WebElement sourceInputButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.TARGET_IMAGE)
    WebElement targetImage;

    @FindBy( how = How.XPATH, using = CredentialsLocator.TARGET_INSTRUCTIONS_LINK)
    WebElement targetInstructionsLink;

    @FindBy( how = How.XPATH, using = CredentialsLocator.TARGET_INPUT_BUTTON)
    WebElement targetInputButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.CANCEL_BUTTON)
    WebElement cancelButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.BACK_BUTTON)
    WebElement backButton;

    @FindBy( how = How.XPATH, using = CredentialsLocator.NEXT_BUTTON)
    WebElement nextButton;

    public boolean clickOnStep3Navigator() {
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

    public boolean clickOnSourceVerificationInstructions() {
        System.out.print("Looking for 'Source Verification Instructions' button");
        if(sourceInstructionsLink.isDisplayed()) {
            System.out.print(" : FOUND");
            sourceInstructionsLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickOnSourceInputButton() {
        System.out.print("Looking for 'Source Input' button");
        if(sourceInputButton.isDisplayed()) {
            System.out.print(" : FOUND");
            sourceInputButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickOnTargetVerificationInstructions() {
        System.out.print("Looking for 'Target Verification Instructions' button");
        if(targetInstructionsLink.isDisplayed()) {
            System.out.print(" : FOUND");
            targetInstructionsLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickOnTargetInputButton() {
        System.out.print("Looking for 'Target Input' button");
        if(targetInputButton.isDisplayed()) {
            System.out.print(" : FOUND");
            targetInputButton.click();
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
        System.out.print("Looking for 'Back' button");
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
