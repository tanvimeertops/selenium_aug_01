package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocLinkDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:\\Users\\tops\\eclipse-workspace\\Selenium_01_Aug\\src\\com\\webdriver\\index1.html");
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Click Here")).click();
	
	Thread.sleep(2000);
	driver.close();
}
}
