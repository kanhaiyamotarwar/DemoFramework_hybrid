package com.util;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.base.TestBase;

public class TestUtility extends TestBase{

	public static long Implicit_Wait =30;
	public static long Page_Load_Timeout =30;
	public static String Test_sheet_path="/Users/kanhaiyamotarwr/eclipse-workspace/HybridFramewo"
			+ "rk/src/main/java/com/testData/sampledata.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	public void SwitchToFrame(String frameName)
	{
		driver.switchTo().frame(frameName); 
	}
	
	public Object[][] getTestData(String Sheet_name) 
	
	{
		FileInputStream file=null;
		try
		{
			file=new FileInputStream(Test_sheet_path);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			book=WorkbookFactory.create(file);

		}
		catch(InvalidFormatException e)
		{
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		sheet= book.getSheet(Sheet_name);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getRow(0).getLastCellNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	/*
	public void takescreenShot(String Fileutils)
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(SrcFile, DestFile);
	}
	*/
	
	

	
	
	
	
	
}
