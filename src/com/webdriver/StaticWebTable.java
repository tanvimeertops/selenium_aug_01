package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticWebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:\\Users\\tops\\eclipse-workspace\\Selenium_01_Aug\\src\\com\\webdriver\\index2.html");
	Thread.sleep(2000);
	
	for (int i = 2; i <=4; i++) {
		for (int j = 1; j <=3; j++) {
			String data= driver.findElement
					(By.xpath("/html/body/table/"
							+ "tbody/tr["+i+"]/td["+j+"]"))
					.getText();
			System.out.print("  |  "+data);
		}
		System.out.println();
	}
	
	
}
}
