import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

public class LogoutPage extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_NAME_BOX)
    WebElement userName;

    @FindBy(how = How.XPATH, using = Locators.RS_PSW_BOX)
    WebElement psw;

    @FindBy(how = How.XPATH, using = Locators.RE_SINGIN_BTN)
    WebElement singInBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/img")
    WebElement rsAvatarBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[1]/div/div/ul/li[3]")
    WebElement rSLogOutBtn;

    @FindBy(how = How.XPATH, using = "//button[@class=\"confirm\"]")
    WebElement okButton;


    public LogoutPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void logOut() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (rsAvatarBtn.isDisplayed()) {
            this.rsAvatarBtn.click();
        } else {
            System.out.println("The avatr is not displayed");
            System.exit(-1);

        }

        this.rSLogOutBtn.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.okButton.click();

    }

}





