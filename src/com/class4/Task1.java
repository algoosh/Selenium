package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.xpath(//input[starts-with(@type,'text')].sendKeyds("standard_user");
//				driver.findElement(By.xpath(xpathExpression)).sendKeys("secret_sauce");
//		driver.findElement(By.xpath(xpathExpression)).click();
//	}

}
}
