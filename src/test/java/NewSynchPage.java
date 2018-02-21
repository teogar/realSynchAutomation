

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

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

    public NewSynchPage(WebDriver driver){
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);

    }

    public void createNewSynch(){

        /**
         * Display Verification for Static Elements
         */

        if(newSynchBtn.isDisplayed()){
            System.out.println("Click on +Synch");
        }else{
            System.out.println(("Unable to Click"));
            System.exit(-1);
        }

        this.newSynchBtn.click();

        /**
         * This is a wait for Loading Objects
         */

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        /**
         * Display Verification for Static Elements
         */

        if(voicePad.isDisplayed()){
            System.out.println("The VoicePad App is displayed");
        }else{
            System.out.println("Elements are not Displayed");
            System.exit(-1);
        }

        /**
         * Click on VoicePad App and Next button
         */

        this.voicePad.click();
        this.nextButton.click();

        /**
         * Wait Till all Elements are Loaded
         */

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        /**
         * Verifying if SalesForce App is Clickable
         */

        if(propertyBase.isDisplayed()){
            System.out.println("The SalesForce App is Clickable");
        }else{
            System.out.println("Not Clickable");
            System.exit(-1);
        }

        /**
         * Verifying if Next Button is Clickable
         */

        if(nextButton.isDisplayed()){
            System.out.println("Next Button is Clickable");
        }else{
            System.out.println("Next Button is not Clickable");
            System.exit(-1);

        }

        /**
         * Clicking on SalesForce App and Next Button
         */

        this.propertyBase.click();

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.nextButton.click();

    }

}
