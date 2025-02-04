package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocStaticXpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
	Thread.sleep(2000);
	///html/body/div[2]/div/div/button
	driver.close();
	
}
}
