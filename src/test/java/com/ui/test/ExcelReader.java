package com.ui.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

@Test
    public void read_from_excel_file() throws IOException {

    String path = "Orders-With Nulls.xlsx";

    File file = new File(path);

    FileInputStream fileInputStream = new FileInputStream(file);

    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    XSSFSheet sheet = workbook.getSheet("Orders");

    System.out.println(sheet.getRow(2));


}

}
