package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElePopUp {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	
	String main_w= driver.getWindowHandle();
	
	System.out.println("main window :"+main_w);
	 WebElement Element = driver.findElement(By.id("windowButton"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 	js.executeScript("arguments[0].scrollIntoView();", Element);

	
	driver.findElement(By.id("windowButton")).click();
	Thread.sleep(2000);
	
	Set<String> all_w= driver.getWindowHandles();
	
	Iterator<String> i1=all_w.iterator();
	
	while (i1.hasNext()) {
		String child_w = (String) i1.next();
		System.out.println(child_w);
		if(!main_w.equals(child_w)) {
			driver.switchTo().window(child_w);
//			Thread.sleep(2000);
//			driver.findElement(By.name("emailid"))
//			.sendKeys("h@gmail.com");
//			Thread.sleep(2000);
//			driver.findElement(By.name("btnLogin")).click();
//			Thread.sleep(2000);
//			driver.close();
		}
	}
	
//	driver.switchTo().window(main_w);
//	System.out.println("in which window we are: "+main_w);
//	Thread.sleep(2000);
//	driver.close();
}
}
