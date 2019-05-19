package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nena\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[name^='e']")).sendKeys("syntex@gmail.com");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[name='password']")).sendKeys("ruby");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[name*='confirmPassword']")).sendKeys("123456");
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[name='register']")).click();
//DID WELL!
	}

}
