package orchestly_test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.read.biff.BiffException;

public class test_provider  {
	
	

	static WebDriver driver;
	@Test
	public void open_browser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/SignIn.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	
	public void login() throws InterruptedException
	{
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@ng-model='Email']")).sendKeys("fdsnfklsdflksnflds");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("dsfsdklfjdsfjlsd");
	
	}
}
