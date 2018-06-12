package flows;

import org.testng.annotations.Test;
import test.BaseTest;

public class ContactuallyFlows extends BaseTest {

    @Test
    public boolean contactuallyCredentialsFlow(String data) throws InterruptedException {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.enterToken(data);
        inputCredentialsPage.clickOnVerifyButton();
        inputCredentialsPage.clickOnClose();
        credentialsPage.clickOnNextButton();
        return true;
    }
}