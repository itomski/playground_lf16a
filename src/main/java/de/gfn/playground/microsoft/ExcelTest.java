package de.gfn.playground.microsoft;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExcelTest {

    public static void main(String[] args) {

        Map<Integer, Object[]> map = new TreeMap<>(); // Eine sortierte Map
        map.put(1, new Object[]{"Nr", "Vorname", "Nachname"});
        map.put(2, new Object[]{"1", "Peter", "Parker"});
        map.put(3, new Object[]{"2", "Bruce", "Banner"});
        map.put(4, new Object[]{"3", "Carol", "Danvers"});
        map.put(5, new Object[]{"4", "Natasha", "Romanov"});

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Personal");

        for(Map.Entry<Integer, Object[]> entry : map.entrySet()) {
            XSSFRow row = sheet.createRow(entry.getKey());

            int i = 0;
            for(Object werte: entry.getValue()) {
                Cell cell = row.createCell(i++);
                cell.setCellValue(werte.toString());
            }
        }

        try(FileOutputStream out = new FileOutputStream("personal_11122025.xlsx")) {
            wb.write(out); // Excel-File schreiben
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
