package orchestly_test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import orchestly.wrapper_class;



public class frame extends wrapper_class {
	




	wrapper_class obj=new wrapper_class();
	
	@BeforeClass
	
public void open_browser()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\temp\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\rajesh\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Selenium_jar\\\\\\\\\\\\\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		

	}
	
	
	@Test(priority=2)
	
	public void frame1() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		
		
		List <WebElement>li=	driver.findElements(By.xpath("//input[@type='checkbox']"));
			for(int i=0;i<li.size();i++)
			{
				WebElement ele=li.get(i);
				String s=li.get(i).getText();
				
				System.out.println(s);
				
				if(s.equalsIgnoreCase("Cricket"))
				{
					ele.click();
				}
				
			
				
			}
				driver.quit();
	
				
			}
	
	
	
//	@Test(priority=1)
	public void mul_frame() throws InterruptedException
	{
		
		driver.findElement(By.id("multi")).click();
		
		String parent=driver.getWindowHandle();
		
		
	Set<String>win=	driver.getWindowHandles();
	
	for(String child:win)
	{
		
		if(!parent.equals(child))
		{
			driver.switchTo().window(child);
			
			Thread.sleep(2000);
			
			driver.close();
		}
		
		
	}
		
		
	}
	
	
			
			
		
	/*
	 * public void take_sc(String dest)
	 * 
	 * {
	 * 
	 * TakesScreenshot ts=(TakesScreenshot)driver;
	 * 
	 * File src=ts.getScreenshotAs(OutputType.FILE);
	 * 
	 * try { FileUtils.copyFile(src, new File(dest)); } catch (IOException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	
	
		
		
		
	}


