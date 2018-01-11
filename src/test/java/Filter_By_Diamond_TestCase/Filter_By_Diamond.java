package Filter_By_Diamond_TestCase;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser_Invocation.Browser_Invoke;
import Page_Objects.Filter_By_Diamond_page;


public class Filter_By_Diamond extends Browser_Invoke{
	static final Logger logger = Logger.getLogger(Filter_By_Diamond.class);

	@Test
	@Parameters({"price_left","Carat_left","Color_left_param","Color_right_param","Cut_left_param","Cut_right_param","Clarity_left_param","Clarity_right_param","flo_left_param","flo_right_param"})
	public void Filter_By_Diamond_TestCase(String price_left,String Carat_left,int Color_left_param,int Color_right_param,int Cut_left_param,int Cut_right_param,int Clarity_left_param,int Clarity_right_param,int flo_left_param,int flo_right_param) throws InterruptedException {
			BasicConfigurator.configure();
			Filter_By_Diamond_page fbd=new Filter_By_Diamond_page(driver);
			System.out.println(price_left);
			//Price
			logger.info("Looking for Price in XML");
			fbd.pricetext().clear();
			fbd.pricetext().sendKeys(Keys.chord(Keys.CONTROL, "a"), price_left);
			Thread.sleep(2000);
			fbd.pricetext().sendKeys(Keys.chord(Keys.ENTER));
			logger.info("Price given successfully");
			
			//Carat
			
			logger.info("Looking for Carat in XML");
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fbd.Carat());
			fbd.Carat().clear();
			fbd.Carat().sendKeys(Keys.chord(Keys.CONTROL, "a"), Carat_left);
			fbd.Carat().sendKeys(Keys.chord(Keys.ENTER));
			logger.info("Carat given successfully");
			Thread.sleep(2000);
			
			
			//CUT
			logger.info("Looking for Cut in XML");
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fbd.Cut_left());
			//Identify WebElement
			WebElement sliderM3 = fbd.Cut_left();	  
		    new Actions(driver).dragAndDropBy(sliderM3,Cut_left_param, 0).build().perform();
	        Thread.sleep(2000);
		    WebElement sliderM4 = fbd.Cut_right();
			new Actions(driver).dragAndDropBy(sliderM4,Cut_right_param, 0).build().perform();
			logger.info("Cut selected successfully");
			
			
			
			logger.info("Looking in Xml for Color");
			//COLOR
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fbd.Color_left());
			//Identify WebElement
			WebElement sliderM1 = fbd.Color_left();	  
		    new Actions(driver).dragAndDropBy(sliderM1,Color_left_param, 0).build().perform();
	        Thread.sleep(2000);
		    WebElement sliderM2 = fbd.Color_Right();
			new Actions(driver).dragAndDropBy(sliderM2,Color_right_param, 0).build().perform();
			logger.info("Color selected successfully");
			
			

			//CLARITY
			logger.info("Looking in Xml for Clarity");
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fbd.Clarity_left());
			//Identify WebElement
			WebElement sliderM5 = fbd.Clarity_left();	  
		    new Actions(driver).dragAndDropBy(sliderM5,Clarity_left_param, 0).build().perform();
	        Thread.sleep(2000);
		    WebElement sliderM6 = fbd.Clarity_Right();
			new Actions(driver).dragAndDropBy(sliderM6,Clarity_right_param, 0).build().perform();
			logger.info("Clarity selected successfully");
			
			
			//FLOURESCENCE
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fbd.flo_left());
			//Identify WebElement
			WebElement sliderM7 = fbd.flo_left();	  
		    new Actions(driver).dragAndDropBy(sliderM7,flo_left_param, 0).build().perform();
	        Thread.sleep(2000);
		    WebElement sliderM8 = fbd.flo_right();
			new Actions(driver).dragAndDropBy(sliderM8,flo_right_param, 0).build().perform();
			
			//Certifications
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fbd.Certification());
			fbd.Certification().click();
			Thread.sleep(5000);
			//Photo or Video Required
			fbd.Photo_Video().click();
			Thread.sleep(5000);
			//Click on Search Button
			fbd.Search().click();
			Thread.sleep(5000);
	}

}
