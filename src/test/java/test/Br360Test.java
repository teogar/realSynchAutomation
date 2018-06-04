package test;

import org.testng.annotations.Test;
import utils.Flows.BasicFlows;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;

public class Br360Test extends BasicFlows {

    /**
     * Desription: Choose Br360 as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602SalesForceAsDraft() throws InterruptedException {
        System.out.println("Br360 vs SalesForce saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("SalesForce");
        saveSynchAsDraft();
        logout();
    }

    /**
     * Desription: Choose Br360 as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602FollowupbossAsDraft() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("FollowUpBoss");
        saveSynchAsDraft();
        logout();
    }

    /**
     * Desription: Choose Br360 as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602ContactuallyAsDraft() throws InterruptedException {
        System.out.println("Br360 vs Contactually saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("Contactually");
        saveSynchAsDraft();
        logout();
    }

    /**
     * Desription: Choose Br360 as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void Br3602BoomTownAsDraft() throws InterruptedException {
        System.out.println("Br360 vs BoomTown saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("BoomTown");
        saveSynchAsDraft();
        logout();
    }
}
