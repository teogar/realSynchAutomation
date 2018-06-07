package page;


import locator.SignUpLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

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

    public static void clickOnSubmitButton() {
        System.out.print("Looking for 'SubmitButton' button");
        if(submitButton.isDisplayed()) {
            System.out.print(" : FOUND");
            submitButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnCancelButton() {
        System.out.print("Looking for 'cancelButton' button");
        if(cancelButton.isDisplayed()) {
            System.out.print(" : FOUND");
            cancelButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendFirstNameInput(String firstName ) {
        System.out.print("Looking for 'firstname' input");
        if(firstNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            firstNameInput.sendKeys(firstName);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendLastNameInput(String lastname ) {
        System.out.print("Looking for 'lastname' input");
        if(lastNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            lastNameInput.sendKeys(lastname);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendEmailInput(String email ) {
        System.out.print("Looking for 'email' input");
        if(emailInput.isDisplayed()) {
            System.out.print(" : FOUND");
            emailInput.sendKeys(email);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendConfirmPasswordInput(String password ) {
        System.out.print("Looking for 'confirmPassword' input");
        if(confirmPasswordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            confirmPasswordInput.sendKeys(password);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendCompanyInput(String company ) {
        System.out.print("Looking for 'company' input");
        if(companyInput.isDisplayed()) {
            System.out.print(" : FOUND");
            companyInput.sendKeys(company);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendPhoneNumberInput(String phonenumber ) {
        System.out.print("Looking for '' input");
        if(phoneNumberInput.isDisplayed()) {
            System.out.print(" : FOUND");
            phoneNumberInput.sendKeys(phonenumber);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
    public static void sendPasswordInput(String password ) {
        System.out.print("Looking for 'password' input");
        if(passwordInput.isDisplayed()) {
            System.out.print(" : FOUND");
            passwordInput.sendKeys(password);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
