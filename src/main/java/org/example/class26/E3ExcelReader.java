package org.example.class26;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {

        //Location of the file.
        String path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch19\\Files\\Batch19TestData.xlsx";
        // Navigating to the file
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook exel=new XSSFWorkbook(fis);
        Sheet sheet=exel.getSheet("Sheet1");
        Row row=sheet.getRow(5);
        Cell cell=row.getCell(3);
        System.out.println(cell);
        // Break till 1:54

    }
}
