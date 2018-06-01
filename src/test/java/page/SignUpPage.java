package page;


import Locator.SignUpLocator;
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
    static WebElement userNameInput;

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

}
