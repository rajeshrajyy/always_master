package orchestly_test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class select {
	
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
	public void sel()
	{
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		
		sel.selectByValue("APIs");
		
		List<WebElement>ele= sel.getOptions();
		
		for(int i=0;i<=ele.size();i++)
		{
			
			
			String s=ele.get(i).getText();
			
			System.out.println(s);
			
			if(s.equalsIgnoreCase("SQL"))
			{
					sel.selectByVisibleText(s);
					
					break;
			}
			
			
			
		}
		
		
	}
	
	
	

}
