import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Locators;

public class ShowCase extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.NEW_SYNCH_BTN)
    WebElement newSynchBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div[5]/div/div[2]/div[9]/div/div/div")
    WebElement showCaseIdx;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div[6]/div/div[2]/div[1]/div/div/div")
    WebElement fUb;

    @FindBy(how = How.CLASS_NAME, using = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div[6]/div/div[2]/div[1]/div/div/div/img")
    WebElement fUbImg;

    @FindBy(how = How.XPATH, using = "//*[@id=\"source-box-btn\"]/span")
    WebElement sIdXCredentials;

    @FindBy(how = How.XPATH, using = Locators.CLOSE_BUTTON)
    WebElement closeBtn;

    @FindBy(how = How.XPATH, using = "//input[@name=\"loginApiKey\"]")
    WebElement fuBCreds;

    @FindBy(how = How.XPATH, using = "//*[@id=\"target-box-btn\"]")
    WebElement inputFubtn;

    @FindBy(how = How.XPATH, using = "//*[contains(text(), \"Verify\")]")
    WebElement fUbVerify;

    @FindBy(how = How.XPATH, using = Locators.FINISH_BTN)
    WebElement finishBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;

    @FindBy(how = How.XPATH, using = Locators.RS_CONFIRM_BUTTON)
    WebElement confirmButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"source-0\"]")
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
            Thread.sleep(5000);
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
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.sIdXCredentials.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.closeBtn.click();
        this.inputFubtn.click();
        this.fuBCreds.clear();
        this.fuBCreds.sendKeys("325812829d5985be8afc09a2c71219896bfe6b");
        this.fUbVerify.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.closeBtn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.nextButton.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.finishBtn.click();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.confirmButton.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
