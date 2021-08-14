package pages;

import orchestly.wrapper_class;

public class users {
	
	wrapper_class obj= new wrapper_class();
	
	
	
	public void settings()
	{
		
		obj.click_by_id("setupmenu");
		
	}
	
	public void users()
	
	{
		
		obj.click_by_xpath("//span[text()='Users']");
	}

	
	public void click_new_users()
	{
		
		obj.click_by_xpath("//span[text()='New User']");
		
	}
	
	public void enter_email_address(String mail)
	{
		
		obj.type_id("user_emailId", mail);
	}
	
	public void save_user()
	{
		
		obj.click_by_id("saveUser");
		
	}
	
	public void confirm_user()
	{
		
		obj.click_by_id("confirmUser");
		
	}
	
	
	public void test_moreoptions()
	{
		
		obj.click_by_xpath("//a[@title='test']//following::span[2]");
	}
	
	public void test_delete()
	{
		obj.click_by_xpath("//div[text()=' test ']//following::div[@title='Delete']");
	}
	
	public void mouse_over_moreoptions()
	{
		
		obj.mouse_over_xpath("//div[text()=' test ']");
	}
	
	public void confirm_delete_user()
	{
		
		obj.click_by_id("deleteTemplate_deletebutton");
		
		
	}
}
