package mExpanse.Pages.TestCases;

import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.LogIn_Impl;

import mExpanse.Pages.ObjectRepository.LogInOR;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mExpance.Library.BaseClass;



public class TestTC extends BaseClass{


    LogIn_Impl login= new LogIn_Impl();


    public By termsCheckbox = By.xpath("//*[@id=\"tnc\"]");
    public By createAccButton = By.xpath("//*[@id=\"start-of-content\"]/div/div/div/div[1]/div[2]/button/div/div/div[3]");
    public By testEmailSwitchTab = By.xpath("//*[@id=\"email\"]");
    public By testPassSwitchTab = By.xpath("//*[@id=\"pass\"]");
    public By testSwitchedLink = By.xpath("//*[@id=\"nav-logo\"]/img");
    public By testSubmitSwitchTab = By.cssSelector("div.ant-drawer.ant-drawer-right.FormDrawer_drawer__1ysD3 div.ant-drawer-content-wrapper div.ant-drawer-content div.ant-drawer-wrapper-body div.ant-drawer-body > form.ant-form.ant-form-vertical");





    @BeforeClass
    public void setupDriver(){

        setUp();
    }


    @Test(priority = 1)
        public void correctMailCorrectPass(){
            String mail=getMail("adminEmail");
            String pass=getPassword("adminPass");
            login.correctMailCorrectPass(driver,mail,pass,"Admin");

        }


    @Test(priority = 2)
    public void method_test() throws InterruptedException {

        Operations.sleep(8000);
        Operations.click(testSubmitSwitchTab, driver);
        Operations.sendText(testSubmitSwitchTab, "text",  driver);




        /*Operations.scrollIntoElement(testSwitchedLink, driver);
        Operations.verifyElementIsPresent(termsCheckbox, driver);
        Operations.verifyElementIsDisplayed(createAccButton, driver);
        Operations.verifyElementIsSelected(termsCheckbox, driver);
        Operations.click(termsCheckbox, driver);
        Operations.verifyElementIsSelected(termsCheckbox, driver);
        Operations.verifyElementIsEnabled(termsCheckbox, driver);
        Operations.waitUntilElementIsClickable(createAccButton, driver);


    }


    @AfterTest
    public void  testCaseTearDown() {
        tearDown(); */

    }


}
