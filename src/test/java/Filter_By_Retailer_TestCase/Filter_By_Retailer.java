package Filter_By_Retailer_TestCase;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser_Invocation.Browser_Invoke;
import Login_Test_Case.Login_Test;
import Page_Objects.Filter_By_Retailer_page;


public class Filter_By_Retailer extends Browser_Invoke{
	static final Logger logger = Logger.getLogger(Filter_By_Retailer.class);
	
	@Test(priority=1)
	public void Filter_Login() throws InterruptedException{
	
	Login_Test lt=new Login_Test();
	lt.Login_TestCase("abhishekgaur4feb@gmail.com","Abhi@12345");
	//lt.loginData();
	logger.info("Successfully loged in");
	Thread.sleep(2000);
	}
	
	@Test(priority=2)
	@Parameters({"zipcode","location","date_available","time_available"})
	public void Filter_By_Diamond_TestCase(String zipcode,String location,int date_available,int time_available) throws InterruptedException {
			BasicConfigurator.configure();
			
			Filter_By_Retailer_page fbr=new Filter_By_Retailer_page(driver);
			
			fbr.filter_retailer().click();
			Thread.sleep(2000);
			logger.info("Clicked on Filter by Retailer tab");
			
			
			logger.info("Looking for zipcode in XML");
			fbr.zipcode_filter().clear();
			fbr.zipcode_filter().sendKeys(Keys.chord(Keys.CONTROL, "a"), zipcode);
			Thread.sleep(2000);
			fbr.zipcode_filter().sendKeys(Keys.chord(Keys.ENTER));
			logger.info("Test Retailer Zipcode replaced successfully");
			Thread.sleep(2000);
			
			fbr.online_check_box().click();
		
			
			fbr.search_button().click();
			
			Thread.sleep(5000);
			
			//Appointment Started
			
			fbr.list_view().click();
			logger.info("Clicked on List View");
			
			Thread.sleep(2000);
			logger.info("Clicking on Diamond Details");
			fbr.list_view_details().click();
			Thread.sleep(2000);
			
			logger.info("Clicking on See in Person to book an appointment");
			fbr.see_in_person().click();
			Thread.sleep(2000);
			
			logger.info("Clicking on Continue to book an appointment");
			fbr.continue_booking().click();
			Thread.sleep(2000);
			
			logger.info("Fetching location from XML File");
			System.out.println("Location fetched-->"+location);
			if(location.contains("EasternTimeDallas")){
				fbr.select_location_eastern_dallas().click();
				Thread.sleep(2000);
				logger.info("Clicked on Eastern Time,DALLAS");
				}
			if(location.contains("TexasUnitedStates")){
				fbr.select_location_taxas_united_states().click();
				Thread.sleep(2000);
				logger.info("Clicked on Pacific Time, Dallas, TX, United States");
				}
			
			if(date_available==0){
				fbr.date_available_0().click();
				Thread.sleep(2000);
			}
			if(date_available==2){
				fbr.date_available_2().click();
				Thread.sleep(2000);
			}
			
			Thread.sleep(2000);
			
			
			driver.switchTo().frame(fbr.click_frame());
			
			fbr.intercome_message().click();
			Thread.sleep(1000);
			fbr.intercome_message().click();
			driver.switchTo().defaultContent();
			
			Thread.sleep(1000);
			//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fbr.scroll());
			//Thread.sleep(2000);
			fbr.time_available_last().click();
			Thread.sleep(5000);
			fbr.double_confirmation().click();
			Thread.sleep(4000);
			logger.info("Appointment Booked Successfully");
	        
	
	}
	}
