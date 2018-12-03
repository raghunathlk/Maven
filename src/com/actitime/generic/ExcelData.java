package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{

	public static String getData(String filepath,String sheetname,int rowindex, int cellnumber) 
	{
		try {
			FileInputStream fis=new FileInputStream(filepath);
			Cell c=WorkbookFactory.create(fis).getSheet(sheetname).getRow(rowindex).getCell(cellnumber);
			String data=c.getStringCellValue();
			return data;
		}
		catch (Exception e) 
		{
			return " ";
		}
				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
