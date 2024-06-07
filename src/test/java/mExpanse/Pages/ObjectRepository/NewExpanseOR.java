package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class NewExpanseOR {
    public static class locator{


        public static By sideBarMenu = By.xpath("//body/div[@id='root']/section[1]/section[1]/div[1]/button[1]");
        public static By myView = By.xpath("//body/div[@id='root']/section[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]");
        public static By expanse = By.xpath("//a[contains(text(),'Expenses')]");
        public static By newExpanseBar = By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]");

        public static By newExpanseBtn = By.xpath("//span[contains(text(),'New Expense')]");
        public static By sideBarTitle = By.xpath("//div[contains(text(),'Add New Expense')]");
        public static By expanseDateLabel = By.xpath("//label[contains(text(),'Expense Date')]");
        public static By merchantLabel = By.xpath("//label[contains(text(),'Merchant')]");
        public static By itemizedExpanses = By.xpath("//span[contains(text(),'Itemized Expenses')]");
        public static By categoryLabel = By.xpath("//label[contains(text(),'Category')]");
        public static By amountLabel = By.xpath("//label[contains(text(),'Amount')]");
        public static By claimReimbursement = By.xpath("//span[contains(text(),'Claim reimbursement')]");
        public static By claimReimbursementCheckBox = By.xpath("//input[@id='claimReimbursement']");
        public static By referenceLabel = By.xpath("//label[contains(text(),'Reference#')]");
        public static By addToReportLabel = By.xpath("//label[contains(text(),'Add To Report')]");
        public static By descriptionLabel = By.xpath("//label[contains(text(),'Description')]");
        public static By uploadReceipts = By.xpath("//span[contains(text(),'Upload receipts')]");


        public static By expanseDateError = By.xpath("//div[contains(text(),'Please enter a valid expense date.')]");
        public static By expanseCategoryError = By.xpath("//div[contains(text(),'Please select an expense category.')]");
        public static By expanseAmountError = By.xpath("//div[contains(text(),'Please enter a valid expense amount.')]");
        public static By dateInput = By.xpath("//input[@id='date']");
        public static By dateInput2 = By.className("ant-picker-content");
        public static By merchantDrpDown = By.xpath("//input[@id='merchantId']");
        public static By merchantPlaceholder = By.xpath("//span[contains(text(),'Select merchant')]");
        public static By merchantDrpDown2 = By.xpath("//div[@class='ant-select-item-option-content']");
        public static By categoryDrpDown = By.xpath("//input[@id='expenseItems_0_expenseCategoryId']");
        public static By categoryDrpDown2 = By.xpath("//span[@class='ant-select-tree-title']");
        public static By categoryPlaceholder = By.xpath("//span[contains(text(),'Select a category')]");
        public static By category2DrpDown = By.xpath("//input[@id='expenseItems_1_expenseCategoryId']");
        public static By category2DrpDown2 = By.xpath("//span[@class='ant-select-tree-title']");
        public static By amountInput = By.xpath("//input[@id='expenseItems_0_amount']");
        public static By amount2Input = By.xpath("//input[@id='expenseItems_1_amount']");
        public static By totalAmount = By.xpath("//div[@class='CreateExpenseForm_amountTotal__2qGD8']");
        public static By addAnotherItem = By.xpath("//span[contains(text(),'Add another item')]");
        public static By paidThroughDropDown = By.xpath("//input[@id='paidThroughAccountId']");
        public static By paidThroughDropDown2 = By.xpath("//div[@class='ant-select-item-option-content']");
        public static By referenceInput = By.xpath("//input[@id='reference']");
        public static By addToReportDrpDown = By.xpath("//input[@id='reportId']");
        public static By addToReportPlaceholder = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/span[2]");
        public static By addToReportDrpDown2 = By.xpath("//div[@class='ant-select-item-option-content']");
        public static By descriptionInput = By.xpath("//textarea[@id='description']");
        public static By uploadBtn = By.xpath("//span[@class='ant-upload']");
        public static By uploadedFile = By.xpath("//span[@class='ant-upload-list-item-actions']");
        public static By saveBtn = By.xpath("//span[contains(text(),'Save')]");
        public static By cancelBtn = By.xpath("//span[contains(text(),'Cancel')]");

    }

    public static class UIElementConstant{
        public static String sideBarTitleText = "Add New Expense";
        public static String expanseDateText  = "EXPENSE DATE";
        public static String expanseDatePlaceholderText  = "Select date";
        public static String expanseDateInvalidText  = "Please enter a valid expense date.";
        public static String merchantText  = "MERCHANT";
        public static String merchantPlaceholderText  = "Select merchant";
        public static String itemizedExpensesText  = "Itemized Expenses";
        public static String categoryText  = "CATEGORY";
        public static String categoryPlaceholderText  = "Select a category";
        public static String amountText  = "AMOUNT";
        public static String expanseCategoryErrorText  = "Please select an expense category.";
        public static String expanseAmountErrorText  = "Please enter a valid expense amount.";
        public static String claimReimbursementText  = "Claim reimbursement";
        public static String referenceText  = "REFERENCE#";
        public static String referencePlaceholderText  = "Put reference here";
        public static String addToReportText  = "ADD TO REPORT";
        public static String addToReportPlaceholderText  = "Select";
        public static String descriptionText  = "DESCRIPTION";
        public static String uploadReceiptText = "Upload receipts";

    }
}
