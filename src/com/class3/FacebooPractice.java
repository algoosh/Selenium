package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebooPractice {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nena\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("silverkeys123@yahoo.com");
	Thread.sleep(1000);
driver.findElement(By.id("pass")).sendKeys("Syntax12345");
Thread.sleep(1000);
driver.findElement(By.id("u_0_2")).click();
Thread.sleep(1000);
//driver.close();
	}

}
