package seleniumDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDemo {

	public static void main(String[] args) throws Throwable {
		
		getData();
	}
	
	
	private static void getData() throws IOException {
		
	       
	       File src=new File(".\\Excel File\\Book6.xlsx");
	       
	       FileInputStream fis=new FileInputStream(src);
	       
	       XSSFWorkbook book=new XSSFWorkbook(fis);
	       
	       XSSFSheet sit=book.getSheetAt(0);
	       
/*	       HSSFWorkbook book=new HSSFWorkbook(fis);
	       
	       HSSFSheet sit=book.getSheetAt(0); */
	       
	       String val=sit.getRow(9).getCell(1).getStringCellValue();
	       
	       System.out.println(val);
	       
	       book.close();
		
		
	}

}
