package com.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {
public static void main(String[] args) throws InterruptedException {
	
	// browser/server setup
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	//open empty browser
	WebDriver driver=new EdgeDriver();
	//to maximize window
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	System.out.println("title is :"+driver.getTitle());
	System.out.println("url is :"+driver.getCurrentUrl());
	
	Thread.sleep(2000);
	
//	driver.close();//close a tab
	driver.quit(); //to close browser
}
}
