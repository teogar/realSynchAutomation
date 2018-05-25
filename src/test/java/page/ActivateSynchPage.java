package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;
import utils.Properties;

public class ActivateSynchPage extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_ELIPSIS_BUTTON)
    WebElement elipsisButton;

    @FindBy(how = How.XPATH, using = Locators.RS_ACTIVATION_BUTTON)
    WebElement activateButton;

    @FindBy(how = How.XPATH, using = Locators.RS_CONFIRM_BUTTON)
    WebElement confirmButton;

    @FindBy(how = How.XPATH, using = Locators.SUCCESS_BUTTON_OK)
    WebElement successImg;

    @FindBy(how = How.XPATH, using = Locators.RS_ACTIVE_SYNCH)
    WebElement activeFilter;

    @FindBy(how = How.XPATH, using = Locators.RS_CALENDAR_BUTTON)
    WebElement calendarButton;

    public ActivateSynchPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void activateSynch() {
        if(elipsisButton.isDisplayed()) {
            System.out.println("The elipsis button is displayed");
        } else {
            System.out.println("The Elipsis button is not displayed");
            System.exit(-1);
        }
        this.elipsisButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(activateButton.isDisplayed()) {
            System.out.println("The activation button is displayed");
        } else {
            System.out.println("The activation button is displayed");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.activateButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.confirmButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(successImg.isDisplayed()) {
            System.out.println("The success Validation is working");
        } else {
            System.out.println("The The success validation is not working");
            System.exit(-1);
        }
        this.confirmButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
