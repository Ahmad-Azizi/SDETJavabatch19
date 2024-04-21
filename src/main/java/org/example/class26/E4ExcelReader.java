package org.example.class26;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {

        //Location of the file.
        String path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch19\\Files\\Batch19TestData.xlsx";
        // Navigating to the file
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook exel=new XSSFWorkbook(fis);
        Sheet sheet=exel.getSheet("Sheet1");


        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }


        // Break till 1:54

    }
}
