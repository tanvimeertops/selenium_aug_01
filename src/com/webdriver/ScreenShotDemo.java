package com.webdriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShotDemo {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name"))
	.sendKeys("locked_out_user");
	Thread.sleep(2000);
	
	driver.findElement(By.id("password"))
	.sendKeys("secret_sauce");
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);
	
	File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	File destFile=new File("H:\\Selenium\\SS\\defect1.png");
	try (FileOutputStream fos = new FileOutputStream(destFile)) {
        byte[] fileContent = Files.readAllBytes(file.toPath());
        fos.write(fileContent);
    }
	
	driver.close();
}
}
