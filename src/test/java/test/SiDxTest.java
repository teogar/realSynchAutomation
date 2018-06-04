package test;

import org.testng.annotations.Test;
import utils.Flows.BasicFlows;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;
import static utils.Properties.SALES_FORCE_CREDENTIAL;
import static utils.Properties.SALES_FORCE_PWD;
import static utils.Properties.SALES_FORCE_TOKEN;
import static utils.Properties.VOICE_PAD_CLIENT_ID;

public class SiDxTest extends BasicFlows {
    /**
     * Desription: Choose SiDx as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2SalesForceAsDraft() throws InterruptedException {
        System.out.println("SiDx vs SalesForce saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("SiDx");
        selectTatrget("SalesForce");
        saveSynchAsDraft();
    }

    /**
     * Desription: Choose SiDx as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2FollowUpBossAsDraft() throws InterruptedException {
        System.out.println("SiDx vs FollowUpBoss saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("SiDx");
        selectTatrget("FollowUpBoss");
        saveSynchAsDraft();
    }

    /**
     * Desription: Choose SiDx as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2ContactuallyAsDraft() throws InterruptedException {
        System.out.println("SiDx vs Contactually saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("SiDx");
        selectTatrget("Contactually");
        saveSynchAsDraft();
    }

    /**
     * Desription: Choose SiDx as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void SiDx2BoomTownAsDraft() throws InterruptedException {
        System.out.println("SiDx vs BoomTown saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("SiDx");
        selectTatrget("BoomTown");
        saveSynchAsDraft();
    }
}
