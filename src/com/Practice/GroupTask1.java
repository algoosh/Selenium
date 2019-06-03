package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GroupTask1 extends CommonMethods {
/*Users Application Form Fill
//		1. Open chrome browser
//		2. Go to “http://uitestpractice.com/”
//		3. Click on “Forms” link
//		4. Fill out the entire form
//		5. Close the browser*/
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome","http://uitestpractice.com/");
		
driver.findElement(By.xpath("//a[text()='Form']")).click();
driver.findElement(By.cssSelector("input#firstname")).sendKeys("Anna");
driver.findElement(By.cssSelector("input#lastname")).sendKeys("Wong");
driver.findElement(By.cssSelector("input[type='radio']")).click();
driver.findElement(By.cssSelector("input[value='read']")).click();
driver.findElement(By.xpath("//option[text()='Indonesia']")).click();

driver.findElement(By.cssSelector("input[placeholder='Enter Date of birth']")).sendKeys("10/10/2000");

driver.findElement(By.cssSelector("input[placeholder='Enter PhoneNumber']")).sendKeys("123456");

driver.findElement(By.cssSelector("input#username")).sendKeys("green");

driver.findElement(By.cssSelector("input#email")).sendKeys("green123@yahoo.com");

driver.findElement(By.cssSelector("textarea#comment")).sendKeys("Hi, I am catching up!");

driver.findElement(By.cssSelector("input#pwd")).sendKeys("0000");

driver.findElement(By.cssSelector("button[type='submit']")).submit();

//driver.close();
	}

}
