package test;

import flows.BasicFlows;
import flows.BoomTownFlows;
import flows.ContactuallyFlows;
import flows.FollowUpBossFlows;
import flows.SalesForceFlows;
import flows.VoicePadFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.RealSynch;

import static locator.BottomLocator.ACTIVATE_BUTTON;
import static org.testng.Assert.assertTrue;
import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;
import static utils.Properties.BOOM_TOWN_EMAIL;
import static utils.Properties.BOOM_TOWN_PWD;
import static utils.Properties.CONTACTUALLY_API_KEY;
import static utils.Properties.FOLLOW_UP_BOSS_API_KEY;
import static utils.Properties.SALES_FORCE_CREDENTIAL;
import static utils.Properties.SALES_FORCE_PWD;
import static utils.Properties.SALES_FORCE_TOKEN;
import static utils.Properties.VOICE_PAD_CLIENT_ID;
import static utils.SourceTarget.BOOMTOWN;
import static utils.SourceTarget.CONTACTUALLY;
import static utils.SourceTarget.FOLLOWUPBOSS;
import static utils.SourceTarget.SALESFROCE;
import static utils.SourceTarget.VOICEPAD;

@Listeners(RealSynch.class)
public class VoicePadTest extends BasicFlows {

    VoicePadFlows voicePadFlows = new VoicePadFlows();

    /**
     * Desription: Choose VoicePad as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceAsDraftTest() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowupbossAsDraftTest() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContactuallyAsDraftTest() throws InterruptedException {
        System.out.println("VoicePad vs Contactually saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown saved as Draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and SalesForce as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce with credentials saved as draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(SALESFROCE);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        SalesForceFlows salesForceFlows = new SalesForceFlows();
        salesForceFlows.salesForceCredentialsFlow(SALES_FORCE_CREDENTIAL, SALES_FORCE_PWD, SALES_FORCE_TOKEN);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowUpBossWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss with credentials saved as draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(FOLLOWUPBOSS);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        FollowUpBossFlows followUpBossFlows = new FollowUpBossFlows();
        followUpBossFlows.followUpBossCredentialsFlow(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContractuallyWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs Contractually with credentials saved as draft");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(CONTACTUALLY);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        FollowUpBossFlows followUpBossFlows = new FollowUpBossFlows();
        followUpBossFlows.followUpBossCredentialsFlow(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraftFlow();
        logoutFLow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown with credentials saved as draft");
        assertTrue(loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD));
        assertTrue(clickOnAddNewSynchButton());
        assertTrue(selectSourceFlow(VOICEPAD));
        assertTrue(selectTargetFlow(BOOMTOWN));
        assertTrue(voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID));
        BoomTownFlows boomTownFlows = new BoomTownFlows();
        assertTrue(boomTownFlows.boomTownCredentialsFlows(BOOM_TOWN_EMAIL, BOOM_TOWN_PWD));
        assertTrue(saveSynchAsDraftFlow());
        logoutFLow();
    }

    /**
     * RESY-12: Pickup a created synch with credential
     */
    @Test(groups = "no_credentials")
    public void completeVoicepad2Contactually() throws InterruptedException {
        System.out.println("complete a synch without credentials VoicePad2Contactually");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        editSynchFlow("Draft", "VoicePad", "Contactually");
        VoicePadFlows voicePad = new VoicePadFlows();
        voicePad.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        ContactuallyFlows contactually = new ContactuallyFlows();
        contactually.contactuallyCredentialsFlow(CONTACTUALLY_API_KEY);
        scrollToElelementFlow(ACTIVATE_BUTTON);
        bottomPage.clickOnActivateButton();
        finishPage.clickOnOKPopupButton();
    }

    @Test(groups = "with_credentials")
    public void completeVoicepad2ContactuallyCredentials() throws InterruptedException {
        System.out.println("complete a synch without credentials VoicePad2Contactually");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        editSynchFlow("VoicePad", "no", "Contactually", "yes");
        VoicePadFlows voicePad = new VoicePadFlows();
        voicePad.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        ContactuallyFlows contactually = new ContactuallyFlows();
        contactually.contactuallyCredentialsFlow(CONTACTUALLY_API_KEY);
        scrollToElelementFlow(ACTIVATE_BUTTON);
        bottomPage.clickOnActivateButton();
        finishPage.clickOnOKPopupButton();
    }

    //_________________________________________________________________________

    /**
     * Desription: Choose VoicePad as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(SALESFROCE);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowupbossAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(FOLLOWUPBOSS);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContactuallyAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs Contactually saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(CONTACTUALLY);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown saved as Draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
        logoutFLow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and SalesForce as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce with credentials saved as draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(SALESFROCE);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        SalesForceFlows salesForceFlows = new SalesForceFlows();
        salesForceFlows.salesForceCredentialsFlow(SALES_FORCE_CREDENTIAL, SALES_FORCE_PWD, SALES_FORCE_TOKEN);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowUpBossWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss with credentials saved as draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(FOLLOWUPBOSS);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        FollowUpBossFlows followUpBossFlows = new FollowUpBossFlows();
        followUpBossFlows.followUpBossCredentialsFlow(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContractuallyWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs Contractually with credentials saved as draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(CONTACTUALLY);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        ContactuallyFlows contactuallyFlows = new ContactuallyFlows();
        contactuallyFlows.contactuallyCredentialsFlow(CONTACTUALLY_API_KEY);
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown with credentials saved as draft displaying verification instructions");
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(BOOMTOWN);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        BoomTownFlows boomTownFlows = new BoomTownFlows();
        assertTrue(boomTownFlows.boomTownCredentialsFlows(BOOM_TOWN_EMAIL, BOOM_TOWN_PWD));
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
    }
}
