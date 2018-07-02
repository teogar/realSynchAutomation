package page;


import locator.SignUpLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SignUpPage extends BaseTest {
    public WebDriver pageDriver;
    public SignUpPage(WebDriver driver){
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = SignUpLocator.TITLE_PAGE)
    static WebElement title;

    @FindBy( how = How.XPATH, using = SignUpLocator.TEAM_LITE_RADIOBUTTON)
    static WebElement liteOption;

    @FindBy( how = How.XPATH, using = SignUpLocator.PASSWORD_INPUT)
    static WebElement passwordInput;

    @FindBy( how = How.CLASS_NAME, using = SignUpLocator.TEAM_BETA_RADIOBUTTON)
    static WebElement betaOption;

    @FindBy( how = How.CLASS_NAME, using = SignUpLocator.TEAM_TEAM_RADIOBUTTON)
    static WebElement teamOption;

    @FindBy( how = How.XPATH, using = SignUpLocator.SUBMIT_BUTTON)
    static WebElement submitButton;

    @FindBy( how = How.XPATH, using = SignUpLocator.TEAM_SUPERTEAMBROKER_RADIOBUTTON)
    static WebElement superTeamBrokerOption;

    @FindBy( how = How.XPATH, using = SignUpLocator.FIRSTNAME_INPUT)
    static WebElement firstNameInput;

    @FindBy( how = How.XPATH, using = SignUpLocator.LASTNAME_INPUT)
    static WebElement lastNameInput;

    @FindBy( how = How.CLASS_NAME, using = SignUpLocator.EMAIL_INPUT)
    static WebElement emailInput;

    @FindBy( how = How.CLASS_NAME, using = SignUpLocator.CONFIRMPASSWORD_INPUT)
    static WebElement confirmPasswordInput;

    @FindBy( how = How.XPATH, using = SignUpLocator.COMPANY_INPUT)
    static WebElement companyInput;

    @FindBy( how = How.CLASS_NAME, using = SignUpLocator.PHONENUMBER_INPUT)
    static WebElement phoneNumberInput;

    @FindBy( how = How.XPATH, using = SignUpLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    public static boolean clickOnSubmitButton() {
        System.out.print("clickOnSubmitButton");
        assertTrue(submitButton.isDisplayed());
        submitButton.click();
        return true;
    }

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(cancelButton.isDisplayed());
        cancelButton.click();
        return true;
    }

    public static boolean sendFirstNameInput(String data ) {
        System.out.print("sendFirstNameInput");
        assertTrue(firstNameInput.isDisplayed());
        firstNameInput.clear();
        firstNameInput.sendKeys(data);
        assertEquals(firstNameInput.getText(), data);
        return true;
    }

    public static boolean sendLastNameInput(String data ) {
        System.out.print("sendLastNameInput");
        assertTrue(lastNameInput.isDisplayed());
        lastNameInput.clear();
        lastNameInput.sendKeys(data);
        assertEquals(lastNameInput.getText(), data);
        return true;
    }

    public static boolean sendEmailInput(String data ) {
        System.out.print("sendEmailInput");
        assertTrue(emailInput.isDisplayed());
        emailInput.clear();
        emailInput.sendKeys(data);
        assertEquals(emailInput.getText(), data);
        return true;
    }

    public static boolean sendConfirmPasswordInput(String data ) {
        System.out.print("sendConfirmPasswordInput");
        assertTrue(confirmPasswordInput.isDisplayed());
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(data);
        assertEquals(confirmPasswordInput.getText(), data);
        return true;
    }

    public static boolean sendCompanyInput(String data ) {
        System.out.print("sendCompanyInput");
        assertTrue(companyInput.isDisplayed());
        companyInput.clear();
        companyInput.sendKeys(data);
        assertEquals(companyInput.getText(), data);
        return true;
    }

    public static boolean sendPhoneNumberInput(String data ) {
        System.out.print("sendPhoneNumberInput");
        assertTrue(phoneNumberInput.isDisplayed());
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys(data);
        assertEquals(phoneNumberInput.getText(), data);
        return true;
    }

    public static boolean sendPasswordInput(String data ) {
        System.out.print("sendPasswordInput");
        assertTrue(passwordInput.isDisplayed());
        passwordInput.clear();
        passwordInput.sendKeys(data);
        assertEquals(passwordInput.getText(), data);
        return true;
    }
}
