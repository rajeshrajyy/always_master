package orchestly_test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.formfill_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test_work {
	
	static WebDriver driver;

	//@Test
	
	public static void main(String args[]) throws InterruptedException
	
	{
		open_browser();
		
	}
	
public static void open_browser() throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\temp\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\rajesh\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Selenium_jar\\\\\\\\\\\\\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		


			
		
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, formfill_page.class);
		
		
		driver.findElement(By.id("msdd")).click();
		
		Thread.sleep(2000);
		

		
	//	formfill_page.skills();
		
Thread.sleep(2000);
		
		formfill_page.Languages_click.click();
		
		Thread.sleep(2000);
		for(int i=0;i<formfill_page.Languages.size();i++)
		{
			WebElement ele=formfill_page.Languages.get(i);
			
			
			
			String s=ele.getText();
			
			System.out.println(s);
			
			if(s.equalsIgnoreCase("Czech"))
				
			{
				ele.click();
			}
		}
		
WebDriverWait wait=new WebDriverWait(driver,20);
		
		formfill_page.name("kumar");
		formfill_page.email.sendKeys("rajesh@gmail.com");
		
		formfill_page.phone.sendKeys("8807609805");
		
		formfill_page.submit.click();
		
		
		
		
		

	
	}}


