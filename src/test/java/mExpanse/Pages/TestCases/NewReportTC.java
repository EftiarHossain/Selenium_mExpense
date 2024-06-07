package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.NewReport_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)

public class NewReportTC extends BaseClass {

    LogIn_Impl logIn = new LogIn_Impl();

    NewReport_Impl newReport = new NewReport_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void verifyGuiElements() {
        logIn.correctMailCorrectPass(driver,getMail("adminEmail"),getPassword("adminPass"),"Admin");
        newReport.navigateToMyViewReports(driver);
        newReport.navigateToNewReport(driver);
        newReport.guiVerification(driver);
    }

    @Test(priority = 2)
    public void verifyNewReportDrawerClosing() {
        newReport.verifyDrawerCancelButton(driver);

    }

    @Test(priority = 3)
    public void verifyNewReportCreation() {
        newReport.navigateToNewReport(driver);
        newReport.createValidNewReport(driver);

    }

    @Test(priority = 4)
    public void verifyCancelReportCreation() {
        newReport.navigateToNewReport(driver);
        newReport.verifyCancelCreatingReport(driver);

    }

    @Test(priority = 5)
    public void verifyReportCreationWithoutOptionalField() {
        newReport.navigateToNewReport(driver);
        newReport.verifyReportCreationWithoutInputtingOptionalField(driver);
    }

    @Test(priority = 6)
    public void verifyInvalidReportCreation() {
        newReport.navigateToNewReport(driver);
        newReport.verifyMandatoryFieldAlert(driver);
    }



    @AfterTest
    public void  testCaseTearDown() {
        tearDown();

    }
}
