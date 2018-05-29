package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;

public class LogoutPage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_AVATAR_BUTTON)
    WebElement rsAvatarBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_LOGOUT_BTN)
    WebElement rSLogOutBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_OK_BTN)
    WebElement okButton;


    public LogoutPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void logOut() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for avatar Icon ");
        if (rsAvatarBtn.isDisplayed()) {
            System.out.println(": FOUND");
            this.rsAvatarBtn.click();
        } else {
            System.out.println(" : NOT FOUND");
            System.exit(-1);
        }
        System.out.println("Click on Logout");
        this.rSLogOutBtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.okButton.click();
    }
}
