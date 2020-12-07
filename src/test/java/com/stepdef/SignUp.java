package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp extends Base {
	WebDriver driver; 
	@Given("^I am on the demoblaze\\.com home page\\.$")
	public void i_am_on_the_demoblaze_com_home_page() throws Throwable {
  WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver() ;
	 driver.get("http://demo.guru99.com/test/newtours/");
	 driver.manage().window().maximize();
	}

	@When("^i click on “user name”$")
	public void i_click_on_user_name() throws Throwable {
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("pank123");   
	    
	}

	@When("^i create a new password$")
	public void i_create_a_new_password() throws Throwable {
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kaka123");  
	    
	}

	@When("^i click on “sign up”$")
	public void i_click_on_sign_up() throws Throwable {
	driver.findElement(By.xpath("//input[@name='submit']")).click();    
	    
	}

	@Then("^i successfully sign up a new account$")
	public void i_successfully_sign_up_a_new_account() throws Throwable {
	    
	    
	}



}
