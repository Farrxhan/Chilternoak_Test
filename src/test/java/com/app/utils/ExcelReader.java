package com.app.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
/*	List<String> subscriber;
	public List<String> getData()throws IOException{
		subscriber=new ArrayList<String>();
		FileInputStream inputStream=new FileInputStream(new File("src/test/resources/excel/subscriber.xlsx"));
		XSSFWorkbook workBook=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=workBook.getSheetAt(0);
		int rowCount=sheet.getLastRowNum() - sheet.getFirstRowNum();//return all active rows, meaing rows have data
		for(int i=1; i<=rowCount; i++) {
			Row row=sheet.getRow(i);
			for(int j=0; j<row.getLastCellNum();j++) { // returns all active cell at rows, meaning cell has data
				subscriber.add(row.getCell(j).getStringCellValue()); // assuming we have data in string format only 
				//System.out.println(row.getCell(j).getStringCellValue());
			}
		}
		return subscriber;
	} */
	static String subName="";
	public static String getData(int rowNum,String sheetName) {
		try {
		FileInputStream inputStream=new FileInputStream(new File("src/test/resources/excel/subscriber.xlsx"));
		XSSFWorkbook workBook=new XSSFWorkbook(inputStream);
		//XSSFSheet sheet=workBook.getSheetAt(0);
		XSSFSheet sheet=workBook.getSheet(sheetName);
			Row row=sheet.getRow(rowNum);
			for(int j=0; j<row.getLastCellNum();j++) { // returns all active cell at rows, meaning cell has data
				subName=row.getCell(j).getStringCellValue(); // assuming we have data in string format only 
				//System.out.println(row.getCell(j).getStringCellValue());
			}
		}catch(IOException ex) {
			System.out.println("Problem in rading excel file .....");
			ex.printStackTrace();
			subName="";
			
		}
		
		
		return subName;
	}
}
