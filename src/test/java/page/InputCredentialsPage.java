package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    WebElement closeIcon;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.SOURCE_IMAGE)
    WebElement sourceImage;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.CLIENT_ID_INPUT)
    WebElement clientIdInput;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.USER_INPUT)
    WebElement userInput;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.PASSWORD_INPUT)
    WebElement passwordInput;

    @FindBy( how = How.NAME, using = InputCredentialsLocator.TOKEN_INPUT)
    WebElement tokenInput;

    @FindBy( how = How.ID, using = InputCredentialsLocator.URL_TEST1)
    WebElement urlTest1;

    @FindBy( how = How.ID, using = InputCredentialsLocator.URL_TEST2)
    WebElement urlTest2;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.VERIFY_BUTTON)
    WebElement verifyButton;

    @FindBy( how = How.XPATH, using = InputCredentialsLocator.CLOSE_BUTTON)
    WebElement closeButton;


    public boolean clickCloseIcon() {
        System.out.print("Looking for close icon");
        if(closeIcon.isDisplayed()) {
            System.out.println(" : DONE");
            closeIcon.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickSourceImage() {
        System.out.print("Looking for source image");
        if(sourceImage.isDisplayed()) {
            System.out.println(" : DONE");
            sourceImage.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean enterClientId(@Nonnull String data) {
        System.out.print("Looking for customer ID");
        if(clientIdInput.isDisplayed()) {
            System.out.println(" : DONE");
            clientIdInput.clear();
            clientIdInput.sendKeys(data);
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean enterUser(@Nonnull String data) {
        System.out.print("Looking for user");
        if(userInput.isDisplayed()) {
            System.out.println(" : DONE");
            userInput.clear();
            userInput.sendKeys(data);
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean enterPassword( @Nonnull String data) {
        System.out.print("Looking for password");
        if(passwordInput.isDisplayed()) {
            System.out.println(" : DONE");
            passwordInput.clear();
            passwordInput.sendKeys(data);
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean enterToken( @Nonnull String data) {
        System.out.print("Lookin for token");
        if(tokenInput.isDisplayed()) {
            System.out.println(" : DONE");
            tokenInput.clear();
            tokenInput.sendKeys(data);
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean selectUrl1() {
        System.out.print("Looking for URL1");
        if(urlTest1.isDisplayed()) {
            System.out.println(" : DONE");
            urlTest1.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean selectUrl2() {
        System.out.print("Looking for URL2");
        if(urlTest2.isDisplayed()) {
            System.out.println(" : DONE");
            urlTest2.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickVerifyButton() {
        System.out.print("Looking for verify button");
        if(verifyButton.isDisplayed()) {
            System.out.println(" : DONE");
            verifyButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }

    public boolean clickCloseButton() {
        System.out.print("Looking for close button");
        if(closeButton.isDisplayed()) {
            System.out.println(" : DONE");
            closeButton.click();
            return true;
        }
        else {
            System.out.println(" : NOT FOUND");
            return false;
        }
    }
}
