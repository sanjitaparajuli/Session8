package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]") WebElement ZIP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]") WebElement SAVE_BUTTON_ADD_CUSTOMER_ELEMENT;
	
	public void enterFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName + randomGenerator(999));
	}
	
	public void enterCompanyName(String company) {
		selectDropdown(COMPANY_ELEMENT, company);
	}
	
	public void enterEmail(String email) {
		EMAIL_ELEMENT.sendKeys(randomGenerator(99) + email);
	}
	
	public void enterPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + randomGenerator(99));
	}
	
	public void enterAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
		
	}
	
	public void enterCity(String city) {
		CITY_ELEMENT.sendKeys(city);
		
	}
	public void enterState(String state) {
		STATE_ELEMENT.sendKeys(state);
		
	}
	public void enterZip(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
		
	}
	public void enterCountry(String country) {
		selectDropdown (COUNTRY_ELEMENT,country);
		
	}
	
	public void clickSaveButtonOnAddCustomerPage() {
		SAVE_BUTTON_ADD_CUSTOMER_ELEMENT.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}