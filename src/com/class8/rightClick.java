package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class rightClick extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://www.saucedemo.com");

		WebElement rightClick = driver.findElement(By.xpath("//input[@type='text']"));
		Actions ac = new Actions(driver);
		ac.contextClick(rightClick).perform();
		Thread.sleep(3000);
		driver.close();
		
		// I did, practice

	}
}