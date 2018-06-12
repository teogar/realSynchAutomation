package test;

import flows.BasicFlows;
import org.testng.annotations.Test;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;
import static utils.SourceTarget.BOOMTOWN;
import static utils.SourceTarget.CONTACTUALLY;
import static utils.SourceTarget.FOLLOWUPBOSS;
import static utils.SourceTarget.SALESFROCE;
import static utils.SourceTarget.SIDX;

public class SiDxTest extends BasicFlows {
    /**
     * Description: Choose SiDx as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2SalesForceAsDraft() throws InterruptedException {
        System.out.println("SiDx vs SalesForce saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(SALESFROCE);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2FollowUpBossAsDraft() throws InterruptedException {
        System.out.println("SiDx vs FollowUpBoss saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(FOLLOWUPBOSS);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2ContactuallyAsDraft() throws InterruptedException {
        System.out.println("SiDx vs Contactually saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(CONTACTUALLY);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2BoomTownAsDraft() throws InterruptedException {
        System.out.println("SiDx vs BoomTown saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(BOOMTOWN);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * Description: Choose SiDx as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2SalesForceAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("SiDx vs SalesForce saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(SALESFROCE);
        saveSynchAsDraftDisplayingVerificationsInstructions();
    }

    /**
     * Description: Choose SiDx as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2FollowUpBossAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("SiDx vs FollowUpBoss saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(FOLLOWUPBOSS);
        saveSynchAsDraftDisplayingVerificationsInstructions();
    }

    /**
     * Description: Choose SiDx as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2ContactuallyAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("SiDx vs Contactually saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(CONTACTUALLY);
        saveSynchAsDraftDisplayingVerificationsInstructions();    }

    /**
     * Description: Choose SiDx as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void SiDx2BoomTownAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("SiDx vs BoomTown saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(SIDX);
        selectTarget(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructions();    }
}
