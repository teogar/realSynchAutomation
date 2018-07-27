package flows;

import test.BaseTest;

public class VoicePadFlows extends BaseTest {

    public boolean voicePadCredentialsFlow(String ID, String WSID) {
        credentialsPage.clickOnSourceInputButton();
        inputCredentialsPage.enterClientId(ID);
        inputCredentialsPage.enterWesiteId(WSID);
        inputCredentialsPage.clickOnClose();

        return true;
    }
}
