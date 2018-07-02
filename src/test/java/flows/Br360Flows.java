package flows;

import org.testng.annotations.Test;
import test.BaseTest;

public class Br360Flows extends BaseTest {
    @Test
    public boolean br360CredentialsFlow(String ID) {
        credentialsPage.clickOnSourceInputButton();
        inputCredentialsPage.enterClientId(ID);
        inputCredentialsPage.clickOnClose();
        return true;
    }
}
