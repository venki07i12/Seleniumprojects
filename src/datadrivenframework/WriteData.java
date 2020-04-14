package datadrivenframework;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {

//create workbook in excel file,store in a variable of writable workbook
		WritableWorkbook wb =Workbook.createWorkbook(new FileOutputStream("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\writableSheet12.xls"));

	//create sheet in the workbook,store in writable sheet
	WritableSheet ws = wb.createSheet("sample2", 0);

	//add cell(col,row) in worksheet
	ws.addCell(new Label(0, 0, "sample4"));
	ws.addCell(new Label(0, 1, "DDT"));
	ws.addCell(new Label(0, 2, "SeleniumSuite"));

	//write data into workbook
		wb.write();
		wb.close();

	}
}