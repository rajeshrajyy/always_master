package pages;

import orchestly.wrapper_class;

public class jobs extends wrapper_class {
	
	
	wrapper_class obj=new wrapper_class();
	
	
	public void add_job()
	{
		
		click_by_id("job_nav_add");
		
	}
	
	public void enter_job_title(String title)
	{
		
		type_id("job_title",title);
	}
	
	public void save_job()
	{
		
		click_by_id("savejob_btn");
	}
	
	public void upload_lineitem_file(String file)
	{
		
		type_xpath("//input[@name='linkedfield_file1']",file);
		
	}
	
	public void file_upload(String file)
	{
		
		click_by_id("job_uploadfile");
		
		type_xpath("//span[@class='flow_savebt mt20']",file);
		
		
	}
	
	public void job_click_delete()
	{
		
		click_by_xpath("//div[text()=' rajesh_selenium ']");
	}
	
	
	public void job_more_options()
	{
		
		click_by_xpath("//span[@data-zoqa='jobs_jobdetail_moreactions']");
		
		
		
		
	}
	
	public void delete_job()
	
	{
		click_by_xpath("//li[@onclick='Jobs.actions.deleteJob(event)']");
	}
	
	public void confirm_delete()
	{
		
		
		click_by_xpath("//button[text()='Yes, delete']");
	}
	
	
	public void job_close()
	{
		
		click_by_xpath("//div[@data-zoqa='jobs_jobdetail_close']");
	}
	
	public void confirm_delete_job(String actual)
	{
		
	obj.verify_title("//button[text()='Yes, delete']", actual);
		
	}

}
