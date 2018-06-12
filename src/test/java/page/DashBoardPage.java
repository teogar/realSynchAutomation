package page;

import locator.DashBoardLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;

public class DashBoardPage extends BaseTest {

    public DashBoardPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = DashBoardLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ADD_NEW_SYNC_BUTTON)
    static WebElement addNewSynchButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.CALENDAR_ICON)
    static WebElement calendarButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ELIPSIS_LINK)
    static WebElement elipsisButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATE_SYNCH_LINK)
    static WebElement activateSynchLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.DEACTIVATE_SYNCH_LINK)
    static WebElement deactivateSyncLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.EDIT_SYNCH_LINK)
    static WebElement editSynchButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SYNCH_STATUS)
    static WebElement synchStatus;

    @FindBy(how = How.XPATH, using = DashBoardLocator.SOURCE_CREDENTIALSISSUE_BUTTON)
    static WebElement sourceCredentialsIssueButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.TARGET_CREDENTIALSISSUE_BUTTON)
    static WebElement targetCredentialsIssueButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATION_INSTRUCTIONS_SYNCH_LINK)
    static WebElement activationInstructionsButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.OK_BUTTON)
    static WebElement okButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.BACK_ACTIVATION_INSTRUCTIONS_BUTTON)
    static WebElement backButton;

    @FindBy(how = How.XPATH, using = DashBoardLocator.NEXT_ACTIVATION_INSTRUCTIONS_BUTTON)
    static WebElement nextButton;

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

    @FindBy(how = How.XPATH, using = DashBoardLocator.ACTIVATION_INSTRUCTIONS_SYNCH_LINK)
    static WebElement activationInstructionsLink;

    @FindBy(how = How.XPATH, using = DashBoardLocator.EDIT_SYNCH_LINK)
    static WebElement editSynchLink;

    public static boolean clickOnAddNewSynchButton(){
        System.out.print("clickOnAddNewSynchButton");
        assertTrue(addNewSynchButton.isDisplayed());
        addNewSynchButton.click();
        return true;
    }

    public static boolean clickOnCalendarButton() {
        System.out.print("clickOnCalendarButton");
        assertTrue(calendarButton.isDisplayed());
        calendarButton.click();
        return true;
    }

    public static boolean clickOnElipsisIcon() {
        System.out.print("clickOnElipsisIcon");
        assertTrue(elipsisButton.isDisplayed());
        elipsisButton.click();
        return true;
    }

    public static boolean clickOnActivateSynchLink() {
        System.out.print("clickOnActivateSynchLink");
        assertTrue(activateSynchLink.isDisplayed());
        activateSynchLink.click();
        return true;
    }

    public static boolean clickOnDeactivateSynchLink() {
        System.out.print("clickOnDeactivateSynchLink");
        assertTrue(deactivateSyncLink.isDisplayed());
        deactivateSyncLink.click();
        return true;
    }

    public static boolean clickOnActivationInstructionsLink() {
        System.out.print("clickOnActivationInstructionsLink");
        assertTrue(activationInstructionsLink.isDisplayed());
        activationInstructionsLink.click();
        return true;
    }

    public static boolean clickOnEditSynchLink() {
        System.out.print("clickOnEditSynchLink");
        assertTrue(editSynchLink.isDisplayed()); ;
        editSynchLink.click();
        return true;
    }

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(deactivateCancelButton.isDisplayed());
        deactivateCancelButton.click();
        return true;
    }

    public static boolean clickOnYesButton() {
        System.out.print("clickOnYesButton");
        assertTrue(deactivateYesButton.isDisplayed());
        deactivateYesButton.click();
        return true;
    }

    public static boolean clickOnBackButton() {
        System.out.print("clickOnBackButton");
        assertTrue(backButton.isDisplayed()); ;
        backButton.click();
        return true;
    }

    public static boolean clickOnCloseButton() {
        System.out.print("clickOnCloseButton");
        assertTrue(closeButton.isDisplayed());
        closeButton.click();
        return true;
    }

    public static boolean clickOnDoneButton() {
        System.out.print("clickOnDoneButton");
        assertTrue(doneButton.isDisplayed());
        doneButton.click();
        return true;
    }

    public static boolean clickOnOkButton() {
        System.out.print("clickOnOkButton");
        assertTrue(okButton.isDisplayed());
        okButton.click();
        return true;
    }

    public static boolean clickOnNextButton() {
        System.out.print("clickOnNextButton");
        assertTrue(nextButton.isDisplayed());
        nextButton.click();
        return true;
    }

    public static String getSynchInformation(){
        System.out.print("getSynchInformation");
        assertTrue(synchInformation.isDisplayed());
        return synchInformation.getText();
    }

    public static boolean checkForNextButton(){
        System.out.print("checkForNextButton");
        assertTrue(nextButton.isDisplayed());
        return true;
    }

    public static boolean checkForDoneButton(){
        System.out.print("checkForDoneButton");
        assertTrue(doneButton.isDisplayed());
        return true;
    }
}
