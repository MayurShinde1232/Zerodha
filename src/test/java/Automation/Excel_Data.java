package Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Data {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String filePath= System.getProperty("user.dir")+"\\Test_Data\\Data.xlsx";
		
		FileInputStream fs= new FileInputStream(filePath);
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		
		String EmailData= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String PassData= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(EmailData);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PassData);
		
		
		
		
		
		

	}

}
