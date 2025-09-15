package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lacators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();// manage is method comes from Webdriver interface,
		// Window method comes from opetion interface. And maximize method comes from window interface
		
		// Locators
		//1) Id
		//driver.findElement(By.id("email"));
		
		//2) Name
		//driver.findElement(By.name("email"));
		
		//3) ClassName
		/*driver.findElement(By.className("inputtext _55r1 _6luy"));*/
		
		// 4) TagName
		//driver.findElement(By.tagName("input"));
		 
		// 5) LinkText--> <a href="/home">Go to Home</a>
		//driver.findElement(By.linkText("Go to Home"));
		
		// 6) Partial linktext--> <a href="/products">View all Products here</a>
		
		//driver.findElement(By.partialLinkText("products"));
		
		//7) CSS selector
		
		/* What is CSS Selector?

		CSS Selector is a locator strategy in Selenium that uses CSS rules to identify elements.
		It is faster than XPath in most browsers and more flexible than id/name.
		Works on any HTML attribute (id, class, type, name, etc.).
		<input type="text" id="username" class="form-control" name="user">
		driver.findElement(By.cssSelector("#username"));
		driver.findElement(By.cssSelector(".form-control"));
		driver.findElement(By.cssSelector("input[name='user']"));
		
		Why Use CSS Selector?

✅ Faster than XPath in most cases
✅ More readable than complex XPath
✅ Works with id, class, attributes, hierarchy
		
		
		When to Prefer XPath over CSS?
		When you need to move backwards in DOM (CSS doesn’t support traversing upwards).
		When dealing with dynamic elements with tricky patterns.
		 */
		
		
		
		
		
		
		
		
		

	}

}
