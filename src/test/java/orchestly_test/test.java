package orchestly_test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test  {

	
	static WebDriver driver;
	
	@Test
	public void open() {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\temp\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Documents\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\rajesh\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Selenium_jar\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");

	//	WebDriverManager.chromedriver().setup();
	//	driver=new ChromeDriver();
		
		
		
		WebDriverManager.edgedriver().setup();
		
		driver=new EdgeDriver();
		
		driver.get("https://www.youtube.com/watch?v=YyB2NGV69xE&t=284s");
		
		
	}
	
	

}
