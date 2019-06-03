package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class ChildParentXpaths extends CommonMethods {
///YESSSSSS
	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		
//		if (driver.findElement(By.xpath("//input[@id='txtPassword']/..")).isDisplayed()) {
//			System.out.println("Element is displayed");
//		} else {
//			System.out.println("None");
//		}
//		// find preceding/previous sibling from current WebElement
		driver.findElement(By.xpath("//span[text()='Contraseña']/preceding-sibling::input")).sendKeys("admin123");
		
		//driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("admin123");
		
		// find following/next sibling from current WebElement
		driver.findElement(By.xpath("//input[@id='btnLogin']/..")).click();
		driver.close();
	}
	
}
