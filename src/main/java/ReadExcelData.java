

/**
 * Created by Mehul on 22/02/2017.
 */
public class ReadExcelData
{

    public static void main(String[] args)


    {
       ExcelDateConficFile excelDateConficFile = new ExcelDateConficFile("C:\\Users\\Mehul\\Excel test data.xlsx");

        System.out.println(excelDateConficFile.getData(2,1,0));  // index always start from o
    }



}
