package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import locator.SourceLocator;

import static org.testng.Assert.assertTrue;

public class SourcePage extends BaseTest {

    public SourcePage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = SourceLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = SourceLocator.WIZARD_STEP_NAVIGATOR1)
    public static WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = SourceLocator.REQUEST_NEW_PROVIDER_LINK)
    static WebElement newProviderLink;

    @FindBy( how = How.XPATH, using = SourceLocator.VOICEPAD_LOGO)
    static WebElement voicePadLogo;

    @FindBy( how = How.XPATH, using = SourceLocator.BR360_LOGO)
    static WebElement Br360Logo;

    @FindBy( how = How.XPATH, using = SourceLocator.REAL_GEEKS_LOGO)
    static WebElement RealgeeksLogo;

    @FindBy( how = How.XPATH, using = SourceLocator.SIDX_LOGO)
    static WebElement SidxLogo;

    @FindBy( how = How.XPATH, using = SourceLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy( how = How.XPATH, using = SourceLocator.BACK_BUTTON)
    static WebElement backButton;

    @FindBy( how = How.XPATH, using = SourceLocator.NEXT_BUTTON)
    static WebElement nextButton;

    public static boolean clickOnRequestNewProvider() {
        System.out.print("clickOnRequestNewProvider");
        assertTrue(newProviderLink.isDisplayed());
        newProviderLink.click();
        return true;
    }

    public static boolean clickOnVoicePadLogo() {
        System.out.print("clickOnVoicePadLogo");
        assertTrue(voicePadLogo.isDisplayed());
        voicePadLogo.click();
        return true;
    }

    public static boolean clickOnBr360Logo() {
        System.out.print("clickOnBr360Logo");
        assertTrue(Br360Logo.isDisplayed());
        Br360Logo.click();
        return true;
    }

    public static boolean clickOnRealGeekLogo() {
        System.out.print("clickOnRealGeekLogo");
        assertTrue(RealgeeksLogo.isDisplayed());
        RealgeeksLogo.click();
        return true;
    }

    public static boolean clickOnSidxLogo() {
        System.out.print("clickOnSidxLogo");
        assertTrue(SidxLogo.isDisplayed());
        SidxLogo.click();
        return true;
    }

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(cancelButton.isDisplayed());
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
}
