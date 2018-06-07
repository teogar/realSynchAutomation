package test;

import org.testng.annotations.Test;
import flows.BasicFlows;

import static page.DashBoardPage.clickOnAddNewSynchButton;
import static utils.Properties.AUTOMATION_PASSWORD;
import static utils.Properties.AUTOMATION_USERNAME;
import static utils.SourceTarget.BOOMTOWN;
import static utils.SourceTarget.CONTACTUALLY;
import static utils.SourceTarget.FOLLOWUPBOSS;
import static utils.SourceTarget.REALGEEKS;
import static utils.SourceTarget.SALESFROCE;

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
        selectSource(REALGEEKS);
        selectTarget(SALESFROCE);
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
        selectSource(REALGEEKS);
        selectTarget(FOLLOWUPBOSS);
        saveSynchAsDraft();
        logout();
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
        selectSource(REALGEEKS);
        selectTarget(CONTACTUALLY);
        saveSynchAsDraft();
        logout();
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
        selectSource(REALGEEKS);
        selectTarget(BOOMTOWN);
        saveSynchAsDraft();
        logout();
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
        selectSource(REALGEEKS);
        selectTarget(SALESFROCE);
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
        selectSource(REALGEEKS);
        selectTarget(FOLLOWUPBOSS);
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
        selectSource(REALGEEKS);
        selectTarget(CONTACTUALLY);
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
        selectSource(REALGEEKS);
        selectTarget(BOOMTOWN);
        saveSynchAsDraftDisplayingVerificationsInstructions();
        logout();
    }
}
