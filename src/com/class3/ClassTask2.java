package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("John");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("Due");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("911");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("green@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("123 grean");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Sterling");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("VA");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.name("country")).sendKeys("Unated State");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("blah@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("654321");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("00000");
		Thread.sleep(1000);
		driver.findElement(By.name("register")).click();
		
	}

}
