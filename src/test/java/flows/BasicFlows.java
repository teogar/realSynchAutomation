package flows;

import locator.CredentialsLocator;
import locator.SourceLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.BaseTest;
import utils.SourceTarget;
import locator.WizardLocator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static locator.DashBoardLocator.SOURCE_COLUMN;
import static locator.DashBoardLocator.STATUS_COLUMN;
import static locator.DashBoardLocator.TARGET_COLUMN;

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
    public boolean finishSynch() {
        bottomPage.clickOnNextButton();
        bottomPage.clickOnActivateButton();
        finishPage.clickOnOKPopupButton();
        return true;
    }

    @Test
    public boolean selectSource(SourceTarget source) {
        scrollToElelement(SourceLocator.WIZARD_STEP_NAVIGATOR1);
        switch (source) {
            case BR360:
                sourcePage.clickOnBr360Logo();
                break;
            case VOICEPAD:
                sourcePage.clickOnVoicePadLogo();
                break;
            case REALGEEKS:
                sourcePage.clickOnRealGeekLogo();
                break;
            case SIDX:
                sourcePage.clickOnSidxLogo();
                break;
            default:
                System.out.println("Source not found, please check your source name");
                return false;
        }
        bottomPage.clickOnNextButton();
        return true;
    }

    @Test
    public boolean selectTarget(SourceTarget target) {
        WebElement element = driver.findElement(By.xpath(WizardLocator.WIZARD_STEP_NAVIGATOR2));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        switch (target) {
            case SALESFROCE:
                wizardPage.clickOnSalesForceLogo();
                break;
            case FOLLOWUPBOSS:
                wizardPage.clickOnFollowUpBossLogo();
                break;
            case CONTACTUALLY:
                wizardPage.clickOnContactuallyLogo();
                break;
            case BOOMTOWN:
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
        driver.findElement(By.xpath(CredentialsLocator.OK_BUTTON));
        credentialsPage.clickOnOkAlertButton();
        return true;
    }

    @Test
    public boolean saveSynchAsDraftDisplayingVerificationsInstructions() throws InterruptedException {
        showSourceVerificationInstructions();
        showTargetVerificationInstructions();
        Thread.sleep(3000);
        credentialsPage.clickOnCancelButton();
        Thread.sleep(500);
        credentialsPage.clickOnYesAlertButton();
        Thread.sleep(500);
        credentialsPage.clickOnOkAlertButton();
        return true;
    }

    @Test
    public boolean scrollToElelement(String locator) {
        By Locator = new By.ByXPath(locator);
        WebElement element = driver.findElement(Locator);
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        return true;
    }

    @Test
    public boolean editSynch(String status, String source, String target) {
        int free = 0;
        List<WebElement> statusList = driver.findElements(By.className(STATUS_COLUMN));
        List<WebElement> sourceList = driver.findElements(By.className(SOURCE_COLUMN));
        List<WebElement> targetList = driver.findElements(By.className(TARGET_COLUMN));
        for(WebElement element : statusList) {
            free = statusList.indexOf(element)+1;
            if(element.getText().equalsIgnoreCase(status))
                if(sourceList.get(statusList.indexOf(element)).getText().equalsIgnoreCase(source))
                    if(targetList.get(statusList.indexOf(element)).getText().equalsIgnoreCase(target))
                        break;
        }
        String property = "(//*[@class='fa fa-ellipsis-h'])[" + free + "]";
        WebElement element = driver.findElement(By.xpath(property));
        element.click();
        property = "edit-" + (free-1);
        element = driver.findElement(By.id(property));
        element.click();
        return true;
    }

    @Test
    public boolean editSynch(String source, String SCredential, String target, String TCredential) {
        int free = 0;
        List<WebElement> statusList = driver.findElements(By.className(STATUS_COLUMN));
        List<WebElement> sourceList = driver.findElements(By.className(SOURCE_COLUMN));
        List<WebElement> targetList = driver.findElements(By.className(TARGET_COLUMN));
        for(WebElement element : statusList) {
            free = statusList.indexOf(element)+1;
            if(element.getText().equalsIgnoreCase("Draft"))
                if(sourceList.get(statusList.indexOf(element)).getText().equalsIgnoreCase(source) &&
                        verifyCredentials(SCredential, free))
                    if(targetList.get(statusList.indexOf(element)).getText().equalsIgnoreCase(target) &&
                            verifyCredentials(TCredential, free))
                        break;
        }
        String property = "(//*[@class='fa fa-ellipsis-h'])[" + free + "]";
        WebElement element = driver.findElement(By.xpath(property));
        element.click();
        property = "edit-" + (free-1);
        element = driver.findElement(By.id(property));
        element.click();
        return true;
    }

    @Test
    public boolean verifyCredentials(String status, int index) {
        index = --index;
        String property = "source-" + String.valueOf(index);
        List<WebElement> element = driver.findElementsById(property);
        int exist = element.size();
        boolean credential = status.equalsIgnoreCase("yes");
        if ((credential == false) && (exist > 0)) return true;
        if ((credential == false) && (exist == 0)) return false;
        if ((credential == true) && (exist == 0)) return true;
        if ((credential == true) && (exist > 0)) return false;
        return false;
    }

    public void forgotPassword(String username){
        loginPage.clickOnForgotPasswordButton();
        forgotPasswordPage.sendPwd(username);
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
        signUpPage.sendFirstNameInput(firstName);
        signUpPage.sendLastNameInput(lastName);
        signUpPage.sendEmailInput(email);
        signUpPage.sendPasswordInput(password);
        signUpPage.sendConfirmPasswordInput(password);
        signUpPage.sendCompanyInput(company);
        signUpPage.sendPhoneNumberInput(phoneNumber);
        signUpPage.clickOnSubmitButton();
    }

    public void modifyUserInformation(String firstName, String lastName, String email){
        topPage.clickOnUserAvatarButton();
        topPage.clickOnAccountSettings();
        /*
        Commented since this page doesn´t support modifications at the time 6/6/2018
        accountSettingsPage.sendFirstName(firstName);
        accountSettingsPage.sendLastName(lastName);
        accountSettingsPage.sendEmail(email);
        */
    }

    public void modifyExistingPaymentMethod(String cardHolder, String monthExpiresAt, String yearExpiresAt){
        topPage.clickOnUserAvatarButton();
        topPage.clickOnAccountSettings();
        paymentMethodPage.clickOnPaymentMethodButton();
        paymentMethodPage.clickOnEditPaymentMethodButton();
        paymentMethodPage.sendEditCardHolderName(cardHolder);
        paymentMethodPage.sendEditMonthExpires(monthExpiresAt);
        paymentMethodPage.sendEditYearExpires(yearExpiresAt);
        paymentMethodPage.clickOnEditSaveButton();
    }
    public void addNewPaymentMethod(String cardHolder, String cardNumber, String expiresAt, String cvv, String zipcode, boolean defaultPayment) throws InterruptedException {
        topPage.clickOnUserAvatarButton();
        topPage.clickOnAccountSettings();
        TimeUnit.SECONDS.sleep(10);
        paymentMethodPage.clickOnPaymentMethodButton();
        paymentMethodPage.clickOnAddNewPaymentMethodButtonn();
        paymentMethodPage.sendNewCardHolderName(cardHolder);
        paymentMethodPage.sendNewCardNumber(cardNumber);
        paymentMethodPage.sendNewExpiresAt(expiresAt);
        paymentMethodPage.sendNewCVV(cvv);
        paymentMethodPage.sendNewZipCode(zipcode);
        paymentMethodPage.clickOnNewSaveButton();
    }

    public void changePassword(String newPassword) {
        topPage.clickOnUserAvatarButton();
        topPage.clickOnChangePasswordButton();
        changePasswordPage.sendNewPassword(newPassword);
        changePasswordPage.sendConfirmNewPassword(newPassword);
        changePasswordPage.clickOnSaveButton();
        changePasswordPage.clickOnOkButton();
    }

    public void activateSynch(){
        dashBoardPage.clickOnElipsisIcon();
        dashBoardPage.clickOnActivateSynchLink();
        dashBoardPage.clickOnYesButton();
        dashBoardPage.clickOnOkButton();
    }

    public void showActivationInstuctions(){
        dashBoardPage.clickOnElipsisIcon();
        dashBoardPage.clickOnActivationInstructionsLink();
        while(dashBoardPage.checkForNextButton()){
            bottomPage.clickOnNextButton();
        }
        if(dashBoardPage.checkForDoneButton()){
            dashBoardPage.clickOnDoneButton();
        }
        else{
            throw new RuntimeException("Done button is not displayed");
        }
    }

    public void editDraftSynch(){
        dashBoardPage.clickOnElipsisIcon();
        dashBoardPage.clickOnEditSynchLink();
        //Edit information of synch here
        credentialsPage.clickOnNextButton();
        bottomPage.clickOnCancelButton();
    }

    public void editAndActivateSynch(){
        dashBoardPage.clickOnElipsisIcon();
        dashBoardPage.clickOnEditSynchLink();
        //Edit information of synch here
        credentialsPage.clickOnNextButton();
        bottomPage.clickOnActivateButton();
        credentialsPage.clickOnOkAlertButton();
    }

    public void showSynchInformation(){
        String synchStatus;

        dashBoardPage.clickOnCalendarButton();
        synchStatus = dashBoardPage.getSynchInformation();
        System.out.println(synchStatus);
    }

    public void showSourceVerificationInstructions(){
        credentialsPage.clickOnSourceVerificationInstructions();
        while(verificationInstructionsPage.checkForNextButton()){
            verificationInstructionsPage.clickOnNextButton();
        }
        if(verificationInstructionsPage.checkForDoneButton()){
            verificationInstructionsPage.clickOnDoneButton();
        }
        else{
            throw new RuntimeException("Done button is not displayed");
        }
    }

    public void showTargetVerificationInstructions(){
        credentialsPage.clickOnTargetVerificationInstructions();
        while(verificationInstructionsPage.checkForNextButton()){
            verificationInstructionsPage.clickOnNextButton();
        }
        if(verificationInstructionsPage.checkForDoneButton()){
            verificationInstructionsPage.clickOnDoneButton();
        }
        else{
            throw new RuntimeException("Done button is not displayed");
        }
    }
    /**
     *         List<WebElement> statusList = driver.findElements(By.xpath("//*[@class='ui-g-2 col-status']"));
     *         List<WebElement> sourceList = driver.findElements(By.xpath("//*[@class='ui-g-3 source-row-cell']"));
     *         List<WebElement> targetList = driver.findElements(By.xpath("//*[@class='ui-g-3 target-row-cell']"));
     */
}
