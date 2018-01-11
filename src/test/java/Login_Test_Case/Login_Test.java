package Login_Test_Case;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Browser_Invocation.Browser_Invoke;
import Page_Objects.Signup_page;

public class Login_Test extends Browser_Invoke{
	static final Logger logger = Logger.getLogger(Login_Test.class);
	
	@Test(dataProvider="Login")
	public void Login_TestCase(String uname,String password) throws InterruptedException {
		BasicConfigurator.configure();
		Signup_page sign=new Signup_page(driver);
		logger.info("Clicking on the Child Window");
	
		
		sign.GoClick().click();

		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		System.out.println(driver.getTitle());
		// Now you are in the popup window, perform necessary actions here
		sign.byRareCarat().click();
		sign.NewLogin_Username().sendKeys(uname);
		sign.NewLogin_Password().sendKeys(password);
		sign.NewLogin().click();
		Thread.sleep(5000);
		logger.info("CLicked on login Provide username ans password");	
		
}
	
	@DataProvider(name="Login")
	public Object[][] loginData() throws InterruptedException {

		
		Object[][] arrayObject = getExcelData("src//test//resources//Rare_Website_login.xls","Sheet2");
		return arrayObject;
	}
	
	public String[][] getExcelData(String fileName, String sheetName){
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}
}