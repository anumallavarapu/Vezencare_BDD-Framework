package StepDefinitions.HospitalStepDefinitions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import HospitalPageObjects.HospitalLoginPage;
import io.cucumber.java.en.*;

public class HospitalLoginSteps {
	WebDriver driver = null;
	
	@Given("Hospital on login page")
	public void hospital_on_login_page() {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver", "G:/Eclipse-My Workspace/VezenCare_BDDFrameWork/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

		driver.navigate().to("https://qa.vezencare.com/Home/HospitalLogin");

	}

	@When("^Hospital enters (.*) and (.*)")
	public void hospital_enters_username_and_password(String husername,String hpassword) {

		System.out.println("Hospital enters username and password");
		
		HospitalLoginPage hlp=new HospitalLoginPage(driver);
		hlp.enterUserName(husername);
		hlp.enterPassword(hpassword);
		
		//driver.findElement(By.name("login-form-username")).sendKeys(husername);
		//driver.findElement(By.name("login-form-password")).sendKeys(hpassword);
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("click on login button");
		
		HospitalLoginPage hlp=new HospitalLoginPage(driver);
		hlp.clickLogin();

		driver.findElement(By.name("login-form-submit")).click();

	}

	@Then("Hospital should navigated to Hospital dashboard page")
	public void hospital_should_navigated_to_hospital_dashboard_page() {

		System.out.println("Hospital should navigated to Hospital dashboard page");

		//driver.getPageSource().contains("Dashboard");
		//WebDriverWait wait = new WebDriverWait(driver, 30);


		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.titleIs("Vezen Care :: DashBoard"));

			if(driver.getTitle().equals("Vezen Care :: DashBoard")) {

				System.out.println("Hospital login is successful");

				driver.findElement(By.id("Btnlogout_Hosp")).click();
			}

			else {

				System.out.println("Hospital login is not successful");
			}	
		}
		catch (Exception e) {



		}

		driver.close();
		driver.quit();

	}

}
