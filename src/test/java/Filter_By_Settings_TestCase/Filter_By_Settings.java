package Filter_By_Settings_TestCase;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser_Invocation.Browser_Invoke;
import Filter_By_Diamond_TestCase.Filter_By_Diamond;
import Page_Objects.Filter_By_Settings_page;

public class Filter_By_Settings extends Browser_Invoke {
	static final Logger logger = Logger.getLogger(Filter_By_Settings.class);
	
	
	
	@Test
	@Parameters({"Setting_Price_Min","Setting_Price_Max","Style","Metal"})
	public void Filter_By_Settings_TestCase(@Optional("200")String Setting_Price_Min,@Optional("7000")String Setting_Price_Max,String Style,String Metal) throws InterruptedException {
			BasicConfigurator.configure();
			Filter_By_Settings_page fbs=new Filter_By_Settings_page(driver);
			//Click on Filter CLicked
			fbs.Filter_settings().click();
			Thread.sleep(2000);
			logger.info("Clicked on Filter by Settings tab");
			System.out.println(Setting_Price_Min);
		
			System.out.println("Setting_Price_Min-->"+Setting_Price_Min);
			
			//Price_settings
			logger.info("Looking for Minimum price in XML");
			Thread.sleep(2000);
			
			fbs.price_settings_min().clear();
			fbs.price_settings_min().sendKeys(Keys.chord(Keys.CONTROL, "a"), Setting_Price_Min);
			Thread.sleep(2000);
			fbs.price_settings_min().sendKeys(Keys.chord(Keys.ENTER));
			logger.info("Price given successfully");
			
			logger.info("Looking for Max Price in XML");
			fbs.price_settings_max().clear();
			fbs.price_settings_max().sendKeys(Keys.chord(Keys.CONTROL, "a"), Setting_Price_Max);
			Thread.sleep(2000);
			fbs.price_settings_max().sendKeys(Keys.chord(Keys.ENTER));
			logger.info("Price given successfully");
			
			
			
			
			System.out.println("Style is -->"+Style);
			//Click Solitaire for removal of Selection
			if(Style.contains("Solitaire")){
				fbs.Solitaire().click();
				Thread.sleep(2000);
				logger.info("Clicked on Solitaire");
				}
			if(Style.contains("halo")){
				fbs.Halo().click();
				Thread.sleep(2000);
				logger.info("Clicked on halo");
				}
			if(Style.contains("SideStone")) {
				fbs.SideStone().click();
				Thread.sleep(2000);
				logger.info("Clicked on Sidestone");
		    
			}
			if(Style.contains("ThreeStone")){
				fbs.ThreeStone().click();
				Thread.sleep(2000);
				logger.info("Clicked on ThreeStone");
			}
			
			//Metal
			//White Gold
			if(Metal.contains("fourteen_k_white_gold")){
				fbs.fourteen_k_white_gold().click();
				Thread.sleep(2000);
				logger.info("Clicked on fourteen_k_white_gold");
			}
			if(Metal.contains("eighteen_k_white_gold")){
				fbs.eighteen_k_white_gold().click();
				Thread.sleep(2000);
				logger.info("Clicked on eighteen_k_white_gold");
			}
			
			//Yellow Gold
			if(Metal.contains("fourteen_k_yellow_gold")){
				fbs.fourteen_k_yellow_gold().click();
				Thread.sleep(2000);
				logger.info("Clicked on fourteen_k_yellow_gold");
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",fbs.eighteen_k_yellow_Gold());
			if(Metal.contains("eighteen_k_yellow_Gold")){
				fbs.eighteen_k_yellow_Gold().click();
				Thread.sleep(2000);
				logger.info("Clicked on eighteen_k_yellow_Gold");
			}
			
			//Rose Gold
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",fbs.fourteen_k_rose_gold());
			if(Metal.contains("fourteen_k_rose_gold")){
				fbs.fourteen_k_rose_gold().click();
				Thread.sleep(2000);
				logger.info("Clicked on fourteen_k_rose_gold");
			}	
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",fbs.eighteen_k_rose_Gold());
			if(Metal.contains("eighteen_k_rose_Gold")){
				fbs.eighteen_k_rose_Gold().click();
				Thread.sleep(2000);
				logger.info("Clicked on eighteen_k_rose_Gold");
			}	
			
			//Platinium
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",fbs.platinium());
			if(Metal.contains("platinium")){
				fbs.platinium().click();
				Thread.sleep(2000);
				logger.info("Clicked on platinium");
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",fbs.palladium());
			if(Metal.contains("palladium")){
				fbs.palladium().click();
				Thread.sleep(2000);
				logger.info("Clicked on palladium");
			}
			
			fbs.search_settings().click();
			Thread.sleep(2000);
			
	}
	
	
}