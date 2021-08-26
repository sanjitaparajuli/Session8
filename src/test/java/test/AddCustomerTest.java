package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrwoserFactory;
import util.ReadExcel;

public class AddCustomerTest {
	
	WebDriver driver;
	ReadExcel exlread = new ReadExcel("src\\main\\java\\data\\TF_TestData.xlsx");
	String fullName = exlread.getCellData("AddContactInfo", "FullName", 2);
	String companyName = exlread.getCellData("AddContactInfo", "CompanyName", 2);
	String emailName = exlread.getCellData("AddContactInfo", "Email", 2);
	String phone = exlread.getCellData("AddContactInfo", "Phone", 2);
	String  address = exlread.getCellData("AddContactInfo", "Address", 2);
	String  city = exlread.getCellData("AddContactInfo", "City", 2);
	String state = exlread.getCellData("AddContactInfo", "State", 2);
	String  zip = exlread.getCellData("AddContactInfo", "Zip", 2);
	String  country = exlread.getCellData("AddContactInfo", "Country", 2);
	
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		driver = BrwoserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSigninButton();
		
		DashboardPage dashboarPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboarPage.varifyDashboarPage();
		dashboarPage.clickCustomerButton();
		dashboarPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.enterFullName("FullName");
		addCustomerPage.enterCompanyName("CompanyName");
		addCustomerPage.enterEmail("EmailName");
		addCustomerPage.enterPhone("Phone");
		addCustomerPage.enterAddress("Address");
		addCustomerPage.enterCity("City");
		addCustomerPage.enterState("State");
		addCustomerPage.enterZip("Zip");
		addCustomerPage.enterCountry("County");
		
		//BrwoserFactory.tearDown();
	}

}