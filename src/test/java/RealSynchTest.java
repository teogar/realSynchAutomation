
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
        System.out.println("INITIALIAZED PLAN SELECTION AND USER REG.");
        super.realSRegisterPage.realRegistration("Alan", "Walker", "pete5@yopmail.com", "4444lola!!!!", "4444lola!!!!");
    }

    /**
     * This Test shows that is Possible To Perform a Login
     * and Shows that the Login Elements are Displayed and-
     * -receiving events.
     */


    @Test(groups = "unit 2")
    public void login(){
        super.loginPage.logElements();
        super.loginPage.signIn("pete222@yopmail.com", "4444lola!!!");

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
        super.loginPage.signIn("pete222@yopmail.com", "4444lola!!!");
        System.out.println(driver.getTitle());
        super.newSynchPage.createNewSynch();
        super.voicePadPage.voicePadCredentials("127", "twersdfeqwr", "garaseqweas");
        super.salesForcePage.salesForceCredentials("hmarin@itexico.net.rsbxv1", "Tgar$ia2018", "zNI1ISNV5Jx0cndV8plhuwZp");
        super.logoutPage.logOut();
        //super.propertyBasePage.propertyBase("AlfaGuarda", "2354567");

    }

    /**
     * This Test Suite performs the "Change your password" functionality
     */

    @Test(groups = {"unit 4"})
    public void rsPswRecovery(){
        super.forgotPasswordPage.pswRecovery();
        super.forgotPasswordPage.sendPwd("pete696@yopmail.com");

    }

    @Test(groups ={"unit 5"})
    public  void logOutFlow(){
        super.loginPage.logElements();
        super.loginPage.signIn("pete222@yopmail.com", "4444lola!!!");
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 6"})
    public void deactivateSynch(){
        super.loginPage.signIn("pete222@yopmail.com", "4444lola!!!");
        super.deactivateSynchPage.deactivateSynch();
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 7"})
    public void modifyPlan(){
        super.loginPage.signIn("pete222@yopmail.com", "4444lola!!!");
        super.modifyPlanPage.changePlan();
        super.logoutPage.logOut();
    }

}
