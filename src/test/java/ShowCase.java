import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;
import utils.Properties;

public class ShowCase extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.NEW_SYNCH_BTN)
    WebElement newSynchBtn;

    @FindBy(how = How.XPATH, using = Locators.SIDX_ICON_BUTTON)
    WebElement showCaseIdx;

    @FindBy(how = How.XPATH, using = Locators.FUB_ICON_BUTTON)
    WebElement fUb;

    @FindBy(how = How.CLASS_NAME, using = Locators.FUB_IMG)
    WebElement fUbImg;

    @FindBy(how = How.XPATH, using = Locators.SIDX_CREDS)
    WebElement sIdXCredentials;

    @FindBy(how = How.XPATH, using = Locators.CLOSE_BUTTON)
    WebElement closeBtn;

    @FindBy(how = How.XPATH, using = Locators.FUB_CREDS_BUTTON)
    WebElement fuBCreds;

    @FindBy(how = How.XPATH, using = Locators.INPUT_FUB_BUTTON)
    WebElement inputFubtn;

    @FindBy(how = How.XPATH, using = Locators.FUB_VERIFY_BUTTON)
    WebElement fUbVerify;

    @FindBy(how = How.XPATH, using = Locators.FINISH_BTN)
    WebElement finishBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;

    @FindBy(how = How.XPATH, using = Locators.RS_CONFIRM_BUTTON)
    WebElement confirmButton;

    @FindBy(how = How.XPATH, using = Locators.SIDX_PENCIL_BUTTON)
    WebElement sIdXPencil;


    public ShowCase(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);

    }

    public void sdIx() {

        this.newSynchBtn.click();

        if (showCaseIdx.isDisplayed()) {
            System.out.println("The Show Case element is Displayed");
        } else {
            System.out.println("The element is not Displayed");
            System.exit(-1);
        }

        this.showCaseIdx.click();

        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (fUb.isDisplayed()) {
            System.out.println("The Follow Up Boss is displayed");
        } else {
            driver.notify();
            System.exit(-1);
        }

        this.fUb.click();

        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.sIdXCredentials.click();

        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.closeBtn.click();
        this.inputFubtn.click();
        this.fuBCreds.clear();
        this.fuBCreds.sendKeys(Locators.FUB_API_KEY);
        this.fUbVerify.click();

        try {
            Thread.sleep(Properties.TIME_OFF_10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.closeBtn.click();

        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.nextButton.click();


        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.finishBtn.click();

        try {
            Thread.sleep(Properties.TIME_OFF_15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.confirmButton.click();

        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
