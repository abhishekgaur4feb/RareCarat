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


public class Raw {
	WebDriver driver;
	WebDriverWait wait;
	String url = "http://www.rarecarat.com"; 

	By Intercome = By.className("intercom-launcher-discovery-frame");
	By Element=By.xpath(".//*[@id='intercom-container']/div/div/div[1]/div/div[1]/div/img");
	


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
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(Intercome));
		driver.findElement(Element).click();
	}
	
		
	}

