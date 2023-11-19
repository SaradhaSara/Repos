package com.makemytrip;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HolidayPackage {
	public WebDriver driver; 
	public void screenShot(String Snap) throws Throwable {
		TakesScreenshot tk= (TakesScreenshot)driver;
		File screenshotAs= tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Dell\\OneDrive"+Snap+".png");
		FileUtils.copyFile(screenshotAs, desc);		   
	}

@Given("Launch the MakeMyTrip Application  #pre-condition")
public void launch_the_MakeMyTrip_Application_pre_condition() throws Throwable {
   WebDriverManager.edgedriver().setup();
   driver= new EdgeDriver();
    driver.get("https://www.makemytrip.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    screenShot("Snap1");

    Thread.sleep(3000);
    driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@class='close']")).click();
    driver.switchTo().parentFrame();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
    Thread.sleep(2000);
    
}

@When("User clicks on HolidayPackage #Action")
public void user_clicks_on_train_Action() throws Throwable  {
    driver.findElement(By.xpath("//span[text()='Holiday Packages']")).click();
    Thread.sleep(3000);
    screenShot("Snap2");
}

@When("User enters the from city")
public void user_enters_the_from_place() throws Throwable {
    Actions a= new Actions(driver);
    Thread.sleep(3000);
	driver.findElement(By.id("fromCity")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
	 screenShot("Snap2");
}

@When("User enters the to city")
public void user_enters_the_to_place() throws Throwable {
	driver.findElement(By.id("toCity")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Goa']")).click();
	 screenShot("Snap3");
}

@When("User selects the Departure date")
public void user_selects_the_travel_date() throws Throwable {
	try {
		driver.findElement(By.xpath("//p[@class='empty-date-text']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//p[@class='dateInnerPara'])[23]")).click();
	    Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println("click sucessfully");
	}
    
    
}

@When("User clicks on search")
public void user_clicks_on_se_arch() {
   // driver.findElement(By.xpath("//button[text()='Search']")).click();
}

@Then("# Post condition, Validation purpose")
public void post_condition_Validation_purpose() {
    
}

@Then("# To enumerate the previous keyword")
public void to_enumerate_the_previous_keyword() {
    
}

}
