package com.class12;

import org.openqa.selenium.By;

import utils.CommonMethods;
/*OrangeHRM Login

Navigate to “https://opensource-demo.orangehrmlive.com/”
Login to the application
Verify user is successfully logged in

Note: must use properties file*/
public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		String url = "https://opensource-demo.orangehrmlive.com/";
		setUpDriver("chrome", url);
		driver.findElement(By.id("divUsername")).sendKeys("Admin");
		driver.findElement(By.id("divPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}

}
