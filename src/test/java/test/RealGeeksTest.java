package test;

import org.testng.annotations.Test;
import utils.Properties;

public class RealGeeksTest extends BaseTest{
    @Test(groups = "RealGeeks.SaveDraftWithSalesForce")
    public void SaveDraftWithSalesForce(){
        System.out.println("Init 'RealGeeks.SaveDraftWithSalesForce' test");
        try {
            super.loginpage.sendUsername(Properties.AUTOMATION_USERNAME);
            super.loginpage.sendPassword(Properties.AUTOMATION_PASSWORD);
            super.loginpage.clickOnSubmitButton();


        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
    @Test(groups = "RealGeeks.SaveDraftWithFollowUpBoss")
    public void SaveDraftWithFollowUpBoss(){
        System.out.println("Init 'RealGeeks.SaveDraftWithFollowUpBoss' test");
    }
    @Test(groups = "RealGeeks.SaveDraftWithContactually")
    public void SaveDraftWithContactually(){
        System.out.println("Init 'RealGeeks.SaveDraftWithContactually' test");
    }
    @Test(groups = "RealGeeks.SaveDraftWithBoomTown")
    public void SaveDraftWithBoomTown(){
        System.out.println("Init 'RealGeeks.SaveDraftWithBoomTown' test");
    }

    @Test(groups = "RealGeeks.ActiveSynchMissingCredentials")
    public void ActiveSynchMissingCredentials(){
        System.out.println("Init 'RealGeeks.ActiveSynchMissingCredentials' test");
    }

}

