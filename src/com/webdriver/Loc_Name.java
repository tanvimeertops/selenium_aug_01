package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loc_Name {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("user-name"))
	.sendKeys("standard_user");
	Thread.sleep(2000);
	
	driver.findElement(By.name("password"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.name("login-button"))
	.click();
	Thread.sleep(2000);
	
	driver.close();
	
}
}
