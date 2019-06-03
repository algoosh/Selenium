package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Calender extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Users Application Form Fill // 1. Open chrome browser // 2. Go to
		 * “http://uitestpractice.com/” // 3. Click on “Forms” link // 4. Fill out the
		 * entire form // 5. Close the browser
		 */
		setUpDriver("chrome", "http://uitestpractice.com/");

		driver.findElement(By.xpath("//a[text()='Form']")).click();
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("Anna");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("Wong");
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.cssSelector("input[value='read']")).click();
		driver.findElement(By.xpath("//option[text()='Indonesia']")).click();
		driver.findElement(By.id("datepicker")).click();
		
		
		WebElement month=driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select month_name=new Select(month);
		month_name.selectByVisibleText("Oct");
		//System.out.println(month_name);
		WebElement year=driver.findElement(By.cssSelector("select.ui-datepicker-year"));
		Select year_name=new Select(year);
		year_name.selectByIndex(5);
		//System.out.println(year_name);
		List <WebElement>  list=driver.findElements(By.cssSelector(".ui-datepicker-calendar tbody tr td"));
		for(int i=0;i<list.size();i++) {
			
			String date=driver.findElements(By.cssSelector(".ui-datepicker-calendar tbody tr td")).get(i).getText();
			if(date.equalsIgnoreCase("15")) {
				driver.findElements(By.cssSelector(".ui-datepicker-calendar tbody tr td")).get(i).click();
			}else {
				System.out.println(" the day is wrong");
			}
		}
	}

}
