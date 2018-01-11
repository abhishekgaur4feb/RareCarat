package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signup_page {
	
	public static WebDriver driver;
	
	public Signup_page(WebDriver driver){
		this.driver=driver;
	}
	By gobutton=By.xpath(".//*[@id='divDiamondController']/header/div[3]/a[10]/span");
	By RareCarat=By.xpath(".//*[@id='loginAlert']/div[2]/div/div/div[2]/div[4]/div[2]/a[4]/i");
	By NewUser=By.xpath(".//*[@id='loginRareCarat']/div[1]/form/button[2]");
	By Login=By.xpath(".//*[@id='loginRareCarat']/div[1]/form/button[1]");
	By Login_Username=By.xpath(".//*[@id='UserName']");
	By Login_Password=By.xpath(".//*[@id='Password']");
	
	By FirstName=By.xpath(".//*[@id='FirstName']");
	By LastName=By.xpath(".//*[@id='LastName']");
	By MailID=By.xpath("html/body/div[6]/div[2]/div/div/div[2]/div[3]/div[3]/input");
	By Password=By.xpath("html/body/div[6]/div[2]/div/div/div[2]/div[3]/div[4]/input");
	By Sign_up_button=By.xpath("html/body/div[6]/div[2]/div/div/div[2]/div[3]/button[1]");
	By Message=By.xpath(".//*[@id='signUpRareCarat']/span[2]");
	
	public WebElement GoClick(){
		return driver.findElement(gobutton);
	}
	
	public WebElement byRareCarat(){
		return driver.findElement(RareCarat);
	}
	
	public WebElement byNewUser(){
		return driver.findElement(NewUser);
	}

	public WebElement FirstName(){
		return driver.findElement(FirstName);
	}
	public WebElement LastName(){
			return driver.findElement(LastName);
	}
	public WebElement EmailID(){
		return driver.findElement(MailID);
	}
	public WebElement Password(){
		return driver.findElement(Password);
	}
	public WebElement Signup(){
		return driver.findElement(Sign_up_button);
	}
	public WebElement GetMessage(){
		return driver.findElement(Message);
	}

	public WebElement NewLogin(){
		return driver.findElement(Login);
	}
	public WebElement NewLogin_Username(){
		return driver.findElement(Login_Username);
	}
	public WebElement NewLogin_Password(){
		return driver.findElement(Login_Password);
	}
}

