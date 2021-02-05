package test;

import com.sun.xml.bind.v2.TODO;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ExcelWrite {
     public static void main(String[] args) throws Exception {
         XSSFWorkbook workbook;
         XSSFSheet sheet;
         XSSFRow row;
         XSSFCell cell;

         String path = "src/SampleData.xlsx";

         FileInputStream fileInputStream = new FileInputStream(path);
         // loading the workbook class
         workbook = new XSSFWorkbook(fileInputStream);
         //providing the specific sheet that we want to work on from this workbook
         sheet = workbook.getSheet("Employees");
         // we are selecting and saving the row
         row = sheet.getRow(1);
         //selecting the cell from the selected row
         cell = row.getCell(1);

         System.out.println("Steven's lastname: " + cell.toString());

         XSSFCell adamCell = sheet.getRow(2).getCell(0);

         System.out.println("Before: " + adamCell.toString());

         adamCell.setCellValue("Trump");

         System.out.println("After: " + adamCell.toString());


         //TODO: CHANGE TRUMP'S JOB_ID TO President DYNAMICALLY

         for(int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
             if (sheet.getRow(rowNum).getCell(0).toString().equals("Trump")) {
                 sheet.getRow(rowNum).getCell(2).setCellValue("President");
             }
         }
         //when you are sending the value to a file
         FileOutputStream fileOutputStream = new FileOutputStream(path);
         //this is the line that is executing and writing to the file
         workbook.write(fileOutputStream);
         workbook.close();
         fileInputStream.close();
         fileOutputStream.close();
     }
}
