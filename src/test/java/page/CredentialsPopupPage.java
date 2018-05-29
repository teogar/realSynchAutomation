package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Locator.CredentialsPopUpLocator;

import test.BaseTest;

public class CredentialsPopupPage extends BaseTest {

    public CredentialsPopupPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.CLOSE_ICON)
    WebElement closeIcon;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.SOURCE_IMAGE)
    WebElement sourceImage;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.CLIENT_ID_INPUT)
    WebElement clientIdInput;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.USER_INPUT)
    WebElement userInput;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.PASSWORD_INPUT)
    WebElement passwordInput;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.TOKEN_INPUT)
    WebElement tokenInput;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.URL_TEST1)
    WebElement urlTest1;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.URL_TEST2)
    WebElement urlTest2;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.VERIFY_BUTTON)
    WebElement verifyButton;

    @FindBy( how = How.XPATH, using = CredentialsPopUpLocator.CLOSE_BUTTON)
    WebElement closeButton;


    public void closeButoon() {
        System.out.println("Click close button");
        this.closeIcon.click();
    }

}
