package page;

import locator.BottomLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class BottomPage extends BaseTest {
    public BottomPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = BottomLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy(how = How.XPATH, using = BottomLocator.BACK_BUTTON)
    static WebElement backButton;

    @FindBy(how = How.XPATH, using = BottomLocator.NEXT_BUTTON)
    static WebElement nextButton;

    @FindBy(how = How.XPATH, using = BottomLocator.ACTIVATE_BUTTON)
    public static WebElement activateButton;

    public static void clickOnCancelButton() {
        System.out.print("Looking for 'Cancel' button");
        if(cancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            cancelButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnBackButton() {
        System.out.print("Looking for 'Back' button");
        if(backButton.isDisplayed()) {
            System.out.print(" : FOUND");
            backButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnNextButton() {
        System.out.print("Looking for 'Next' button");
        if(nextButton.isDisplayed()) {
            System.out.print(" : FOUND");
            nextButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnActivateButton() {
        System.out.print("Looking for 'Activate' button");
        if(activateButton.isDisplayed()) {
            System.out.print(" : FOUND");
            activateButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
