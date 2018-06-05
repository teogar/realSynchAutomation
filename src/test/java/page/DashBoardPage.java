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
    static WebElement title;
    
    @FindBy(how = How.XPATH, using = DashBoardLocator.ADD_NEW_SYNC_BUTTON)
    static WebElement addNewSynchButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SOURCE_NAME)
    static WebElement sourceName;

    @FindBy(how = How.XPATH, using = DashBoardLocator.TARGET_NAME)
    static WebElement targetName;

    @FindBy(how = How.XPATH, using = DashBoardLocator.CALENDAR_ICON)
    static WebElement calendarButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ELIPSIS_BUTTON)
    static WebElement elipsisButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATE_SYNCH_BUTTON)
    static WebElement activateSynchLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.DEACTIVATE_SYNCH_LINK)
    static WebElement deactivateSyncLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SYNCH_STATUS)
    static WebElement synchStatus;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SOURCE_CREDENTIALSISSUE_BUTTON)
    static WebElement sourceCredentialsIssueButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.TARGET_CREDENTIALSISSUE_BUTTON)
    static WebElement targetCredentialsIssueButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATION_INSTRUCTIONS_SYNCH_BUTTON)
    static WebElement activationInstructionsButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.EDIT_SYNCH_BUTTON)
    static WebElement editSynchButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.OK_BUTTON)
    static WebElement okButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.BACK_ACTIVATION_INSTRUCTIONS_BUTTON)
    static WebElement backButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.CLOSE_ACTIVATION_INSTRUCTIONS_BUTTON)
    static WebElement closeButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.DONE_ACTIVATION_INSTRUCTIONS_BUTTON)
    static WebElement doneButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.DEACTIVATE_POP_UP_CANCEL)
    static WebElement deactivateCancelButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.DEACTIVATE_POP_UP_YES)
    static WebElement deactivateYesButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SYNCH_INFORMATION_LABEL)
    static WebElement synchInformation;

    public static String getSynchStatusText() {
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

    public static String getSourceNameText() {
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
  
    public static String getTargetNameText() {
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

    public static boolean clickOnAddNewSynchButton(){
        System.out.print("Looking for 'Add new synch button' button");
        if(addNewSynchButton.isDisplayed()) {
            System.out.print(" : FOUND");
            addNewSynchButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean clickOnCalendarButton() {
        System.out.print("Looking for 'Calendar' button");
        if(calendarButton.isDisplayed()) {
            System.out.print(" : FOUND");
            calendarButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
  
    public static boolean clickOnElipsisIcon() {
        System.out.print("Looking for 'Elipsis' button");
        if(elipsisButton.isDisplayed()) {
            System.out.print(" : FOUND");
            elipsisButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
  
    public static boolean clickOnActivateSynchLink() {
        System.out.print("Looking for 'Activate Synch' button");
        if(activateSynchLink.isDisplayed()) {
            System.out.print(" : FOUND");
            activateSynchLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
  
    public static boolean clickOnDeactivateSynchLink() {
        System.out.print("Looking for 'Submit' button");
        if(deactivateSyncLink.isDisplayed()) {
            System.out.print(" : FOUND");
            deactivateSyncLink.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
  
    public static boolean clickOnSourceCredentialsIssueButton() {
        System.out.print("Looking for 'Source Credentials Issue' button");
        if(sourceCredentialsIssueButton.isDisplayed()) {
            System.out.print(" : FOUND");
            sourceCredentialsIssueButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
  
    public static boolean clickOnTargetCredentialsIssueButton() {
        System.out.print("Looking for 'Target Credentials Issue' button");
        if(targetCredentialsIssueButton.isDisplayed()) {
            System.out.print(" : FOUND");
            targetCredentialsIssueButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
  
    public static boolean clickOnActivationInstructionsLink() {
        System.out.print("Looking for 'Activation Instructions' button");
        if(activationInstructionsButton.isDisplayed()) {
            System.out.println(" : FOUND");
            activationInstructionsButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
  
    public static boolean clickOnEditSynchLink() {
        System.out.print("Looking for 'Edit Synch' button");
        if(editSynchButton.isDisplayed()) {
            System.out.print(" : FOUND");
            editSynchButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnCancelButton() {
        System.out.print("Looking for 'deactivateCancelButton' button");
        if(deactivateCancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            deactivateCancelButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnYesButton() {
        System.out.print("Looking for 'deactivateYesButton' button");
        if(deactivateYesButton.isDisplayed()) {
            System.out.print(" : FOUND");
            deactivateYesButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnBackButton() {
        System.out.print("Looking for 'backButton' button");
        if(backButton.isDisplayed()) {
            System.out.print(" : FOUND");
            backButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnCloseButton() {
        System.out.print("Looking for 'closeButton' button");
        if(closeButton.isDisplayed()) {
            System.out.print(" : FOUND");
            closeButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnDoneButton() {
        System.out.print("Looking for 'doneButton' button");
        if(doneButton.isDisplayed()) {
            System.out.print(" : FOUND");
            doneButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnOkButton() {
        System.out.print("Looking for 'okButton' button");
        if(okButton.isDisplayed()) {
            System.out.print(" : FOUND");
            okButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static String getSynchInformation(){
        System.out.print("Looking for 'synchInformation' label");
        if(synchInformation.isDisplayed()) {
            System.out.println(" : FOUND and STRING RETRIEVED");
            return synchInformation.getText();
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
