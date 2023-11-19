package com.makemytrip;

import org.openqa.selenium.WebElement;

public interface IBaseClass {

	
	public void browserLaunch(String url);
	public void scrollDown();
	public void sendKeys1(WebElement e,String value);
	public void sendKeys2(WebElement e, String value);
	public void sendKeys3(WebElement e, String value);
	public void button (WebElement e);
	
}



