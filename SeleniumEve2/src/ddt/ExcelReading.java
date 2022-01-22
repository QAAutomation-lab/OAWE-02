package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReading {

	@Test
	public void getSheetName() throws FileNotFoundException, IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\appTestData.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3. perform operation on sheet
		int sheetCount = workbook.getNumberOfSheets();// give you sheet count present inside excel
		System.out.println("Sheet count: " + sheetCount);
		System.out.println("Active sheet index: " + workbook.getActiveSheetIndex());
		for (int i = 0; i < sheetCount; i++) {
			System.out.println(workbook.getSheetName(i));
		}
		// to get specific sheet
		XSSFSheet sheet = workbook.getSheet("LoginDetails");
	}

	@Test
	public void getRowOperation() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\appTestData.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3. get sheet
		XSSFSheet sheet = workbook.getSheet("LoginDetails");
		// 4. get row
		int rowCount = sheet.getLastRowNum();// in current how many rows are present, row count=actual count -1
		System.out.println("RowCount: " + rowCount);
		// get speci
		XSSFRow row = sheet.getRow(0);
	}

	@Test
	public void getCellOperation() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\appTestData.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3. get sheet
		XSSFSheet sheet = workbook.getSheet("LoginDetails");
		// 4. get row
		XSSFRow row = sheet.getRow(0);
		// 5. cell operation
		System.out.println("Cell count in row-0: " + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {
			System.out.print(row.getCell(i).getStringCellValue() + "\t");
		}
	}

	@Test
	public void getDifferentCellValues() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\appTestData.xlsx");
		// 2. Create an instance of required workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// 3. get sheet
		XSSFSheet sheet = workbook.getSheet("LoginDetails");
		// 4. get row
		XSSFRow row = sheet.getRow(2);
		// 5. cell operation
		System.out.println("Cell count in row-2: " + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {

			XSSFCell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println((int) cell.getNumericCellValue());
				break;
			case BLANK:
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			default:
				throw new RuntimeException("There is no support for this type of cell");
			}
		}
	}

	@Test
	public void getDifferentCellValues_2() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testData\\appData.xlsx");
		// 2. Create an instance of required workbook
		Workbook workbook = new XSSFWorkbook(fis);
		// 3. get sheet
		Sheet sheet = workbook.getSheet("LoginDetails");
		// 4. get row
		Row row = sheet.getRow(1);
		// 5. cell operation
		System.out.println("Cell count in row-1: " + row.getLastCellNum());
		for (int i = 0; i < row.getLastCellNum(); i++) {

			Cell cell = row.getCell(i);
			switch (cell.getCellType()) {
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println((int) cell.getNumericCellValue());
				break;
			case BLANK:
				break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				break;
			default:
				throw new RuntimeException("There is no support for this type of cell");
			}
		}
	}

	@Test
	public void getEachRowFirstCellValue() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\appTestData.xlsx");
		// 2. Create an instance of required workbook
		Workbook x = new XSSFWorkbook(fis);
		// 3. get sheet
		Sheet sheet = x.getSheet("LoginDetails");
		// 4. get row count
		int rowCount = sheet.getLastRowNum();
		for (int i = 0; i <= rowCount; i++) {
//			Row row =sheet.getRow(i);
//			Cell cell=row.getCell(0);
			// or
//			Cell cell=sheet.getRow(i).getCell(0);
//			System.out.println(cell.getStringCellValue());
			// or
			System.out.println(sheet.getRow(i).getCell(2).getStringCellValue());
		}
	}

	@Test
	public void getEachRowAllCellValue() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\appTestData.xlsx");
		// 2. Create an instance of required workbook
		Workbook x = new XSSFWorkbook(fis);
		// 3. get sheet
		Sheet sheet = x.getSheet("LoginDetails");
		// 4. get row count
		int rowCount = sheet.getLastRowNum();
		for (int i = 0; i <= rowCount; i++) {
			int cellCount = sheet.getRow(i).getLastCellNum();
			for (int j = 0; j < cellCount; j++) {
				// System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "\t");
				Cell cell = sheet.getRow(i).getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + "\t");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;
				case BLANK:
					break;
				default:
					throw new RuntimeException("There is no support for this type of cell");
				}
			}
			System.out.println();
		}
	}

	@Test
	public void updateResult() throws IOException {
		// 1. File location
		FileInputStream fis = new FileInputStream(".\\testdata\\appTestData.xlsx");
		// 2. Create an instance of required workbook
		Workbook workbook = new XSSFWorkbook(fis);
		// 3. get sheet
		Sheet sheet = workbook.getSheet("LoginDetails");
		// 4. get row count
		int rowCount = sheet.getLastRowNum();
		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet.getRow(i);
			int cellCount = row.getLastCellNum()-1;
			row.createCell(cellCount).setCellValue("failed");
		}
		// to write the contents into file user below steps
		// 1. Create an instance of FileOutStream and
		FileOutputStream fos = new FileOutputStream(".\\testdata\\appTestData.xlsx");
		workbook.write(fos);
		fos.flush();
		fos.close();
	}

	@Test
	public void createNewExcelFile() throws IOException {

		//1. Create an instance of FileOutStream and 
//		FileOutputStream fos=new FileOutputStream(".\\testData\\appData_new.xlsx");
//		// 2. Create an instance of required workbook
//		Workbook workbook = new XSSFWorkbook();
//		workbook.write(fos);

		// or
		// 1. Create an instance of FileOutStream and
		// FileOutputStream fos=new FileOutputStream(".\\testData\\appData_new2.xlsx");
		// or
		// 1. Create an instance of FileOutStream and
		FileOutputStream fos = new FileOutputStream(".\\testdata\\appData_new2.xlsx");
		fos.close();
	}
}
