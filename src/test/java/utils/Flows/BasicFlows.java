package utils.Flows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.*;
import test.BaseTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static utils.Properties.CONTACTUALLY_API_KEY;
import static utils.Properties.FOLLOW_UP_BOSS_API_KEY;


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

    @Test
    public boolean voicePadCredentials(String ID) {
        CredentialsPage.clickOnSourceInputButton();
        InputCredentialsPage.enterClientId(ID);
        InputCredentialsPage.clickOnClose();
        return true;
    }

    @Test
    public boolean salesForceCredentials(String ID, String PWD, String TKN) throws InterruptedException {
        CredentialsPage.clickOnTargetInputButton();
        InputCredentialsPage.enterUser(ID);
        InputCredentialsPage.enterPassword(PWD);
        InputCredentialsPage.enterToken(TKN);
        InputCredentialsPage.selectUrl2();
        InputCredentialsPage.clickOnClose();
        Thread.sleep(300);
        CredentialsPage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean followUpBossCredentials(String APIKey) {
        CredentialsPage.clickOnTargetInputButton();
        InputCredentialsPage.enterToken(FOLLOW_UP_BOSS_API_KEY);
        InputCredentialsPage.clickOnVerifyButton();
        InputCredentialsPage.clickOnClose();
        CredentialsPage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean contactuallyCredentials() {
        CredentialsPage.clickOnTargetInputButton();
        InputCredentialsPage.enterToken(CONTACTUALLY_API_KEY);
        InputCredentialsPage.clickOnVerifyButton();
        InputCredentialsPage.clickOnClose();
        CredentialsPage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean boomTownCredentials(String mail, String pwd) {
        CredentialsPage.clickOnTargetInputButton();
        InputCredentialsPage.clickOnBoomVerifyButton();
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

    public void forgotPassword(String username){
        LoginPage.clickOnForgotPasswordButton();
        ForgotPasswordPage.sendPwd(username);
    }

    public void signUp(String team, String firstName, String lastName, String email, String password, String company, String phoneNumber){

        switch(team) {
            case "Beta":
                break;
            case "Lite":
                break;
            case "Team":
                break;
            case "Super Team/Broker":
                break;
        }
        SignUpPage.sendFirstNameInput(firstName);
        SignUpPage.sendLastNameInput(lastName);
        SignUpPage.sendEmailInput(email);
        SignUpPage.sendPasswordInput(password);
        SignUpPage.sendConfirmPasswordInput(password);
        SignUpPage.sendCompanyInput(company);
        SignUpPage.sendPhoneNumberInput(phoneNumber);
        SignUpPage.clickOnSubmitButton();


    }
/*
    public void login(String username,String password){
        LoginPage.sendUsername(username);
        LoginPage.sendPassword(password);
        LoginPage.clickSubmitButton();
    }
    public void logout(){
        TopPage.clickOnUserAvatarButton();
        TopPage.clickOnLogoutButton();
    }
    public void deactivateSynch(){
        DashBoardPage.clickOnElipsisIcon();
        DashBoardPage.clickOnActivateSynchLink();
        DashBoardPage.clickOnYesButton();
        DashBoardPage.clickOnOkButton();
    }
*/
    public void modifyUserInformation(String firstName, String lastName, String email){
        TopPage.clickOnUserAvatarButton();
        TopPage.clickOnAccountSettings();
    }

    public void modifyExistingPaymentMethod(String cardHolder, String cardNumber, String expiresAt, boolean defaultPayment){
        TopPage.clickOnUserAvatarButton();
        TopPage.clickOnAccountSettings();
        PaymentMethodPage.clickOnPaymentMethodButton();
        PaymentMethodPage.clickOnEditPaymentMethodButton();
        PaymentMethodPage.sendEditCardHolderName("Automation Tester2");
        PaymentMethodPage.sendEditMonthExpires("03");
        PaymentMethodPage.sendEditYearExpires("2025");
        PaymentMethodPage.clickOnEditSaveButton();
    }
    public void addNewPaymentMethod(String cardHolder, String cardNumber, String expiresAt, String cvv, String zipcode, boolean defaultPayment) throws InterruptedException {
        TopPage.clickOnUserAvatarButton();
        TopPage.clickOnAccountSettings();
        TimeUnit.SECONDS.sleep(10);
        PaymentMethodPage.clickOnPaymentMethodButton();
        PaymentMethodPage.clickOnAddNewPaymentMethodButtonn();
        PaymentMethodPage.sendNewCardHolderName(cardHolder);
        PaymentMethodPage.sendNewCardNumber(cardNumber);
        PaymentMethodPage.sendNewExpiresAt(expiresAt);
        PaymentMethodPage.sendNewCVV(cvv);
        PaymentMethodPage.sendNewZipCode(zipcode);
        PaymentMethodPage.clickOnNewSaveButton();
    }
    public void changePassword(String newPassword){
        TopPage.clickOnUserAvatarButton();
        TopPage.clickOnChangePasswordButton();
        ChangePasswordPage.sendNewPassword(newPassword);
        ChangePasswordPage.sendConfirmNewPassword(newPassword);
        ChangePasswordPage.clickOnSaveButton();
        ChangePasswordPage.clickOnOkButton();
    }
    public void activateSynch(){
        DashBoardPage.clickOnElipsisIcon();
        DashBoardPage.clickOnActivateSynchLink();
        DashBoardPage.clickOnYesButton();
        DashBoardPage.clickOnOkButton();
    }

    public void showActivationInstuctions(){
        DashBoardPage.clickOnElipsisIcon();
        DashBoardPage.clickOnActivationInstructionsLink();
        DashBoardPage.clickOnDoneButton();
    }

    public void editDraftSynch(){
        DashBoardPage.clickOnElipsisIcon();
        DashBoardPage.clickOnEditSynchLink();
        // next button
        // cancel
        // ok
    }

    public void editAndActivateSynch(){
        DashBoardPage.clickOnElipsisIcon();
        DashBoardPage.clickOnEditSynchLink();
        // next button
        // activate
        // ok
    }

    public void showSynchInformation(){
        String synchStatus;

        DashBoardPage.clickOnCalendarButton();
        synchStatus = DashBoardPage.getSynchInformation();
        System.out.println(synchStatus);
    }
}
