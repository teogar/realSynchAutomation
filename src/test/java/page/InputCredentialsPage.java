package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import Locator.InputCredentialsLocator;

import test.BaseTest;

import javax.annotation.Nonnull;

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
    static WebElement  verifyButton;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.CLOSE_BUTTON)
    static WebElement  closeButton;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.LABEL)
    static WebElement  statusLabel;


    public static String getLabelText() {
        return statusLabel.getText();
    }

    public static boolean clickOnClose() {
        System.out.print("Looking for close icon");
        if(closeIcon.isDisplayed()) {
            System.out.print(" : DONE");
            closeIcon.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  clickOnSourceImage() {
        System.out.print("Looking for source image");
        if(sourceImage.isDisplayed()) {
            System.out.print(" : DONE");
            sourceImage.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  enterClientId(@Nonnull String data) {
        System.out.print("Looking for customer ID");
        if(clientIdInput.isDisplayed()) {
            System.out.print(" : DONE");
            clientIdInput.clear();
            clientIdInput.sendKeys(data);
            System.out.println(" & SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  enterUser(@Nonnull String data) {
        System.out.print("Looking for user");
        if(userInput.isDisplayed()) {
            System.out.print(" : DONE");
            userInput.clear();
            userInput.sendKeys(data);
            System.out.println(" & SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  enterPassword( @Nonnull String data) {
        System.out.print("Looking for password");
        if(passwordInput.isDisplayed()) {
            System.out.print(" : DONE");
            passwordInput.clear();
            passwordInput.sendKeys(data);
            System.out.println(" & SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  enterToken( @Nonnull String data) {
        System.out.print("Lookin for token");
        if(tokenInput.isDisplayed()) {
            System.out.print(" : DONE");
            tokenInput.clear();
            tokenInput.sendKeys(data);
            System.out.println(" & SENT");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  selectUrl1() {
        System.out.print("Looking for URL1");
        if(urlTest1.isDisplayed()) {
            System.out.print(" : DONE");
            urlTest1.click();
            System.out.println(" & SELECTED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  selectUrl2() {
        System.out.print("Looking for URL2");
        if(urlTest2.isDisplayed()) {
            System.out.print(" : DONE");
            urlTest2.click();
            System.out.println(" & SELECTED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  clickOnVerifyButton() {
        System.out.print("Looking for verify button");
        if(verifyButton.isDisplayed()) {
            System.out.print(" : DONE");
            verifyButton.click();
            System.out.println(" & CLICKED");
            System.out.print("Verifying API Key");
            if(getLabelText().contentEquals("VERIFIED")) {
                System.out.println(" : SUCCESS");
                return true;
            }
            else {
                System.out.println(" : NOT SUCCESS");
                return false;
            }

        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static boolean  clickOnCloseButton() {
        System.out.print("Looking for close button");
        if(closeButton.isDisplayed()) {
            System.out.print(" : DONE");
            closeButton.click();
            System.out.println(" & CLICKED");
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void clickOnBoomVerifyButton() {
        System.out.print("Looking for verify button");
        if (verifyButton.isDisplayed()) {
            System.out.print(" : DONE");
            verifyButton.click();
            System.out.println(" & CLICKED");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
