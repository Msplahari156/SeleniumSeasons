package xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PracticeXpath {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("reyaz0806");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(3000);
		//location dropdown
		WebElement locationDropDown =driver.findElement(By.xpath("//select[@id='location']"));
		List <WebElement> allLocationDropValues=locationDropDown.findElements(By.tagName("option"));
		System.out.println("No of values in Location dropdown is : "+allLocationDropValues.size());
		for(int i=0;i<allLocationDropValues.size();i++){
			System.out.println(allLocationDropValues.get(i).getText());
		}
		Select s1=new Select(locationDropDown);
		s1.selectByVisibleText("Sydney");
		//hotel dropdown
		WebElement hotelDropDown=driver.findElement(By.xpath("//select[@id='hotels']"));
		List <WebElement> hotelDrop=hotelDropDown.findElements(By.tagName("option"));
		System.out.println("No of hotels in Sydney "+hotelDrop.size());
		for(int i=0;i<hotelDrop.size();i++) {
			System.out.println(hotelDrop.get(i).getText());
		}
		Select s2=new Select(hotelDropDown);
		s2.selectByValue("Hotel Sunshine");
		//room type
		WebElement room=driver.findElement(By.xpath("//select[@id='room_type']"));
		List <WebElement> roomDrop=room.findElements(By.tagName("option"));
		System.out.println("No of hotels in Sydney "+roomDrop.size());
		for(int i=0;i<roomDrop.size();i++) {
			System.out.println(roomDrop.get(i).getText());
		}
		Select s3=new Select(room);
		s3.selectByValue("Super Deluxe");
		Thread.sleep(3000);
		//no of rooms
		WebElement noofroom=driver.findElement(By.xpath("//select[@id='room_nos']"));
		List <WebElement> noOfRoomDrop=noofroom.findElements(By.tagName("option"));
		System.out.println("No of hotels in Sydney "+noOfRoomDrop.size());
		for(int i=0;i<noOfRoomDrop.size();i++) {
			System.out.println(noOfRoomDrop.get(i).getText());
		}
		Select s4=new Select(noofroom);
		s4.selectByValue("2");
		Thread.sleep(3000);
		//checkin date
		WebElement checkInDate=driver.findElement(By.xpath("//input[@id='datepick_in']"));
		checkInDate.clear();
		checkInDate.sendKeys("03/09/2025");
		Thread.sleep(3000);
		//checkout date
		WebElement checkOutDate=driver.findElement(By.xpath("//input[@id='datepick_out']"));
		checkOutDate.clear();
		checkOutDate.sendKeys("05/09/2025");
		Thread.sleep(3000);
		//adults per room
		WebElement adultIn=driver.findElement(By.xpath("//select[@id='adult_room']"));
		List <WebElement> adultDrop=driver.findElements(By.tagName("option"));
		for(int i=0;i<adultDrop.size();i++) {
			System.out.println(adultDrop.get(i).getText());
		}
		Select s6=new Select(adultIn);
	    s6.selectByValue("2");
	    Thread.sleep(3000);
	    //children per room
	    WebElement childRoom=driver.findElement(By.xpath("//select[@id='child_room']"));
	    List <WebElement> childDrop=driver.findElements(By.tagName("option"));
	    for(int i=0;i<childDrop.size();i++) {
			System.out.println(childDrop.get(i).getText());
		}
	    Select s7=new Select(childRoom);
	    s7.selectByValue("2");
	    Thread.sleep(3000);
	    
	    WebElement Submit=driver.findElement(By.xpath("//input[@id='Submit']"));
	    Submit.click();
	    Thread.sleep(10000);
	    
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    
	/* WebElement Reset=driver.findElement(By.xpath("//input[@id='Reset']"));
	    Reset.click();
	    Thread.sleep(3000);*/
	    
	  WebElement radio=driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
	  System.out.println("the radio buton is selected"+radio.isSelected());  
	  radio.click();
	  Thread.sleep(3000);
	  
	  WebElement continueButton=driver.findElement(By.xpath("//input[@id='continue']"));
	  continueButton.click();
	  Thread.sleep(5000);
		
	 /* WebElement cancelButton=driver.findElement(By.xpath("//input[@id='cancel']"));
	  cancelButton.click();
	  Thread.sleep(3000);*/
	  
	  System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	  
	  driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("vicky");
	  driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("likki");
	  driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("visakahapatnam");
	  driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("2424242424242424");
	WebElement credCard=driver.findElement(By.xpath("//select[@id='cc_type']"));
	List <WebElement> credList=driver.findElements(By.tagName("option"));
	for(int i=0;i<credList.size();i++) {
		System.out.println(credList.get(i).getText());
	}
	
	Select c1=new Select(credCard);
	c1.selectByValue("VISA");
	Thread.sleep(3000);
	
	WebElement month=driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	//List <WebElement> m=driver.findElements(By.tagName("option"));
	Select m1=new Select(month);		
	m1.selectByVisibleText("July");
	
	WebElement year1=driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	//List <WebElement> year=driver.findElements(By.tagName("option"));
	Select y1=new Select(year1);		
	y1.selectByVisibleText("2028");
	
	driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("765");
	driver.findElement(By.xpath("//input[@id='book_now']")).click(); //click book now
	
	//driver.findElement(By.xpath("//input[@id='cancel']")).click(); //cancel button
	
	Thread.sleep(10000);
	 System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	   
	    driver.findElement(By.xpath("//input[@id='search_hotel']")).click();
	    Thread.sleep(4000);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle()); 
	    
	  /*  driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
	    Thread.sleep(20000);
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());  */
	    
	  /*  driver.findElement(By.xpath("//input[@id='logout']")).click();
	    Thread.sleep(20000); */
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		System.out.println("Browser closed");
		
	}
	
}
