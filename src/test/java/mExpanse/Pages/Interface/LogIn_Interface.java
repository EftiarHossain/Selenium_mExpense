package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface LogIn_Interface {
	
	
	  public void guiVerification(WebDriver driver)throws InterruptedException;
	  
	  public  void BlankmaillBlankPassword(WebDriver driver) throws InterruptedException;
	  
	  public void wrongmailCorrectPass(WebDriver driver);
	  
	  public void correctMailWrongPass(WebDriver driver);
	  
	  public void mailNotInFormat(WebDriver driver) throws InterruptedException;
	  
	  public void correctMailCorrectPass(WebDriver driver,String mail,String pass,String role);

}
