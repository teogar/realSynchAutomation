import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

public class SiDx extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div[5]/div/div[2]/div[9]/div/div/div/img")
    WebElement showCaseIdx;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div[6]/div/div[2]/div[1]/div/div/div/img")
    WebElement fUb;

    @FindBy(how = How.XPATH, using = "//*[@id=\"source-box-btn\"]/span")
    WebElement sIdXCredentials;

    @FindBy(how = How.XPATH, using = Locators.CLOSE_BUTTON)
    WebElement closeBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"target-box-btn\"]")
    WebElement fuBCreds;

    @FindBy(how = How.XPATH, using = "//*[@id=\"target-box-btn\"]")
    WebElement inputFubtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"pr_id_12\"]/div[2]/div[3]/div[2]/button")
    WebElement fUbVerify;

    @FindBy(how = How.XPATH, using = Locators.FINISH_BTN)
    WebElement finishBtn;






    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;



    public SiDx(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);

    }

    public void sdIx(){

        this.showCaseIdx.click();
        this.fUb.click();
        this.sIdXCredentials.click();
        this.closeBtn.click();
        this.inputFubtn.click();
        this.fuBCreds.clear();
        this.fuBCreds.sendKeys("325812829d5985be8afc09a2c71219896bfe6b");
        this.closeBtn.click();
        this.fUbVerify.click();


        try{
            Thread.sleep(8000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        this.nextButton.click();


        try{
            Thread.sleep(15000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.finishBtn.click();






    }


}
