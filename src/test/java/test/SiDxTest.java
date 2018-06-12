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
import static utils.SourceTarget.SALESFROCE;
import static utils.SourceTarget.SIDX;

@Listeners(RealSynch.class)
public class SiDxTest extends BasicFlows {
    /**
     * Description: Choose SiDx as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2SalesForceAsDraftTest() throws InterruptedException {
        System.out.println("SiDx vs SalesForce saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2FollowUpBossAsDraftTest() throws InterruptedException {
        System.out.println("SiDx vs FollowUpBoss saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2ContactuallyAsDraftTest() throws InterruptedException {
        System.out.println("SiDx vs Contactually saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2BoomTownAsDraftTest() throws InterruptedException {
        System.out.println("SiDx vs BoomTown saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2SalesForceAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("SiDx vs SalesForce saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
    }

    /**
     * Description: Choose SiDx as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2FollowUpBossAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("SiDx vs FollowUpBoss saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
    }

    /**
     * Description: Choose SiDx as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2ContactuallyAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("SiDx vs Contactually saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();    }

    /**
     * Description: Choose SiDx as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2BoomTownAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("SiDx vs BoomTown saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(SIDX);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();    }
}
