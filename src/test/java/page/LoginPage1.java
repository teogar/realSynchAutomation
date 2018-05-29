package page;

import Locator.LoginLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class LoginPage1 extends BaseTest {

    public LoginPage1(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = LoginLocator.TITLE_PAGE)
    WebElement title;

    @FindBy( how = How.NAME, using = LoginLocator.USER_INPUT)
    WebElement userName;

    @FindBy( how = How.NAME, using = LoginLocator.PASSWORD_INPUT)
    WebElement password;

    @FindBy( how = How.CLASS_NAME, using = LoginLocator.FORGOT_PASSWORD_LINK)
    WebElement forgotPasswordLink;

    @FindBy( how = How.CLASS_NAME, using = LoginLocator.REGISTER_LINK)
    WebElement RegisterLink;

    @FindBy( how = How.XPATH, using = LoginLocator.SUBMIT_BUTTON)
    WebElement SubmitLink;

    public boolean clickNext() {
        if(SubmitLink.isDisplayed()) {
            System.out.println("Click Next Button");
            SubmitLink.click();
            return true;
        }
        else {
            System.out.println("Next button is not located");
            return false;
        }
    }


}
