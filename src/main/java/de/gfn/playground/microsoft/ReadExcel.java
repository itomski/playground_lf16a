package de.gfn.playground.microsoft;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class ReadExcel {

    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("personal_11122025.xlsx")) {

            XSSFWorkbook workbook = new XSSFWorkbook(in); // Dateinhalt einlesen
            XSSFSheet sheet = workbook.getSheet("Personal"); // Datenblatt auswählen

            Iterator<Row> rows = sheet.iterator();
            while (rows.hasNext()) { // Weitere Zeilen vorhanden?
                Row row = rows.next(); // Springe zur nächster Zeile

                Iterator<Cell> cells = row.cellIterator();
                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    if(cell.getCellType() == CellType.NUMERIC) {
                        System.out.printf("%-10f ", cell.getNumericCellValue()); // Als Zahl einlesen
                    }
                    else {
                        System.out.printf("%-10s ", cell.getStringCellValue()); // Als String einlesen
                    }
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
