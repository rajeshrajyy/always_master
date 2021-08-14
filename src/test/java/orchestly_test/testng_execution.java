package orchestly_test;

import org.testng.annotations.Test;

public class testng_execution {
	
	@Test(groups={"smoke","sanity"},priority=0,enabled=false)
	public void start_car()
	{
		
		System.out.println("start car");
		
		
		
	}
	@Test(groups= {"sanity","smoke"},priority=1)
	public void first_gear()
	{
		
		System.out.println("first gear");
		
		
		
	}
	
	@Test(groups= {"smoke"},priority=2 )
	
	
	public void second_gear()
	{
		
		System.out.println("second gear");
		
		
		
	}
	
	
	@Test(groups= {"smoke"},priority=3)
	
	public void third_gear()
	{
		
		System.out.println("third gear");
		
		
		
	}
	@Test(groups= {"sanity"},priority=4)
	
	public void fourth_gear()
	{
		
		System.out.println("fourth gear");
		
		
		
	}
	
	@Test(groups= {"sanity"},priority=5,enabled=false)
	
	
	
	public void stop_car()
	{
		
		System.out.println("stop car");
		
		
		
	}
	
	
	

}
