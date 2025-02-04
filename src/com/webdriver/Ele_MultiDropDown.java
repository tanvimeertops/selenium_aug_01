package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * Select by 
 * index
 * value
 * visible text
 */
public class Ele_MultiDropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://output.jsbin.com/osebed/2");
	Thread.sleep(2000);
	
	WebElement e1=  driver.findElement(By.id("fruits"));
	
	Select s1=new Select(e1);
	
	s1.selectByIndex(2);
	Thread.sleep(2000);
	
	s1.selectByValue("banana");
	Thread.sleep(2000);
	
	s1.selectByVisibleText("Grape");
	Thread.sleep(2000);
	
	driver.close();
}
}
