package page;

import locator.BottomLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;

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

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(cancelButton.isDisplayed()) ;
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

    public static boolean clickOnActivateButton() {
        System.out.print("LclickOnActivateButton");
        assertTrue(activateButton.isDisplayed());
        activateButton.click();
        return true;
    }
}
