package orchestly_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class mul_browser_test extends multi_browser{
	
	
	@Test
	
	public void test1()
	{
		//getDriver().get("http://demo.automationtesting.in/Register.html");
		getDriver().findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("rajesh");
		
		
	}
	
	@Test
	public void test2()
	{
		
		
		getDriver().findElement(By.xpath("//a[text()='WebTable']")).click();
	}
	
	@Test
	
	public void test3()
	{
		
		
		getDriver().findElement(By.xpath("//a[text()='Interactions ']")).click();
	}

}
