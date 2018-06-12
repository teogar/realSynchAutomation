package test;

import flows.BasicFlows;
import flows.Br360Flows;
import flows.FollowUpBossFlows;
import org.testng.annotations.Test;

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

public class Br360Test extends BasicFlows {

    Br360Flows br360Flows = new Br360Flows();

    /**
     * Desription: Choose Br360 as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602SalesForceAsDraft() throws InterruptedException {
        System.out.println("Br360 vs SalesForce saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(SALESFROCE);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602FollowupbossAsDraft() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(FOLLOWUPBOSS);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602ContactuallyAsDraft() throws InterruptedException {
        System.out.println("Br360 vs Contactually saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(CONTACTUALLY);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * RESY-754: BR360 - FUB NO CREDENTIALS SAVED AS DRAFT
     */
    @Test(groups = "unit 1")
    public void Br3602BoomTownAsDraft() throws InterruptedException {
        System.out.println("Br360 vs BoomTown saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(BOOMTOWN);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * RESY-756: BR360 - FUB W CREDENTIALS VERIFIED SAVED AS DRAFT
     */
    @Test
    public void Br3602FollowUpBossWCredentialsVerifiedAsDraft() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss W credentials verified & saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(FOLLOWUPBOSS);
        br360Flows.br360Credentials(BR360_ID);
        FollowUpBossFlows FUB = new FollowUpBossFlows();
        FUB.followUpBossCredentials(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraft();
        logoutFLow();
    }

    /**
     * Description: Choose Br360 as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602SalesForceAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs SalesForce saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(SALESFROCE);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602FollowupbossAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(FOLLOWUPBOSS);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602ContactuallyAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs Contactually saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(CONTACTUALLY);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logoutFLow();
    }

    /**
     * Desription: Choose Br360 as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602BoomTownAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs BoomTown saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(BR360);
        selectTarget(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logoutFLow();
    }
}
