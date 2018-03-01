import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Locators;
import utils.Properties;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public RealSRegisterPage realSRegisterPage;
    public WebDriver driver;
    public RemoteWebDriver driver;
    public NewSynchPage newSynchPage;
    public LoginPage loginPage;
    public VoicePadPage voicePadPage;
    public SalesForcePage salesForcePage;
    public PropertyBasePage propertyBasePage;
    public ForgotPasswordPage forgotPasswordPage;
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
      options.addArguments("--start-maximized");
      //driver = new ChromeDriver(options);
     // driver = new FirefoxDriver();
      driver = new RemoteWebDriver(new URL("http://45.33.121.99:4444/wd/hub"), DesiredCapabilities.firefox());
      realSRegisterPage = new RealSRegisterPage(driver);
      loginPage = new LoginPage(driver);
      newSynchPage = new NewSynchPage(driver);
      voicePadPage = new VoicePadPage(driver);
      salesForcePage = new SalesForcePage(driver);
      propertyBasePage = new PropertyBasePage(driver);
      forgotPasswordPage = new ForgotPasswordPage(driver);
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.navigate().to("https://realsynch-fullstack.herokuapp.com/login");

    }

    /**
     * Destroying Selenium after classes
     */

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();

    }

}
