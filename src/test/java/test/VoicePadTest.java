package test;

import org.testng.annotations.Test;
import utils.Properties;

public class VoicePadTest extends BaseTest{

    public void login(String username,String password) {
        super.loginpage.sendUsername(username);
        super.loginpage.sendPassword(password);
        super.loginpage.clickOnSubmitButton();
    }
}
