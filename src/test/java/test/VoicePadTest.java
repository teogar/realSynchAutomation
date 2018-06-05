package test;

import org.testng.annotations.Test;
import utils.Flows.BasicFlows;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;
import static utils.Properties.BOOM_TOWN_EMAIL;
import static utils.Properties.BOOM_TOWN_PWD;
import static utils.Properties.FOLLOW_UP_BOSS_API_KEY;
import static utils.Properties.SALES_FORCE_CREDENTIAL;
import static utils.Properties.SALES_FORCE_PWD;
import static utils.Properties.SALES_FORCE_TOKEN;
import static utils.Properties.VOICE_PAD_CLIENT_ID;

public class VoicePadTest extends BasicFlows {
    /**
     * Desription: Choose VoicePad as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2SalesForceAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs SalesForce saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("VoicePad");
        selectTatrget("SalesForce");
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
        selectSource("VoicePad");
        selectTatrget("FollowUpBoss");
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
        selectSource("VoicePad");
        selectTatrget("Contactually");
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
        selectSource("VoicePad");
        selectTatrget("BoomTown");
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
        selectSource("VoicePad");
        selectTatrget("SalesForce");
        voicePadCredentials(VOICE_PAD_CLIENT_ID);
        salesForceCredentials(SALES_FORCE_CREDENTIAL, SALES_FORCE_PWD, SALES_FORCE_TOKEN);
        saveSynchAsDraft();
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
        selectSource("VoicePad");
        selectTatrget("FollowUpBoss");
        voicePadCredentials(VOICE_PAD_CLIENT_ID);
        followUpBossCredentials(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraft();
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
        selectSource("VoicePad");
        selectTatrget("Contractually");
        voicePadCredentials(VOICE_PAD_CLIENT_ID);
        followUpBossCredentials(FOLLOW_UP_BOSS_API_KEY);
        saveSynchAsDraft();
    }

    /**
     * Description: Add new Synch, VoicePad as source
     * and FollowUpBoss as target, fill out Credentials
     * & save it as Draft
     */
    @Test(groups = "unit 1")
    public void VoicePad2BoomTownWCredentialsAsDraft() throws InterruptedException {
        System.out.println("VoicePad vs BoomTown with credentials saved as draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("VoicePad");
        selectTatrget("BoomTown");
        voicePadCredentials(VOICE_PAD_CLIENT_ID);
        boomTownCredentials(BOOM_TOWN_EMAIL, BOOM_TOWN_PWD);
        saveSynchAsDraft();
    }
}
