package com.makemytrip;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookk {
		public WebDriver driver;
		
		@Given("launch facebook application {string}")
		
		public void launch_facebook_application(String url) {
			 WebDriverManager.edgedriver().setup();
			    driver= new EdgeDriver();
			    driver.get(url);
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		

			@When("user clicks New account")
			public void user_clicks_New_account() {
				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();         
			}


		@When("user clicks {string}")
		public void user_clicks(String fname) {
		    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		}

		@When("clicks  {string}")
		public void clicks(String surname) {
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(surname);
		}


		@When("user click  {string}")
		public void user_click(String phoneno) {
		    driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(phoneno);
		}

		@When("users clicks  {string}")
		public void users_clicks(String pass) {
		    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(pass);
		}

		
		

@When("user clickss  Date of birth {string},{string},{string}")
public void user_clickss_Date_of_birth(String string, String string2, String string3) {
	 WebElement ele= driver.findElement(By.xpath("//select[@id='day']"));
	  Select s= new Select(ele);
	  List<WebElement> option= s.getOptions();
	  for(WebElement ele1:option) {
		  System.out.println(ele1.getText());
		  String s1=ele1.getText();
		  if(s1.contains("2")) {
			  driver.findElement(By.xpath("//option[@value='31']//preceding::option[@value='2']")).click();
		  }
	  }
	  WebElement ele1=driver.findElement((By.xpath("//select[@aria-label='Month']")));
	    Select s1= new Select(ele);
	    List<WebElement> options=s.getOptions();
	    for(WebElement ele2:options) {
	    	System.out.println(ele1.getText());
	    	String s2=ele1.getText();
	    	if(s2.contains("july")) {
	    		driver.findElement(By.xpath("//option[text()='Jul']")).click();
	    	}
	    }
}

		@When("user clicking  Gender")
		public void user_clicking_Gender() {
		   
		}







}
