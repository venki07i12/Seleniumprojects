package datadrivenframework;


import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ReadData {

	public static void main(String[] args) throws Exception
	{
		//get the file for reading
	 FileInputStream fs=new FileInputStream("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\writableSheet11.xls");
	 // get workbook from the file
	 Workbook wb=Workbook.getWorkbook(fs);
	 //get sheet from workbook
	 Sheet ws=wb.getSheet("sample");
	 //for all the rows
	 for(int r=0;r<ws.getRows();r++)
	 {
		 //for all the columns
		 for(int c=0;c<ws.getColumns();c++)
		 {
			 System.out.println(ws.getCell(c,r).getContents());
		 }
		 System.out.println("------------");
	 }
	 wb.close();
	 

	}

}