package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface NewReport_Interface {

    void navigateToMyViewReports(WebDriver driver);

    void navigateToNewReport(WebDriver driver);

    void guiVerification(WebDriver driver);

    void verifyDrawerCancelButton(WebDriver driver);

    String createValidNewReport(WebDriver driver);

    void verifyCancelCreatingReport(WebDriver driver);

    void verifyMandatoryFieldAlert(WebDriver driver);

    void verifyReportCreationWithoutInputtingOptionalField(WebDriver driver);


}
