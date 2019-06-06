package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;//CCORRECTTTTTT AND FINISH

public class FlightSearch extends CommonMethods {

	String browser = "chrome";
	String url = "https://www.aa.com/homePage.do";

	@BeforeMethod
	public void openBrowser() {
		setUpDriver("chrome",url);
	}

	@Test
	public void searchFlight() throws InterruptedException {

		driver.findElement(By.name("originAirport")).sendKeys("BUR");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("DEN");
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		Thread.sleep(3000); 
		WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		while (!month.getText().contains("November")) {
			driver.findElement(By.cssSelector("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			Thread.sleep(3000); 
			month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		}
		Thread.sleep(3000); 
		//List<WebElement> depDay = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
		List<WebElement> depDay=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		Thread.sleep(3000); 
		for (WebElement day : depDay) {
			if (day.getText().equals("15")) {
				day.click();
				Thread.sleep(3000); 
				break; 
			}
			Thread.sleep(3000); 
		}
	}

	@AfterMethod
	public void close() {

		//driver.close();

	}
}
