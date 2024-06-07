package mExpanse.Pages.Implementation;

import mExpanse.Pages.Interface.LogIn_Interface;
import mExpanse.Pages.ObjectRepository.LogInOR;

import static mExpanse.Pages.ObjectRepository.LogInOR.Locator;
import static mExpanse.Pages.ObjectRepository.LogInOR.UIElementConstant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mExpance.Library.Operations;;



public class LogIn_Impl implements  LogIn_Interface{


    @Override
    public void guiVerification(WebDriver driver) {
    	
    	
    	Operations.verifyElementIsDisplayed(LogInOR.Locator.Logo, driver);
    	Operations.matchText(LogInOR.Locator.Logo,LogInOR.UIElementConstant.LogoText, driver);
    	
    	Operations.matchText(LogInOR.Locator.WelcomeToMexpence,LogInOR.UIElementConstant.WelcomeToMexpenceText, driver);
    	Operations.matchText(LogInOR.Locator.PleaseSignInToYourAccount, LogInOR.UIElementConstant.PleaseSignInToYourAccount, driver);
    	
    	Operations.matchText(LogInOR.Locator.EmailLevel, LogInOR.UIElementConstant.EmailLevelText, driver);
    	Operations.matchAttribute(LogInOR.Locator.EmailTextBox, LogInOR.UIElementConstant.EmaillaceHolder,"placeholder", driver);
    	
    	Operations.matchText(LogInOR.Locator.PasswordLevel, LogInOR.UIElementConstant.PasswordLevelText, driver);
    	Operations.matchAttribute(LogInOR.Locator.PasswordTextBox, LogInOR.UIElementConstant.PasswordPlaceHolder,"placeholder", driver);
    	Operations.matchText(LogInOR.Locator.ForgotPasswordLink, LogInOR.UIElementConstant.ForgotPasswordLinkText, driver);
    	
    	Operations.matchText(LogInOR.Locator.SignIn, LogInOR.UIElementConstant.SignInText, driver);
    	Operations.matchText(LogInOR.Locator.NewOnOurPlaform, LogInOR.UIElementConstant.NewOnOurPlaformText, driver);
    	Operations.matchText(LogInOR.Locator.CreateAnAccount, LogInOR.UIElementConstant.CreateAnAccountText, driver);
    	
    	
    	
    }
    
    
    public  void BlankmaillBlankPassword(WebDriver driver) throws InterruptedException{
    	
    	Operations.click(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sleep(2000);
    	Operations.clear(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sendText(LogInOR.Locator.EmailTextBox, "sumaa@monstar-lab.com", driver);
    	Operations.click(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.clear(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.click(LogInOR.Locator.SignIn, driver);
        Operations.matchText(LogInOR.Locator.RequiredpassAlert, LogInOR.UIElementConstant.RequiredpassAlertText, driver);
    	Operations.matchColor(LogInOR.Locator.RequiredpassAlert, "#ff4d4f", "color", driver);
    	
    	
    	
    	
    	Operations.click(LogInOR.Locator.EmailTextBox, driver);
    	Operations.clear(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sendText(LogInOR.Locator.PasswordTextBox, "qc1234", driver);
    	Operations.click(LogInOR.Locator.SignIn, driver);
    	Operations.matchText(LogInOR.Locator.RequirdMailAlert, LogInOR.UIElementConstant.RequirdMailAlertText, driver);
    	Operations.matchColor(LogInOR.Locator.RequirdMailAlert, "#ff4d4f", "color", driver);
    	
    	Operations.click(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.clear(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.click(LogInOR.Locator.SignIn, driver);
    	
    	Operations.matchText(LogInOR.Locator.RequirdMailAlert, LogInOR.UIElementConstant.RequirdMailAlertText, driver);
    	Operations.matchText(LogInOR.Locator.RequiredpassAlert, LogInOR.UIElementConstant.RequiredpassAlertText, driver);
    	
    	Operations.matchColor(LogInOR.Locator.RequiredpassAlert, "#ff4d4f", "color", driver);
    	Operations.matchColor(LogInOR.Locator.RequirdMailAlert, "#ff4d4f", "color", driver);
    	
    	
    	
     }
    
    public void wrongmailCorrectPass(WebDriver driver){
    	Operations.click(LogInOR.Locator.EmailTextBox, driver);
    	Operations.clear(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sendText(LogInOR.Locator.EmailTextBox, "sumaa@monstar-lab.com", driver);
    	
    	Operations.click(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.clear(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.sendText(LogInOR.Locator.PasswordTextBox, "qc1234", driver);
    	
    	Operations.click(LogInOR.Locator.SignIn, driver);
    	Operations.waitUntilElementIsVisible(LogInOR.Locator.InCorrectMail, driver);
    	
    	Operations.matchText(LogInOR.Locator.InCorrectMail, LogInOR.UIElementConstant.InCorrectMailText, driver);
   
    	
    	//Operations.matchColor(LogInOR.Locator.InCorrectMail, "#ff4d4f", "color", driver);
    	
    	
    }
    public void correctMailWrongPass(WebDriver driver){
    	
    	Operations.click(LogInOR.Locator.EmailTextBox, driver);
    	Operations.clear(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sendText(LogInOR.Locator.EmailTextBox, "sumaiya@monstar-lab.com", driver);
    	
    	Operations.click(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.clear(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.sendText(LogInOR.Locator.PasswordTextBox, "qce1234", driver);
    	
    	Operations.click(LogInOR.Locator.SignIn, driver);
    	Operations.waitUntilElementIsVisible(LogInOR.Locator.InCorrectPass, driver);
    	
    	Operations.matchText(LogInOR.Locator.InCorrectPass, LogInOR.UIElementConstant.InCorrectPassText, driver);
   
    	
    	//Operations.matchColor(LogInOR.Locator.InCorrectPass, "#ff4d4f", "color", driver);
    	
    	
    }
    public void mailNotInFormat(WebDriver driver) throws InterruptedException{
    	
    	Operations.click(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sleep(2000);
    	Operations.clear(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sendText(LogInOR.Locator.EmailTextBox, "sumaiyamonstar-lab.com", driver);
        Operations.sendText(LogInOR.Locator.PasswordTextBox, "qce1234", driver);
    	
    	Operations.click(LogInOR.Locator.SignIn, driver);
   
    	
    	Operations.matchText(LogInOR.Locator.ValidMailAlert, LogInOR.UIElementConstant.ValidMailAlertText, driver);
   
    	
    	Operations.matchColor(LogInOR.Locator.ValidMailAlert, "#ff4d4f", "color", driver);
    	Operations.sleep(2000);

    	Operations.click(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sleep(2000);
    	Operations.clear(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sendText(LogInOR.Locator.EmailTextBox, "sumaiya@monstar-labcom", driver);
    	  Operations.sendText(LogInOR.Locator.PasswordTextBox, "qce1234", driver);
      	
      	Operations.click(LogInOR.Locator.SignIn, driver);
   
    	
    	Operations.matchText(LogInOR.Locator.ValidMailAlert, LogInOR.UIElementConstant.ValidMailAlertText, driver);
   
    	
    	Operations.matchColor(LogInOR.Locator.ValidMailAlert, "#ff4d4f", "color", driver);
    	
    	
    }
    public void correctMailCorrectPass(WebDriver driver,String mail,String pass,String role){
    	
    	Operations.waitUntilElementIsVisible(LogInOR.Locator.EmailTextBox, driver);
    	Operations.click(LogInOR.Locator.EmailTextBox, driver);
    	Operations.clear(LogInOR.Locator.EmailTextBox, driver);
    	Operations.sendText(LogInOR.Locator.EmailTextBox, mail, driver);
    	
    	Operations.click(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.clear(LogInOR.Locator.PasswordTextBox, driver);
    	Operations.sendText(LogInOR.Locator.PasswordTextBox, pass, driver);
    	
    	Operations.click(LogInOR.Locator.SignIn, driver);
    	Operations.waitUntilElementIsVisible(LogInOR.Locator.LogInSucsesMsg, driver);
    	Operations.matchText(LogInOR.Locator.LogInSucsesMsg, LogInOR.UIElementConstant.LogInSucsesMsgText, driver);
    	
    	Operations.matchText(LogInOR.Locator.RoleName, role, driver);
    	
    	
   }
}
