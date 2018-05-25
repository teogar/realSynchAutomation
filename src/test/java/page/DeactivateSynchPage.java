package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;
import utils.Properties;


public class DeactivateSynchPage extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_ELIPSIS_BUTTON)
    WebElement elipsisButton;

    @FindBy(how = How.XPATH,using = Locators.RD_DEACTIVATE_BUTTON)
    WebElement deactivateButton;

    @FindBy(how = How.XPATH, using = Locators.RS_YES_BUTTON)
    WebElement yesButton;

    @FindBy(how = How.XPATH, using = Locators.RS_CONFIRM_BUTTON)
    WebElement confirmButton;

    @FindBy(how = How.XPATH, using = Locators.RS_ACTIVE_SYNCH)
    WebElement activesynch;

    @FindBy(how = How.XPATH, using = Locators.RS_CALENDAR_BUTTON)
    WebElement calendarButton;

    public DeactivateSynchPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void deactivateSynch() {
        System.out.print("Looking for Active synch ");
        if(activesynch.isDisplayed()) {
            System.out.println(": FOUND");
            this.activesynch.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for elipsis button ");
        if(elipsisButton.isDisplayed()) {
            System.out.println(": FOUND");
            this.elipsisButton.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for deactive button ");
        if(deactivateButton.isDisplayed()) {
            System.out.println(": FOUND");
            deactivateButton.click();
        } else {
            System.out.println(": NOT FOUND");
        }
        try {
            Thread.sleep(Properties.TIME_OFF_7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click yes button");
        this.yesButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Click confirm button");
        this.confirmButton.click();
        System.out.println("Looking for calendar button");
        if(calendarButton.isDisplayed()) {
            System.out.println("The calendar button is ready show info");
        } else {
            System.out.println("The calendar button is not displayed");
            System.exit(-1);
        }
        /**
        System.out.println("Click Active filter");
        this.activeFilter.click();
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         **/
        System.out.println("Click calendar button");
        this.calendarButton.click();
        try {
            Thread.sleep(Properties.TIME_OFF_10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
