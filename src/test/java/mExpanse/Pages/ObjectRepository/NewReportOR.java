package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class NewReportOR {

    public static class Locator{


        public static By sideNavMenuMyView =By.xpath("//*[@id=\"root\"]/section/aside/div/div[2]/div[1]/div[1]/div[2]");
        public static By sideNavSubMenuReport =By.xpath("//a[contains(text(),'Reports')]");
        public static By newReportCTA =By.xpath("//span[contains(text(),'New Report')]");
        public static By drawerTitleNewReport =By.xpath("//div[contains(text(),'New Report')]");
        public static By drawerCloserBTN =By.xpath("/html/body/div[3]/div/div[2]/div/div/div[1]/div/button");
        public static By fieldTitleReportName =By.xpath("//label[contains(text(),'Report Name')]");
        public static By fieldReportNameErrorAlert =By.xpath("//div[contains(text(),'Please enter the report name')]");
        public static By fieldTitleBusinessPurpose =By.xpath("//label[contains(text(),'Business Purpose')]");
        public static By fieldTitleDurationFrom =By.xpath("//label[contains(text(),'Duration (From)')]");
        public static By fieldTitleDurationTo =By.xpath("//label[contains(text(),'Duration (To)')]");
        public static By reportNameField =By.xpath("//input[@id='name']");
        public static By businessPurposeField =By.xpath("//textarea[@id='businessPurpose']");
        public static By fromDateField =By.xpath("//input[@id='fromDate']");
        public static By fromDateTable =By.xpath("//table[@class='ant-picker-content']");
        public static By toDateField =By.xpath("//input[@id='toDate']");
        public static By toDateTable =By.xpath("/html/body/div[5]/div/div/div/div/div[1]/div[2]/table");
        public static By saveButton =By.xpath("//span[contains(text(),'Save')]");
        public static By cancelButton =By.xpath("//span[contains(text(),'Cancel')]");
        public static By creationSubmitAlert =By.xpath("//span[contains(text(),'The report created successfully')]");


    }


    public static class UIElementConstant{


        public static  String drawerTitleNewReport="New Report";
        public static  String fieldTitleReportName="REPORT NAME";
        public static  String fieldTitleBusinessPurpose="BUSINESS PURPOSE";
        public static  String fieldTitleDurationFrom="DURATION (FROM)";
        public static  String fieldTitleDurationTo="DURATION (TO)";
        public static  String reportNameField="Enter the report name";
        public static  String businessPurposeField="Enter the business purpose";
        public static  String fromDateField="Select start date";
        public static  String toDateField="Select end date";
        public static  String saveButton="Save";
        public static  String cancelButton="Cancel";
        public static  String creationSubmitAlert="The report created successfully";
        public static  String fieldReportNameErrorAlert="Please enter the report name";


    }
}
