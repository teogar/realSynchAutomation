package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import locator.FinishLocator;

public class FinishPage extends BaseTest {

    public FinishPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = FinishLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = FinishLocator.WIZARD_STEP_NAVIGATOR3)
    static WebElement stepNavigator;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_LOGO)
    static WebElement sourceImage;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_ACTIVATION_LINK)
    static WebElement sourceActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_LOGO)
    static WebElement targetImage;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_ACTIVATION_LINK)
    static WebElement targetActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.ADD_SYNCH_ICON)
    static WebElement addSynchIcon;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_CLIENT_ID)
    static WebElement sourceClientId;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_USER)
    static WebElement userName;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_TOKEN)
    static WebElement targetToken;

    @FindBy( how = How.XPATH, using = FinishLocator.OK_POPUP_BUTTON)
    static WebElement okPopupButton;

    public static boolean clickOnSourceActivationInstructions() {
        System.out.print("Looking for source activation instructions link");
        if(sourceActivationLink.isDisplayed()) {
            System.out.print(" : DONE");
            sourceActivationLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOntargetActivationInstructions() {
        System.out.print("Looking for target activation instructions link");
        if(targetActivationLink.isDisplayed()) {
            System.out.print(" : DONE");
            targetActivationLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnAddSynchIcon() {
        System.out.print("Looking for Add Synch Icon");
        if(addSynchIcon.isDisplayed()) {
            System.out.print(" : DONE");
            addSynchIcon.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static String getClientIdText() {
        System.out.print("Looking for client ID");
        if(sourceClientId.isDisplayed()) {
            System.out.println(" : DONE");
            return sourceClientId.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static String getUserIdText() {
        System.out.print("Looking for user name");
        if(userName.isDisplayed()) {
            System.out.println(" : DONE");
            return userName.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static String getTokenText() {
        System.out.print("Looking for security token");
        if(targetToken.isDisplayed()) {
            System.out.println(" : DONE");
            return targetToken.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnOKPopupButton() {
        System.out.print("Looking for 'OK' popup button");
        if (okPopupButton.isDisplayed()) {
            System.out.print(" : DONE");
            okPopupButton.click();
            System.out.println(" & CLICKED");
            return true;
        } else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
