import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Copy_Paste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement login= driver.findElement(By.xpath("//input[@id='email']"));
		login.sendKeys("Mayur@gmail.com");
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();
		
		

	}

}
