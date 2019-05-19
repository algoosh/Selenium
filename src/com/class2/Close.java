package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.cnn.com");
		// driver.close();
		driver.get("https://www.amazon.com");
		driver.close();
	}
}
