package orchestly_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import orchestly.wrapper_class;

public class take_sc extends wrapper_class{
	
	
	public  void take_s1 (String dest) throws IOException
	{
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		
	File src=	sc.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File(dest));
		
		
		
		
	}

}
