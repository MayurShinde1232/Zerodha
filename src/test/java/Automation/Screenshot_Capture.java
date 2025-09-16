package Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Capture {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();// Webdrivermanager is class, chromedriver is static method
		//It returns a WebDriverManager instance configured for ChromeDriver. And Setup It actually downloads 
		//the driver binary (if not already present) and sets the correct path in your system so Selenium can use it.
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		File desc= new File("D:\\Automatio Testing\\Mayur_Shinde\\Test.png");
		FileUtils.copyFile(src, desc);
		
		
	
		
		

	}

}
