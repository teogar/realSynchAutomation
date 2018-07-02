package flows;
import test.BaseTest;



public class SierraInteractiveFlows extends BaseTest {

    public boolean sierraInteractiveCredentialsFlows()  {
        wizardPage.clickOnSierraLogo();
        sierraInteractivePage.sierraCredentials();
        inputCredentialsPage.clickOnClose();
        credentialsPage.clickOnNextButton();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        sierraInteractivePage.sierraActivateAction();
        return true;
    }
}
