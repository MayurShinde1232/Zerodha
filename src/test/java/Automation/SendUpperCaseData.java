package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendUpperCaseData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement login= driver.findElement(By.xpath("//input[@id='email']"));
		Actions act= new Actions(driver);
		act.keyDown(login, Keys.SHIFT).sendKeys("mayur@gmail.com").keyUp(Keys.SHIFT).build().perform();
		

	}

}
