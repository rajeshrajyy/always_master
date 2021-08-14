package framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import orchestly.wrapper_class;

public class formfill_page extends wrapper_class{
	
//	static WebDriver driver;
	
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	public static WebElement first_name;
	
	
	@FindBy(xpath="//input[@type='email']")
	public static WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	public static WebElement phone;
	
	
	@FindBy(id="submitbtn")
	public static WebElement submit;
	
	
	@FindBy(xpath="//select[@id='Skills']")
	public static WebElement Skills;
	
	@FindBy(id="msdd")
	public static WebElement Languages_click;
	
	@FindBy(xpath="//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']/li")
	public static List<WebElement> Languages;

	
	
	public formfill_page()
	{
		
		PageFactory.initElements(driver, this);

	}
	
	
	public static WebElement name(String name)
	{
		
		
		first_name.sendKeys(name);
		
		return first_name;
		
	}
	
	public static void skills()
	{
		
			Select sel=new Select(formfill_page.Skills);
		
		sel.selectByValue("APIs");
		
		List<WebElement>ele= sel.getOptions();
		
		for(int i=0;i<=ele.size();i++)
		{
			
			
			String s=ele.get(i).getText();
			
			System.out.println(s);
			
			if(s.equalsIgnoreCase("CSS"))
			{
					sel.selectByVisibleText(s);
					
					break;
			}
			
			
			
		}
		
	}
	
	public static List<WebElement> languages() 
	{
		return Languages;
			
			
		
		
		
		
		
	}


}


