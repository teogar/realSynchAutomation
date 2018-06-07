package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.AccountSettingsPage;
import page.BoomTownPage;
import page.BottomPage;
import page.ChangePasswordPage;
import page.CredentialsPage;
import page.DashBoardPage;
import page.FinishPage;
import page.ForgotPasswordPage;
import page.InputCredentialsPage;
import page.LoginPage;
import page.PaymentMethodPage;
import page.ResetPasswordPage;
import page.SignUpPage;
import page.SourcePage;
import page.TopPage;
import page.VerificationInstructionsPage;
import page.WizardPage;
import utils.Properties;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public RemoteWebDriver driver;
    public AccountSettingsPage accountSettingsPage;
    public BoomTownPage boomTownPage;
    public BottomPage bottomPage;
    public ChangePasswordPage changePasswordPage;
    public CredentialsPage credentialsPage;
    public DashBoardPage dashBoardPage;
    public FinishPage finishPage;
    public ForgotPasswordPage forgotPasswordPage;
    public InputCredentialsPage inputCredentialsPage;
    public LoginPage loginPage;
    public ResetPasswordPage resetPasswordPage;
    public SignUpPage signUpPage;
    public SourcePage sourcePage;
    public TopPage topPage;
    public WizardPage wizardPage;
    public PaymentMethodPage paymentMethodPage;
    public VerificationInstructionsPage verificationInstructionsPage;

    public static final String DRIVER_FIREFOX_PATH = "/Users/rchacon/Documents/RealSynch/src/geckodriver";

    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {

        /**
         * Selenium Setup
         **/
      System.out.println("Running Selenium Config");
      System.out.println("Starting Real Synch Automation Test");
      //System.setProperty(Properties.CHROME_DRIVER_PROPERTY, TEST_CHROME_PATH);
      System.setProperty(Properties.GECKO_DRIVER_PROPERTY, DRIVER_FIREFOX_PATH);

        /**
         * Initializing Objects (Classes)
         **/
      FirefoxProfile firefoxProfile = new FirefoxProfile();
      firefoxProfile.setPreference("layout.css.devPixelsPerPx", "0.75");
      DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
      desiredCapabilities.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
      driver = new RemoteWebDriver(new URL("http://45.33.121.99:4444/wd/hub"), desiredCapabilities);

      accountSettingsPage = new AccountSettingsPage(driver);
      boomTownPage = new BoomTownPage(driver);
      bottomPage = new BottomPage(driver);
      changePasswordPage = new ChangePasswordPage(driver);
      credentialsPage = new CredentialsPage(driver);
      dashBoardPage = new DashBoardPage(driver);
      finishPage = new FinishPage(driver);
      forgotPasswordPage = new ForgotPasswordPage(driver);
      inputCredentialsPage = new InputCredentialsPage(driver);
      loginPage = new LoginPage(driver);
      paymentMethodPage = new PaymentMethodPage(driver);
      resetPasswordPage = new ResetPasswordPage(driver);
      signUpPage = new SignUpPage(driver);
      sourcePage = new SourcePage(driver);
      topPage = new TopPage(driver);
      verificationInstructionsPage = new VerificationInstructionsPage(driver);
      wizardPage = new WizardPage(driver);

      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.navigate().to("https://realsynch-integration.herokuapp.com/login");
    }

    /**
     * Destroying Selenium after classes
     */
    @AfterClass(alwaysRun = true)
    public void tearDown(){ driver.quit(); }
}
