package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Filter_By_Settings_page {
		public static WebDriver driver;
		
		public Filter_By_Settings_page(WebDriver driver){
			this.driver=driver;
		}
		By filter_settings=By.xpath(".//*[@id='tabSettings']/a");
		
		By price_settings_min=By.xpath(".//*[@id='priceMin_settings']");
		By price_settings_max=By.xpath(".//*[@id='priceMax_settings']");
		//Style
		By Solitaire=By.xpath(".//*[@id='1']");
		By halo=By.xpath(".//*[@id='2']");
		By sidestone=By.xpath(".//*[@id='4']");
		By threestone=By.xpath(".//*[@id='8']");
		
		By fourteen_k_white_gold=By.xpath(".//*[@id='m-2']");
		By eighteen_k_white_gold=By.xpath(".//*[@id='m-3']");
		
		By fourteen_k_yellow_gold=By.xpath(".//*[@id='m-4']");
		By eighteen_k_yellow_Gold=By.xpath(".//*[@id='m-5']");
		
		By fourteen_k_rose_gold=By.xpath(".//*[@id='m-6']");
		By eighteen_k_rose_Gold=By.xpath(".//*[@id='m-7']");
		
		By platinium=By.xpath(".//*[@id='m-1']");
		By palladium=By.xpath(".//*[@id='m-8']");
		
		By search_settings=By.xpath(".//*[@id='divSearchBtn']/div[2]");
		
		
		public WebElement Solitaire(){
			return driver.findElement(Solitaire);
		}
		
		
		public WebElement price_settings_min(){
			return driver.findElement(price_settings_min);
		}
		public WebElement price_settings_max(){
			return driver.findElement(price_settings_max);
		}
		public WebElement Filter_settings(){
			return driver.findElement(filter_settings);
		}
		public WebElement Halo(){
			return driver.findElement(halo);
		}
		
		public WebElement SideStone(){
			return driver.findElement(sidestone);
		}
		public WebElement ThreeStone(){
			return driver.findElement(threestone);
		}

		public WebElement fourteen_k_white_gold(){
			return driver.findElement(fourteen_k_white_gold);
		}
		
		public WebElement eighteen_k_white_gold(){
			return driver.findElement(eighteen_k_white_gold);
		}
		public WebElement fourteen_k_yellow_gold(){
			return driver.findElement(fourteen_k_yellow_gold);
		}
		
		public WebElement eighteen_k_yellow_Gold(){
			return driver.findElement(eighteen_k_yellow_Gold);
		}
		
		
		public WebElement fourteen_k_rose_gold(){
			return driver.findElement(fourteen_k_rose_gold);
		}
		
		public WebElement eighteen_k_rose_Gold(){
			return driver.findElement(eighteen_k_rose_Gold);
		}
		
		public WebElement platinium(){
			return driver.findElement(platinium);
		}
		
		public WebElement palladium(){
			return driver.findElement(palladium);
		}
		public WebElement search_settings(){
			return driver.findElement(search_settings);
		}
		
	}
