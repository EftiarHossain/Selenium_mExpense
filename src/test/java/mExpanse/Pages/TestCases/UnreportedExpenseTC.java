package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.UnreportedExpense_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)

public class UnreportedExpenseTC extends BaseClass {

    LogInTC logInTC = new LogInTC();
    UnreportedExpense_Impl unreportedExpense = new UnreportedExpense_Impl();


    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test(priority = 1)
    public void verifyNavigatesUnreportedExpense() {
        logInTC.correctMailCorrectPass();
        unreportedExpense.navigateToUnreportedExpense(driver);
        //Operations.takeSnapShot(driver, "/Users/eftiarbd/Downloads/mexpense/mexpanse/build/Snapshots/test.png");

    }

    @Test(priority = 2)
    public void verifyGuiElements() {
        unreportedExpense.guiVerification(driver);

    }

    @Test(priority = 3)
    public void dataValidationUnreportedExpenses() {

    }

    @Test(priority = 4)
    public void verifyTableDataSorting() {

    }


    @AfterTest
    public void  testCaseTearDown() {
        tearDown();

    }
}
