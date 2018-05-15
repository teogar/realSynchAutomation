import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Locators;
import utils.Properties;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class BaseTest {

    public RealSRegisterPage realSRegisterPage;
    //public WebDriver driver;
    public RemoteWebDriver driver;
    public NewSynchPage newSynchPage;
    public LoginPage loginPage;
    public LogoutPage logoutPage;
    public VoicePadPage voicePadPage;
    public SalesForcePage salesForcePage;
    public ShowCase showCase;
    public PropertyBasePage propertyBasePage;
    public ForgotPasswordPage forgotPasswordPage;
    public DeactivateSynchPage deactivateSynchPage;
    public ModifyPlanPage modifyPlanPage;
    public ActivateSynchPage activateSynchPage;
    public UpdateCredsPage updateCredsPage;
    public ChromeOptions options  = new ChromeOptions();


    @BeforeClass(alwaysRun = true)
    public void setUp() throws MalformedURLException, AWTException {

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
      loginPage = new LoginPage(driver);
      logoutPage = new LogoutPage(driver);
      newSynchPage = new NewSynchPage(driver);
      voicePadPage = new VoicePadPage(driver);
      salesForcePage = new SalesForcePage(driver);
      showCase = new ShowCase(driver);
      propertyBasePage = new PropertyBasePage(driver);
      forgotPasswordPage = new ForgotPasswordPage(driver);
      deactivateSynchPage = new DeactivateSynchPage(driver);
      modifyPlanPage = new ModifyPlanPage(driver);
      activateSynchPage = new ActivateSynchPage(driver);
      updateCredsPage = new UpdateCredsPage(driver);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //driver.manage().window().maximize();
      driver.navigate().to("https://realsynch-production.herokuapp.com/login");

    }

    /**
     * Destroying Selenium after classes
     */

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();

    }

}
