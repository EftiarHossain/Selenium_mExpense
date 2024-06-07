package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInOR {
	
     public static class Locator{

          public static By Logo=By.xpath("//h3[@class='ant-typography AuthScreens_logoText__14Y3q'][contains(text(),'MExpense')]");
          public static By WelcomeToMexpence=By.xpath("//h4[@class='ant-typography'][contains(text(),'Welcome to MExpense!')]");
          public static By PleaseSignInToYourAccount=By.xpath("//span[@class='ant-typography'][contains(text(),'Please sign-in to your account')]");
          public static By EmailLevel=By.xpath("//label[@class='ant-form-item-required'][@title='Email']");
          public static By EmailTextBox=By.cssSelector("input#username");
          
          public static By PasswordLevel=By.xpath("//span[@class='ant-typography AuthScreens_passwordLabelLogin__3q8II'][contains(text(),'Password')]");
          public static By PasswordTextBox=By.xpath("//input[@class='ant-input'][@id='password']");
         
          public static By ForgotPasswordLink=By.xpath("//a[@class='AuthScreens_smallText__3OV-R'][contains(text(),'Forgot password?')]");
        
          public static By SignIn = By.xpath("//span[contains(text(),'Sign in')]");
          public static By NewOnOurPlaform=By.xpath("//span[@class='ant-typography'][contains(text(),'New on our platform?')]");
          public static By CreateAnAccount=By.xpath("//a[contains(text(),'Create an account')]");
          public static By InavlidMailAlert=By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please enter a valid email address')]");
          public static By RequirdMailAlert=By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please enter your email')]");
          public static By RequiredpassAlert=By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please enter your password')]");
          public static By InCorrectPass=By.xpath("//span[contains(text(),'Incorrect password. Please try again.')]");
          public static By InCorrectMail=By.xpath("//span[contains(text(),'Incorrect email. Please try again.')]");
          public static By ValidMailAlert=By.xpath("//div[@class='ant-form-item-explain-error'][contains(text(),'Please enter a valid email address')]");
          public static By LogInSucsesMsg=By.xpath("//span[contains(text(),'Login successful')]");
          public static By RoleName=By.xpath("//span[@class='ant-typography SidebarLayoutHeader_role__3u_iF']");
          
          
          
     
        
    
     }
     

     public static class UIElementConstant{
    	 

    	 public static  String LogoText="MExpense";
         public static String WelcomeToMexpenceText="Welcome to MExpense!";
         public static  String PleaseSignInToYourAccount="Please sign-in to your account";
         public static  String EmailLevelText="EMAIL";
         public static String EmaillaceHolder="Enter your email";
         public static String PasswordLevelText="PASSWORD\n"
         		+ "Forgot password?";
         public static String PasswordPlaceHolder="Enter your password";
         public static  String ForgotPasswordLinkText="Forgot password?";
       
         public static String SignInText = "Sign in";
         public static  String NewOnOurPlaformText="New on our platform? Create an account";
         public static String CreateAnAccountText="Create an account";
         public static String InavlidMailAlertText="Please enter a valid email address";
         public static String RequirdMailAlertText="Please enter your email";
         public static String RequiredpassAlertText="Please enter your password";
         public static String InCorrectPassText="Incorrect password. Please try again.";
         public static String InCorrectMailText="Incorrect email. Please try again.";
         public static String ValidMailAlertText="Please enter a valid email address";
         public static String LogInSucsesMsgText="Login successful";
         
         
         
     
     }
     
}
