package flows;

import org.testng.annotations.Test;
import test.BaseTest;

public class ContactuallyFlows extends BaseTest {

    @Test
    public boolean contactuallyCredentials(String data) throws InterruptedException {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.enterToken(data);
        inputCredentialsPage.clickOnVerifyButton();
        inputCredentialsPage.clickOnClose();
        credentialsPage.clickOnNextButton();
        return true;
    }
}