package flows;

import org.testng.annotations.Test;
import test.BaseTest;

import static utils.Properties.FOLLOW_UP_BOSS_API_KEY;

public class FollowUpBossFlows extends BaseTest {

    @Test
    public boolean followUpBossCredentialsFlow(String APIKey) throws InterruptedException {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.enterToken(FOLLOW_UP_BOSS_API_KEY);
        inputCredentialsPage.clickOnVerifyButton();
        inputCredentialsPage.clickOnClose();
        credentialsPage.clickOnNextButton();
        return true;
    }
}
