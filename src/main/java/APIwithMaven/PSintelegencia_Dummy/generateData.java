package APIwithMaven.PSintelegencia_Dummy;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVWriter;

public class generateData {

	//This is method use to manage the data in excel format
	//Apache POI is used for excel connection and handling.
	
	public static void GenerateExcel() throws IOException
	{
		FileOutputStream fout = new FileOutputStream("TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet ws = wb.createSheet("Sheet1");
	
		//Below lines of code creates the header in the output.
			XSSFRow row = ws.createRow(0);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue("Patientid");
			XSSFCell cell2 = row.createCell(1);
			cell2.setCellValue("Date of Birth");
			XSSFCell cell3 = row.createCell(2);
			cell3.setCellValue("PersonalIdentifier");
			XSSFCell cell4 = row.createCell(3);
			cell4.setCellValue("admit date");
			
			//Data is being entered in the excel with below 
			for (int i =1 ; i<=10 ;i ++)
			{
				XSSFRow data_row = ws.createRow(i);
					 XSSFCell data_cell_PI = data_row.createCell(0);
					 data_cell_PI.setCellValue(inputValues.PID());
					 XSSFCell data_cell_DOB = data_row.createCell(1);
					 data_cell_DOB.setCellValue(inputValues.GenerateDOB());
					 XSSFCell data_cell_PIS = data_row.createCell(2);
					 data_cell_PIS.setCellValue(inputValues.PIGenerator());
					 XSSFCell data_cell_Admit = data_row.createCell(3);
					 data_cell_Admit.setCellValue(inputValues.AdmitDate());
			}	
		wb.write(fout);
		wb.close();
		fout.flush();
		
		}
	
	
	public static void GenerateCSV(){
		File fi = new File("TestData.csv");
		
		try {
			FileWriter Filewriter = new FileWriter(fi);
			CSVWriter CSVwriter = new CSVWriter(Filewriter);
			
			//Adding header to csv
			
			String[] header = {"Patientid","Date of Birth","PersonalIdentifier","admit date"};
			CSVwriter.writeNext(header);
			
			for (int i =1 ;i<=10;i++)
			{
				String [] row_data =  {inputValues.PID(),inputValues.GenerateDOB(),inputValues.PIGenerator(),inputValues.AdmitDate()};
				CSVwriter.writeNext(row_data);
			}
			
			CSVwriter.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

		
	}
	
