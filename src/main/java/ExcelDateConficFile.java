import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Mehul on 22/02/2017.
 */
public class ExcelDateConficFile
{
    XSSFSheet sheet1;
    XSSFWorkbook wb;

    public ExcelDateConficFile(String excelData)
    {
      try
      {
        File src = new File(excelData);

        FileInputStream fis = new FileInputStream(src);
        wb = new XSSFWorkbook(fis);   // when you work with  .xlsx
        //  HSSFWorkbook wb = new HSSFWorkbook(fis);// for  .xls file


      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }

    }
    public String getData (int sheetNumber , int row , int colum )
    {
        sheet1 =  wb.getSheetAt(sheetNumber);
        String data = sheet1.getRow(row).getCell(colum).getStringCellValue();
    return data;
    }
}
