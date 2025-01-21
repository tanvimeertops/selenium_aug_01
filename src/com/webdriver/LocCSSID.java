package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * CSS selector
 * 
 *  id
 *  by css id
 *  syn:
 *  tagname#id
 *  input#email
 *  
    class
    attribute
 */
public class LocCSSID {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input#email"))
	.sendKeys("tanci@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input#pass"))
	.sendKeys("123");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login"))
	.click();
	Thread.sleep(20000);
	driver.close();
	
	
	
}
}
