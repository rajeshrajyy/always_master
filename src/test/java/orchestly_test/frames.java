package orchestly_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class frames {

	
	
static WebDriver driver;
	
	@BeforeClass
	
public static void open_browser()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\temp\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\rajesh\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Selenium_jar\\\\\\\\\\\\\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		

	}
	
	
	//@Test
	
	public void frames()
	{
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		
		driver.findElement(By.xpath("//title[text()='SingleFrame']//following::body/section/div/div/div/input[1]")).sendKeys("test");
		
		
		
		
		
	}
	
	
@Test
	
	public void mul_frames()
	{
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
	List<WebElement> ele=	driver.findElements(By.tagName("iframe"));
	
	System.out.println(ele.size());
	
	for(int i=0;i<=ele.size();i++)
	{
		WebElement e=ele.get(i);
		
		String s=ele.get(i).getText();
		
		driver.switchTo().frame(i);
		
		
	}
		
		
	}
}
