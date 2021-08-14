package orchestly_test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert1 {
	
	
	SoftAssert soft=new SoftAssert();
	
	@BeforeSuite
	public void assert1()
	{
		
		soft.assertEquals("s", "s");
		
		System.out.println("case 1 failed here");
		
		
		
		soft.assertAll();
		
		
	}
	@BeforeSuite
	public void assert2()
	{
		
		soft.assertEquals("a", "a");
		
		System.out.println("case passed");
		
		soft.assertAll();
	}
	@BeforeMethod
	public void assert3()
	{
		
		soft.assertEquals("c", "");
		
		soft.assertAll();
	}
	@Test
	public void assert4()
	{
		
		soft.assertEquals("e", "e");
		
		soft.assertAll();
	}

	
}
