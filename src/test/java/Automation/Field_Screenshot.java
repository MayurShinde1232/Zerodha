package Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Field_Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fb_Logo= driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		
		File src= fb_Logo.getScreenshotAs(OutputType.FILE);
		File desc= new File("D:\\Automatio Testing\\Mayur_Shinde\\fb_Logo.png");
		FileUtils.copyFile(src, desc);
		
		

	}

}
