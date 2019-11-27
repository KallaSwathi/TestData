package test;

import com.techouts.fanniemae.dao.DefaultExcelDAO;
import com.techouts.fanniemae.dao.WorkbookOperations;
import com.techouts.fanniemae.util.PathProvider;

public class BookTest {
		
	static{
		System.out.println("Static block");
	}
	
		public static void main(String[] args) 
		{
		//System.out.println(new DefaultExcelDAO(PathProvider.getTestDataFilePath()).extractWorkbook());
		System.out.println("Main Method");
		}
}
