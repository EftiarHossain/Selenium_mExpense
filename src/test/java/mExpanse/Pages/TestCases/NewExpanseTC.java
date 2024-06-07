package mExpanse.Pages.TestCases;
import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.NewExpanse_Impl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)

public class NewExpanseTC extends BaseClass {
    NewExpanse_Impl newExpanse = new NewExpanse_Impl();
    LogIn_Impl login= new LogIn_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login(){
        login.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");
        //login.correctMailCorrectPass(driver,getMail("email"),getPassword("password"),"Admin");
    }

    @Test(priority = 2)
    public void navigateToNewExpanse() throws InterruptedException {
        newExpanse.navigateToNewExpanse(driver);
    }

    @Test(priority = 3)
    public void uiVerification() throws InterruptedException {
        newExpanse.guiVerification(driver);
    }

    @Test(priority = 4)
    public void requiredFieldVerification() throws InterruptedException {
        newExpanse.requiredFieldCheck(driver);
    }

    @Test(priority = 5)
    public void createNewExpanseWithReimbursement() throws InterruptedException {
        newExpanse.createNewExpanseWithReimbursement(driver);
    }

    @Test(priority = 6)
    public void createNewExpanseWithoutReimbursement() throws InterruptedException {
        newExpanse.createNewExpanseWithoutReimbursement(driver);
    }

    @Test(priority = 7)
    public void createNewExpanseWithMultipleItem() throws InterruptedException {
        newExpanse.createNewExpanseWithMultipleItem(driver);
    }

    @AfterClass
    public void  testCaseTearDown() {

        tearDown();
    }
}
