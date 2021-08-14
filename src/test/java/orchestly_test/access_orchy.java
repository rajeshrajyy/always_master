package orchestly_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class access_orchy {
	
static WebDriver driver;
	
	
	
	@BeforeSuite
	public void open_browser()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://orchestlymigration.localzoho.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
	}
	
	@BeforeTest()
	@Parameters({"user_id","Password"}) 
	public void login(String user_id,String Password) throws InterruptedException
	{
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='LOGIN_ID']")).sendKeys(user_id);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn blue' and @id='nextbtn']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(Password);
		
		driver.findElement(By.xpath("//button[@class='btn blue' and @id='nextbtn']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		try {
			driver.findElement(By.id("rmLaterBtn")).isDisplayed();
			
			driver.findElement(By.id("rmLaterBtn")).click();
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
		
		}
		
		
	
	@Test
	
	public void create_job() throws InterruptedException
	{
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='job_nav_add']")).click();
		
		driver.findElement(By.id("job_title")).sendKeys("orchy");
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("savejob_btn")));
		
		driver.findElement(By.id("savejob_btn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='zoho-close m0']")));
		
		
		driver.findElement(By.xpath("//span[@class='zoho-close m0']")).click();
		
	}
	
	@Test
	public void navigateTo_layout()
	
	{
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Settings']")));
		
		driver.findElement(By.xpath("//span[@title='Settings']")).click();
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@name='layout']")));
		
		driver.findElement(By.xpath("//div[@name='layout']")).click();
		
		
		
		
	}
	
	@Test
	public void navigateTo_users()
	
	{
		
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Settings']")));
		
		
		driver.findElement(By.xpath("//span[@title='Settings']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@name='user']")));
		
		driver.findElement(By.xpath("//div[@name='user']")).click();
		
		
	}
	@Test
public void navigateTo_Brule()
	
	{
		
		 WebDriverWait wait=new WebDriverWait(driver, 10);
 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Settings']")));
		
		driver.findElement(By.xpath("//span[@title='Settings']")).click();
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@name='businessrule']")));
		
		driver.findElement(By.xpath("//div[@name='businessrule']")).click();
		
		
	}
	
	
	@AfterSuite
	
	public void close()
	
	{
		driver.quit();
		
		
	}
	


}
