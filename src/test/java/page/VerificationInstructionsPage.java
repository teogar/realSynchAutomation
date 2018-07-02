package page;

import locator.VerificationInstructionsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;

public class VerificationInstructionsPage extends BaseTest{
    public VerificationInstructionsPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = VerificationInstructionsLocator.NEXT_VERIFICATION_INSTRUCTIONS_SYNCH_BUTTON)
    static WebElement nextButton;

    @FindBy( how = How.XPATH, using = VerificationInstructionsLocator.CLOSE_VERIFICATION_INSTRUCTIONS_BUTTON)
    static WebElement closeButton;

    @FindBy( how = How.XPATH, using = VerificationInstructionsLocator.BACK_VERIFICATION_INSTRUCTIONS_BUTTON)
    static WebElement backButton;

    @FindBy( how = How.XPATH, using = VerificationInstructionsLocator.DONE_VERIFICATION_INSTRUCTIONS_BUTTON)
    static WebElement doneButton;

    public static boolean clickOnNextButton() {
        System.out.print("Looking for 'nextButton' button");
        assertTrue(nextButton.isDisplayed());
        nextButton.click();
        return true;
    }

    public static boolean clickOnCloseButton() {
        System.out.print("Looking for 'closeButton' button");
        assertTrue(closeButton.isDisplayed());
        closeButton.click();
        return true;
    }

    public static boolean clickOnBackButton() {
        System.out.print("Looking for 'backButton' button");
        assertTrue(backButton.isDisplayed());
        backButton.click();
        return true;
    }

    public static boolean clickOnDoneButton() {
        System.out.print("Looking for 'doneButton' button");
        assertTrue(doneButton.isDisplayed());
        doneButton.click();
        return true;
    }

    public static boolean checkForNextButton(){
        System.out.print("Checking assertTrue the 'Next' button is displayed");
        assertTrue(nextButton.isDisplayed());
        return true;
    }

    public static boolean checkForDoneButton(){
        System.out.print("Checking assertTrue the 'Done' button is displayed");
        assertTrue(doneButton.isDisplayed());
        return true;
    }
}
