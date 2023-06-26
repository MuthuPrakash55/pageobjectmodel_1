package bdd.test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import pageobject.register;

public class register_step_def extends base_class {
	
	@After
    public void capturescreenshot(Scenario scenario) {
    	byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    	scenario.attach(screenshot, "image/png", scenario.getName());
    }
	
	@Given("user opens {string} browser")
	public void user_opens_browser(String browser) {
	    switch (browser) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			break;
		}
	    reg=new register(driver);
	   
	}

	@When("user enters the url of {string}")
	public void user_enters_the_url_of(String url) {
	    driver.get(url);
	}

	@Then("user navigate to the login page")
	public void user_navigate_to_the_login_page() {
	      String page1=reg.first_page();
	      System.out.println(page1);
	}

	@Then("use click the register button")
	public void use_click_the_register_button() {
	    reg.register_click();
	   
	}

	@Then("user navigate to the register page")
	public void user_navigate_to_the_register_page() {
		String page2=reg.register_page(); 
	   System.out.println(page2);
	}

	@Then("user want to fill the required field in that page")
	public void user_want_to_fill_the_required_field_in_that_page() {
	    reg.first_name();
	    reg.last_name();
	    reg.add();
	    reg.city1();
	    reg.state1();
	    reg.zip_code();
	    reg.ssn_no();
	    reg.phone_no();
	    reg.user_name();
	    reg.pwd();
	    reg.confirm_password();
	   
	}

	@When("user clicks the register button")
	public void user_clicks_the_register_button() {
	    reg.submit_btn();
	   
	}

	@Then("user navigate to the profile page")
	public void user_navigate_to_the_profile_page() {
	    
	   
	}

}
