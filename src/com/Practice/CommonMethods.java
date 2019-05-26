package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
	public static WebDriver driver;

	public static void setUpDriver(String browser,String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/Nena/Selenium/chromedriver.exe");
		driver = new ChromeDriver();}
		else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/Nena/Selenium/geckodriver.exe");
		driver = new FirefoxDriver();}
		else{
			System.out.println("browser giving is wrong");
		}
		driver.get(url);
		driver.manage().window().maximize();
	}}