package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import Locator.SourceLocator;

public class SourcePage extends BaseTest {

    public SourcePage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = SourceLocator.TITLE_PAGE)
    WebElement title;

    @FindBy( how = How.XPATH, using = SourceLocator.WIZARD_STEP_NAVIGATOR1)
    WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = SourceLocator.REQUEST_NEW_PROVIDER_LINK)
    WebElement newProviderLink;

    @FindBy( how = How.XPATH, using = SourceLocator.VOICEPAD_ICON)
    WebElement voicePadIcon;

    @FindBy( how = How.XPATH, using = SourceLocator.BR360_ICON)
    WebElement Br360Icon;

    @FindBy( how = How.XPATH, using = SourceLocator.REAL_GEEKS)
    WebElement RealgeeksIcon;

    @FindBy( how = How.XPATH, using = SourceLocator.SIDX_ICON)
    WebElement SidxIcon;

    @FindBy( how = How.XPATH, using = SourceLocator.CANCEL_BUTTON)
    WebElement cancelButton;

    @FindBy( how = How.XPATH, using = SourceLocator.BACK_BUTTON)
    WebElement backButton;

    @FindBy( how = How.XPATH, using = SourceLocator.NEXT_BUTTON)
    WebElement nextButton;

}
