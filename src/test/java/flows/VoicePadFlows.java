package flows;

import test.BaseTest;

public class VoicePadFlows extends BaseTest {

    public boolean voicePadCredentials(String ID) {
        credentialsPage.clickOnSourceInputButton();
        inputCredentialsPage.enterClientId(ID);
        inputCredentialsPage.clickOnClose();
        return true;
    }
}
