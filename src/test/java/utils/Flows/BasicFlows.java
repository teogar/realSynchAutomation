package utils.Flows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.BoomTownPage;
import test.BaseTest;

import java.util.Iterator;
import java.util.Set;

import static utils.Properties.CONTACTUALLY_API_KEY;
import static utils.Properties.FOLLOW_UP_BOSS_API_KEY;


public class BasicFlows extends BaseTest {

    @Test
    public boolean login(String user, String pwd) {
        loginPage.sendUsername(user);
        loginPage.sendPassword(pwd);
        loginPage.clickOnSubmitButton();
        return true;
    }

    @Test
    public boolean logout() {
        topPage.clickOnUserAvatarButton();
        topPage.clickOnLogoutButton();
        return true;
    }

    @Test
    public boolean modifyPassword(String pwd, String confirmpwd) {
        topPage.clickOnUserAvatarButton();
        resetPasswordPage.sendNewPassword(pwd);
        resetPasswordPage.sendConfirmPassword(confirmpwd);
        return true;
    }

    @Test
    public boolean initSynch() {
        dashBoardPage.clickOnAddNewSynchButton();
        return true;
    }

    @Test
    public boolean selectSource(String source) {
        WebElement element = driver.findElement(By.xpath("//*[@class = 'rs-wizard-step-circle']"));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

        switch (source) {
            case "Br360":
                sourcePage.clickOnBr360Logo();
                break;
            case "VoicePad":
                sourcePage.clickOnVoicePadLogo();
                break;
            case "RealGeeks":
                sourcePage.clickOnRealGeekLogo();
                break;
            case "SiDx":
                sourcePage.clickOnSidxLogo();
                break;
            default:
                System.out.println("Source not found, please check your source name");
                return false;
        }
        sourcePage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean selectTatrget(String target) {
        WebElement element = driver.findElement(By.xpath("(//*[@class='rs-wizard-step-innercircle'])[2]"));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

        switch (target) {
            case "SalesForce":
                wizardPage.clickOnSalesForceLogo();
                break;
            case "FollowUpBoss":
                wizardPage.clickOnFollowUpBossLogo();
                break;
            case "Contactually":
                wizardPage.clickOnContactuallyLogo();
                break;
            case "BoomTown":
                wizardPage.clickOnBoomTownLogo();
                break;
            default:
                System.out.println("Target not found, please check your target name");
                return false;
        }
        return true;
    }

    @Test
    public boolean deactivateSynch() {
        dashBoardPage.clickOnElipsisIcon();
        dashBoardPage.clickOnDeactivateSynchLink();
        return true;
    }

    @Test
    public boolean reactivateSynch() {
        dashBoardPage.clickOnElipsisIcon();
        dashBoardPage.clickOnActivateSynchLink();
        return true;
    }

    @Test
    public boolean saveSynchAsDraft() throws InterruptedException {
        Thread.sleep(3000);
        credentialsPage.clickOnCancelButton();
        Thread.sleep(500);
        credentialsPage.clickOnYesAlertButton();
        Thread.sleep(500);
        credentialsPage.clickOnOkAlertButton();
        return true;
    }

    @Test
    public boolean voicePadCredentials(String ID) {
        credentialsPage.clickOnSourceInputButton();
        inputCredentialsPage.enterClientId(ID);
        inputCredentialsPage.clickOnClose();
        return true;
    }

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

    @Test
    public boolean followUpBossCredentials(String APIKey) {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.enterToken(FOLLOW_UP_BOSS_API_KEY);
        inputCredentialsPage.clickOnVerifyButton();
        inputCredentialsPage.clickOnClose();
        credentialsPage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean contactuallyCredentials() {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.enterToken(CONTACTUALLY_API_KEY);
        inputCredentialsPage.clickOnVerifyButton();
        inputCredentialsPage.clickOnClose();
        credentialsPage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean boomTownCredentials(String mail, String pwd) {
        credentialsPage.clickOnTargetInputButton();
        inputCredentialsPage.clickOnBoomVerifyButton();
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
