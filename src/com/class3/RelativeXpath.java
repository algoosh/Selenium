package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standartUser");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("badayaga");
driver.findElement(By.xpath("//input[@type='submit']")).click();
}}
