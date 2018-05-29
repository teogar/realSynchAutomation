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

    @FindBy( how = How.XPATH, using = CredentialsLocator.TAGET_IMAGE)
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
}
