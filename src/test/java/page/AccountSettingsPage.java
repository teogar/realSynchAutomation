package page;

import locator.AccountSettingsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class AccountSettingsPage extends BaseTest{
    public AccountSettingsPage(WebDriver driver) {
        WebDriver pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    @FindBy( how = How.XPATH, using = AccountSettingsLocator.FIRSTNAME_INPUT)
    static WebElement firstNameInput;
    @FindBy( how = How.XPATH, using = AccountSettingsLocator.LASTNAME_INPUT)
    static WebElement lastNameInput;
    @FindBy( how = How.XPATH, using = AccountSettingsLocator.EMAIL_INPUT)
    static WebElement emailInput;

    public static void sendFirstName(String fistName) {
        System.out.print("Looking for 'firstNameInput' input");
        if(firstNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            firstNameInput.sendKeys(fistName);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendLastName(String lastName) {
        System.out.print("Looking for 'lastNameInput' input");
        if(lastNameInput.isDisplayed()) {
            System.out.print(" : FOUND");
            lastNameInput.sendKeys(lastName);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }

    public static void sendEmail(String email) {
        System.out.print("Looking for 'email' input");
        if(emailInput.isDisplayed()) {
            System.out.print(" : FOUND");
            emailInput.sendKeys(email);
            System.out.println(" & STRING SENT");
        }
        else {
            System.out.println(" : NOT FOUND");
            throw new RuntimeException();
        }
    }
}
