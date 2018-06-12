package test;

import flows.BasicFlows;
import flows.Br360Flows;
import flows.FollowUpBossFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.RealSynch;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;
import static utils.Properties.BR360_ID;
import static utils.Properties.FOLLOW_UP_BOSS_API_KEY;
import static utils.SourceTarget.BOOMTOWN;
import static utils.SourceTarget.BR360;
import static utils.SourceTarget.CONTACTUALLY;
import static utils.SourceTarget.FOLLOWUPBOSS;
import static utils.SourceTarget.SALESFROCE;

@Listeners(RealSynch.class)
public class Br360Test extends BasicFlows {

    Br360Flows br360Flows = new Br360Flows();

    /**
     * Desription: Choose Br360 as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602SalesForceAsDraftTest() throws InterruptedException {
        System.out.println("Br360 vs SalesForce saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602FollowupbossAsDraftTest() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602ContactuallyAsDraftTest() throws InterruptedException {
        System.out.println("Br360 vs Contactually saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * RESY-754: BR360 - FUB NO CREDENTIALS SAVED AS DRAFT
     */
    @Test(groups = "unit 1")
    public void Br3602BoomTownAsDraftTest() throws InterruptedException {
        System.out.println("Br360 vs BoomTown saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * RESY-756: BR360 - FUB W CREDENTIALS VERIFIED SAVED AS DRAFT
     */
    @Test
    public void Br3602FollowUpBossWCredentialsVerifiedAsDraftTest() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss W credentials verified & saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(FOLLOWUPBOSS);
        br360Flows.br360CredentialsFlow(BR360_ID);
        FollowUpBossFlows FUB = new FollowUpBossFlows();
        FUB.followUpBossCredentialsFlow(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Choose Br360 as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602SalesForceAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("Br360 vs SalesForce saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602FollowupbossAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602ContactuallyAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("Br360 vs Contactually saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602BoomTownAsDraftShowVerificationInstructionsTest() throws InterruptedException {
        System.out.println("Br360 vs BoomTown saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(BR360);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }
}
