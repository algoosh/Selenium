package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Nena/Selenium/chromedriver.exe");
		WebDriver drv=new ChromeDriver();
		drv.get("http://newtours.demoaut.com/");
		drv.findElement(By.xpath("//a[text()='REGISTER']")).click();
		drv.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Olga");
		drv.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Thompson");
		drv.findElement(By.cssSelector("input[name='phone']")).sendKeys("123456789");
		drv.findElement(By.cssSelector("input#userName")).sendKeys("Thompson@yahoo.com");
		drv.findElement(By.cssSelector("input[name='address1']")).sendKeys("123 White Streat");
		drv.findElement(By.cssSelector("input[name='city']")).sendKeys("Reston");
		drv.findElement(By.cssSelector("input[name='state']")).sendKeys("VA");
		drv.findElement(By.cssSelector("input#email")).sendKeys("badyaga");
		drv.findElement(By.cssSelector("input[type='image']")).click();
		Thread.sleep(8000);
		drv.close();
		
		//YESSSSSSSS!
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("John");
		driver.findElement(By.xpath("//input[starts-with(@name,'last')]")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[starts-with(@name,'phone')]")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[starts-with(@name,'phone')]")).sendKeys("work@yahoo.com");*/
	}

}
