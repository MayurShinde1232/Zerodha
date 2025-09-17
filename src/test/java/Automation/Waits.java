package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*We can write it once no need to write multiple times.
		//If any element taken time more than provide then it will be synchronization error and 
		 we will be getting NoSuchElementException. */
		
		//Explicit Waits
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
		driver.close();
		

	}

}
