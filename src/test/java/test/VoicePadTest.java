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
import static utils.SourceTarget.*;

@Listeners(RealSynch.class)
public class VoicePadTest extends BasicFlows {

    VoicePadFlows voicePadFlows = new VoicePadFlows();

    /**
     * Desription: Choose VoicePad as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceAsDraftTest() throws InterruptedException {
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
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(BOOMTOWN);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        BoomTownFlows boomTownFlows = new BoomTownFlows();
        assertTrue(boomTownFlows.boomTownCredentialsFlows(BOOM_TOWN_EMAIL, BOOM_TOWN_PWD));
        saveSynchAsDraftDisplayingVerificationsInstructionsFlow();
    }

    /**
     * Description: Add a New Synch with VoicePad as source
     * and SierraInteractive as target fill the credentials
     * and verify the target ones and Activate the Synch
     */
    @Test(groups = "VP to SierraI")
    public void voicePadToSierraInteractive() {
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        selectTargetFlow(SIERRAINTERACTIVE);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        System.out.println("VoicePad to Sierra Synch creation and activation : START");
        sierraInteractiveFlows.sierraInteractiveCredentialsFlows();
    }

    /**
     * Description; Add a new Synch with VoicePad as Source
     * and LionDesk as Target fill the credentials
     * and Verify the target ones 
     *
     */
    @Test(groups = "VP to LionDesk")
    public void voicePadToLionDesk() throws Exception {
        loginFlow(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSourceFlow(VOICEPAD);
        Thread.sleep(3000);
        selectTargetFlow(LIONDESK);
        voicePadFlows.voicePadCredentialsFlow(VOICE_PAD_CLIENT_ID);
        lionDeskFlows.lionDeskCredentialsFlow();
    }

}
