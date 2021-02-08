package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven\\Credential.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Cell createCell = sheetAt.createRow(0).createCell(1);
		createCell.setCellValue("pavi");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		
		

	}

}
