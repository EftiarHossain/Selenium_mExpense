package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.UnreportedExpense_Interface;
import mExpanse.Pages.ObjectRepository.UnreportedExpenseOR;
import org.openqa.selenium.WebDriver;

public class UnreportedExpense_Impl implements UnreportedExpense_Interface {

    public void guiVerification(WebDriver driver) {

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.unreportedExpenseTab, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.unreportedExpenseTab,UnreportedExpenseOR.UIElementConstant.unreportedExpenseText, driver);
        //Operations.matchAttribute(LogInOR.Locator.EmailTextBox, LogInOR.UIElementConstant.EmaillaceHolder,"placeholder", driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.allExpenseTab, driver);
        //Operations.click(UnreportedExpenseOR.Locator.allExpenseTab, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.allExpenseTab,UnreportedExpenseOR.UIElementConstant.allExpenseText, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.newExpenseCTA, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.newExpenseCTA,UnreportedExpenseOR.UIElementConstant.newExpenseBtnText, driver);
        Operations.verifyElementIsEnabled(UnreportedExpenseOR.Locator.newExpenseCTA, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderExpenseDetails, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderExpenseDetails,UnreportedExpenseOR.UIElementConstant.tableHeaderExpenseDetailsText, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderMerchant, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderMerchant,UnreportedExpenseOR.UIElementConstant.tableHeaderMerchant, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderAmount, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderAmount,UnreportedExpenseOR.UIElementConstant.tableHeaderAmount, driver);

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.tableHeaderStatus, driver);
        Operations.matchText(UnreportedExpenseOR.Locator.tableHeaderStatus,UnreportedExpenseOR.UIElementConstant.tableHeaderStatus, driver);




    }

    public void navigateToUnreportedExpense(WebDriver driver) {

        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.sideNavMenuMyView, driver);
        Operations.click(UnreportedExpenseOR.Locator.sideNavMenuMyView, driver);
        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.sideNavSubMenuExpenses, driver);
        Operations.click(UnreportedExpenseOR.Locator.sideNavSubMenuExpenses, driver);
        Operations.verifyElementIsDisplayed(UnreportedExpenseOR.Locator.unreportedExpenseTab, driver);


    }
}
