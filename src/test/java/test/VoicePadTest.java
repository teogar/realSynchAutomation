package test;

import org.testng.annotations.Test;
import utils.Flows.BasicFlows;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;

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
}
