package com.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	WebDriver driver;
	
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "H:\\Selenium\\msedgedriver.exe");
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);

		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
	  
  
}
