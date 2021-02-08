package com.data.task;

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
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Maven\\Student.xlsx");
		FileInputStream fis = new FileInputStream(f);
		 XSSFWorkbook work = new XSSFWorkbook(fis);
			Sheet sheetAt = work.getSheetAt(0);
			Cell c1 = sheetAt.createRow(0).createCell(0);
			c1.setCellValue("S.No");
			FileOutputStream fos = new FileOutputStream(f);
			work.write(fos);
		}

	}


