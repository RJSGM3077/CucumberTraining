package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginWebPage {
	WebDriver driver;
	@Given("^User is on login page$")
	
	public void user_is_on_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\Google\\\\Chrome\\\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^User tries to open with the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_tries_to_open_with_the_credentials_and(String arg1,String arg2) throws Throwable {
		//List<String> Credentials=dataTable.asList(String.class);
		//String arg1 = Credentials.get(0);
		//String arg2 = Credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	   
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	   
	}

	@Then("^user should be able to log in and see the home page$")
	public void user_should_be_able_to_log_in_and_see_the_home_page() throws Throwable {
	  boolean Status = driver.findElement(By.linkText("welcome Admin")).isDisplayed();
	  Assert.assertTrue(Status);
	  
	}

}
