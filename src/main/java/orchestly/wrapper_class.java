package orchestly;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wrapper_class {
	
	public  static WebDriver driver;
	

	
	
	public void open_browser()
	
	{
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		
		
		
		
		
	}
	
	public void get_url(String url)
	{
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
	}
	
	

	
	public  void click_by_id(String id)
	
	{
		 WebDriverWait wait=new WebDriverWait(driver,10) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		driver.findElement(By.id(id)).click();
		
		
	}
	
	public  void click_by_xpath(String xpath)
	
	{ 
		 WebDriverWait wait=new WebDriverWait(driver,10) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();
		
		
	}

	
	
	
	
	public  void type_id(String id, String value)
	
	{
		 WebDriverWait wait=new WebDriverWait(driver,10) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		driver.findElement(By.id(id)).sendKeys(value);;
		
		
	}
	
public  void type_xpath(String xpath, String value)
	
	{ 
	 WebDriverWait wait=new WebDriverWait(driver,10) ;
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys(value);;
		
		
	}


public void verify_title( String xpath, String expected)
{
	
	String actual=driver.findElement(By.xpath(xpath)).getText();




Assert.assertEquals(actual, expected);
	
	
}

public void mouse_over_xpath(String xpath)
{
	

Actions act=new Actions(driver);

WebDriverWait wait=new WebDriverWait(driver,10) ;
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));


WebElement ele=driver.findElement(By.xpath(xpath));

try {
if(ele.isDisplayed())
{
	act.moveToElement(ele);
}
}

catch(Exception e)
{
e.printStackTrace();	

}


}



public void screenShot() throws IOException, InterruptedException {
    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String filename =  new SimpleDateFormat("dd-mm-yy hh-mm'.png'").format(new Date());
    
    
    
    File dest = new File("C:\\Users\\temp\\Documents\\rajesh\\Selenium\\My_Workspace\\orchestly\\test-output\\screenshot\\" + filename);
    FileUtils.copyFile(scr, dest);
}


public void Sshot() throws IOException
{
	
File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileHandler.copy(file, new File("C:\\Users\\temp\\Documents\\rajesh\\Selenium\\My_Workspace\\orchestly\\test-output\\screenshot\\test.png"));


}

public void screenshot_of_element(WebElement ele) throws IOException
{
	File file=ele.getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(file, new File("C:\\Users\\temp\\Documents\\rajesh\\Selenium\\My_Workspace\\orchestly\\test-output\\screenshot\\test.png"));
	
	
}

}
