package page;

import locator.InputCredentialsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InputCredentialsPage extends BaseTest {

    public InputCredentialsPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.CLOSE_ICON)
    static WebElement  closeIcon;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.SOURCE_IMAGE)
    static WebElement  sourceImage;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.CLIENT_ID_INPUT)
    static WebElement  clientIdInput;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.WEBSITE_ID_INPUT)
    static WebElement webSiteId;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.USER_INPUT)
    static WebElement  userInput;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.PASSWORD_INPUT)
    static WebElement  passwordInput;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.TOKEN_INPUT)
    static WebElement  tokenInput;

    @FindBy( how = How.ID, using = InputCredentialsLocator.URL_TEST1)
    static WebElement  urlTest1;

    @FindBy( how = How.ID, using = InputCredentialsLocator.URL_TEST2)
    static WebElement  urlTest2;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.VERIFY_BUTTON)
    static WebElement verifyButton;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.CLOSE_BUTTON)
    static WebElement  closeButton;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.LABEL)
    static WebElement  statusLabel;


    public static String getLabelText() {
        return statusLabel.getText();
    }

    public static boolean clickOnClose() {
        System.out.print("click On Close");
        assertTrue(closeIcon.isDisplayed());
        closeIcon.click();
        return true;
    }

    public static boolean  clickOnSourceImage() {
        System.out.print("clickOnSourceImage");
        assertTrue(sourceImage.isDisplayed());
        sourceImage.click();
        return true;
    }

    public static boolean  enterClientId(String data) {
        System.out.print("enterClientId");
        assertTrue(clientIdInput.isDisplayed());
        clientIdInput.clear();
        clientIdInput.sendKeys(data);
        return true;
    }

    public static boolean enterWesiteId(String webSIte) {
        System.out.println("Enter WebSIte Id");
        assertTrue(webSiteId.isDisplayed());
        webSiteId.clear();
        webSiteId.sendKeys(webSIte);
        return true;
    }

    public static boolean  enterUser(String data) {
        System.out.print("enterUser");
        assertTrue(userInput.isDisplayed());
        userInput.clear();
        userInput.sendKeys(data);
        assertEquals(userInput.getText(), data);
        return true;
    }

    public static boolean  enterPassword(String data) {
        System.out.print("enterPassword");
        assertTrue(passwordInput.isDisplayed());
        passwordInput.clear();
        passwordInput.sendKeys(data);
        assertEquals(passwordInput.getText(), data);
        return true;
    }

    public static boolean  enterToken(String data) {
        System.out.print("enterToken");
        assertTrue(tokenInput.isDisplayed());
        tokenInput.clear();
        tokenInput.sendKeys(data);
        assertEquals(tokenInput.getText(), data);
        return true;
    }

    public static boolean  selectUrl1() {
        System.out.print("selectUrl1");
        assertTrue(urlTest1.isDisplayed());
        urlTest1.click();
        return true;
    }

    public static boolean  selectUrl2() {
        System.out.print("selectUrl2");
        assertTrue(urlTest2.isDisplayed());
        urlTest2.click();
        return true;
    }

    public static boolean clickOnVerButton() throws InterruptedException {
        System.out.print("clickOnVerButton");
        assertTrue(verifyButton.isDisplayed());
        verifyButton.click();
        Thread.sleep(3000);
        return true;
    }

    public static boolean  clickOnCloseButton() {
        System.out.print("clickOnCloseButton");
        assertTrue(closeButton.isDisplayed());
        closeButton.click();
        return true;
    }

    public static boolean clickOnVerifyButton() {
        System.out.print("clickOnVerifyButton");
        assertTrue (verifyButton.isDisplayed());
        verifyButton.click();
        return true;
    }
}
