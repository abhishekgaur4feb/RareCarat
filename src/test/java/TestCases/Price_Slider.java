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


public class Price_Slider {
	WebDriver driver;
	WebDriverWait wait;
	String url = "http://www.rarecarat.com"; 

	By Clarity = By.xpath(".//*[@id='thelist']/div[7]/div[2]/div[1]/span/span[7]");
	
	//By Cut_right = By.xpath(".//*[@id='thelist']/div[5]/div[2]/div[1]/span/span[6]");


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
		
		//Color
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(Clarity));
		
		WebElement sliderL = driver.findElement(Clarity);
		int width=sliderL.getSize().getWidth();
		System.out.println("Width is--"+width);
		Actions mover = new Actions(driver);
		org.openqa.selenium.interactions.Action act=	mover.dragAndDropBy(sliderL,((width*-350)/100), 0).build();
	    
		act.perform();
	}
	
		
	}

