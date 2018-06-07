package test;

import org.testng.annotations.Test;
import utils.Flows.BasicFlows;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import page.LoginPage;
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


    /**
     * Description: Choose Br360 as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602SalesForceAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs SalesForce saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("SalesForce");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose Br360 as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602FollowupbossAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs FollowUpBoss saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("FollowUpBoss");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose Br360 as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602ContactuallyAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs Contactually saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("Contactually");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose Br360 as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void Br3602BoomTownAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("Br360 vs BoomTown saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("Br360");
        selectTatrget("BoomTown");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }
}
