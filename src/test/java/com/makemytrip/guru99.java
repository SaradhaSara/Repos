package com.makemytrip;

import java.awt.Button;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {
	public static WebDriver driver;
	
  public static	String url="https://www.guru99.com/become-an-instructor";
	public static void main(String[] args) throws InterruptedException, Throwable {
		

		
		
		BaseClass b= new BaseClass();
		b.browserLaunch(url);
		b.scrollDown();
		
	 
	

	 WebElement e2= driver.findElement(By.xpath("//input[@id='input_98_field_1']"));
	 b.sendKeys1(e2, "sara");
	 
	 WebElement e3=driver.findElement(By.xpath("//input[@type='email']"));
	 b.sendKeys2(e3, "saraa.saradha@gmail.com");
	 
	 WebElement e4=driver.findElement(By.xpath("//input[@type='number']"));
	 b.sendKeys3(e4, "778888888");
	
	 Thread.sleep(3000);

	 WebElement a= driver.findElement(By.xpath("(//button[text()='Next'])[3]"));
	 b.button(a);
	 
	 Thread.sleep(3000);
	 WebElement c=driver.findElement(By.xpath("(//span[text()='YES'])[1]"));
	 c.click();
	 
}
}

