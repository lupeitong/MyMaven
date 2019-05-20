package com.StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	WebDriver driver;
	@Given("^User in login page$")
	public void user_in_login_page()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	}

	@When("^User enter valid useername and valid password$")
	public void user_enter_valid_useername_and_valid_password()  {
	   driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("abc123");
	}

	@When("^User click the Signin button$")
	public void user_click_the_Signin_button()  {
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();;
	}

	@Then("^Verify user login successfully$")
	public void verify_user_login_successfully()  {
		driver.findElement(By.xpath("//h2[text()='Dashboard ']")).isDisplayed();
	}
}
