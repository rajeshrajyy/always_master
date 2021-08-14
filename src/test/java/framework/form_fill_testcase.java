package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import orchestly.wrapper_class;

public class form_fill_testcase extends wrapper_class   {
	
	
	 WebDriver driver;
	wrapper_class obj=new wrapper_class();
	
	
	@BeforeTest
	
	public void login()
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
	}
	
	
	@DataProvider
	public String[][] getExcelData()
	{
		
		excel_reader ex=new excel_reader();
		
		String data[][]=ex.getExcelData();
		
		return data;
		
		
	}
	
	@Test(dataProvider="getExcelData")
	
	public void form_fill(String first) throws InterruptedException
	{
		
		PageFactory.initElements(driver, formfill_page.class);
		
		//System.out.println(first+""+mail );
		
	Thread.sleep(2000);
		
		formfill_page.first_name.sendKeys(first);
		
	//	formfill_page.email.sendKeys(mail);
		
	//	formfill_page.phone.sendKeys(phone);
		
	
	
			
				
		
	}

}
