package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
			driver.manage().window().maximize();
			WebElement drpDown= driver.findElement(By.tagName("select"));
			Select sel= new Select(drpDown);
			//sel.selectByIndex(10);
			//sel.selectByVisibleText("India");
			//sel.selectByValue("India");
			
			//If dropdowns are dynamic then use select by  visible text method.
			
			//sel.getOptions();// It resturns all list of dropdown elements.
			/*List<WebElement> list= sel.getOptions();
			
			System.out.println(list.size());
			
			// Print all dropdown options
			
			for(WebElement ele: list )
			{
				System.out.println(ele);
			}
			*/
			

	}

}
