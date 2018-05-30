package test;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page.*;
import utils.Locators;
import utils.Properties;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public Dashboard dashboard;
    public RealSRegisterPage realSRegisterPage;
    //public WebDriver driver;
    public RemoteWebDriver driver;
    public NewSynchPage newSynchPage;
    public LoginPage1 loginpage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    public VoicePadPage voicePadPage;
    public SalesForcePage salesForcePage;
    public ShowCasePage showCasePage;
    public PropertyBasePage propertyBasePage;
    public ForgotPasswordPage forgotPasswordPage;
    public DeactivateSynchPage deactivateSynchPage;
    public ModifyPlanPage modifyPlanPage;
    public ActivateSynchPage activateSynchPage;

    public ChromeOptions options  = new ChromeOptions();


    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException {

        /**
         * Selenium Setup
         */

      System.out.println("Running Selenium Config");
      System.out.println("Starting Real Synch Automation Test");
      System.setProperty(Properties.CHROME_DRIVER_PROPERTY, Locators.TEST_CHROME_PATH);
      System.setProperty(Properties.GECKO_DRIVER_PROPERTY, Locators.DRIVER_FIREFOX_PATH);

        /**
         * Initializing Objects (Classes)
         */

      //options.addArguments("--start-fullscreen");
      //options.addArguments("--start-maximized");
      //driver = new ChromeDriver(options);
      //driver = new FirefoxDriver();
      FirefoxProfile firefoxProfile = new FirefoxProfile();
      firefoxProfile.setPreference("layout.css.devPixelsPerPx", "0.75");
      DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
      desiredCapabilities.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
      driver = new RemoteWebDriver(new URL("http://45.33.121.99:4444/wd/hub"), desiredCapabilities);

      realSRegisterPage = new RealSRegisterPage(driver);
      loginpage = new LoginPage1(driver);
      loginPage = new LoginPage(driver);
      logoutPage = new LogoutPage(driver);
      newSynchPage = new NewSynchPage(driver);
      voicePadPage = new VoicePadPage(driver);
      salesForcePage = new SalesForcePage(driver);
      showCasePage = new ShowCasePage(driver);
      propertyBasePage = new PropertyBasePage(driver);
      forgotPasswordPage = new ForgotPasswordPage(driver);
      deactivateSynchPage = new DeactivateSynchPage(driver);
      modifyPlanPage = new ModifyPlanPage(driver);
      dashboard = new Dashboard(driver);

      activateSynchPage = new ActivateSynchPage(driver);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //driver.manage().window().maximize();
      driver.navigate().to("https://realsynch-integration.herokuapp.com/login");
    }

    /**
     * Destroying Selenium after classes
     */

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
