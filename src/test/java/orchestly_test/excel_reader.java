package orchestly_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excel_reader {
	
	String[][] data=null;
	
	@DataProvider(name="loginData")
	
	public String[][] loginDataProvider() throws BiffException, IOException
	{
		
	data=getExcelData();
	
	return data;
		
	}
	
	public static void main(String args[]) throws BiffException, IOException
	{
		getExcelData();
	}
	
	
	public static  String[][] getExcelData() throws BiffException, IOException
	{
		
		
		FileInputStream file=new FileInputStream("C:\\\\\\\\Users\\\\\\\\temp\\\\\\\\Documents\\\\\\\\rajesh\\\\\\\\Selenium\\\\\\\\login.xls");
		
		Workbook wb= Workbook.getWorkbook(file);
		
		Sheet sheet=wb.getSheet(0);
		
		int row= sheet.getRows();
		
		int coulumn=sheet.getColumns();
		
		
		String testdata[][] =new String [row-1][coulumn];
		
		for(int i=1;i<row;i++)
		{
			
			for(int j=0;j<coulumn;j++)
			{
				
				testdata[i-1][j]=sheet.getCell(j, i).getContents();
				
				
				
			}
			System.out.println(testdata);
		}
		
		return testdata;
		
		
	}
	
	
	

}
