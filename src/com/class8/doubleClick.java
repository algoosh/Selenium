package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class doubleClick extends CommonMethods {

public static void main(String[] args) throws InterruptedException {

	setUpDriver("chrome","https://www.saucedemo.com");
	WebElement el=driver.findElement(By.cssSelector("input#user-name"));
Actions ac=new Actions(driver);
el.sendKeys("please slowdown");
ac.doubleClick(el).build().perform();

Thread.sleep(6000);
driver.close();

//I did it! Practice
}}