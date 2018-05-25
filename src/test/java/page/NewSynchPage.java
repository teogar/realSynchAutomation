package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;
import utils.Properties;

public class NewSynchPage extends BaseTest {
    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.NEW_SYNCH_BTN)
    WebElement newSynchBtn;

    @FindBy(how = How.XPATH, using = Locators.VOICE_PAD_PATH)
    WebElement voicePad;

    @FindBy(how = How.XPATH, using = Locators.SALES_FORCE_APP)
    WebElement salesForce;

    @FindBy(how = How.XPATH, using = Locators.PROPERTY_BASE_APP)
    WebElement propertyBase;

    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;

    public NewSynchPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    /**
     * Display Verification for Static Elements
     */
    public void createNewSynch() {
        System.out.print("Looking for Synch button ");
        if(newSynchBtn.isDisplayed()) {
            System.out.println(": FOUND");
            this.newSynchBtn.click();
        } else {
            System.out.println(("NOT FOUND"));
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for VoicePad Icon ");
        if(voicePad.isDisplayed()) {
            System.out.println(": FOUND");
            this.voicePad.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        System.out.print("Looking for Sales Force ");
        if(salesForce.isDisplayed()) {
            System.out.print(": FOUND");
            this.salesForce.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(Properties.TIME_OFF_3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
