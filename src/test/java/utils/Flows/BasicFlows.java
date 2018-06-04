package utils.Flows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.CredentialsPage;
import page.DashBoardPage;
import page.LoginPage;
import page.ResetPasswordPage;
import page.SourcePage;
import page.TopPage;
import page.WizardPage;
import test.BaseTest;


public class BasicFlows extends BaseTest {

    @Test
    public boolean login(String user, String pwd) {
        LoginPage.sendUsername(user);
        LoginPage.sendPassword(pwd);
        LoginPage.clickSubmitButton();
        return true;
    }

    @Test
    public boolean logout() {
        TopPage.clickOnUserAvatarButton();
        TopPage.clickOnLogoutButton();
        return true;
    }

    @Test
    public boolean modifyPassword(String pwd, String confirmpwd) {
        TopPage.clickOnUserAvatarButton();
        ResetPasswordPage.sendNewPassword(pwd);
        ResetPasswordPage.sendConfirmPassword(confirmpwd);
        return true;
    }

    @Test
    public boolean initSynch() {
        DashBoardPage.clickOnAddNewSynchButton();
        return true;
    }

    @Test
    public boolean selectSource(String source) {
        WebElement element = driver.findElement(By.xpath("//*[@class = 'rs-wizard-step-circle']"));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

        switch (source) {
            case "Br360":
                SourcePage.clickOnBr360Logo();
                break;
            case "VoicePad":
                SourcePage.clickOnVoicePadLogo();
                break;
            case "RealGeeks":
                SourcePage.clickOnRealGeekLogo();
                break;
            case "SiDx":
                SourcePage.clickOnSidxLogo();
                break;
            default:
                System.out.println("Source not found, please check your source name");
                return false;
        }
        SourcePage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean selectTatrget(String target) {
        WebElement element = driver.findElement(By.xpath("(//*[@class='rs-wizard-step-innercircle'])[2]"));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", element);

        switch (target) {
            case "SalesForce":
                WizardPage.clickOnSalesForceLogo();
                break;
            case "FollowUpBoss":
                WizardPage.clickOnFollowUpBossLogo();
                break;
            case "Contactually":
                WizardPage.clickOnContactuallyLogo();
                break;
            case "BoomTown":
                WizardPage.clickOnBoomTownLogo();
                break;
            default:
                System.out.println("Target not found, please check your target name");
                return false;
        }
        return true;
    }

    @Test
    public boolean deactivateSynch() {
        DashBoardPage.clickOnElipsisIcon();
        DashBoardPage.clickOnDeactivateSynchLink();
        return true;
    }

    @Test
    public boolean reactivateSynch() {
        DashBoardPage.clickOnElipsisIcon();
        DashBoardPage.clickOnActivateSynchLink();
        return true;
    }

    @Test
    public boolean saveSynchAsDraft() throws InterruptedException {
        Thread.sleep(3000);
        CredentialsPage.clickOnCancelButton();
        Thread.sleep(500);
        CredentialsPage.clickOnYesAlertButton();
        Thread.sleep(500);
        CredentialsPage.clickOnOkAlertButton();
        return true;
    }
}
