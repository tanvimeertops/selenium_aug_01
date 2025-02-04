package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EleCheckBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/radio.html");
	Thread.sleep(2000);
	for (int i = 0; i <3; i++) {
		driver.findElement(By.id("vfb-6-"+i)).click();
		Thread.sleep(2000);
	}
	
	Thread.sleep(2000);
	driver.close();
}
}
