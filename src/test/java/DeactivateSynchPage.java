import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class DeactivateSynchPage extends BaseTest {

    public WebDriver pageDriver;


    @FindBy(how = How.XPATH, using = "//*[@id=\"10\"]/div/div[6]/i")
    WebElement elipsisButton;

    @FindBy(how = How.XPATH,using = "//*[@id=\"deactivate\"]/button")
    WebElement deactivateButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), \"OK\")]")
    WebElement confirmButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), \"Active\")]")
    WebElement activeFilter;

    @FindBy(how = How.XPATH, using = "//*[@id=\"10\"]/div/div[5]/i")
    WebElement calendarButton;



    public DeactivateSynchPage(WebDriver driver) {
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);
    }


    public void deactivateSynch(){

        if(activeFilter.isDisplayed()){
            this.activeFilter.click();
        }else{
            System.out.println("The active filter is not displayed");
            System.exit(-1);
        }

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        if(elipsisButton.isDisplayed()){
            this.elipsisButton.click();
        }else{
            System.out.println("Ths elipsis button is not displayed");
            System.exit(-1);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.deactivateButton.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.confirmButton.click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.confirmButton.click();

        if(calendarButton.isDisplayed()){
            System.out.println("The calendar button is ready show info");
        }else{
            System.out.println("The calendar button is not displayed");
            System.exit(-1);
        }

        this.activeFilter.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.calendarButton.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
