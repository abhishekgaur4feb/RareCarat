package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing_Diamond {
	WebDriver driver;
	WebDriverWait wait;
	String url = "http://www.rarecarat.com"; 
	
	By Certification = By.xpath("html/body/div[2]/div/section/div[1]/div[1]/div[5]/div[1]/div/div[2]/div[1]/div/div/div[9]/div[2]/div[2]");
	By pricetext = By.xpath(".//*[@id='priceMin']");
	By Carat = By.xpath(".//*[@id='caratMin']");
	By Color_Right = By.xpath(".//*[@id='thelist']/div[6]/div[2]/div[1]/span/span[6]");
	By Color_left= By.xpath(".//*[@id='thelist']/div[6]/div[2]/div[1]/span/span[7]");
	By Clarity_Right = By.xpath(".//*[@id='thelist']/div[7]/div[2]/div[1]/span/span[6]");
	By Clarity_left= By.xpath(".//*[@id='thelist']/div[7]/div[2]/div[1]/span/span[7]");
	By Cut_left = By.xpath(".//*[@id='thelist']/div[5]/div[2]/div[1]/span/span[7]");
	By Cut_right = By.xpath(".//*[@id='thelist']/div[5]/div[2]/div[1]/span/span[6]");
	By flo_right = By.xpath(".//*[@id='thelist']/div[8]/div[2]/div[1]/span/span[6]");
	By flo_left = By.xpath(".//*[@id='thelist']/div[8]/div[2]/div[1]/span/span[7]");
	By Photo_Video = By.xpath(".//*[@id='thelist']/div[11]/div/label/div");
	By Search = By.xpath(".//*[@id='divSearchBtn']/div[2]");


	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C://Abhishek//downloads//drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  wait = new WebDriverWait(driver, 10);
	}

	//@AfterTest
	//public void tearDown() {
	 //driver.quit();
	//}



	@Test
	public void moveSliderToEnd() throws InterruptedException {

		driver.get(url); 
		//Price
		driver.findElement(pricetext).clear();
		driver.findElement(pricetext).sendKeys(Keys.chord(Keys.CONTROL, "a"), "9500");
		driver.findElement(pricetext).sendKeys(Keys.chord(Keys.ENTER));
		//Carat
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(Carat));
		driver.findElement(Carat).clear();
		driver.findElement(Carat).sendKeys(Keys.chord(Keys.CONTROL, "a"), ".90");
		driver.findElement(Carat).sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(2000);
		
		//Cut(Right and Left)
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(Cut_left));
		//Identify WebElement
		WebElement slider1 = driver.findElement(Cut_left);
		new Actions(driver).clickAndHold(slider1).moveByOffset(-100,0).release().perform();
		Thread.sleep(2000);
		WebElement slider2 = driver.findElement(Cut_right);
		new Actions(driver).clickAndHold(slider2).moveByOffset(100,0).release().perform();
		
		//Colour
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(Color_Right));
		//Identify WebElement
		WebElement sliderM1 = driver.findElement(Color_Right);	  
	    new Actions(driver).dragAndDropBy(sliderM1,120, 0).build().perform();
        Thread.sleep(2000);
	    WebElement sliderM2 = driver.findElement(Color_left);
		new Actions(driver).dragAndDropBy(sliderM2,-120, 0).build().perform();
		
		//Clarity
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(Clarity_Right));
		//Identify WebElement
		WebElement sliderM3 = driver.findElement(Clarity_Right);	  
	    new Actions(driver).dragAndDropBy(sliderM3,128, 0).build().perform();
        Thread.sleep(2000);
	   WebElement sliderM4 = driver.findElement(Clarity_left);
		new Actions(driver).dragAndDropBy(sliderM4,-128, 0).build().perform();
		
		
		//Flourencense
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(flo_right));
		//Identify WebElement
		WebElement sliderA = driver.findElement(flo_right);		
		new Actions(driver).dragAndDropBy(sliderA, 150, 0).build().perform();
		Thread.sleep(2000);
		WebElement sliderB = driver.findElement(flo_left);		
		new Actions(driver).dragAndDropBy(sliderB, -150, 0).build().perform();
		Thread.sleep(2000);
		
		//Certification
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(Certification));
		driver.findElement(Certification).click();
		Thread.sleep(5000);
		driver.findElement(Photo_Video).click();
		Thread.sleep(5000);
		driver.findElement(Search).click();
		Thread.sleep(5000);
		}
}
