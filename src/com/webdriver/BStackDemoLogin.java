package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BStackDemoLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://bstackdemo.com/signin");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"username\"]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='demouser']")).click();
}
}
