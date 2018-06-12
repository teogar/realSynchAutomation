package test;

import org.testng.annotations.Test;
import flows.BasicFlows;
import flows.BoomTownFlows;
import flows.ContactuallyFlows;
import flows.FollowUpBossFlows;
import flows.SalesForceFlows;
import flows.VoicePadFlows;

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


public class VoicePadTest extends BasicFlows {

    VoicePadFlows voicePadFlows = new VoicePadFlows();

    /**
     * Desription: Choose VoicePad as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(SALESFROCE);
        saveSynchAsDraft();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowupbossAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(FOLLOWUPBOSS);
        saveSynchAsDraft();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContactuallyAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs Contactually saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(CONTACTUALLY);
        saveSynchAsDraft();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(BOOMTOWN);
        saveSynchAsDraft();
        logout();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and SalesForce as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce with credentials saved as draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(SALESFROCE);
        voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        SalesForceFlows salesForceFlows = new SalesForceFlows();
        salesForceFlows.salesForceCredentials(SALES_FORCE_CREDENTIAL, SALES_FORCE_PWD, SALES_FORCE_TOKEN);
        saveSynchAsDraft();
        logout();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowUpBossWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss with credentials saved as draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(FOLLOWUPBOSS);
        voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        FollowUpBossFlows followUpBossFlows = new FollowUpBossFlows();
        followUpBossFlows.followUpBossCredentials(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraft();
        logout();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContractuallyWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs Contractually with credentials saved as draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(CONTACTUALLY);
        voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        FollowUpBossFlows followUpBossFlows = new FollowUpBossFlows();
        followUpBossFlows.followUpBossCredentials(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraft();
        logout();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown with credentials saved as draft");
        assertTrue(login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD));
        assertTrue(clickOnAddNewSynchButton());
        assertTrue(selectSource(VOICEPAD));
        assertTrue(selectTarget(BOOMTOWN));
        assertTrue(voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID));
        BoomTownFlows boomTownFlows = new BoomTownFlows();
        assertTrue(boomTownFlows.boomTownCredentials(BOOM_TOWN_EMAIL, BOOM_TOWN_PWD));
        assertTrue(saveSynchAsDraft());
        logout();
    }

    /**
     * RESY-12: Pickup a created synch with credential
     */
    @Test(groups = "no_credentials")
    public void completeVoicepad2Contactually() throws InterruptedException {
        System.out.println("complete a synch without credentials VoicePad2Contactually");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        editSynch("Draft", "VoicePad", "Contactually");
        VoicePadFlows voicePad = new VoicePadFlows();
        voicePad.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        ContactuallyFlows contactually = new ContactuallyFlows();
        contactually.contactuallyCredentials(CONTACTUALLY_API_KEY);
        scrollToElelement(ACTIVATE_BUTTON);
        bottomPage.clickOnActivateButton();
        finishPage.clickOnOKPopupButton();
    }

    @Test(groups = "with_credentials")
    public void completeVoicepad2ContactuallyCredentials() throws InterruptedException {
        System.out.println("complete a synch without credentials VoicePad2Contactually");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        editSynch("VoicePad", "no", "Contactually", "yes");
        VoicePadFlows voicePad = new VoicePadFlows();
        voicePad.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        ContactuallyFlows contactually = new ContactuallyFlows();
        contactually.contactuallyCredentials(CONTACTUALLY_API_KEY);
        scrollToElelement(ACTIVATE_BUTTON);
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
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(SALESFROCE);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowupbossAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(FOLLOWUPBOSS);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContactuallyAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs Contactually saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(CONTACTUALLY);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and SalesForce as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce with credentials saved as draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(SALESFROCE);
        voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        SalesForceFlows salesForceFlows = new SalesForceFlows();
        salesForceFlows.salesForceCredentials(SALES_FORCE_CREDENTIAL, SALES_FORCE_PWD, SALES_FORCE_TOKEN);
        saveSynchAsDraftDisplayingVerificationsInstructions();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2FollowUpBossWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs FollowUpBoss with credentials saved as draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(FOLLOWUPBOSS);
        voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        FollowUpBossFlows followUpBossFlows = new FollowUpBossFlows();
        followUpBossFlows.followUpBossCredentials(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraftDisplayingVerificationsInstructions();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2ContractuallyWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs Contractually with credentials saved as draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(CONTACTUALLY);
        voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        ContactuallyFlows contactuallyFlows = new ContactuallyFlows();
        contactuallyFlows.contactuallyCredentials(CONTACTUALLY_API_KEY);
        saveSynchAsDraftDisplayingVerificationsInstructions();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownWCredentialsAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown with credentials saved as draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource(VOICEPAD);
        selectTarget(BOOMTOWN);
        voicePadFlows.voicePadCredentials(VOICE_PAD_CLIENT_ID);
        BoomTownFlows boomTownFlows = new BoomTownFlows();
        assertTrue(boomTownFlows.boomTownCredentials(BOOM_TOWN_EMAIL, BOOM_TOWN_PWD));
        saveSynchAsDraftDisplayingVerificationsInstructions();
    }
}
