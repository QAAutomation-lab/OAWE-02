package ddt;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {

	static String getXLCellValue(String xlpath,String sheetName,int rowNum,int cellNum)
	{
		try
		{
			FileInputStream fis=new FileInputStream(xlpath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet("Sheet1");
	        XSSFRow row; 
	        XSSFCell cell;

			Iterator<Row> rows = sheet.rowIterator();

			while (rows.hasNext())
			{
				row=(XSSFRow) rows.next();
				Iterator<Cell> cells = row.cellIterator();
				
				while (cells.hasNext())
				{
					cell=(XSSFCell) cells.next();
					
					switch (cell.getCellType()) {
					case STRING:
						//System.out.println(cell.getStringCellValue());
						return cell.getStringCellValue();
					
					case NUMERIC:
						//System.out.println(cell.getNumericCellValue());
						return Integer.toString((int)cell.getNumericCellValue());
					default:
						return null;
					}
				}
			}
		}
		catch(Exception e)
		{
			
		}
		return " ";
	}
	public static void main(String[] args) {

		String loc="C:\\Users\\Virus\\Desktop\\Data.xlsx";
		System.out.println(getXLCellValue(loc, "Sheet1", 0, 0));

	}
}
