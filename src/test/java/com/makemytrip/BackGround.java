package com.makemytrip;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackGround {
	public WebDriver driver; 
	
	
@Given("Launching Makemytrip")
	public void launching_Makemytrip() {
		WebDriverManager.edgedriver().setup();
		   driver= new EdgeDriver();
		    driver.get("https://www.makemytrip.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("user clicks ad{int}")
	public void user_clicks_ad(Integer int1) throws Throwable {
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@class='close']")).click();
	    driver.switchTo().parentFrame();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	    Thread.sleep(2000);
	}

	@When("user click HolidayPack")
	public void user_click_HolidayPack() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Holiday Packages']")).click();
	    Thread.sleep(3000);
	}


	@When("User enter the from cities")
	public void user_enter_the_from_cities(DataTable dataTable) throws Throwable {
	    List<String> li= dataTable.asList();
	    String s =li.get(2);
	    
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-testid='"+s+"']")).click();
	}


	@When("User enter the to city in")
	public void user_enter_the_to_city_in(DataTable dataTable) throws Throwable {
		
		Map<Integer,String> mp= dataTable.asMap(Integer.class,String.class);
		String s1=mp.get(2);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Goa']")).click();
	}


	

	@When("User enter in-times")
	public void user_enter_in_times(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		List<String> li= dataTable.asList();
	    String s =li.get(1);
	    
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-testid='"+s+"']")).click();
	}

	@When("User enter out-times")
	public void user_enter_out_times(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Map<Integer,String> mp= dataTable.asMap(Integer.class,String.class);
		String s1=mp.get(3);
		driver.findElement(By.id("toCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Goa']")).click();
	}

	


}
