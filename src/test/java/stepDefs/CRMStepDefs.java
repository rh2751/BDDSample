package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDefs {
	
//	@BeforeAll
//	public static void initBeforeAllDB() {
//		System.out.println("BeforeAll Init DB....");
//	}
	
//	@AfterAll
//	public static void closeAfterAllDB() {
//		System.out.println("AfterAll Close DB....");
//	}
	
//	@Before
//	public static void initBeforeDB() {
//		System.out.println("Before Init DB....");
//	}
	
//	@After
//	public static void closeAfterDB() {
//		System.out.println("After Close DB....");
//	}
	
//	@BeforeStep
//	public static void initBeforeStepDB() {
//		System.out.println("BeforeStep Init DB....");
//	}
	
//	@AfterStep
//	public static void closeAfterStepDB() {
//		System.out.println("AfterStep Close DB....");
//	}
	
	@Before("@SmokeTest")
	public static void initChorme() {
		System.out.println("Init Chorme....");
	}
	
	@Before("@RegressionTest")
	public static void initEdge() {
		System.out.println("Init Edge....");
	}
	
	@Given("User is logged in")
	public void user_is_logged_in() {
	    System.out.println("User is logged in");
	}
	@When("User creates a new contact")
	public void user_creates_a_new_contact() {
	    System.out.println("User creates a new contact");
	}
	@When("User view contact details")
	public void user_view_contact_details() {
	    System.out.println("User view contact details");
	}
	@When("User delete a contact")
	public void user_delete_a_contact() {
	    System.out.println("User delete a contact");
	}
	@When("User creates a new deal")
	public void user_creates_a_new_deal() {
	    System.out.println("User creates a new deal");
	}
	@When("User view deal details")
	public void user_view_deal_details() {
	    System.out.println("User view deal details");
	}
	@When("User delete a deal")
	public void user_delete_a_deal() {
	    System.out.println("User delete a deal");
	}
	@When("User creates a new task")
	public void user_creates_a_new_task() {
	    System.out.println("User creates a new task");
	}
	@When("User view task details")
	public void user_view_task_details() {
	    System.out.println("User view task details");
	}
	@When("User delete a task")
	public void user_delete_a_task() {
	    System.out.println("User delete a task");
	}
}
