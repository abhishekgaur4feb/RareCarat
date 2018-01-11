package Browser_Invocation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Browser_Invoke {
	public static WebDriver driver;
	public Properties prop;
	@BeforeTest
	@Parameters("Browsername")
	public WebDriver InvokeBrowser(String Browsername) throws IOException{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("src//main//resources//Url.properties");
		prop.load(fis);
		String url=prop.getProperty("url");
		System.out.println(Browsername);
		if(Browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C://Abhishek//downloads//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			}
		else if(Browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C://Abhishek//downloads//drivers//chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		return driver;
	}
	
	//Takes Screen Shot Method
	public static void getScreenShot(String result) throws IOException{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Abhishek//Kepler_Workspace//RareCaratWebsite//Screenshots//"+result+"screenshot.png"));
	}
	
	@AfterTest
	public void teardown(){
		driver.close();
		//to avoid the memory in Heap 
		driver=null;
	}

}
