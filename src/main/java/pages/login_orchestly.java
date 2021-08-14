package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orchestly.wrapper_class;

public class login_orchestly extends wrapper_class {
	
	
	wrapper_class obj=new wrapper_class();
	
	public void open()
	{
		obj.open_browser();
		
		obj.get_url("https://accounts.localzoho.com/signin?servicename=Orchestly&serviceurl=https%3A%2F%2Forchestlyapps.localzoho.com%2Fblueprints");
		
		
	}
	
	public void login(String username,String password)
	{
		
		type_xpath("//input[@name='LOGIN_ID']", username);
	
		click_by_xpath("//button[@class='btn blue' and @id='nextbtn']");
	
		type_xpath("//input[@name='PASSWORD']", password);
		
		
		click_by_xpath("//button[@class='btn blue' and @id='nextbtn']");
		
	}
	

}
