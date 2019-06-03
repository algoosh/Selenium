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
	public void searchFlight() {

		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("DCA");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("DEN");
		//store the element 
		WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		while (!month.getText().contains("October")) {
			driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();
			month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		}
			
		List<WebElement> depDay = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td"));
		for (WebElement day : depDay) {
			if (day.getText().equals("15")) {
				day.click();
				break;

			}
		}
	}

	@AfterMethod
	public void close() {

		driver.close();

	}
}
