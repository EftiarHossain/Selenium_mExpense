package mExpanse.Pages.TestCases;

import mExpanse.Pages.Implementation.LogIn_Impl;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mExpance.Library.BaseClass;


@Listeners(mExpanse.Listener.CustomListener.class)

public class LogInTC extends BaseClass{

	 
	 LogIn_Impl login= new LogIn_Impl();
	 
	
	@BeforeClass
    public void setupDriver(){
       
        setUp();
    }


    @Test(priority = 1)
    public void uiElementVerification(){
    	login.guiVerification(driver);
    	
    }

   @Test(priority = 2)
    public void mailFormatValidation() throws InterruptedException{
    	login.mailNotInFormat(driver);
    	
    }

   @Test(priority = 3)
    public void mailPassNotSpecified() throws InterruptedException{
    	login.BlankmaillBlankPassword(driver);
    	
    }
    
   @Test(priority = 4)
    public void wrongmailCorrectPass(){
    	login.wrongmailCorrectPass(driver);
    	
    }
   @Test(priority = 5)
    public void correctMailWrongPass(){
    	login.correctMailWrongPass(driver);
    	
    }	
    
    @Test(priority = 6)
    public void correctMailCorrectPass(){
    	login.correctMailCorrectPass(driver,getMail("adminEmail"),getPassword("adminPass"),"Admin");
    	
    }	
    
    

    @AfterTest
    public void  testCaseTearDown() {
       tearDown();
    	
    }
    

}
