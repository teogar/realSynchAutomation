import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangeCred extends BaseTest{

    public WebDriver pageDriver;

    @FindBy(how = How.XPATH, using = "")


    public ChangeCred(WebDriver driver){
        pageDriver = driver;
        PageFactory.initElements(pageDriver, this);




        }

}
