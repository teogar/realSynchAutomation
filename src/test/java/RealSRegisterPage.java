

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

public class RealSRegisterPage extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.REALS_REGISTRATION_LINK)
    WebElement rsRegisterLink;

    @FindBy(how = How.XPATH, using = "//input[@name=\"firstName\"]")
    WebElement rsFirstName;

    @FindBy(how = How.XPATH, using = "//input[@name=\"lastName\"]")
    WebElement rsLastName;

    @FindBy(how = How.XPATH, using = "//input[@name=\"email\"]")
    WebElement rsEmail;

    @FindBy(how = How.XPATH, using = "//input[@name=\"password\"]")
    WebElement rsPassword;

    @FindBy(how = How.XPATH, using = "//input[@name=\"confirmpassword\"]")
    WebElement rsConfirmPsw;

    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
    WebElement rsSubmitButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/div/div[3]/div/button/span[2]")
    WebElement buyPlanTeam;


    public RealSRegisterPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);

    }

    public void realRegistration(String name, String lastName, String email, String psw, String confpsw) {

        if (rsRegisterLink.isEnabled()) {
            System.out.println("The Registration Link is enabled");
            this.rsRegisterLink.click();
        } else {
            System.out.println("The Link is Broken");
            System.exit(-1);
        }

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.buyPlanTeam.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        if (rsFirstName.isDisplayed()
                && rsLastName.isDisplayed()
                && rsEmail.isDisplayed()
                && rsPassword.isDisplayed()
                && rsConfirmPsw.isDisplayed()
                && rsSubmitButton.isDisplayed()) {
            System.out.println("The Login Elements are Displayed and Are Manipulable ");
        }else{
            System.out.println("Elements are Broken");
            System.exit(-1);
        }

        this.rsFirstName.clear();
        this.rsFirstName.sendKeys(name);
        this.rsLastName.clear();
        this.rsLastName.sendKeys(lastName);
        this.rsEmail.clear();
        this.rsEmail.sendKeys(email);
        this.rsPassword.clear();
        this.rsPassword.sendKeys(psw);
        this.rsConfirmPsw.clear();
        this.rsConfirmPsw.sendKeys(confpsw);
        this.rsSubmitButton.click();

    }

}

