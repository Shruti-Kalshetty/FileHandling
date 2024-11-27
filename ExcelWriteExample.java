// write data into an Excel file

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteExample {
    public static void main(String[] args) {
        // Create a Workbook instance
        Workbook workbook = new XSSFWorkbook();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Sheet1");

        // Create a row in the sheet (0th row)
        Row row = sheet.createRow(0);

        // Create cells in the row and set values
        Cell cell1 = row.createCell(0);
        cell1.setCellValue("Name");

        Cell cell2 = row.createCell(1);
        cell2.setCellValue("Age");

        // Write more rows (data)
        row = sheet.createRow(1);
        row.createCell(0).setCellValue("John");
        row.createCell(1).setCellValue(25);

        row = sheet.createRow(2);
        row.createCell(0).setCellValue("Jane");
        row.createCell(1).setCellValue(30);

        // Write the workbook to a file
        try (FileOutputStream fileOut = new FileOutputStream("example.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Excel file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
