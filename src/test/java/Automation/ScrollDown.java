package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);// Thread is class which has sleep method
		
		JavascriptExecutor js= driver;
		//js.executeScript("window.scrollBy(0,200)", "");
		//Thread.sleep(2000);
		
		
		//Scroll upto perticular element
		
		WebElement element= driver.findElement(By.xpath("//input[@id='email']"));
		
		js.executeScript("arguments[0]ScrollIntoView()", element);
		
		

	}

}
