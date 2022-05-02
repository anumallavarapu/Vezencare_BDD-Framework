package StepDefinitions.HospitalStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;

public class HospitalRegistrationSteps {

	WebDriver driver=null;
	
	@Given("Open browser")
	public void open_browser_and_enter_url() {
		
		
		
	String projectPath=System.getProperty("user.dir");
	System.setProperty("Webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	}

	@And("Enter URL.It will navigated to Hospital registration page")
	public void it_will_navigated_to_hospital_registration_page() {
		
		driver.get("https://qa.vezencare.com/Home/HospitalRegistartion");
		
	}

	@When("Enter all valid inputs")
	public void enter_all_valid_inputs() {

	}

	@And("click on submit button")
	public void click_on_submit_button() {


	}

	@Then("Hospital should successfully registered with vezencare")
	public void hospital_should_successfully_registered_with_vezencare() {

	}

}
