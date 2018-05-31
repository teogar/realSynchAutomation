package page;

import Locator.DashBoardLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class DashBoardPage extends BaseTest {

    public DashBoardPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = DashBoardLocator.TITLE_PAGE)
    WebElement title;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ADD_NEW_SYNC_BUTTON)
    WebElement addNewSynchButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SOURCE_NAME)
    WebElement sourceName;

    @FindBy(how = How.XPATH, using = DashBoardLocator.TARGET_NAME)
    WebElement targetName;

    @FindBy(how = How.XPATH, using = DashBoardLocator.CALENDAR_ICON)
    WebElement calendarButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ELIPSIS_BUTTON)
    WebElement elipsisButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATE_SYNCH_BUTTON)
    WebElement activateSynchLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.DEACTIVATE_SYNCH_LINK)
    WebElement deactivateSyncLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SYNCH_STATUS)
    WebElement synchStatus;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SOURCE_CREDENTIALSISSUE_BUTTON)
    WebElement sourceCredentialsIssueButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.TARGET_CREDENTIALSISSUE_BUTTON)
    WebElement targetCredentialsIssueButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATION_INSTRUCTIONS_SYNCH_BUTTON)
    WebElement activationInstructionsButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.EDIT_SYNCH_BUTTON)
    WebElement editSynchButton;

    public String getSynchStatusText() {
        System.out.print("Looking for 'Synch Status' text");
        if(synchStatus.isDisplayed()) {
            System.out.println(" : FOUND & RETRIEVED");
            return synchStatus.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            return "NOT FOUND";
        }
    }

    public String getSourceNameText() {
        System.out.print("Looking for 'Source name' text");
        if(sourceName.isDisplayed()) {
            System.out.println(" : FOUND & RETRIEVED");
            return sourceName.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            return "NOT FOUND";
        }
    }
  
    public String getTargetNameText() {
        System.out.print("Looking for 'Target name' text");
        if(targetName.isDisplayed()) {
            System.out.println(" : FOUND & RETRIEVED");
            return targetName.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            return "NOT FOUND";
        }
    }

    public boolean clickOnAddNewSynchButton(){
        System.out.print("Looking for 'Add new synch button' button");
        if(addNewSynchButton.isDisplayed()) {
            System.out.print(" : FOUND");
            addNewSynchButton.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickOnCalendarButton() {
        System.out.print("Looking for 'Calendar' button");
        if(calendarButton.isDisplayed()) {
            System.out.print(" : FOUND");
            calendarButton.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
  
    public boolean clickOnElipsis() {
        System.out.print("Looking for 'Elipsis' button");
        if(elipsisButton.isDisplayed()) {
            System.out.print(" : FOUND");
            elipsisButton.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
  
    public boolean clickOnActivateSynch() {
        System.out.print("Looking for 'Activate Synch' button");
        if(activateSynchLink.isDisplayed()) {
            System.out.print(" : FOUND");
            activateSynchLink.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
  
    public boolean clickOnDeactivateSynchLink() {
        System.out.print("Looking for 'Submit' button");
        if(deactivateSynchLink.isDisplayed()) {
            System.out.print(" : FOUND");
            deactivateSynchLink.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
  
    public boolean clickOnSourceCredentialsIssueButton() {
        System.out.print("Looking for 'Source Credentials Issue' button");
        if(sourceCredentialsIssueButton.isDisplayed()) {
            System.out.print(" : FOUND");
            sourceCredentialsIssueButton.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
  
    public boolean clickOnTargetCredentialsIssue() {
        System.out.print("Looking for 'Target Credentials Issue' button");
        if(targetCredentialsIssueButton.isDisplayed()) {
            System.out.print(" : FOUND");
            targetCredentialsIssueButton.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
  
    public boolean clickOnActivationInstructions() {
        System.out.print("Looking for 'Activation Instructions' button");
        if(activationInstructionsButton.isDisplayed()) {
            System.out.print(" : FOUND");
            activationInstructionsButton.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
  
    public boolean clickOnEditSynch() {
        System.out.print("Looking for 'Edit Synch' button");
        if(editSynchButton.isDisplayed()) {
            System.out.print(" : FOUND");
            editSynchButton.click();
            System.out.print(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
}
