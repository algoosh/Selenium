package com.Practice;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Iframe extends CommonMethods {
	
	
public static void main(String[] args) throws InterruptedException {
	CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
	driver.switchTo().frame("iframe_a");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#name")).sendKeys("Olga");
	
	//driver.close();
}
}
