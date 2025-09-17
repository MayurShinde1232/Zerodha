package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt= driver.switchTo().alert();
		//alt.accept();
		//alt.dismiss();
		
		String text= alt.getText();
		System.out.println(text);
		// If there is no alerts on page then you will be getting NoAlertsPresentException.
		

	}

}
