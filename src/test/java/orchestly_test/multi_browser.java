package orchestly_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multi_browser {
	
	
	private static ThreadLocal<ChromeDriver> driver=new ThreadLocal<>();
	
	
	
	@BeforeMethod
	
	public void open_browser()
	
	{
		WebDriverManager.chromedriver().setup();
		
		driver.set(new ChromeDriver());
		
		getDriver().get("http://demo.automationtesting.in/Register.html");
		
		
		
	}
	
	
	public WebDriver getDriver()
	{
		
		
		return driver.get();
		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		
		getDriver().close();
		
	}

}
