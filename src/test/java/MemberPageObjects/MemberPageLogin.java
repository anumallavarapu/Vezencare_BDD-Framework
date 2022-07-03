package MemberPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

   

public class MemberPageLogin 
{
	WebDriver driver;
	
	By txt_username=By.id("txtUserName");
	
	By txt_password=By.id("txtPassword");
	
	By btn_Login=By.id("login-form-submit");
	
	
	public MemberPageLogin(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enterUsername(String username)
	{
		
		driver.findElement(By.id("txtUserName")).sendKeys(username);
		
		
	}
	public void enterPassword(String password)
	{
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(By.id("login-form-submit")).click();
	}
	
	
	
	public void loginVaildUser(String username,String password)
	{
		driver.findElement(By.id("txtUserName")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("login-form-submit")).click();
		
		
		
	}
}
