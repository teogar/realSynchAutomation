package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;

public class RealSRegisterPage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.REALS_REGISTRATION_LINK)
    WebElement rsRegisterLink;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_FIRST_NAME)
    WebElement rsFirstName;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_LASTNAME)
    WebElement rsLastName;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_EMAIL)
    WebElement rsEmail;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_PASSWORD)
    WebElement rsPassword;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_CONFIRM_PASSWORD)
    WebElement rsConfirmPsw;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_SUBMIT_BUTTON)
    WebElement rsSubmitButton;

    @FindBy(how = How.XPATH, using = Locators.RS_REG_BUY_PLAN_TEAM)
    WebElement buyPlanTeam;

    public RealSRegisterPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void realRegistration(String name, String lastName, String email, String psw, String confpsw) {
        System.out.print("Looking for Registration Link ");
        if (rsRegisterLink.isEnabled()) {
            System.out.println(": ENABLE");
            this.rsRegisterLink.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for Team radio button ");
        this.buyPlanTeam.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (rsFirstName.isDisplayed()
                && rsLastName.isDisplayed()
                && rsEmail.isDisplayed()
                && rsPassword.isDisplayed()
                && rsConfirmPsw.isDisplayed()
                && rsSubmitButton.isDisplayed()) {
            System.out.println("SignUp Elements are Displayed and Are Manipulable");
        } else {
            System.out.println("SignUp elements are Broken");
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
