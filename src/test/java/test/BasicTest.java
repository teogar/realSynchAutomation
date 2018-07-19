package test;

import flows.BasicFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.RealSynch;

import static org.testng.Assert.assertTrue;
import static utils.Properties.*;

@Listeners(RealSynch.class)
public class BasicTest extends BasicFlows {

    @Test(groups = "Login")
    public void loginTest() {
        assertTrue(loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD));
    }

    @Test(groups = "LogoutTest")
    public void LogoutTest() {
        assertTrue(loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD));
        assertTrue(logoutFLow());
    }

    
    @Test(groups = "BasicTests.Logout")
    public void forgotPasswordTest() {
        assertTrue(forgotPasswordFlow("username"));
    }

    @Test(groups = "BasicTests.changePasswordTest")
    public void changePasswordTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            changePasswordFlow("itexico2*");
            changePasswordFlow("itexico1*");
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "BasicTests.addNewPaymentMethodTest")
    public void addNewPaymentMethodTest() {
        try {
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            addNewPaymentMethodFlow(PAYMENT_METHOD_CARDHOLDER_NAME, PAYMENT_METHOD_CARDHOLDER_CARD_NUMBER,PAYMENT_METHOD_CARDHOLDER_EXPIRES_AT,PAYMENT_METHOD_CARDHOLDER_CVV,PAYMENT_METHOD_CARDHOLDER_ZIPCODE,true);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.signUpTest")
    public void signUpTest() {
        try{
            loginPage.clickOnRegisterButton();
            signUpFlow(REGISTRATION_TEAM,REGISTRATION_FIRST_NAME,REGISTRATION_LAST_NAME,REGISTRATION_MAIL,REGISTRATION_PASSWORD,REGISTRATION_COMPANY,REGISTRATION_PHONE);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.activateSynchNoCredentialsTest")
    public void activateSynchNoCredentialsTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            //newSynchNoCredentials();
            activateSynchFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.activateSynchWithCredentialsTest")
    public void activateSynchWithCredentialsTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            //newSynchWithCredentials();
            activateSynchFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.showActivationInstructionsTest")
    public void showActivationInstructionsTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            showActivationInstuctionsFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.deactivateSynchTest")
    public void deactivateSynchTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            deactivateSynchFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editDraftSynchTest")
    public void editDraftSynchTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            editDraftSynchFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editAndActivateSynchTest")
    public void editAndActivateSynchTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            editAndActivateSynchFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.showSynchInformationTest")
    public void showSynchInformationTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            showSynchInformationFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.modifyUserInformationTest")
    public void modifyUserInformationTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            modifyUserInformationFlow(REGISTRATION_FIRST_NAME,REGISTRATION_LAST_NAME,REGISTRATION_MAIL);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.modifyExistingPaymentMethodTest")
    public void modifyExistingPaymentMethodTest() {
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            modifyExistingPaymentMethodFlow(EDIT_PAYMENT_METHOD_CARDHOLDER_NAME, EDIT_PAYMENT_METHOD_CARDHOLDER_MONTH_EXPIRES, EDIT_PAYMENT_METHOD_CARDHOLDER_YEAR_EXPIRES);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.displaySourceVerificationInstructionsTest")
    public void displaySourceVerificationInstructionsTest() {
        try{
            showSourceVerificationInstructionsFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.displayTargetVerificationInstructionsTest")
    public void displayTargetVerificationInstructionsTest() {
        try{
            showTargetVerificationInstructionsFlow();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
