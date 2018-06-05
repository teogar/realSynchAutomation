package test;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.*;
import utils.Properties;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public RemoteWebDriver driver;

    public CredentialsPage credentialsPage;
    public DashBoardPage dashBoardPage;
    public FinishPage finishPage;
    public ForgotPasswordPage forgotPasswordPage;
    public InputCredentialsPage inputCredentialsPage;
    public LoginPage loginPage;
    public ResetPasswordPage resetPasswordPage;
    public SourcePage sourcePage;
    public TopPage topPage;
    public WizardPage wizardPage;
    public BottomPage bottomPage;
    public AccountSettingsPage accountSettingsPage;
    public ChangePasswordPage changePasswordPage;
    public SignUpPage signUpPage;


    public ChromeOptions options  = new ChromeOptions();
    public static final String TEST_CHROME_PATH ="/Users/rchacon/Documents/RealSynch/src/chromedriver";
    public static final String DRIVER_FIREFOX_PATH = "/Users/rchacon/Documents/RealSynch/src/geckodriver";

    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {

        /**
         * Selenium Setup
         **/
        System.out.println("Running Selenium Config");
        System.out.println("Starting Real Synch Automation Test");
        System.setProperty(Properties.CHROME_DRIVER_PROPERTY, TEST_CHROME_PATH);
        System.setProperty(Properties.GECKO_DRIVER_PROPERTY, DRIVER_FIREFOX_PATH);

        /**
         * Initializing Objects (Classes)
         **/
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("layout.css.devPixelsPerPx", "0.75");
        DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
        desiredCapabilities.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
        driver = new RemoteWebDriver(new URL("http://45.33.121.99:4444/wd/hub"), desiredCapabilities);

        credentialsPage = new CredentialsPage(driver);
        dashBoardPage = new DashBoardPage(driver);
        finishPage = new FinishPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        inputCredentialsPage = new InputCredentialsPage(driver);
        loginPage = new LoginPage(driver);
        resetPasswordPage = new ResetPasswordPage(driver);
        sourcePage = new SourcePage(driver);
        topPage = new TopPage(driver);
        wizardPage = new WizardPage(driver);
        bottomPage = new BottomPage(driver);
        accountSettingsPage = new AccountSettingsPage(driver);
        changePasswordPage = new ChangePasswordPage(driver);
        signUpPage = new SignUpPage(driver);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://realsynch-integration.herokuapp.com/login");
    }

    /**
     * Destroying Selenium after classes
     */
    @AfterClass(alwaysRun = true)
    public void tearDown(){ driver.quit(); }
}
