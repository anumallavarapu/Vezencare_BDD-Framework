package hospitalPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HospitalLoginPage {
	
	WebDriver driver;
	
	By txt_username=By.name("login-form-username");
	By txt_password=By.name("login-form-password");
	By btn_login=By.name("login-form-submit");
	By btn_Logout=By.id("Btnlogout_Hosp");
	
	
	public HospitalLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void enterUserName(String husername) {
		
		driver.findElement(txt_username).sendKeys(husername);
	}
	
	public void enterPassword(String hpassword) {
		
		driver.findElement(txt_password).sendKeys(hpassword);
	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	public void clickLogout()
	{
		driver.findElement(btn_Logout).click();
	}
	
	
	public void loginValidUser(String username,String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		driver.findElement(btn_Logout).click();
		
	}
	
}
