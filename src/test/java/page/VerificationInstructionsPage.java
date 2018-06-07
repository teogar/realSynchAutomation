package page;

import Locator.VerificationInstructionsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

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

    public static boolean clickOnCloseButton() {
        System.out.print("Looking for 'closeButton' button");
        if(closeButton.isDisplayed()) {
            System.out.print(" : FOUND");
            closeButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnBackButton() {
        System.out.print("Looking for 'backButton' button");
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

    public static boolean clickOnDoneButton() {
        System.out.print("Looking for 'doneButton' button");
        if(doneButton.isDisplayed()) {
            System.out.print(" : FOUND");
            doneButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean checkForNextButton(){
        System.out.print("Checking if the 'Next' button is displayed");
        try {
            if(nextButton.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        }
        catch (Exception e) { return false; }
    }

    public static boolean checkForDoneButton(){
        System.out.print("Checking if the 'Done' button is displayed");
        try {
            if(doneButton.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        }
        catch (Exception e) { return false; }
    }

}
