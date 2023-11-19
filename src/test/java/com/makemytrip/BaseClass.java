package com.makemytrip;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass implements IBaseClass{
	
	public static WebDriver driver;
	
	public void browserLaunch(String url) {
		WebDriverManager.edgedriver().setup();
		  driver= new EdgeDriver(); 
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
	}

	@Override
	public void scrollDown() {

		 JavascriptExecutor js= (JavascriptExecutor) driver;
		 WebElement wel=driver.findElement(By.xpath("//h2[text()='💡 Simply fill-up the form below to begin:']"));
		 
		 WebElement e1=driver.findElement(By.xpath("//iframe[@id='JotFormIFrame-82892910187466']"));
		 js.executeScript("arguments[0].scrollIntoView(true)",wel);
		 driver.switchTo().frame(0);
	}

	@Override
	public void sendKeys1(WebElement e2,String value) {
		e2.sendKeys(value);
	}
	@Override
	public void sendKeys2(WebElement e3, String value) {
		e3.sendKeys(value);
	}
	@Override
	public void sendKeys3(WebElement e4, String value) {
		e4.sendKeys(value);
		
	}

	
	@Override
	public void button(WebElement e) {
		e.click();
		
	}

	
	
	



	
}
