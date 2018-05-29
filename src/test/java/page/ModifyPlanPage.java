package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;
import utils.Locators;

public class ModifyPlanPage  extends BaseTest {
public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_AVATAR_BUTTON)
    WebElement rsAvatarBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_ACCOUNT_SET_BUTTON)
    WebElement accountSettings;

    @FindBy(how = How.XPATH, using = Locators.RS_PLAN_BUTTON)
    WebElement planButton;

    @FindBy(how = How.XPATH, using = Locators.RS_PLAN_CONFIRM_BUTTON)
    WebElement paymentButton;

    @FindBy(how = How.XPATH, using = Locators.RS_VISA_CARD_VALIDATOR)
    WebElement visaCardImg;

    @FindBy(how = How.XPATH, using = Locators.RS_LOW_EXEC_PLAN)
    WebElement lowExecPlan;

    @FindBy(how = How.XPATH, using = Locators.RS_PLAN_CONFIRM_BUTTON)
    WebElement planConfirmBtn;

    public ModifyPlanPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void changePlan() {
        System.out.print("Looking for Avatar icon ");
        if(rsAvatarBtn.isDisplayed()) {
            System.out.println(": FOUND");
            this.rsAvatarBtn.click();
        } else {
            System.out.println(": NOT FOUND");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Looking for Account Settings ");
        if( accountSettings.isDisplayed()) {
            System.out.println(": FOUND");
            accountSettings.click();
        } else {
            System.out.println(": NOT FOUND");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print( "Looking for Payment Method image ");
        if(paymentButton.isDisplayed()) {
            System.out.println(": FOUND");
            paymentButton.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        System.out.print( "Looking for Visa Card Image ");
        if(visaCardImg.isDisplayed()) {
            System.out.println(": FOUND");
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        System.out.print( "Looking for plan Button ");
        if(planButton.isDisplayed()) {
            System.out.println(": FOUND");
            this.planButton.click();
        } else {
            System.out.println(": NOT FOUND");
            System.exit(-1);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.lowExecPlan.click();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Confirming plan");
        this.planConfirmBtn.click();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Double check confirm plan");
        this.planConfirmBtn.click();
        System.out.println("The plan has been changed successfully");
    }
}
