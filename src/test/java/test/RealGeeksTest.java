package test;

import flows.BasicFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.RealSynch;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;
import static utils.SourceTarget.BOOMTOWN;
import static utils.SourceTarget.CONTACTUALLY;
import static utils.SourceTarget.FOLLOWUPBOSS;
import static utils.SourceTarget.REALGEEKS;
import static utils.SourceTarget.SALESFROCE;

@Listeners(RealSynch.class)
public class RealGeeksTest extends BasicFlows {
    /**
     * Desription: Choose RealGeeks as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2SalesForceAsDraftTest() throws InterruptedException {
        System.out.println("RealGeeks vs SalesForce saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftFlow();
    }

    /**
     * Desription: Choose RealGeeks as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2FollowUpBossAsDraftTest() throws InterruptedException {
        System.out.println("RealGeeks vs FollowUpBoss saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2ContactuallyAsDraftTest() throws InterruptedException {
        System.out.println("RealGeeks vs Contactually saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2BoomTownAsDraftTest() throws InterruptedException {
        System.out.println("RealGeeks vs BoomTown saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose RealGeeks as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2SalesForceAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("RealGeeks vs SalesForce saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose RealGeeks as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2FollowUpBossAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("RealGeeks vs FollowUpBoss saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2ContactuallyAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("RealGeeks vs Contactually saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2BoomTownAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("RealGeeks vs BoomTown saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(REALGEEKS);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }
}
