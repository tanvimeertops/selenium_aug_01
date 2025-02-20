package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Wait :
 * 
 * Implicit Wait
 * Explicit Wait
 * 
 */
public class ImplicitWaitDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	// Implicit Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	driver.findElement(By.id("user-name"))
	.sendKeys("locked_out_user");
	Thread.sleep(2000);
	
	driver.findElement(By.id("password"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);
}
}
