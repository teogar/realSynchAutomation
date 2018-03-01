
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.given;

public class RealSynchTest extends BaseTest {

    /**
     * This Method Will Perform an User Registration For Real Synch.
     * Negative test with White Spaces "tabs, space bar etc."
     */

    @Test(groups = "unit 1")

    public void reg(){
        super.realSRegisterPage.realRegistration("Alan", "Walker", "pete2@yopmail.com", "4444lola!!!!", "4444lola!!!!");
    }

    /**
     * This Test shows that is Possible To Perform a Login
     * and Shows that the Login Elements are Displayed and-
     * -receiving events.
     */


    @Test(groups = "unit 2")
    public void login(){
        super.loginPage.logElements();
        super.loginPage.signIn("pete111@yopmail.com", "4444lola!!");

    }

    /**
     * This Test Suite shows and Verifies that it is Possible-
     * -to Perform a Full New Synch. In addition Verifies if the connection to the Dev environment-
     * -Is 200 Ok (Receiving DOM) E2E testing
     */

    @Test(groups = "unit 3")
    public void rsE2E(){
        System.out.println("REAL SYNCH CI PIPELINE");
        super.loginPage.logElements();
        super.loginPage.signIn("pete2@yopmail.com", "4444lola!!!!");
        System.out.println(driver.getTitle());
        super.newSynchPage.createNewSynch();
        super.voicePadPage.voicePadCredentials("12341234", "twersdfeqwr", "garaseqweas");
        super.salesForcePage.salesForceCredentials("laura@beerhometeam.com.sandbox2\n", "Hannah@19915\n", "eErZHMvUZLIRrs48CcQ2EOge9");
        //super.propertyBasePage.propertyBase("AlfaGuarda", "2354567");

    }

    /**
     * This Test Suite performs the "Change your password" functionality
     */

    @Test(groups = {"unit_4"})
    public void rsPswRecovery(){
        super.forgotPasswordPage.pswRecovery();
        super.forgotPasswordPage.sendPwd("pete696@yopmail.com");

    }

}
