package test;

import org.testng.annotations.Test;
import utils.Flows.BasicFlows;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;

public class RealGeeksTest extends BasicFlows {
    /**
     * Desription: Choose RealGeeks as source and SalesForce as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2SalesForceAsDraft() throws InterruptedException {
        System.out.println("RealGeeks vs SalesForce saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("SalesForce");
        saveSynchAsDraft();
    }

    /**
     * Desription: Choose RealGeeks as source and FollowUpBoss as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2FollowUpBossAsDraft() throws InterruptedException {
        System.out.println("RealGeeks vs FollowUpBoss saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("FollowUpBoss");
        saveSynchAsDraft();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2ContactuallyAsDraft() throws InterruptedException {
        System.out.println("RealGeeks vs Contactually saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("Contactually");
        saveSynchAsDraft();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft
     */
    @Test(groups = "unit 1")
    public void RealGeeks2BoomTownAsDraft() throws InterruptedException {
        System.out.println("RealGeeks vs BoomTown saved as Draft");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("BoomTown");
        saveSynchAsDraft();
    }

    /**
     * Desription: Choose RealGeeks as source and SalesForce as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2SalesForceAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("RealGeeks vs SalesForce saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("SalesForce");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose RealGeeks as source and FollowUpBoss as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2FollowUpBossAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("RealGeeks vs FollowUpBoss saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("FollowUpBoss");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and Contactually as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2ContactuallyAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("RealGeeks vs Contactually saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("Contactually");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }

    /**
     * Desription: Choose VoicePad as source and BoomTown as target
     * this flow saves it as draft displaying verification instructions
     */
    @Test(groups = "unit 1")
    public void RealGeeks2BoomTownAsDraftShowVerificationInstructions() throws InterruptedException {
        System.out.println("RealGeeks vs BoomTown saved as Draft displaying verification instructions");
        login(AUTOMATION_USERNAME, AUTOMATION_PASSWORD);
        clickOnAddNewSynchButton();
        selectSource("RealGeeks");
        selectTatrget("BoomTown");
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }
}
