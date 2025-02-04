package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DoubtSession {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/automation-practice-form");
	Thread.sleep(2000);
	WebElement Element = driver.findElement(By.id("dateOfBirthInput"));
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 	js.executeScript("arguments[0].scrollIntoView();", Element);
	 	Thread.sleep(2000);
	 	Element.click();
	driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[3]"))
	.click();
	
	WebElement upload_pic= 
			driver.findElement(By.id("uploadPicture"));
	upload_pic
	.sendKeys("H:\\Downloads\\WORKSHOP_PRACTICALS\\AR Book.pdf");
	
	
	
}
}
