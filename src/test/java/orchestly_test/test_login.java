package orchestly_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Workbook;

public class test_login extends excel_reader {
	
static WebDriver driver;
	
	
	
	@BeforeTest
	public void open_browser() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/SignIn.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		
		
		
		
	}
	
	@Test(dataProvider="loginData")
	public void test(String email,String password) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@ng-model='Email']")).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys(password);
		
	}
	

}
