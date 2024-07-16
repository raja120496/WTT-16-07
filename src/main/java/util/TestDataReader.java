package util;

import java.io.File;  
import java.io.FileInputStream;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.CommonPaths;

public class TestDataReader  
{  

	public static HashMap<Object, Object> Testdata = new HashMap<Object, Object>();

	public static Object[] TestheaderArray;

	public static Object[] TestdataArray;

	public static int numberrows;

	public static XSSFSheet sheet;


	public static void tetsdatareader(String filename , String sheetname) {

		try  
		{  
			File file = new File(CommonPaths.Test_data+filename);   
			FileInputStream fis = new FileInputStream(file);   
			XSSFWorkbook wb = new XSSFWorkbook(fis);   
			sheet = wb.getSheet(sheetname);     

			numberrows=sheet.getLastRowNum();

			for(int i=0;i<1;i++) 
			{
				TestheaderArray=new Object[sheet.getRow(i).getLastCellNum()];
				for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {

					Cell cell=sheet.getRow(i).getCell(j);   
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						TestheaderArray[j]=cell.getNumericCellValue();
						//System.out.print(cell.getNumericCellValue() + "\n");
						break;
					case Cell.CELL_TYPE_STRING:
						TestheaderArray[j]=cell.getStringCellValue();
						//System.out.print(cell.getStringCellValue() + "\n");
						break;
					}		
				}
			}

			for(int k=1;k<=sheet.getLastRowNum();k++) {
				TestdataArray=new Object[sheet.getRow(k).getLastCellNum()];
				for(int l=0;l<sheet.getRow(k).getLastCellNum();l++) {

					Cell cell1=sheet.getRow(k).getCell(l);
					switch (cell1.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						TestdataArray[l]=cell1.getNumericCellValue();
						//System.out.print(cell1.getNumericCellValue() + "\n");
						break;
					case Cell.CELL_TYPE_STRING:
						TestdataArray[l]=cell1.getStringCellValue();
						//System.out.print(cell1.getStringCellValue() + "\n");
						break;
					}
				}
			}


			if(TestheaderArray.length==TestdataArray.length) {
				for(int i=0;i<TestheaderArray.length;i++) {
					Testdata.put(TestheaderArray[i], TestdataArray[i]);	    
				}
			}

			//		    for(Map.Entry m : Testdata.entrySet()){    
			//		        System.out.println(m.getKey());
			//		        System.out.println(m.getValue());
			//		       }  


		}




		/*	
		Iterator<Row> itr = sheet.iterator();     
		while (itr.hasNext())                 
		{  
		Row row = itr.next();  
		Iterator<Cell> cellIterator = row.cellIterator();   
		while (cellIterator.hasNext())   
		{  
		Cell cell = cellIterator.next();  
		switch (cell.getCellType())               
		{  
		case Cell.CELL_TYPE_STRING:      
		System.out.print(cell.getStringCellValue() + "\t\t\t"); 
		Testdata.put(cell.getStringCellValue(), cell.getStringCellValue());

		break;  
		case Cell.CELL_TYPE_NUMERIC:     
		System.out.print(cell.getNumericCellValue() + "\t\t\t");
		Testdata.put(cell.getNumericCellValue(), cell.getNumericCellValue());
		break;  
		default:  
		}  
		}  
		System.out.println("");  
		}  

		 for(Entry<Object, Object> m : Testdata.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue());    
			   }  

		}
		 */


		catch(Exception e)  
		{  
			e.printStackTrace();  
		}



	}


}  
