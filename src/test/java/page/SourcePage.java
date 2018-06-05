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
        System.out.print("Looking for new provider link");
        if(newProviderLink.isDisplayed()) {
            System.out.println(" : DONE");
            newProviderLink.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnVoicePadLogo() {
        System.out.print("Looking for voice pad logo");
        if(voicePadLogo.isDisplayed()) {
            System.out.println(" : DONE");
            voicePadLogo.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnBr360Logo() {
        System.out.print("Looking for Br360 pad logo");
        if(Br360Logo.isDisplayed()) {
            System.out.println(" : DONE");
            Br360Logo.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnRealGeekLogo() {
        System.out.print("Looking for real geek Logo");
        if(RealgeeksLogo.isDisplayed()) {
            System.out.println(" : DONE");
            RealgeeksLogo.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnSidxLogo() {
        System.out.print("Looking for SiDX logo");
        if(SidxLogo.isDisplayed()) {
            System.out.println(" : DONE");
            SidxLogo.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnCancelButton() {
        System.out.print("Looking for cancel button");
        if(cancelButton.isDisplayed()) {
            System.out.println(" : DONE");
            cancelButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnBackButton() {
        System.out.print("Looking for back button");
        if(backButton.isDisplayed()) {
            System.out.println(" : DONE");
            backButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnNextButton() {
        System.out.print("Looking for next button");
        if(nextButton.isDisplayed()) {
            System.out.println(" : DONE");
            nextButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
