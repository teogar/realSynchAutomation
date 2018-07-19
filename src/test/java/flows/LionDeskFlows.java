package flows;

import test.BaseTest;

public class LionDeskFlows extends BaseTest {

    public boolean lionDeskCredentialsFlow() throws Exception{
        System.out.println("The Lion Desk credentials flow : Sart");
        Thread.sleep(3000);
        lionDeskPage.lionDeskReuseCreds();
        inputCredentialsPage.clickOnClose();
        credentialsPage.clickOnNextButton();
        Thread.sleep(5000);
        //sierraInteractivePage.sierraActivateAction();
        return  true;
    }



}
