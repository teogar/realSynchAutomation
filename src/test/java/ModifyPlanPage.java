import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

public class ModifyPlanPage  extends BaseTest{

public WebDriver pageDriver;


    @FindBy(how = How.XPATH, using = Locators.RS_AVATAR_BUTTON)
    WebElement rsAvatarBtn;

    @FindBy(how = How.XPATH, using = Locators.RS_ACCOUNT_SET_BUTTON)
    WebElement accountSettings;

    @FindBy(how = How.XPATH, using = Locators.RS_PLAN_BUTTON)
    WebElement planButton;

    @FindBy(how = How.XPATH, using = Locators.RS_VISA_CARD_VALIDATOR)
    WebElement visaCardImg;

    @FindBy(how = How.XPATH, using = Locators.RS_LOW_EXEC_PLAN)
    WebElement lowExecPlan;

    @FindBy(how = How.XPATH, using = Locators.RS_PLAN_CONFIRM_BUTTON)
    WebElement planConfrimBtn;

    public ModifyPlanPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void changePlan(){

        this.rsAvatarBtn.click();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.accountSettings.click();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        if(visaCardImg.isDisplayed()){
            System.out.println("The payment method is defined");
        }else{
            System.out.println("The payment method is defiend and can't continue");
            System.exit(-1);
        }

        this.planButton.click();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.lowExecPlan.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.planConfrimBtn.click();

        try{
            Thread.sleep(7000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.planConfrimBtn.click();
        System.out.println("The plan has been changed successfully");

    }

}
