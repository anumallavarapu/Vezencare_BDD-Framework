package StepDefinitions.MemberStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import MemberPageObjects.MemberPageLogin;
import io.cucumber.java.en.*;

public class MemberLoginSteps2_POM {
/*	
	WebDriver driver=null;;
	MemberPageLogin login;
	
	
	@Given("Member on home page")
	
	
	public void member_on_home_page() 
	
	{
		
	System.setProperty("webdriver.chrome.driver", "G:\\Eclipse-My Workspace\\VezenCare_BDDFrameWork\\src\\test\\resources\\Drivers\\chromedriver.exe");	
		
	driver=new ChromeDriver();
	
	driver.navigate().to("https://qa.vezencare.com/Home/UserLogin");
	
	}   
		
	   
	

	@When("^Member enters valid (.*) and (.*)")
	public void member_enters_valid_username_and_password(String username,String password) 
	{ 
		  MemberPageLogin login= new MemberPageLogin(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
	   System.out.println("Member enters valid username and password");
	   
	  // driver.findElement(By.id("txtUserName")).sendKeys(username);
	  // driver.findElement(By.id("txtPassword")).sendKeys(password);
	   
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {
		

	    
		System.out.println("clicks on login button");
	    
		driver.findElement(By.id("login-form-submit")).click();
		
		Thread.sleep(3000);
	}

	@Then("Member should navigated to dashboard page")
	public void member_should_navigated_to_dashboard_page() {
	    
		System.out.println("Member should navigated to dashboard page");
		 
		try {
			
		String actualTitle=driver.getTitle();
		
		String expectedTitle="Vezen Care :: DashBoard";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			
			
		{
			
			System.out.println("Member should navigated to dashboard page");
			
		}
		
		else
		{
			System.out.println("Member should not navigated to dashboard page");
		}
		}
		catch(Exception e)
		{
			
		}
		driver.close();
		
		driver.quit();
	}
*/

}
