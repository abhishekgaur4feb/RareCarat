package Page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Filter_By_Retailer_page {
	public static WebDriver driver;
	
	public Filter_By_Retailer_page(WebDriver driver){
		this.driver=driver;
	}
	By filter_retailer=By.xpath(".//*[@id='tabRetailer']/a");
	By zipcode_filter = By.xpath(".//*[@id='zipcode-filter']");
	By online_check_box= By.xpath(".//*[@id='retailerScroll']/div[2]/label");
	By search_button= By.xpath(".//*[@id='divSearchBtn']/div[2]");
	//Appointment
	
	By list_view=By.xpath("html/body/div[2]/div/section/div[3]/div/div[4]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/span/span");
	By list_view_details=By.xpath("html/body/div[2]/div/section/div[3]/div/div[4]/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/div[2]");
	By see_in_person=By.xpath("html/body/div[2]/div/section/div[3]/div/div[12]/div[2]/div/div[2]/div[3]/div[1]");
	By continue_booking=By.xpath("html/body/div[2]/div/section/div[4]/div/div/div[3]/div[2]/div[1]");
	By select_location_eastern_dallas=By.xpath("html/body/div[2]/div/section/div[3]/div/div[14]/div[2]/div/div[3]/div[2]/div[1]/div[1]");
	By select_location_taxas_united_states=By.xpath("html/body/div[2]/div/section/div[3]/div/div[14]/div[2]/div/div[3]/div[2]/div[1]/div[2]");
	By date_available_0=By.xpath(".//*[@id='date-time-0']");
	By date_available_2=By.xpath(".//*[@id='date-time-2']");
	By click_frame=By.className("intercom-launcher-discovery-frame");
	By intercome_message=By.xpath(".//*[@id='intercom-container']/div/div/div[1]/div/div[1]/div/img");
	//By scroll=By.xpath(".//*[@id='availableTimeSlots']");
	
	By time_available_last=By.xpath(".//*[@id='dtime-2']");
	By double_confirmation=By.xpath(".//*[@id='btnCreateAppointment']");
	
	public WebElement filter_retailer(){
		return driver.findElement(filter_retailer);
	}
	public WebElement zipcode_filter(){
		return driver.findElement(zipcode_filter);
	}
	
	
	public WebElement online_check_box(){
		return driver.findElement(online_check_box);	
	}
	
	public WebElement search_button(){
		return driver.findElement(search_button);
	}
	
	//Appointment
	
	public WebElement list_view(){
		return driver.findElement(list_view);
	}
	public WebElement list_view_details(){
		return driver.findElement(list_view_details);
	}
	
	public WebElement see_in_person(){
		return driver.findElement(see_in_person);
	}
	
	public WebElement continue_booking(){
		return driver.findElement(continue_booking);
	}
	
	public WebElement select_location_eastern_dallas(){
		return driver.findElement(select_location_eastern_dallas);
	}
	public WebElement select_location_taxas_united_states(){
		return driver.findElement(select_location_taxas_united_states);
	}
	
	public WebElement date_available_0(){
		return driver.findElement(date_available_0);
	}
	public WebElement date_available_2(){
		return driver.findElement(date_available_2);
	}
	
	public WebElement time_available_last(){
		return driver.findElement(time_available_last);
	}
	
	
	public WebElement click_frame(){
		return driver.findElement(click_frame);
	}	
	public WebElement intercome_message(){
		return driver.findElement(intercome_message);
	}	
	public WebElement double_confirmation(){
		return driver.findElement(double_confirmation);
	}	
	
	
}
