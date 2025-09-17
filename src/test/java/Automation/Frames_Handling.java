package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		//First find out iframe xpath and store in one webelement variable.
		WebElement OuterFrame = driver.findElement(By.xpath(""));
		
		driver.switchTo().frame(OuterFrame);
		//MainFrame--> OuterFrame --> Innerframe.
		WebElement InnerFrame = driver.findElement(By.xpath(""));
		driver.switchTo().frame(InnerFrame);
		
		driver.switchTo().parentFrame();//parentFrame Is a method which comes from WebDriver Interface
		driver.switchTo().defaultContent();// defaultContent Is a method which comes from WebDriver Interface.
		
		
		
		

	}

}
