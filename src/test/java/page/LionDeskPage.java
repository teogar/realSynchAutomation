package page;

import locator.LionDeskLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;

public class LionDeskPage extends BaseTest {

    public LionDeskPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver,this);
    }

    @FindBy(how = How.XPATH, using = LionDeskLocators.LION_DESK_INPUT_BUTTON)
    static WebElement lionDeskInputButton;

    @FindBy(how = How.XPATH, using = LionDeskLocators.LION_DESK_REUSE_CREDS_BUTTON)
    static WebElement credsReuseButton;

    @FindBy(how = How.XPATH, using = LionDeskLocators.LIONDESK_REUSEABLE_CREDS)
    static WebElement credsReused;

    public static boolean lionDeskReuseCreds() {
        System.out.println("LionDesk Reuse Credetials Function : START");
        assertTrue(lionDeskInputButton.isDisplayed());
        lionDeskInputButton.click();
        assertTrue(credsReuseButton.isDisplayed());
        credsReuseButton.click();
        assertTrue(credsReused.isDisplayed());
        credsReused.click();
        return true;
    }
}
