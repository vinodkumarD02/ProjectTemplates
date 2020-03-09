package ExcelDataUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import BasicUtilities.logger;

public class ReadExcel {
		public static int r,c;
		static WebDriver dr;
		public static String[][] testdata=new String[2][4];
		static logger log= new logger(dr);
	public static String[][] get_data() throws IOException {
		
	try {
	File f=new File("C:\\Users\\BLTuser.BLT0215\\Documents\\Excel\\3.xlsx");
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet("Sheet2");
	for(r=1;r<3;r++) {
	XSSFRow row=sh.getRow(r);
	for(c=3;c<7;c++) {
	XSSFCell cell =row.getCell(c);
	testdata[r-1][c-3]=cell.getStringCellValue();
	System.out.println(testdata[r-1][c-3]);
	
	
	}}
	
	} catch (FileNotFoundException e) {
		
		log.Update_log("Exception in Reading Excel Method");
	}
	return testdata;

}

}
			

