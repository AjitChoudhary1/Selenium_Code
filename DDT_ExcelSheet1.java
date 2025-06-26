package selenium_code1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_ExcelSheet1
{
	  public static void main(String[] args) throws EncryptedDocumentException, IOException
	  {
		  FileInputStream fis=new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Selenium_Programs\\Excel Sheet\\Login Details.xlsx");

		      Workbook wb=   WorkbookFactory.create(fis);
		                                                                                       //use it in real project

		  String username=  wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();

		                  System.out.println(username);

		  String password=  wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();

		                    System.out.println(password);






	}

}
