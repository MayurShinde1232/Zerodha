package Automation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		String ParentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("")).click();
		
		// Parent + Child Window
		
		Set<String> AllId= driver.getWindowHandles();
		//Converting set to list to get data in indexing form.
		
		List<String> list= new ArrayList(AllId);
		System.out.println(AllId);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.close();// It will close current window.
		driver.quit();// It will close all windows.
		
		driver.switchTo().window(ParentWindow);
		driver.quit();
		
		

	}

}
