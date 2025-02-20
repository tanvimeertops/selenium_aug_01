package com.FW;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DataDrivenDemo {
public String[][] readData() throws InvalidFormatException, IOException {
	String[][] data=null;
	//1.to select filepath
	String filepath="H:\\Selenium\\login.xlsx";
	//2.to make file
	File file=new File(filepath);
	//3.to open excel workbook
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	//4.to open a particular sheet
	Sheet sheet=workbook.getSheet("Sheet1");
	//5. to get no of row
	int nrow=sheet.getPhysicalNumberOfRows();
	System.out.println("no of row is :"+nrow);
	
	data=new String[nrow][];
	
	for (int i = 0; i < data.length; i++) {
		//6.to select a particular row
		Row row=sheet.getRow(i);
		//7. to get no of col
		int ncol=row.getPhysicalNumberOfCells();
		System.out.println("no of col is :"+ncol);
		data[i] =new String[ncol];
		for (int j = 0; j < data[i].length; j++) {
			//8.to select a particular col
			Cell cell=row.getCell(j);
			
			//9.to convert every cell value to string
			cell.setCellType(CellType.STRING);
			
			//10.to read data from the cell
			data[i][j]=cell.getStringCellValue();
			
		}
		
		
	}
	return data;
	
}

@Test
public void test() throws InterruptedException, InvalidFormatException, IOException {
	String[][] data=readData();
	
	
	
	System.setProperty("webdriver.edge.driver",
			"H:\\Selenium\\msedgedriver.exe");
	
	
	for (int i = 0; i < data.length; i++) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name"))
	.sendKeys(data[i][0]);
	Thread.sleep(2000);
	
	driver.findElement(By.id("password"))
	.sendKeys(data[i][1]);
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(2000);
	driver.close();
}
}
}
