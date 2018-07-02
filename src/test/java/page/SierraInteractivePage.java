package page;

import locator.SierraInteractiveLocators;
import locator.WizardLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Properties;

import javax.xml.xpath.XPath;

import static org.testng.Assert.assertTrue;

public class SierraInteractivePage extends BaseTest {

    public SierraInteractivePage(WebDriver driver) {
        WebDriver pagegeDriver = driver;
        PageFactory.initElements(pagegeDriver,this);
    }

    @FindBy(how = How.XPATH, using = SierraInteractiveLocators.SIERRA_INTERACTIVE_INPUT_BUTTON)
    static WebElement sierraInputButton;

    @FindBy(how = How.XPATH, using = SierraInteractiveLocators.SIERRA_INTERACTIVE_API_BOX)
    static  WebElement sierraInputApi;

    @FindBy(how = How.XPATH,using = SierraInteractiveLocators.SIERRA_INTERACTIVE_VERIFY_BUTTON)
    static  WebElement sierraVerifyButton;

    @FindBy(how = How.XPATH,using = SierraInteractiveLocators.SIERRA_INTERACTIVE_ACTIVATE_BUTTON)
    static WebElement sierraActivate;

    public static boolean sierraCredentials() {
        assertTrue(sierraInputButton.isDisplayed());
        sierraInputButton.click();
        assertTrue(sierraInputApi.isDisplayed());
        sierraInputApi.clear();
        sierraInputApi.sendKeys(Properties.SIERRA_INTERACTIVE_ID);
        assertTrue(sierraVerifyButton.isDisplayed());
        System.out.println("Sierra Verify Button : Click On");
        sierraVerifyButton.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean sierraActivateAction() {
        assertTrue(sierraActivate.isDisplayed());
        sierraActivate.click();
        return true;
    }
}
