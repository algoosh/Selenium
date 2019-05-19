package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
//		String title = driver.getTitle();
//		if (title.equalsIgnoreCase("google"));{
//		System.out.println("this is right title");
//			
//	}
//		else
//		{
//			System.out.println("sorry this not title");
//		}

		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		String title1 = driver.getTitle();
		if (title1.equalsIgnoreCase("google")) {
			System.out.println("this is right title");

		} else {
			System.out.println("sorry this not title");
		}
	}
}
