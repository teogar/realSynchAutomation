package test;

import org.testng.annotations.Test;

import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USER;
import static utils.Properties.REAL_SYNCH_FORGOT_PWD;
import static utils.Properties.REGISTRATION_CONFIRM;
import static utils.Properties.REGISTRATION_LAST_NAME;
import static utils.Properties.REGISTRATION_MAIL;
import static utils.Properties.REGISTRATION_NAME;
import static utils.Properties.REGISTRATION_PASSWORD;
import static utils.Properties.SALES_FORCE_CREDENTIAL;
import static utils.Properties.SALES_FORCE_PWD;
import static utils.Properties.SALES_FORCE_TOKEN;
import static utils.Properties.VOICE_PAD_CLIENT_ID;

public class RealSynchTest extends BaseTest {

/**
    @Test(groups = {"unit 8"})
    public void actSynchVoicePad2REalgeek() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.activateSynch();
        super.VoicePad();
        super.Realgeek();
        logout();
    }

    @Test(groups = {"unit 9"})
    public void actSynchBr360Pad2REalgeek() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.activateSynch();
        super.Br360();
        super.Realgeek();
        logout();
    }

    //Deprecated
     @Test(groups = {"unit 8"})
     public void actSynch() {
     super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
     super.activateSynchPage.activateSynch();
     super.logoutPage.logOut();
     }

    **/

    @Test(groups = "unit 1")
    public void signUpRealSynchTest() {
        System.out.println("INITIALIAZED PLAN SELECTION AND USER REG.");
        super.realSRegisterPage.realRegistration(REGISTRATION_NAME, REGISTRATION_LAST_NAME, REGISTRATION_MAIL,
                REGISTRATION_PASSWORD, REGISTRATION_CONFIRM);
    }

    @Test(groups = "unit 2")
    public void login() {
        super.loginPage.logElements();
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
    }

    @Test(groups = "unit 3")
    public void syncCreationVoicePad2SalesFroceTest() {
        System.out.println("REAL SYNCH CI PIPELINE");
        super.loginPage.logElements();
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        System.out.println(driver.getTitle());
        super.newSynchPage.createNewSynch();
        super.voicePadPage.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        super.salesForcePage.salesForceCredentials(SALES_FORCE_CREDENTIAL, SALES_FORCE_PWD, SALES_FORCE_TOKEN);
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 4"})
    public void passwordRecoveryRealSynchTest() {
        super.forgotPasswordPage.pswRecovery();
        super.forgotPasswordPage.sendPwd(REAL_SYNCH_FORGOT_PWD);
    }

    @Test(groups ={"unit 5"})
    public  void logOutFlow() {
        super.loginPage.logElements();
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 6"})
    public void deactivateSynch() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.deactivateSynchPage.deactivateSynch();
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 7"})
    public void modifyPlan() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.modifyPlanPage.changePlan();
        super.logoutPage.logOut();
    }

    @Test(groups ={"unit 9"})
    public  void syncCreationShowCase2FUBTest() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.showCasePage.sdIx();
        super.logoutPage.logOut();

    }

    @Test(groups = {"unit 10"})
    public void syncCreationsVoicePad2SalesForceTest() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.voicePadPage.voicePad();
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 11"})
    public void RSModifyPassword() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.dashboard.changePassword();
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 12"})
    public void RS_EditAccountInfo() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.dashboard.editAccountInfo();
        super.logoutPage.logOut();
    }

    @Test(groups = {"unit 13"})
    public void RS_SaveSyncAsDraft() {
        super.loginPage.Login(AUTOMATION_USER, AUTOMATION_PASSWORD);
        super.newSynchPage.saveSyncAsDraft();
        super.logoutPage.logOut();
    }
}
