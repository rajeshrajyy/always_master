package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excel_reader {
	
	public static FileInputStream fis;
	
	public static Workbook wb;
	
	
	/*
	 * public static void main(String args[]) { getExcelData(); }
	 */	
	public String[][] getExcelData()
	{
		
		try {
			 fis=new FileInputStream("C:\\Users\\temp\\Desktop\\form_fill.xls");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		try {
			 wb= Workbook.getWorkbook(fis);
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sheet=wb.getSheet("Sheet2");
		
		
		int rowCount=sheet.getRows();
		
		int colCount=sheet.getColumns();
		
		System.out.println(sheet.getCell(1, 0).getContents());
	String testdata[][] =new String [rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			
			for(int j=0;j<colCount;j++)
			{
				
				testdata[i-1][j]=sheet.getCell(j, i).getContents();
				
				
				
			}
			
		}
		
		return testdata;
		
		
	}
		
		
		
	

}
