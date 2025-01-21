package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Css class
 * syntax:
 * tagname.class_value
 * input.inputtext _55r1 _6luy
 */
public class LocCssSelector {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"))
	.sendKeys("pratixa@gmail.com");
			Thread.sleep(2000);
			
	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"))
	.sendKeys("123");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
			
	
}
}
