package page;
import locator.ForgotPasswordLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import locator.LoginLocator;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordPage extends BaseTest {

    public ForgotPasswordPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy(how = How.NAME, using = ForgotPasswordLocator.USER_NAME_INPUT)
    static WebElement userName;

    @FindBy(how = How.XPATH,using = ForgotPasswordLocator.CANCEL_BUTTON)
    static WebElement cancelButton;

    @FindBy(how = How.XPATH, using = ForgotPasswordLocator.SUBMIT_BUTTON)
    static WebElement submitButton;

    @FindBy(how = How.XPATH, using = LoginLocator.FORGOT_PASSWORD_LINK)
    static WebElement forgotPsw;

    @FindBy(how = How.NAME,using = ForgotPasswordLocator.USER_NAME_INPUT)
    static WebElement forgotPswBox;

    @FindBy(how = How.XPATH, using = ForgotPasswordLocator.SUBMIT_BUTTON)
    static WebElement forgotSubmit;

    @FindBy(how = How.XPATH, using = ForgotPasswordLocator.OK_BUTTON)
    static WebElement okButton;

    public static boolean sendUserName(String username) {
        System.out.print("sendUserName");
        assertTrue(userName.isDisplayed());
        userName.sendKeys(username);
        assertEquals(userName.getText(), username);
        return true;
    }

    public static boolean clickOnCancelButton() {
        System.out.print("clickOnCancelButton");
        assertTrue(cancelButton.isDisplayed());
        cancelButton.click();
        return true;
    }

    public static boolean clickOnSubmitButton() {
        System.out.print("clickOnSubmitButton");
        assertTrue(submitButton.isDisplayed());
        submitButton.click();
        return true;
    }

    public static boolean clickOnOkButton() {
        System.out.print("clickOnOkButton");
        assertTrue (okButton.isDisplayed());
        okButton.click();
        return true;
    }

    public static boolean pswRecovery(){
        System.out.println("pswRecovery");
        assertTrue(forgotPsw.isDisplayed());
        forgotPsw.click();
        return true;
    }

    public static boolean sendPwd(String forgotPsw) {
        System.out.print("sendPwd");
        assertTrue(forgotPswBox.isDisplayed());
        forgotPswBox.clear();
        forgotPswBox.sendKeys(forgotPsw);
        assertEquals(forgotPswBox.getText(), forgotPsw);
        return true;
    }
}
