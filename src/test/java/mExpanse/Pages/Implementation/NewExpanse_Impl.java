/**
 * Owner: Jakareya
 * Ticket-no:
 * Modifier-name:
 * Ticket-no:
 **/

package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.NewExpanse_Interface;
import mExpanse.Pages.ObjectRepository.LogInOR;
import mExpanse.Pages.ObjectRepository.NewExpanseOR;
import org.openqa.selenium.WebDriver;

public class NewExpanse_Impl implements NewExpanse_Interface {

    LoremIpsum ipsum = new LoremIpsum();
    @Override
    public void navigateToNewExpanse(WebDriver driver) throws InterruptedException {
        Operations.click(NewExpanseOR.locator.myView,driver);
        Operations.click(NewExpanseOR.locator.expanse,driver);
        Operations.verifyElementIsDisplayed(NewExpanseOR.locator.newExpanseBtn,driver);
        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
    }

    @Override
    public void guiVerification(WebDriver driver) throws InterruptedException {
        Operations.matchText(NewExpanseOR.locator.sideBarTitle,NewExpanseOR.UIElementConstant.sideBarTitleText, driver);
        Operations.matchText(NewExpanseOR.locator.merchantLabel,NewExpanseOR.UIElementConstant.merchantText, driver);
        Operations.matchText(NewExpanseOR.locator.merchantPlaceholder,NewExpanseOR.UIElementConstant.merchantPlaceholderText, driver);
        Operations.matchText(NewExpanseOR.locator.expanseDateLabel,NewExpanseOR.UIElementConstant.expanseDateText, driver);
        Operations.matchAttribute(NewExpanseOR.locator.dateInput, NewExpanseOR.UIElementConstant.expanseDatePlaceholderText,"placeholder", driver);
        Operations.matchText(NewExpanseOR.locator.itemizedExpanses,NewExpanseOR.UIElementConstant.itemizedExpensesText, driver);
        Operations.matchText(NewExpanseOR.locator.amountLabel,NewExpanseOR.UIElementConstant.amountText, driver);
        Operations.matchText(NewExpanseOR.locator.categoryLabel,NewExpanseOR.UIElementConstant.categoryText, driver);
        Operations.matchText(NewExpanseOR.locator.categoryPlaceholder,NewExpanseOR.UIElementConstant.categoryPlaceholderText, driver);
        Operations.matchText(NewExpanseOR.locator.claimReimbursement,NewExpanseOR.UIElementConstant.claimReimbursementText, driver);
        Operations.matchText(NewExpanseOR.locator.referenceLabel,NewExpanseOR.UIElementConstant.referenceText, driver);
        Operations.matchAttribute(NewExpanseOR.locator.referenceInput, NewExpanseOR.UIElementConstant.referencePlaceholderText,"placeholder", driver);
        Operations.matchText(NewExpanseOR.locator.addToReportLabel,NewExpanseOR.UIElementConstant.addToReportText, driver);
        Operations.matchText(NewExpanseOR.locator.addToReportPlaceholder,NewExpanseOR.UIElementConstant.addToReportPlaceholderText, driver);
        Operations.matchText(NewExpanseOR.locator.descriptionLabel,NewExpanseOR.UIElementConstant.descriptionText, driver);
        Operations.matchText(NewExpanseOR.locator.uploadReceipts,NewExpanseOR.UIElementConstant.uploadReceiptText, driver);
    }

    @Override
    public void requiredFieldCheck(WebDriver driver) throws InterruptedException {
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.saveBtn, driver);
        Operations.sleep(1000);
        Operations.matchText(NewExpanseOR.locator.expanseDateError,NewExpanseOR.UIElementConstant.expanseDateInvalidText, driver);
        Operations.matchColor(NewExpanseOR.locator.expanseDateError, "#ff4d4f", "color", driver);
        Operations.matchText(NewExpanseOR.locator.expanseCategoryError,NewExpanseOR.UIElementConstant.expanseCategoryErrorText, driver);
        Operations.matchColor(NewExpanseOR.locator.expanseCategoryError, "#ff4d4f", "color", driver);
        Operations.matchText(NewExpanseOR.locator.expanseAmountError,NewExpanseOR.UIElementConstant.expanseAmountErrorText, driver);
        Operations.matchColor(NewExpanseOR.locator.expanseAmountError, "#ff4d4f", "color", driver);

    }

    @Override
    public void createNewExpanseWithReimbursement(WebDriver driver) throws InterruptedException {

        Operations.click(NewExpanseOR.locator.dateInput,driver);
        Operations.selectRandomDateFromDatePicker(NewExpanseOR.locator.dateInput2,1,4,driver);
        Operations.sleep(2000);
        Operations.click(NewExpanseOR.locator.merchantDrpDown,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.merchantDrpDown2,driver);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.merchantDrpDown2,0,driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.categoryDrpDown,driver);
        Operations.sleep(1000);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.categoryDrpDown,2,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.categoryDrpDown2,driver);
        Operations.sleep(1000);
        String amount1 = String.valueOf(Operations.createRandomIntBetween(10,50));
        Operations.sendText(NewExpanseOR.locator.amountInput,amount1,driver);
        Operations.sleep(1000);
        Operations.matchText(NewExpanseOR.locator.totalAmount,amount1,driver);
        Operations.scrollBarDown(driver);

        Operations.sendText(NewExpanseOR.locator.referenceInput,ipsum.getWords(2),driver);
        //Operations.randomDropdownList(NewExpanseOR.locator.addToReportDrpDown,driver);
        Operations.click(NewExpanseOR.locator.addToReportDrpDown,driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(NewExpanseOR.locator.addToReportDrpDown2,driver);
        Operations.sendText(NewExpanseOR.locator.descriptionInput,ipsum.getWords(10),driver);
        Operations.sleep(1000);
        /*Operations.click(NewExpanseOR.locator.uploadBtn,driver);
        Operations.sleep(3000);
        String filePath = System.getProperty("user.dir") + "/src/test/java/mExpanse/Resources/receipt1.jpg";
        Operations.uploadSingleFile(NewExpanseOR.locator.uploadBtn,filePath,driver);
        Operations.sleep(2000);
        Operations.waitUntilElementIsVisible(NewExpanseOR.locator.uploadedFile,driver);
        Operations.sleep(1000);*/
        Operations.click(NewExpanseOR.locator.saveBtn,driver);

    }

    @Override
    public void createNewExpanseWithoutReimbursement(WebDriver driver) throws InterruptedException {

        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
        Operations.sleep(3000);
        Operations.click(NewExpanseOR.locator.dateInput,driver);
        Operations.selectRandomDateFromDatePicker(NewExpanseOR.locator.dateInput2,1,7,driver);
        Operations.sleep(2000);
        Operations.click(NewExpanseOR.locator.merchantDrpDown,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.merchantDrpDown2,driver);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.merchantDrpDown2,0,driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.categoryDrpDown,driver);
        Operations.sleep(1000);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.categoryDrpDown,2,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.categoryDrpDown2,driver);
        Operations.sleep(1000);
        String amount1 = String.valueOf(Operations.createRandomIntBetween(10,50));
        Operations.sendText(NewExpanseOR.locator.amountInput,amount1,driver);
        Operations.sleep(1000);
        Operations.matchText(NewExpanseOR.locator.totalAmount,amount1,driver);
        Operations.scrollBarDown(driver);
        Operations.click(NewExpanseOR.locator.claimReimbursementCheckBox,driver);
        Operations.click(NewExpanseOR.locator.paidThroughDropDown,driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(NewExpanseOR.locator.paidThroughDropDown2,driver);
        Operations.sleep(1000);
        Operations.sendText(NewExpanseOR.locator.referenceInput,ipsum.getWords(2),driver);
        Operations.click(NewExpanseOR.locator.addToReportDrpDown,driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(NewExpanseOR.locator.addToReportDrpDown2,driver);
        Operations.sendText(NewExpanseOR.locator.descriptionInput,ipsum.getWords(10),driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.saveBtn,driver);

    }

    @Override
    public void createNewExpanseWithMultipleItem(WebDriver driver) throws InterruptedException {

        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
        Operations.click(NewExpanseOR.locator.dateInput,driver);
        Operations.selectRandomDateFromDatePicker(NewExpanseOR.locator.dateInput2,1,7,driver);
        Operations.sleep(2000);
        Operations.click(NewExpanseOR.locator.merchantDrpDown,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.merchantDrpDown2,driver);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.merchantDrpDown2,0,driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.categoryDrpDown,driver);
        Operations.sleep(1000);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.categoryDrpDown,2,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.categoryDrpDown2,driver);
        Operations.sleep(1000);
        String amount1 = String.valueOf(Operations.createRandomIntBetween(10,50));
        Operations.sendText(NewExpanseOR.locator.amountInput,amount1,driver);
        Operations.click(NewExpanseOR.locator.addAnotherItem,driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.category2DrpDown,driver);
        Operations.sleep(1000);
        Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.category2DrpDown2,11,driver);
        //Operations.randomDropdownList(NewExpanseOR.locator.category2DrpDown2,driver);
        Operations.sleep(1000);
        String amount2 = String.valueOf(Operations.createRandomIntBetween(10,50));
        Operations.sendText(NewExpanseOR.locator.amount2Input,amount2,driver);
        String totalAmount = String.valueOf(Integer.valueOf(amount1)+Integer.valueOf(amount2));
        Operations.matchText(NewExpanseOR.locator.totalAmount,totalAmount,driver);
        Operations.scrollBarDown(driver);
        Operations.sendText(NewExpanseOR.locator.referenceInput,ipsum.getWords(2),driver);
        Operations.click(NewExpanseOR.locator.addToReportDrpDown,driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(NewExpanseOR.locator.addToReportDrpDown2,driver);
        Operations.sendText(NewExpanseOR.locator.descriptionInput,ipsum.getWords(10),driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.saveBtn,driver);

    }
}
