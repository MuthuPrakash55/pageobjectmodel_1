package pageobject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.test.base_class;

public class register extends base_class {
		
		public register(WebDriver rdriver) {
			rdriver=driver;
			PageFactory.initElements(rdriver,this);
		}
		
		@FindBy(xpath ="//a[text()=\"Register\"]")
		WebElement register;
		
		@FindBy(xpath = "//h1[text()=\"Signing up is easy!\"]")
		WebElement signup_page;
		
		@FindBy(id ="customer.firstName")
		WebElement fname;
		
		@FindBy(id = "customer.lastName")
		WebElement lname;
		
		@FindBy(id = "customer.address.street")
		WebElement address;
		
		@FindBy(id ="customer.address.city")
		WebElement city;
		
		@FindBy(id = "customer.address.state")
		WebElement state;
		
		@FindBy(id = "customer.address.zipCode")
		WebElement zip;
		
		@FindBy(id = "customer.phoneNumber")
		WebElement phn;
		
		@FindBy(id = "customer.ssn")
		WebElement ssn;
		
		@FindBy(id = "customer.username")
		WebElement uname;
		
		@FindBy(id = "customer.password")
		WebElement password;
		
		@FindBy(id = "repeatedPassword")
		WebElement rpassword;
		
		@FindBy(xpath = "//input[@type=\"submit\"]")
		WebElement submit;
		
		public String first_page() {
			String txt=register.getText();
			Assert.assertEquals(txt, "Register");
			return ("page is landed");
			
		}
		public void register_click() {
			register.click();
		}
		public  String register_page() {
			String title=signup_page.getText();
			assertEquals(title, "Signing up is easy!");
			return ("page is matched");
		
		}
		public void first_name() {
			fname.sendKeys("vijay");
		}
		public void last_name() {
			lname.sendKeys("prakash");
		}
		public void add() {
			address.sendKeys("chennai");
		}
		public void city1() {
			city.sendKeys("chennai");
		}
		public void state1() {
			state.sendKeys("tamilnadu");
		}
		public void zip_code() {
			zip.sendKeys("600028");
		}
		public void ssn_no(){
			ssn.sendKeys("123456789012");
		}
		public void phone_no() {
			phn.sendKeys("9876543213");
		}
		public void user_name() {
			uname.sendKeys("vijayprakash");
		}
		public void pwd() {
			password.sendKeys("vijay@55");
		}
		public void confirm_password() {
			rpassword.sendKeys("vijay@55");
		}
		public void submit_btn() {
			submit.click();
		}
}
