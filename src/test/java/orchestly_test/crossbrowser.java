package orchestly_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowser {
	
	


	
	
	public WebDriver driver;
	public void open_browser(String browserName)
	{
		
		

		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				
				driver=new ChromeDriver();
			}
			
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
			}
			
		
		
		
	}
	}
}


