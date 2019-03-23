package com.mystepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public WebDriver driver;

	@Given("^enter the valid site$")
	public void enter_the_valid_site(){

		driver = new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^check the title of the \"(.*)\" data$")
	public void check_the_title_of_the_data(String actdata) {

		String title = driver.getTitle();
		if (title.contains(actdata)) {
			System.out.println("test is passed");
		} else {
			System.out.println("test is failed");
		}
	}

	@Then("^homepage should be displayed with login fields$")
	public void homepage_should_be_displayed_with_login_fields()  {

		boolean display = driver.findElement(By.xpath("//img[@src='images/TopFrame_01.jpg']")).isDisplayed();
		if (display) {
			System.out.println("test is passed");

			{
				System.out.println("test is failed");
			}
		}
	}
	
	 //without using Scenario Outline+Exsamples keyword
	 @When("^enter the valid \"([^\"]*)\" and \"([^\"]*)\" fields$") 
	 public void enter_the_valid_userid_and_password_fields(String username,String password) {

	 driver.findElement(By.id("txtuId")).sendKeys(username);
	 driver.findElement(By.id("txtPword")).sendKeys(password); 
	 }
	 
	
	
	 
	//with using Scenario Outline+Exsamples keyword
	 @When("^enter the valid details \"([^\"]*)\" and \"([^\"]*)\" fields$")
	 public void enter_the_valid_details_and_fields(String usernameone, String passwordone)  {
	    
		 driver.findElement(By.id("txtuId")).sendKeys(usernameone);
		 driver.findElement(By.id("txtPword")).sendKeys(passwordone); 
	 }
	 
	
	
	
	// By using DataTable(without using ScenarieOutline+Example keyword)
	@When("^enter the valid login fields$")
	public void enter_the_valid_login_fields(DataTable credentials) {

		List<List<String>> data = credentials.raw(); 
		driver.findElement(By.id("txtuId")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("txtPword")).sendKeys(data.get(0).get(1));
	}

	
	
	
	
	//By using DataTable(without using ScenarieOutline+Examples keyword and Maps )
	@When("^enter the valid username and password fields$") 
	public void enter_the_valid_userid_and_password_fields(DataTable credentials)  {

		for(Map<String,String> data1:credentials.asMaps(String.class,String.class))
		{
			
			driver.findElement(By.id("txtuId")).sendKeys(data1.get("username"));
			driver.findElement(By.id("txtPword")).sendKeys(data1.get("password")); 
		}
	}
	
	
	

	@Then("^click on login buttom$")
	public void click_on_login_buttom()  {

		driver.findElement(By.id("login")).click();
	}

	@Then("^branches button should be displayed$")
	public void branches_button_should_be_displayed()  {

		System.out.println("branches buttom should be displayed");
	}
	
	@Then("^close site$")
	public void close_site()  {

		driver.quit();
	}

}
