package page;

import Locator.PaymentMethodLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

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

    public static void clickOnAddNewPaymentMethodButtonn() {
        System.out.print("Looking for 'addNewPaymentMethodButton' button");
        if(addNewPaymentMethodButton.isDisplayed()) {
            System.out.print(" : FOUND");
            addNewPaymentMethodButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnPaymentMethodButton() {
        System.out.print("Looking for 'paymentMethodButton' button");
        if(paymentMethodButton.isDisplayed()) {
            System.out.print(" : FOUND");
            paymentMethodButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnDeletePaymentMethodButton() {
        System.out.print("Looking for 'deletePaymentMethodButton' button");
        if(deletePaymentMethodButton.isDisplayed()) {
            System.out.print(" : FOUND");
            deletePaymentMethodButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnEditPaymentMethodButton() {
        System.out.print("Looking for 'Edit Payment Method' button");
        if(editPaymentMethodButton.isDisplayed()) {
            System.out.print(" : FOUND");
            editPaymentMethodButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnEditCancelButton() {
        System.out.print("Looking for 'editCardHolderNameInput' button");
        if(editCancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            editCancelButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnEditSaveButton() {
        System.out.print("Looking for 'editSaveButton' button");
        if(editSaveButton.isDisplayed()) {
            System.out.print(" : FOUND");
            editSaveButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnEditCloseButton() {
        System.out.print("Looking for 'editCloseButton' button");
        if(editCloseButton.isDisplayed()) {
            System.out.print(" : FOUND");
            editCloseButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnNewCancelButton() {
        System.out.print("Looking for 'newCancelButton' button");
        if(newCancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            newCancelButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void clickOnNewSaveButton() {
        System.out.print("Looking for 'Save Button' button");
        if(newSaveButton.isDisplayed()) {
            System.out.print(" : FOUND");
            newSaveButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendEditMonthExpires(String monthExpires) {
        System.out.print("Looking for 'Month Expires' input");
        if(editMonthExpiresInput.isDisplayed()) {
            System.out.print(" : FOUND");
            editMonthExpiresInput.sendKeys(monthExpires);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendEditCardHolderName(String cardHolderName) {
        System.out.print("Looking for 'CardHolder Name' input");
        if(editCardHolderNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            editCardHolderNameInput.clear();
            editCardHolderNameInput.sendKeys(cardHolderName);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendEditYearExpires(String yearExpires) {
        System.out.print("Looking for 'Year Expires' input");
        if(editYearExpiresInput.isDisplayed()) {
            System.out.print(" : FOUND");
            editYearExpiresInput.sendKeys(yearExpires);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendNewCardHolderName(String cardHolderName) {
        System.out.print("Looking for 'CardHolderName' input");
        if(newCardHolderNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            newCardHolderNameInput.sendKeys(cardHolderName);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendNewCardNumber(String cardNumber) {
        System.out.print("Looking for 'cardNumber' input");
        if(newCardNumberInput.isDisplayed()) {
            System.out.print(" : FOUND");
            newCardNumberInput.click();
            newCardNumberInput.clear();
            newCardNumberInput.sendKeys(cardNumber);
            //newCardNumberInput.sendKeys(cardNumber);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendNewExpiresAt(String expiresAt) {
        System.out.print("Looking for 'Expires date' input");
        if(newExpiresAtInput.isDisplayed()) {
            System.out.print(" : FOUND");
            newExpiresAtInput.sendKeys(expiresAt);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendNewCVV(String cvv) {
        System.out.print("Looking for 'CVV' input");
        if(newCVVInput.isDisplayed()) {
            System.out.print(" : FOUND");
            newCVVInput.sendKeys(cvv);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendNewZipCode(String zipcode) {
        System.out.print("Looking for 'ZipCode' input");
        if(newZipCodeInput.isDisplayed()) {
            System.out.print(" : FOUND");
            newZipCodeInput.sendKeys(zipcode);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
