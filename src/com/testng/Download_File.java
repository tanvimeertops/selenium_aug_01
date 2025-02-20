package com.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Download_File {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "H:\\Selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://practice-automation.com/file-download/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"post-1042\"]/div/div[3]/div/div/div/div[3]/a")).click();
		Thread.sleep(5000);
		
		// PDF FILE
//		driver.findElement(By.xpath("//*[@id=\"post-1042\"]/div/div[1]/div/div/div/div[3]/a")).click();
//		Thread.sleep(2000);
		
		// file 2
		
//		driver.findElement(By.xpath("//*[@id=\"password_67a45fcf066df_921\"]")).sendKeys("12345678");
//		Thread.sleep(1000);	Thread.sleep(1000);
		
		
//		String main_w = driver.getWindowHandle();  // get address of window
//		System.out.println("main window: "+ main_w);
//		Set<String> all_w =driver.getWindowHandles(); //get all window address
		
//		Iterator<String> i1=all_w.iterator();
		
//		while (i1.hasNext()) {
//			String child_w = (String) i1.next();
//			System.out.println(child_w);
//			if (!main_w.equals(child_w)) {
//				driver.switchTo().window(child_w);
//				System.out.println("switched to child window");
//				driver.findElement(By.xpath("//*[@id=\"password_67a45fcf066df_921\"]")).sendKeys("12345678");
//				Thread.sleep(1000);	Thread.sleep(1000);
//			
//				
//			}
//			
//		}
		
//		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement iframe=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("wpdm-lock-frame")));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        Boolean isModalVisible = (Boolean) js.executeScript(
            "var elem = document.querySelector('#wpdm-locks > div > div');" +
            "return elem && elem.offsetHeight > 0 && elem.offsetWidth > 0;"
        );

        if (isModalVisible) {
		System.out.println("modal visible");
		  Thread.sleep(5000);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"wpdmdlf_67b45ffd55bfc_921\"]/div")));
		driver.findElement(By.id("password_67b34314db68e_921")).sendKeys("12345678");
		Thread.sleep(1000);
//		driver.findElement(By.id("wpdm_submit_67a45fcf066df_921"));
//		Thread.sleep(1000);
//		driver.findElement(By.id("Outlined")).click();
		  }else {
			System.out.println("modal not visible");
		}
	}
	}


