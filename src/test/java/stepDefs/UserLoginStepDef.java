package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//	    driver.get("https://the-internet.herokuapp.com/login");
//	    driver.findElement(By.id("username")).sendKeys("tomsmith");
//	    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//	    driver.findElement(By.className("radius")).click();
//	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		driver.get("https://the-internet.herokuapp.com/login");
	    driver.findElement(By.id("username")).sendKeys(strUser);
	    driver.findElement(By.id("password")).sendKeys(strPwd);
	    driver.findElement(By.className("radius")).click();
	}
//	//using DataTable as Lists
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable userCred) {
//	    driver.get("https://the-internet.herokuapp.com/login");
//	    //list of list of string
//	    List<List<String>> data = userCred.asLists();
//	    //will store as
//	    //user1 - id, pwd
//	    //user2 - id pwd
//	    String strUser = data.get(0).get(0);
//	    String strPwd = data.get(0).get(1);
//	    driver.findElement(By.id("username")).sendKeys(strUser);
//	    driver.findElement(By.id("password")).sendKeys(strPwd);
//	    driver.findElement(By.className("radius")).click();
//	}
	//using DataTable as Maps
		@When("User enters credentials")
		public void user_enters_credentials(DataTable userCred) {
		    driver.get("https://the-internet.herokuapp.com/login");
		    //list of map
		    List<Map<String, String>> data = userCred.asMaps();
		    
		    String strUser = data.get(0).get("username");
		    String strPwd = data.get(0).get("password");
		    driver.findElement(By.id("username")).sendKeys(strUser);
		    driver.findElement(By.id("password")).sendKeys(strPwd);
		    driver.findElement(By.className("radius")).click();
		}
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
	    boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	    Assert.assertTrue(isDisp);
	}

}
