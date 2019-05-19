package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("John");
		driver.findElement(By.xpath("//input[starts-with(@name,'last')]")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[starts-with(@name,'phone')]")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[starts-with(@name,'phone')]")).sendKeys("work@yahoo.com");
	}

}
