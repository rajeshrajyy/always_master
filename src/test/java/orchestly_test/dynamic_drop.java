package orchestly_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dynamic_drop {
	
static WebDriver driver;
	
	@BeforeClass
	
public static void open_browser()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\temp\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\rajesh\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Selenium_jar\\\\\\\\\\\\\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		

	}
	
	@Test
	public void drop() throws InterruptedException
	{
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		
		
		
		
		driver.findElement(By.id("msdd")).click();
		
	List<WebElement>li=	driver.findElements(By.xpath("//li[@class='ng-scope']//following::a[@class='ui-corner-all']"));
	
	for(int i=0;i<=li.size();i++)
	{
		WebElement ele=li.get(i);
		
		String s=li.get(i).getText();
		
		System.out.println(s);
		
		if(s.equals("Polish"))
		{
			ele.click();
			
			break;
			
		}
		
	}
	
	act.sendKeys(Keys.ENTER).perform();
		
		
	}

}
