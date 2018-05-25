package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;

public class ForgotPasswordPage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.FORGOT_PSW_LINK)
    WebElement forgotPsw;

    @FindBy(how = How.XPATH,using = Locators.RS_FORGOT_PSW_BOX)
    WebElement rsForgotPswBox;

    @FindBy(how = How.XPATH, using = Locators.RS_FORGOT_SUBMIT_BTN)
    WebElement forgotSubmit;

    public ForgotPasswordPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void pswRecovery() {
        if(forgotPsw.isDisplayed()) {
            System.out.println("The Forgot PSW link is Displayed");
        } else {
            System.out.println("There's not Link");
            System.exit(-1);
        }
        this.forgotPsw.click();
    }

    public void sendPwd(String forgotPsw) {
        if(rsForgotPswBox.isDisplayed()) {
            System.out.println("The Forgot PWD Box is Displayed");
        } else {
            System.out.println("The Forgot PWD Box is Not Displayed");
            System.exit(-1);
        }
        this.rsForgotPswBox.clear();
        this.rsForgotPswBox.sendKeys(forgotPsw);
        this.forgotSubmit.click();
    }
}
