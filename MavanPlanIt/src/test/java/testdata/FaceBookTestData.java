package testdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import genericfunctions.Constants;

public class FaceBookTestData {

	public static String value = null;
	public static String key = null;
	public static String celldata = null;

	public static Object[][] getInputdata(String filename, String sheetname) {

		Object[][] data = null;

		try {

			FileInputStream fis = new FileInputStream(filename);//
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetname);
			int rows = sh.getLastRowNum() - sh.getFirstRowNum();
			int col = sh.getRow(0).getLastCellNum();
			System.out.println(rows);
			System.out.println(col);
			data = new Object[rows][col];

			for (int i = 1; i <= rows; i++) {

				for (int j = 0; j < col; j++) {

					if (sh.getRow(i).getCell(j).getCellType() == CellType.STRING) {

						data[i - 1][j] = sh.getRow(i).getCell(j).getStringCellValue();

					} else {

						data[i - 1][j] = sh.getRow(i).getCell(j).getRawValue();
						
					}
                      System.out.println(data[i-1][j]);
				}
                     
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;

	}

}
