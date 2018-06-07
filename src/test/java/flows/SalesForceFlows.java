package flows;

import org.testng.annotations.Test;
import test.BaseTest;

public class SalesForceFlows extends BaseTest {

    @Test
    public boolean salesForceCredentials(String ID, String PWD, String TKN) throws InterruptedException {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.enterUser(ID);
        inputCredentialsPage.enterPassword(PWD);
        inputCredentialsPage.enterToken(TKN);
        inputCredentialsPage.selectUrl2();
        inputCredentialsPage.clickOnClose();
        Thread.sleep(300);
        credentialsPage.clickOnNextButton();
        return true;
    }
}
