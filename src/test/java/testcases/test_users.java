package testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.login_orchestly;
import pages.users;

public class test_users {

	
	users u=new users();
	
	login_orchestly log=new login_orchestly();
	
@BeforeSuite
	
	public void open()
	{
		log.open();
		
		log.login("rajesh.d+88@zohotest.com", "Google@1");
		
	}
	
	@Test(priority=1)
	public void create_user()
	{
		u.settings();
		u.users();
		u.click_new_users();
		u.enter_email_address("test@12345.com");
		u.save_user();
		u.confirm_user();
	
	}
	
	@Test(priority=2)
	public void delete_user()
	
	{
		u.mouse_over_moreoptions();
		u.test_moreoptions();
		u.test_delete();
		u.confirm_delete_user();
		
	}
	
	
	
	
	
	
	
	
}
