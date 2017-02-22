package Software.ReadExealData;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Mehul on 21/02/2017.
 */
public class ReadExcel1
{
    public static void main(String[] args) throws IOException {

        File src = new File("C:\\Users\\Mehul\\Excel test data.xlsx");

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);   // when you work with  .xlsx
      //  HSSFWorkbook wb = new HSSFWorkbook(fis);// for  .xls file

       XSSFSheet sheet1 =  wb.getSheetAt(0);   // if you want data by sheet number    .getSheetName if you want date by sheet name

        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from Excel is "+ data0);

        String data1 = sheet1.getRow(1).getCell(0).getStringCellValue();
        System.out.println("Data from Excel is "+ data1);

        wb.close();  // closing object
    }
}
