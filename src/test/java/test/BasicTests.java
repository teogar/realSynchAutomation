package test;

import org.testng.annotations.Test;
import flows.BasicFlows;

import static utils.Properties.*;


public class BasicTests extends BasicFlows {
    @Test(groups = "BasicTests.LogIn")
    public void login(){
        System.out.println("Init 'BasicTests.LogIn' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.LogoutTest")
    public void LogoutTest(){
        System.out.println("Init 'BasicTests.LogoutTest' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            logout();
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.Logout")
    public void forgotPassword(){
        System.out.println("Init 'BasicTests.forgotPassword' test");
        try{
            forgotPassword("automationtester@mailinator.com");
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.changePassword")
    public void changePassword(){
        System.out.println("Init 'BasicTests.changePassword' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            changePassword("itexico2*");
            changePassword("itexico1*");
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "BasicTests.addNewPaymentMethod")
    public void addNewPaymentMethod() {
        System.out.println("Init 'BasicTests.addNewPaymentMethod' test");
        try {
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            addNewPaymentMethod(PAYMENT_METHOD_CARDHOLDER_NAME, PAYMENT_METHOD_CARDHOLDER_CARD_NUMBER,PAYMENT_METHOD_CARDHOLDER_EXPIRES_AT,PAYMENT_METHOD_CARDHOLDER_CVV,PAYMENT_METHOD_CARDHOLDER_ZIPCODE,true);
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.signUp")
    public void signUp() {
        System.out.println("Init 'BasicTests.signUp' test");
        try{
            loginPage.clickOnRegisterButton();
            signUp(REGISTRATION_TEAM,REGISTRATION_FIRST_NAME,REGISTRATION_LAST_NAME,REGISTRATION_MAIL,REGISTRATION_PASSWORD,REGISTRATION_COMPANY,REGISTRATION_PHONE);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.activateSynchNoCredentials")
    public void activateSynchNoCredentials() {
        System.out.println("Init 'BasicTests.activateSynchNoCredentials' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            //newSynchNoCredentials();
            activateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.activateSynchWithCredentials")
    public void activateSynchWithCredentials() {
        System.out.println("Init 'BasicTests.activateSynchWithCredentials' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            //newSynchWithCredentials();
            activateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.showActivationInstructions")
    public void showActivationInstructions() {
        System.out.println("Init 'BasicTests.showActivationInstructions' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            showActivationInstuctions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.deactivateSynchTest")
    public void deactivateSynchTest() {
        System.out.println("Init 'BasicTests.deactivateSynchTest' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            deactivateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editDraftSynchTest")
    public void editDraftSynchTest() {
        System.out.println("Init 'BasicTests.editDraftSynchTest' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            editDraftSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editAndActivateSynchTest")
    public void editAndActivateSynchTest() {
        System.out.println("Init 'BasicTests.editAndActivateSynchTest' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            editAndActivateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.showSynchInformationTest")
    public void showSynchInformationTest() {
        System.out.println("Init 'BasicTests.showSynchInformationTest' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            showSynchInformation();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.modifyUserInformationTest")
    public void modifyUserInformationTest() {
        System.out.println("Init 'BasicTests.modifyUserInformationTest' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            modifyUserInformation(REGISTRATION_FIRST_NAME,REGISTRATION_LAST_NAME,REGISTRATION_MAIL);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.modifyExistingPaymentMethodTest")
    public void modifyExistingPaymentMethodTest() {
        System.out.println("Init 'BasicTests.modifyExistingPaymentMethodTest' test");
        try{
            login(AUTOMATION_USERNAME,AUTOMATION_PASSWORD);
            modifyExistingPaymentMethod(EDIT_PAYMENT_METHOD_CARDHOLDER_NAME, EDIT_PAYMENT_METHOD_CARDHOLDER_MONTH_EXPIRES, EDIT_PAYMENT_METHOD_CARDHOLDER_YEAR_EXPIRES);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.displaySourceVerificationInstructions")
    public void displaySourceVerificationInstructions() {
        System.out.println("Init 'BasicTests.displaySourceVerificationInstructions' test");
        try{
            showSourceVerificationInstructions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.displayTargetVerificationInstructions")
    public void displayTargetVerificationInstructions() {
        System.out.println("Init 'BasicTests.displayTargetVerificationInstructions' test");
        try{
            showTargetVerificationInstructions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
