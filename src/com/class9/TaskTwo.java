package com.class9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TaskTwo extends CommonMethods {
/* Verify element is clickable1.Open chrome browser2.Go to “https://the-internet.herokuapp.com/”3.
 * Click on “Click on the “Dynamic Controls” link4.Select checkbox and click Remove5.
 * Click on Add button and verify “It's back!” text is displayed6.
 * Close the browser*/
	public static void main(String[] args) throws InterruptedException {
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome",url);

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[onclick='swapCheckbox()']")).click();
	WebElement x=driver.findElement(By.id("message"));
	if(x.isDisplayed()) {
		System.out.println("there");
	}else {
		System.out.println("NOT");
	}
	driver.close();
	}

}//YEEESSSSS!
