package com.class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2Mine {
	/*TC 2: Swag Labs Negative login:
	Open chrome browser
	Go to “https://www.saucedemo.com/”
	Enter invalid username and password and click login
	Verify error message contains: “Username and password do not match any user in this service*/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Nena/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.saucedemo.com");	
		
	}

}
