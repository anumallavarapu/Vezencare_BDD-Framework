package CaretakerPageObjects;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaretakerLoginPage {

	public WebDriver ldriver;
	private String _btnLogoutId;

	public CaretakerLoginPage(WebDriver rdriver, String btnLogoutId) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		_btnLogoutId = btnLogoutId;
	}

	@FindBy(id = "txtUserName")
	@CacheLookup
	WebElement ctusername;

	@FindBy(id = "txtPassword")
	@CacheLookup
	WebElement ctpassword;

	@FindBy(id = "login-form-submit")
	@CacheLookup
	WebElement cbtnLogin;

	// @FindBy(id="Btnlogout_CareTaker")
	// @CacheLookup
	// WebElement cbtnLogOut;

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/div[2]/button")
	@CacheLookup
	WebElement ctBtnLogOutConfirmationBtn;

	public void setctUserName(String cusername) {
		ctusername.clear();
		ctusername.sendKeys(cusername);

	}

	public void setctpassword(String cpassword) {
		ctpassword.clear();
		ctpassword.sendKeys(cpassword);

	}

	public void clickCTLogin() {

		cbtnLogin.click();
	}

	public void clickCTLogOut() {
		try {
			WebElement element = ldriver.findElement(By.id(_btnLogoutId));
			if (element != null) {
				element.click();
				// cbtnLogOut.click();
				clickCTLogOutConfirmation();
			}
		} 
		catch (NoSuchElementException n){
			System.out.println("Invalid login attmpt occurred");
		}
		catch (Exception ex) {
				System.out.println("Error occurred::"+ ex.getMessage());
		}
	}

	private void clickCTLogOutConfirmation() {

		ctBtnLogOutConfirmationBtn.click();
	}

}
