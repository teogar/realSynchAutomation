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

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_LOGO)
    WebElement sourceImage;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_ACTIVATION_LINK)
    WebElement sourceActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_LOGO)
    WebElement targetImage;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_ACTIVATION_LINK)
    WebElement targetActivationLink;

    @FindBy( how = How.XPATH, using = FinishLocator.ADD_SYNCH_ICON)
    WebElement addSynchIcon;

    @FindBy( how = How.XPATH, using = FinishLocator.SOURCE_CLIENT_ID)
    WebElement sourceClientId;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_USER)
    WebElement userName;

    @FindBy( how = How.XPATH, using = FinishLocator.TARGET_TOKEN)
    WebElement targetToken;

    @FindBy( how = How.XPATH, using = FinishLocator.CANCEL_BUTTON)
    WebElement cancelButton;

    @FindBy( how = How.XPATH, using = FinishLocator.BACK_BUTTON)
    WebElement backButton;

    @FindBy( how = How.XPATH, using = FinishLocator.ACTIVATE_BUTTON)
    WebElement activateButton;

    public boolean clickSourceActivationInstructions() {
        System.out.print("Looking for source activation instructions link");
        if(sourceActivationLink.isDisplayed()) {
            System.out.println(" : DONE");
            sourceActivationLink.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clicktargetActivationInstructions() {
        System.out.print("Looking for target activation instructions link");
        if(targetActivationLink.isDisplayed()) {
            System.out.println(" : DONE");
            targetActivationLink.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickAddSynchIcon() {
        System.out.print("Looking for Add Synch Icon");
        if(addSynchIcon.isDisplayed()) {
            System.out.println(" : DONE");
            addSynchIcon.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public String getClientIdText() {
        System.out.print("Looking for client ID");
        if(sourceClientId.isDisplayed()) {
            System.out.println(" : DONE");
            return sourceClientId.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            return "NOT FOUND";
        }
    }

    public String getUserIdText() {
        System.out.print("Looking for user name");
        if(userName.isDisplayed()) {
            System.out.println(" : DONE");
            return userName.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            return "NOT FOUND";
        }
    }

    public String getTokenText() {
        System.out.print("Looking for security token");
        if(targetToken.isDisplayed()) {
            System.out.println(" : DONE");
            return targetToken.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            return "NOT FOUND";
        }
    }

    public boolean clickCancelButton() {
        System.out.print("Looking for cancel button");
        if(cancelButton.isDisplayed()) {
            System.out.println(" : DONE");
            cancelButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickBackButton() {
        System.out.print("Looking for back button");
        if(backButton.isDisplayed()) {
            System.out.println(" : DONE");
            backButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickActivateButton() {
        System.out.print("Looking for activate button");
        if(activateButton.isDisplayed()) {
            System.out.println(" : DONE");
            activateButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
}
