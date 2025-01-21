package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loc_ID {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name"))
	.sendKeys("standard_user");
	Thread.sleep(2000);
	
	driver.findElement(By.id("password"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);
	driver.close();
	
}
}
