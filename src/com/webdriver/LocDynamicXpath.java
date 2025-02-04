package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocDynamicXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/selenium-xpath.html");
	
	//  //tagname[@attr_name='attr_value']
	driver.findElement(By.xpath("//input[@name='uid']"))
	.sendKeys("123");
	
	Thread.sleep(2000);
	//  //tagname[text()='Testing']
String msg= driver.findElement(By.xpath("//b[text()='Testing']")).getText();
System.out.println(msg);
			


}
}
