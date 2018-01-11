package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


import Browser_Invocation.Browser_Invoke;
import Page_Objects.Signup_page;



public class Signup extends Browser_Invoke{
	static final Logger logger = Logger.getLogger(Signup.class);

	
	
	//@BeforeTest
	//public void Invocation() throws IOException{
		//Browser Invoke Class
		//driver=InvokeBrowser();
		//driver.get(prop.getProperty("url"));
		
	//}
	
	@Test(dataProvider="Signup")
	public void Signup_RareCarat(String fname,String lname,String email,String password) throws InterruptedException, FileNotFoundException, IOException{
	BasicConfigurator.configure();
	Signup_page lop=new Signup_page(driver);
	logger.info("Looking in Property File");
	lop.GoClick().click();


		//String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); // switch to popup window
		System.out.println(driver.getTitle());
		// Now you are in the popup window, perform necessary actions here

		lop.byRareCarat().click();
		logger.info("Signup by RareCarat Clicked Successfully");
		
		lop.byNewUser().click();
		logger.info("Signup for New User Clicked Successfully");
		Thread.sleep(1000L);
		lop.FirstName().sendKeys(fname);
		Thread.sleep(1000L);
		lop.LastName().sendKeys(lname);
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(lop.EmailID())).sendKeys("XXX.gmail.com");
		
				
		Thread.sleep(1000L);
		lop.EmailID().sendKeys(email);
		
		Thread.sleep(1000L);
		lop.Password().sendKeys(password);
		
		logger.info("All Entries given");
		
		Thread.sleep(1000L);
		lop.Signup().click();
		logger.info("Finally clicked Signup");
		Thread.sleep(3000L);
		String Message=lop.GetMessage().getText();
		
		System.out.println("Message Printed-->"+Message);
		
		//driver.switchTo().window(parentWindowHandler); 
		
	}
	
	@DataProvider(name="Signup")
	public Object[][] loginData() throws InterruptedException {

		
		Object[][] arrayObject = getExcelData("src//test//resources//Rare_Website_login.xls","Sheet1");
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
	
	@AfterTest
	public void teardown(){
		driver.close();
		//to avoid the memory in Heap 
		driver=null;
	}

}
