package org.example.class26;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {

        //Location of the file.
        String path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch19\\Files\\Batch19TestData.xlsx";
        // Navigating to the file
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook exel=new XSSFWorkbook(fis);
        Sheet sheet=exel.getSheet("Sheet1");
        Row headerRow=sheet.getRow(0);
        List<Map<String,String>> excelData=new ArrayList<>();
        for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
            Row row=sheet.getRow(i);
            Map<String,String> rowMap= new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell=row.getCell(j);
                String key=headerRow.getCell(j).toString();
                String value=row.getCell(j).toString();
                rowMap.put(key,value);
            }
            excelData.add(rowMap);

        }


        System.out.println(excelData);

    }
}
