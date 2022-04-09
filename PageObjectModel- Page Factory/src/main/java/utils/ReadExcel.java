package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] getData(String excelFilePath) throws IOException {
		
		XSSFWorkbook book= new XSSFWorkbook(excelFilePath);
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowCount = sheet.getLastRowNum();
		System.out.println("row Count is : " +rowCount);
		
		short Colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count is :" +Colcount);
		
		//XSSFRow header = ws.getRow(0);
		//int columnCount = header.getLastCellNum();
		//System.out.println(columnCount);
		
		String[][] data=new String[rowCount][Colcount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < Colcount; j++) {
			XSSFCell eachCell = eachRow.getCell(j);
			String value = eachCell.getStringCellValue();
			data[i-1][j]=value;
			System.out.println(value);
			}
			
		}
		return data;
	
		
		

	}

}
