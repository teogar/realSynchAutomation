package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import Locator.FinishLocator;

public class FinishPage extends BaseTest {

    public FinishPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = FinishLocator.TITLE_PAGE)
    WebElement title;

    @FindBy( how = How.XPATH, using = FinishLocator.WIZARD_STEP_NAVIGATOR3)
    WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_IMAGE)
    WebElement sourceImage;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_ACTIVATION_LINK)
    WebElement sourceActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_IMAGE)
    WebElement targetImage;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_ACTIVATION_LINK)
    WebElement targetActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.ADD_SYNCH_ICON)
    WebElement addSynchIcon;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_API_KEY)
    WebElement sourceApiKey;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_API_KEY)
    WebElement targetApiKey;

    @FindBy( how = How.XPATH, using = FinishLocator.CANCEL_BUTTON)
    WebElement cancelButton;

    @FindBy( how = How.XPATH, using = FinishLocator.BACK_BUTTON)
    WebElement backButton;

    @FindBy( how = How.XPATH, using = FinishLocator.ACTIVATE_BUTTON)
    WebElement ActivateButton;
}
