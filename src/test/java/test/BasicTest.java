package test;

import org.testng.annotations.Test;
import flows.BasicFlows;

import static org.testng.Assert.assertTrue;
import static utils.Properties.*;


public class BasicTest extends BasicFlows {
    @Test(groups = "BasicTests.LogIn")
    public void login(){
        System.out.println("loginTest");
        assertTrue(loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD));
    }

    @Test(groups = "BasicTests.LogoutTest")
    public void LogoutTest(){
        System.out.println("LogoutTest");
            assertTrue(loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD));
            assertTrue(logoutFLow());
    }

    @Test(groups = "BasicTests.Logout")
    public void forgotPassword(){
        System.out.println("forgotPassword");
        assertTrue(forgotPassword("automationtester@mailinator.com"));
    }

    @Test(groups = "BasicTests.changePassword")
    public void changePassword(){
        System.out.println("changePassword");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            changePassword("itexico2*");
            changePassword("itexico1*");
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "BasicTests.addNewPaymentMethod")
    public void addNewPaymentMethod() {
        System.out.println("addNewPaymentMethod");
        try {
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            addNewPaymentMethod(PAYMENT_METHOD_CARDHOLDER_NAME, PAYMENT_METHOD_CARDHOLDER_CARD_NUMBER,PAYMENT_METHOD_CARDHOLDER_EXPIRES_AT,PAYMENT_METHOD_CARDHOLDER_CVV,PAYMENT_METHOD_CARDHOLDER_ZIPCODE,true);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.signUp")
    public void signUp() {
        System.out.println("signUp");
        try{
            loginPage.clickOnRegisterButton();
            signUp(REGISTRATION_TEAM,REGISTRATION_FIRST_NAME,REGISTRATION_LAST_NAME,REGISTRATION_MAIL,REGISTRATION_PASSWORD,REGISTRATION_COMPANY,REGISTRATION_PHONE);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.activateSynchNoCredentials")
    public void activateSynchNoCredentials() {
        System.out.println("activateSynchNoCredentials");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            //newSynchNoCredentials();
            activateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.activateSynchWithCredentials")
    public void activateSynchWithCredentials() {
        System.out.println("activateSynchWithCredentials");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            //newSynchWithCredentials();
            activateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.showActivationInstructions")
    public void showActivationInstructions() {
        System.out.println("showActivationInstructions");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            showActivationInstuctions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.deactivateSynchTest")
    public void deactivateSynchTest() {
        System.out.println("deactivateSynchTest");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            deactivateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editDraftSynchTest")
    public void editDraftSynchTest() {
        System.out.println("editDraftSynchTest");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            editDraftSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editAndActivateSynchTest")
    public void editAndActivateSynchTest() {
        System.out.println("editAndActivateSynchTest");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            editAndActivateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.showSynchInformationTest")
    public void showSynchInformationTest() {
        System.out.println("showSynchInformationTest");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            showSynchInformation();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.modifyUserInformationTest")
    public void modifyUserInformationTest() {
        System.out.println("modifyUserInformationTest");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            modifyUserInformation(REGISTRATION_FIRST_NAME,REGISTRATION_LAST_NAME,REGISTRATION_MAIL);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.modifyExistingPaymentMethodTest")
    public void modifyExistingPaymentMethodTest() {
        System.out.println("modifyExistingPaymentMethodTest");
        try{
            loginFlow(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            modifyExistingPaymentMethod(EDIT_PAYMENT_METHOD_CARDHOLDER_NAME, EDIT_PAYMENT_METHOD_CARDHOLDER_MONTH_EXPIRES, EDIT_PAYMENT_METHOD_CARDHOLDER_YEAR_EXPIRES);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.displaySourceVerificationInstructions")
    public void displaySourceVerificationInstructions() {
        System.out.println("displaySourceVerificationInstructions");
        try{
            showSourceVerificationInstructions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.displayTargetVerificationInstructions")
    public void displayTargetVerificationInstructions() {
        System.out.println("displayTargetVerificationInstructions");
        try{
            showTargetVerificationInstructions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
