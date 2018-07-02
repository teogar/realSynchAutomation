package flows;

import page.BoomTownPage;
import test.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class BoomTownFlows extends BaseTest {

    public boolean boomTownCredentialsFlows(String mail, String pwd) {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.clickOnVerifyButton();
        Set<String> st= driver.getWindowHandles();
        Iterator<String> it = st.iterator();
        String parent =  it.next();
        String child =it.next();
        //swtich to parent
        System.out.println("Now switching to parent window");
        driver.switchTo().window(child);
        System.out.println(driver.getCurrentUrl());
        BoomTownPage boomTown = new BoomTownPage(driver);
        boomTown.enterEmail(mail);
        boomTown.enterPassword(pwd);
        boomTown.clickOnLogin();
        //driver.switchTo().window(parent);
        return true;
    }
}
