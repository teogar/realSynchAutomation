package page;

import locator.PaymentMethodLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PaymentMethodPage extends BaseTest {
    public PaymentMethodPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.PAYMENT_METHOD_BUTTON)
    static WebElement paymentMethodButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.DELETE_PAYMENT_BUTTON)
    static WebElement deletePaymentMethodButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.EDIT_PAYMENT_BUTTON)
    static WebElement editPaymentMethodButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.EDIT_CARD_HOLDERNAME_INPUT)
    static WebElement editCardHolderNameInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.EDIT_MONTHEXPIRES_INPUT)
    static WebElement editMonthExpiresInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.EDIT_YEAREXPIRES_INPUT)
    static WebElement editYearExpiresInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.EDIT_CANCEL_BUTTON)
    static WebElement editCancelButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.EDIT_SAVE_BUTTON)
    static WebElement editSaveButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.EDIT_CLOSE_BUTTON)
    static WebElement editCloseButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.ADD_NEW_PAYMENT_METHOD_BUTTON)
    static WebElement addNewPaymentMethodButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.NEW_CARDHOLDER_NAME_INPUT)
    static WebElement newCardHolderNameInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.NEW_CARD_NUMBER_INPUT)
    static WebElement newCardNumberInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.NEW_EXPIRESAT_INPUT)
    static WebElement newExpiresAtInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.NEW_CVV_INPUT)
    static WebElement newCVVInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.NEW_ZIPCODE_INPUT)
    static WebElement newZipCodeInput;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.NEW_CANCEL_BUTTON)
    static WebElement newCancelButton;

    @FindBy( how = How.XPATH, using = PaymentMethodLocator.NEW_SAVE_BUTTON)
    static WebElement newSaveButton;

    public static boolean clickOnAddNewPaymentMethodButtonn() {
        System.out.print("Looking for 'addNewPaymentMethodButton' button");
        assertTrue(addNewPaymentMethodButton.isDisplayed());
        System.out.print(" : FOUND");
        addNewPaymentMethodButton.click();
        System.out.println(" & CLICKED");
        return true;
    }

    public static boolean clickOnPaymentMethodButton() {
        System.out.print("Looking for 'paymentMethodButton' button");
        assertTrue(paymentMethodButton.isDisplayed());
        paymentMethodButton.click();
        return true;
    }

    public static boolean clickOnDeletePaymentMethodButton() {
        System.out.print("clickOnDeletePaymentMethodButton");
        assertTrue(deletePaymentMethodButton.isDisplayed());
        deletePaymentMethodButton.click();
        return true;
    }

    public static boolean clickOnEditPaymentMethodButton() {
        System.out.print("clickOnEditPaymentMethodButton");
        assertTrue(editPaymentMethodButton.isDisplayed());
        editPaymentMethodButton.click();
        return true;
    }

    public static boolean clickOnEditCancelButton() {
        System.out.print("clickOnEditCancelButton");
        assertTrue(editCancelButton.isDisplayed());
        editCancelButton.click();
        return true;
    }

    public static boolean clickOnEditSaveButton() {
        System.out.print("clickOnEditSaveButton");
        assertTrue(editSaveButton.isDisplayed());
        editSaveButton.click();
        return true;
    }

    public static boolean clickOnEditCloseButton() {
        System.out.print("clickOnEditCloseButton");
        assertTrue(editCloseButton.isDisplayed());
        editCloseButton.click();
        return true;
    }

    public static boolean clickOnNewCancelButton() {
        System.out.print("clickOnNewCancelButton");
        assertTrue(newCancelButton.isDisplayed());
        newCancelButton.click();
        return true;
    }
    public static boolean clickOnNewSaveButton() {
        System.out.print("clickOnNewSaveButton");
        assertTrue(newSaveButton.isDisplayed());
        newSaveButton.click();
        return true;
    }

    public static boolean sendEditMonthExpires(String data) {
        System.out.print("sendEditMonthExpires");
        assertTrue(editMonthExpiresInput.isDisplayed());
        editMonthExpiresInput.clear();
        editMonthExpiresInput.sendKeys(data);
        assertEquals(editMonthExpiresInput.getText(), data);
        return true;
    }

    public static boolean sendEditCardHolderName(String data) {
        System.out.print("sendEditCardHolderName");
        assertTrue(editCardHolderNameInput.isDisplayed());
        editCardHolderNameInput.clear();
        editCardHolderNameInput.sendKeys(data);
        assertEquals(editCardHolderNameInput.getText(), data);
        return true;
    }
    public static boolean sendEditYearExpires(String data) {
        System.out.print("sendEditYearExpires");
        assertTrue(editYearExpiresInput.isDisplayed());
        editYearExpiresInput.clear();
        editYearExpiresInput.sendKeys(data);
        assertEquals(editYearExpiresInput.getText(), data);
        return true;
    }
    public static boolean sendNewCardHolderName(String data) {
        System.out.print("sendNewCardHolderName");
        assertTrue(newCardHolderNameInput.isDisplayed());
        newCardHolderNameInput.clear();
        newCardHolderNameInput.sendKeys(data);
        assertEquals(newCardNumberInput.getText(), data);
        return true;
    }
    public static boolean sendNewCardNumber(String data) {
        System.out.print("sendNewCardNumber");
        assertTrue(newCardNumberInput.isDisplayed());
        newCardNumberInput.clear();
        newCardNumberInput.sendKeys(data);
        assertEquals(newCardNumberInput.getText(), data);
        return true;
    }
    public static boolean sendNewExpiresAt(String data) {
        System.out.print("sendNewExpiresAt");
        newExpiresAtInput.clear();
        assertTrue(newExpiresAtInput.isDisplayed());
        newExpiresAtInput.sendKeys(data);
        assertEquals(newCardNumberInput.getText(), data);
        return true;
    }
    public static boolean sendNewCVV(String data) {
        assertTrue(newCVVInput.isDisplayed());
        newCVVInput.clear();
        newCVVInput.sendKeys(data);
        assertEquals(newCVVInput.getText(), data);
        return true;
    }
    public static boolean sendNewZipCode(String data) {
        System.out.print("Looking for 'ZipCode' input");
        assertTrue(newZipCodeInput.isDisplayed());
        newZipCodeInput.clear();
        newZipCodeInput.sendKeys(data);
        assertEquals(newZipCodeInput.getText(), data);
        return true;
    }
}
