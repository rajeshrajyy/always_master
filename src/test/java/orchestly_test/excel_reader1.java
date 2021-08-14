package orchestly_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excel_reader1 {
	
	
	@DataProvider(name="test")
	public String[][] testdata() throws BiffException, IOException
	{
		
		String data[][]=excel_data();

		return data;
	}


	
	public static void main(String args[]) throws BiffException, IOException
	{
		excel_data();
		
	}
	public static String [][] excel_data() throws BiffException, IOException
	
	{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\temp\\Desktop\\exceldata.xls");
		
		Workbook wb=Workbook.getWorkbook(fis);
		
		Sheet sheet= wb.getSheet(0);
		
		int row=sheet.getRows();
		
		int col=sheet.getColumns();
		
		System.out.println(sheet.getCell(1, 1));
		
		wb.close();
		
		
		
		
		return null;
		
		
		
	}
}
