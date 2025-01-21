package com.webdriver;
import org.openqa.selenium.By;
/*
 * css attribute except id and class everything else is
 * attribute
 * 
 * syn:
 * tagname[attr_name='att_value']
 * input[type='text']
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocCssAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[type='text']"))
	.sendKeys("tanvi@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("input[data-testid='royal_pass']"))
	.sendKeys("123");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("button[type='submit']"))
	.click();
	Thread.sleep(20000);
	
	driver.close();
	
}
}
