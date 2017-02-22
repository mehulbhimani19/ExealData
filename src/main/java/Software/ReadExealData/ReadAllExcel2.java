package Software.ReadExealData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Mehul on 21/02/2017.
 */
public class ReadAllExcel2 {
    public static void main(String[] args) throws IOException {

        File src = new File("C:\\Users\\Mehul\\Excel test data.xlsx");

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);   // when you work with  .xlsx
        //  HSSFWorkbook wb = new HSSFWorkbook(fis);// for  .xls file

        XSSFSheet sheet1 = wb.getSheetAt(0);   // if you want data by sheet number    .getSheetName if you want date by sheet name

        int rowcount = sheet1.getLastRowNum();
        System.out.println("Total number of row " + rowcount);

        for (int i = 0 ; i <rowcount;i++)
        {
            String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
            System.out.println("Test data from exel is "+ data0);
            System.out.println("Date form  row "+i+data0);
        }
    }
}