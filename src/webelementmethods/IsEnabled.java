package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?tripType=O&itinerary=PNQ-VNS-14/08/2025&paxType=A-1_C-0_I-0&cabinClass=E&sTime=1755182382862&forwardFlowRequired=true&action=FLTSRCH&intl=false&cmp=SEM%7CD%7CDF%7CB%7CRoute%7CGrouped%7CRoute-ToptoMid_DT%7CDF_Route_Exact_3%7CPune_Varanasi_Exact%7CRSA&ef_id=:G:s&msclkid=0d474451681c1372b09f2cc5d2975079&isSemFlow=true");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("search-button")).isEnabled());
		driver.quit();
	}

}
