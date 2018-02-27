

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.Locators;

public class PropertyBasePage extends BaseTest {

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = Locators.RS_NEXT_BUTTON)
    WebElement nextButton;

    @FindBy(how = How.XPATH,using = "//input[@name=\"username\"]")
    WebElement propertyBaseUserName;

    @FindBy(how = How.XPATH,using = "//input[@name=\"password\"]")
    WebElement propertyBasePsw;

    @FindBy(how = How.XPATH, using = Locators.FINISH_BTN)
    WebElement finishBtn;

    @FindBy(how = How.XPATH, using = Locators.TARGET_CREDETIALS_BUTTON)
    WebElement pBaseInputCed;

    @FindBy(how = How.XPATH, using = "//button[@class=\"primary-button rs-md-font\"]")
    WebElement ppCloseBtn;

    @FindBy(how = How.XPATH, using = "//button[@type=\"button\"]")
    WebElement configButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text() , \"Save\")]")
    WebElement savebutton;



    public PropertyBasePage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }

    public void propertyBase(String pBUser, String pBpsw){



        this.pBaseInputCed.click();


        this.propertyBaseUserName.clear();
        this.propertyBaseUserName.sendKeys(pBUser);
        this.propertyBasePsw.clear();
        this.propertyBasePsw.sendKeys(pBpsw);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.ppCloseBtn.click();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.nextButton.click();


        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        if(configButton.isEnabled()){
            this.configButton.click();
        }else{
            System.out.println("The Config Button is Unclickable");
            System.exit(-1);
        }

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.savebutton.click();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        this.finishBtn.click();

    }

}