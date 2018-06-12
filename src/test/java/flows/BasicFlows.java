package flows;

import locator.CredentialsLocator;
import locator.SourceLocator;
import locator.WizardLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import test.BaseTest;
import utils.SourceTarget;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static locator.DashBoardLocator.SOURCE_COLUMN;
import static locator.DashBoardLocator.STATUS_COLUMN;
import static locator.DashBoardLocator.TARGET_COLUMN;
import static org.testng.Assert.assertTrue;

public class BasicFlows extends BaseTest {

    public boolean loginFlow(String user, String pwd) {
        System.out.println("login");
        assertTrue(loginPage.sendUsername(user));
        assertTrue(loginPage.sendPassword(pwd));
        assertTrue(loginPage.clickOnSubmitButton());
        return true;
    }

    public boolean logoutFLow() {
        System.out.println("logout");
        assertTrue(topPage.clickOnUserAvatarButton());
        assertTrue(topPage.clickOnLogoutButton());
        return true;
    }

    public boolean modifyPasswordFlow(String pwd, String confirmpwd) {
        System.out.println("modifyPassword");
        assertTrue(topPage.clickOnUserAvatarButton());
        assertTrue(resetPasswordPage.sendNewPassword(pwd));
        assertTrue(resetPasswordPage.sendConfirmPassword(confirmpwd));
        return true;
    }

    public boolean initSynchFlow() {
        System.out.println("initSynchFlow");
        assertTrue(dashBoardPage.clickOnAddNewSynchButton());
        return true;
    }

    public boolean finishSynch() {
        System.out.println("finishSynch");
        assertTrue(bottomPage.clickOnNextButton());
        assertTrue(bottomPage.clickOnActivateButton());
        assertTrue(finishPage.clickOnOKPopupButton());
        return true;
    }

    public boolean selectSource(SourceTarget source) {
        System.out.println("selectSource");
        scrollToElelement(SourceLocator.WIZARD_STEP_NAVIGATOR1);
        switch (source) {
            case BR360:
                assertTrue(sourcePage.clickOnBr360Logo());
                break;
            case VOICEPAD:
                assertTrue(sourcePage.clickOnVoicePadLogo());
                break;
            case REALGEEKS:
                assertTrue(sourcePage.clickOnRealGeekLogo());
                break;
            case SIDX:
                assertTrue(sourcePage.clickOnSidxLogo());
                break;
            default:
                System.out.println("Source not found, please check your source name");
                return false;
        }
        assertTrue(sourcePage.clickOnNextButton());
        return true;
    }

    public boolean selectTarget(SourceTarget target) {
        System.out.println("selectTarget");
        WebElement element = driver.findElement(By.xpath(WizardLocator.WIZARD_STEP_NAVIGATOR2));
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        switch (target) {
            case SALESFROCE:
                assertTrue(wizardPage.clickOnSalesForceLogo());
                break;
            case FOLLOWUPBOSS:
                assertTrue(wizardPage.clickOnFollowUpBossLogo());
                break;
            case CONTACTUALLY:
                assertTrue(wizardPage.clickOnContactuallyLogo());
                break;
            case BOOMTOWN:
                assertTrue(wizardPage.clickOnBoomTownLogo());
                break;
            default:
                System.out.println("Target not found, please check your target name");
                return false;
        }
        return true;
    }

    public boolean deactivateSynch() {
        System.out.println("deactivateSynch");
        assertTrue(dashBoardPage.clickOnElipsisIcon());
        assertTrue(dashBoardPage.clickOnDeactivateSynchLink());
        return true;
    }

    public boolean reactivateSynch() {
        System.out.println("reactivateSynch");
        assertTrue(dashBoardPage.clickOnElipsisIcon());
        assertTrue(dashBoardPage.clickOnActivateSynchLink());
        return true;
    }

    public boolean saveSynchAsDraft() throws InterruptedException {
        System.out.println("saveSynchAsDraft");
        Thread.sleep(3000);
        assertTrue(credentialsPage.clickOnCancelButton());
        Thread.sleep(500);
        assertTrue(credentialsPage.clickOnYesAlertButton());
        Thread.sleep(500);
        driver.findElement(By.xpath(CredentialsLocator.OK_BUTTON));
        assertTrue(credentialsPage.clickOnOkAlertButton());
        return true;
    }

    public boolean saveSynchAsDraftDisplayingVerificationsInstructions() throws InterruptedException {
        System.out.println("saveSynchAsDraftDisplayingVerificationsInstructions");
        assertTrue(showSourceVerificationInstructions());
        assertTrue(showTargetVerificationInstructions());
        Thread.sleep(3000);
        assertTrue(credentialsPage.clickOnCancelButton());
        Thread.sleep(500);
        assertTrue(credentialsPage.clickOnYesAlertButton());
        Thread.sleep(500);
        assertTrue(credentialsPage.clickOnOkAlertButton());
        return true;
    }

    public boolean scrollToElelement(String locator) {
        System.out.println("scrollToElelement");
        By Locator = new By.ByXPath(locator);
        WebElement element = driver.findElement(Locator);
        //JavascriptExecutor js = driver;
        //js.executeScript("arguments[0].scrollIntoView();", element);
        return true;
    }

    public boolean editSynch(String status, String source, String target) {
        System.out.println("editSynch");
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

    public boolean editSynch(String source, String SCredential, String target, String TCredential) {
        System.out.println("editSynch");
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

    public boolean verifyCredentials(String status, int index) {
        System.out.println("verifyCredentials");
        index = --index;
        String property = "source-" + String.valueOf(index);
        List<WebElement> element = driver.findElements(By.id(property));
        int exist = element.size();
        boolean credential = status.equalsIgnoreCase("yes");
        if ((credential == false) && (exist > 0)) return true;
        if ((credential == false) && (exist == 0)) return false;
        if ((credential == true) && (exist == 0)) return true;
        if ((credential == true) && (exist > 0)) return false;
        return false;
    }

    public boolean forgotPassword(String username){
        System.out.println("forgotPassword");
        assertTrue(loginPage.clickOnForgotPasswordButton());
        assertTrue(forgotPasswordPage.sendPwd(username));
        return true;
    }

    public boolean signUp(String team, String firstName, String lastName, String email, String password, String
            company, String phoneNumber){
        System.out.println("signUp");
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
        assertTrue(signUpPage.sendFirstNameInput(firstName));
        assertTrue(signUpPage.sendLastNameInput(lastName));
        assertTrue(signUpPage.sendEmailInput(email));
        assertTrue(signUpPage.sendPasswordInput(password));
        assertTrue(signUpPage.sendConfirmPasswordInput(password));
        assertTrue(signUpPage.sendCompanyInput(company));
        assertTrue(signUpPage.sendPhoneNumberInput(phoneNumber));
        assertTrue(signUpPage.clickOnSubmitButton());
        return true;
    }

    public boolean modifyUserInformation(String firstName, String lastName, String email){
        System.out.println("modifyUserInformation");
        assertTrue(topPage.clickOnUserAvatarButton());
        assertTrue(topPage.clickOnAccountSettings());
        /*
        Commented since this page doesn´t support modifications at the time 6/6/2018
        accountSettingsPage.sendFirstName(firstName);
        accountSettingsPage.sendLastName(lastName);
        accountSettingsPage.sendEmail(email);
        */
        return true;
    }

    public boolean modifyExistingPaymentMethod(String cardHolder, String monthExpiresAt, String yearExpiresAt){
        System.out.println("modifyExistingPaymentMethod");
        assertTrue(topPage.clickOnUserAvatarButton());
        assertTrue(topPage.clickOnAccountSettings());
        assertTrue(paymentMethodPage.clickOnPaymentMethodButton());
        assertTrue(paymentMethodPage.clickOnEditPaymentMethodButton());
        assertTrue(paymentMethodPage.sendEditCardHolderName(cardHolder));
        assertTrue(paymentMethodPage.sendEditMonthExpires(monthExpiresAt));
        assertTrue(paymentMethodPage.sendEditYearExpires(yearExpiresAt));
        assertTrue(paymentMethodPage.clickOnEditSaveButton());
        return true;
    }

    public boolean addNewPaymentMethod(String cardHolder, String cardNumber, String expiresAt, String cvv, String
            zipcode, boolean defaultPayment) throws InterruptedException {
        System.out.println("addNewPaymentMethod");
        assertTrue(topPage.clickOnUserAvatarButton());
        assertTrue(topPage.clickOnAccountSettings());
        TimeUnit.SECONDS.sleep(10);
        assertTrue(paymentMethodPage.clickOnPaymentMethodButton());
        assertTrue(paymentMethodPage.clickOnAddNewPaymentMethodButtonn());
        assertTrue(paymentMethodPage.sendNewCardHolderName(cardHolder));
        assertTrue(paymentMethodPage.sendNewCardNumber(cardNumber));
        assertTrue(paymentMethodPage.sendNewExpiresAt(expiresAt));
        assertTrue(paymentMethodPage.sendNewCVV(cvv));
        assertTrue(paymentMethodPage.sendNewZipCode(zipcode));
        assertTrue(paymentMethodPage.clickOnNewSaveButton());
        return true;
    }

    public boolean changePassword(String newPassword) {
        System.out.println("changePassword");
        assertTrue(topPage.clickOnUserAvatarButton());
        assertTrue(topPage.clickOnChangePasswordButton());
        assertTrue(changePasswordPage.sendNewPassword(newPassword));
        assertTrue(changePasswordPage.sendConfirmNewPassword(newPassword));
        assertTrue(changePasswordPage.clickOnSaveButton());
        assertTrue(changePasswordPage.clickOnOkButton());
        return true;
    }

    public boolean activateSynch(){
        System.out.println("activateSynch");
        assertTrue(dashBoardPage.clickOnElipsisIcon());
        assertTrue(dashBoardPage.clickOnActivateSynchLink());
        assertTrue(dashBoardPage.clickOnYesButton());
        assertTrue(dashBoardPage.clickOnOkButton());
        return true;
    }

    public boolean showActivationInstuctions(){
        System.out.println("showActivationInstuctions");
        assertTrue(dashBoardPage.clickOnElipsisIcon());
        assertTrue(dashBoardPage.clickOnActivationInstructionsLink());
        while(dashBoardPage.checkForNextButton()){
            assertTrue(dashBoardPage.clickOnNextButton());
        }
        if(dashBoardPage.checkForDoneButton()){
            assertTrue(dashBoardPage.clickOnDoneButton());
        }
        else{
            throw new RuntimeException("Done button is not displayed");
        }
        return true;
    }

    public boolean editDraftSynch(){
        System.out.println("editDraftSynch");
        assertTrue(dashBoardPage.clickOnElipsisIcon());
        assertTrue(dashBoardPage.clickOnEditSynchLink());
        //Edit information of synch here
        assertTrue(credentialsPage.clickOnNextButton());
        assertTrue(bottomPage.clickOnCancelButton());
        return true;
    }

    public boolean editAndActivateSynch(){
        System.out.println("editAndActivateSynch");
        assertTrue(dashBoardPage.clickOnElipsisIcon());
        assertTrue(dashBoardPage.clickOnEditSynchLink());
        //Edit information of synch here
        assertTrue(credentialsPage.clickOnNextButton());
        assertTrue(bottomPage.clickOnActivateButton());
        assertTrue(credentialsPage.clickOnOkAlertButton());
        return true;
    }

    public boolean showSynchInformation(){
        System.out.println("showSynchInformation");
        String synchStatus;
        assertTrue(dashBoardPage.clickOnCalendarButton());
        synchStatus = dashBoardPage.getSynchInformation();
        System.out.println(synchStatus);
        return true;
    }

    public boolean showSourceVerificationInstructions(){
        System.out.println("showSourceVerificationInstructions");
        assertTrue(credentialsPage.clickOnSourceVerificationInstructions());
        while(verificationInstructionsPage.checkForNextButton()){
            assertTrue(verificationInstructionsPage.clickOnNextButton());
        }
        if(verificationInstructionsPage.checkForDoneButton()){
            assertTrue(verificationInstructionsPage.clickOnDoneButton());
        }
        else{
            return false;
        }
        return true;
    }

    public boolean showTargetVerificationInstructions(){
        System.out.println("showTargetVerificationInstructions");
        assertTrue(credentialsPage.clickOnTargetVerificationInstructions());
        while(verificationInstructionsPage.checkForNextButton()){
            assertTrue(verificationInstructionsPage.clickOnNextButton());
        }
        if(verificationInstructionsPage.checkForDoneButton()){
            assertTrue(verificationInstructionsPage.clickOnDoneButton());
        }
        else{
            return false;
        }
        return true;
    }
}
