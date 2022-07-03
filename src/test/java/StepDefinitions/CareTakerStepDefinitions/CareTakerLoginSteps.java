package StepDefinitions.CareTakerStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CaretakerPageObjects.CaretakerLoginPage;
import io.cucumber.java.en.*;

public class CareTakerLoginSteps {
	
	public WebDriver driver;
	public CaretakerLoginPage ctlp;
	
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.out.println("The driver path is:");
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		ctlp= new CaretakerLoginPage(driver,"Btnlogout_CareTaker");
	}

	@When("User Open URL {string}")
	public void user_open_url(String cturl) {
		driver.get(cturl);
	    
	}

	@When("^User enters username as (.*) and password as (.*)")
	public void user_enters_username_as_cusername_and_password_as_cpassword(String cusername, String cpassword) {
	   System.out.println("Username is: " + cusername);
		ctlp.setctUserName(cusername);
	    ctlp.setctpassword(cpassword);
	}

	@When("Click on Caretaker Login")
	public void click_on_caretaker_login() {
		ctlp.clickCTLogin();
	   
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.titleIs("Vezen Care :: DashBoard"));

			if(driver.getTitle().equals("Vezen Care :: DashBoard")) {

				System.out.println("Caretaker login is successful");

			}

			else {

				System.out.println("Caretaker login is not successful");
			}	
		}
		catch (Exception e) {



		}
	    
	}
	
	@Then("Click on Logout button")
	public void Click_on_Logout_button()
	{
		ctlp.clickCTLogOut();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	

	@Then("close browser")
	public void close_browser() {
		
		driver.close();
		driver.quit();
	    
	}



}
