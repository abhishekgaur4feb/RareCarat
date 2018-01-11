package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;


public class Sample {
	WebDriver driver;
	WebDriverWait wait;
	String url = "http://www.rarecarat.com"; 

	//By Clarity = By.xpath(".//*[@id='thelist']/div[7]/div[2]/div[1]/span/span[6]");
	
	By Clarity_Right = By.xpath(".//*[@id='thelist']/div[7]/div[2]/div[1]/span/span[6]");
	By Clarity_left= By.xpath(".//*[@id='thelist']/div[7]/div[2]/div[1]/span/span[7]");

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C://Abhishek//downloads//drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver, 10);
	}

	//@AfterTest
	//public void tearDown() {
	// driver.quit();
	//}



	@Test
	public void moveSliderToRight() throws InterruptedException {
		driver.get(url); 
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(Clarity_Right));
		//Identify WebElement
		WebElement sliderM3 = driver.findElement(Clarity_Right);	  
	    new Actions(driver).dragAndDropBy(sliderM3,128, 0).build().perform();
        Thread.sleep(2000);
	   WebElement sliderM4 = driver.findElement(Clarity_left);
		new Actions(driver).dragAndDropBy(sliderM4,-128, 0).build().perform();
		
	}
	
		
	}

