import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

import static sun.java2d.cmm.ColorTransform.Out;

/**
 * Created by Mehul on 22/02/2017.
 */
public class WrightExcelsheet
{
    public static void main(String[] args) throws IOException {

        File src = new File("C:\\Users\\Mehul\\Excel test data.xlsx");

        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);   // when you work with  .xlsx
        //  HSSFWorkbook wb = new HSSFWorkbook(fis);// for  .xls file

        XSSFSheet sheet1 = wb.getSheetAt(0);
         sheet1.getRow(0).createCell(2).setCellValue("pass");

        sheet1.getRow(1).createCell(2).setCellValue("fail");
        sheet1.getRow(2).createCell(2).setCellValue("14.78");

        FileOutputStream fout = new FileOutputStream(src);

        wb.write(fout);
        wb.close();




    }
}
