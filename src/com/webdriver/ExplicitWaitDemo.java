package com.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	Thread.sleep(2000);
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	
	driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button"))
	.click();
	Thread.sleep(2000);
	String msg= wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//p[text()='WebDriver']"))).getText();
	
	System.out.println("message is :"+msg);
}
}
