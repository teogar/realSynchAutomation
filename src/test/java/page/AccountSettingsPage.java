package page;

import locator.AccountSettingsLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


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

    public static boolean sendFirstName(String firstName) {
        System.out.print("sendFirstName");
        assertTrue(firstNameInput.isDisplayed());
        firstNameInput.sendKeys(firstName);
         assertEquals(firstNameInput.getText(), firstName);
         return true;
    }

    public static boolean sendLastName(String lastName) {
        System.out.print("sendLastName");
        assertTrue(lastNameInput.isDisplayed());
        lastNameInput.sendKeys(lastName);
        assertEquals(lastNameInput.getText(), lastName);
        return true;
    }

    public static boolean sendEmail(String email) {
        System.out.print("sendEmail");
        assertTrue(emailInput.isDisplayed());
        emailInput.sendKeys(email);
        assertEquals(emailInput.getText(), email);
        return true;
    }
}
