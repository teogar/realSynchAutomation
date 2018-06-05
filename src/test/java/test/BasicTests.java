package test;

import org.testng.annotations.Test;
import utils.Flows.BasicFlows;

public class BasicTests extends BasicFlows {

    @Test(groups = "BasicTests.LogIn")
    public void login(){
        System.out.println("Init 'BasicTests.LogIn' test");
        try{
            login("automationtester@mailinator.com","itexico1*");
        }catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    @Test(groups = "BasicTests.LogoutTest")
    public void LogoutTest(){
        System.out.println("Init 'BasicTests.LogoutTest' test");
        try{
            login("automationtester@mailinator.com","itexico1*");
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
            login("automationtester@mailinator.com","itexico1*");
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
            login("automationtester@mailinator.com", "itexico1*");
            addNewPaymentMethod("Automation Tester 3", "4111111111111111","0225","098","90210",true);
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
            signUp("beta","Automation","Tester","automationtester2@mailinator.com","itexico2*","Tex","1234567890");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.activateSynchNoCredentials")
    public void activateSynchNoCredentials() {
        System.out.println("Init 'BasicTests.activateSynchNoCredentials' test");
        try{
            login("automationtester@mailinator.com", "itexico1*");
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
            login("automationtester@mailinator.com", "itexico1*");
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
            login("automationtester@mailinator.com", "itexico1*");
            showActivationInstuctions();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.deactivateSynchTest")
    public void deactivateSynchTest() {
        System.out.println("Init 'BasicTests.deactivateSynchTest' test");
        try{
            login("automationtester@mailinator.com", "itexico1*");
            deactivateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editDraftSynch")
    public void editDraftSynch() {
        System.out.println("Init 'BasicTests.editDraftSynch' test");
        try{
            login("automationtester@mailinator.com", "itexico1*");
            editDraftSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.editAndActivateSynch")
    public void editAndActivateSynch() {
        System.out.println("Init 'BasicTests.editAndActivateSynch' test");
        try{
            login("automationtester@mailinator.com", "itexico1*");
            editAndActivateSynch();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test(groups = "BasicTests.showSynchInformation")
    public void showSynchInformation() {
        System.out.println("Init 'BasicTests.showSynchInformation' test");
        try{
            login("automationtester@mailinator.com", "itexico1*");
            showSynchInformation();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
