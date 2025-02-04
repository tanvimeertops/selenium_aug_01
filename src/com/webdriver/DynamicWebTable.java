package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicWebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	Thread.sleep(2000);
	
List<WebElement> tc_size=	driver.findElements
(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	System.out.println("no of col :"+tc_size.size());
	
List<WebElement> tr_size=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
System.out.println("no of row :"+tr_size.size());


for (int i = 1; i <=tr_size.size(); i++) {
	for (int j = 1; j <=tc_size.size(); j++) {
	String data=	driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]"
			+ "/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		System.out.print("   |   "+data);
		Thread.sleep(1000);
	}
	System.out.println();
}
}
}
