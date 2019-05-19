package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 1: Amazon Page Title Verification:
Open chrome browser
Go to “https://www.amazon.com/”
Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed*/
public class TestCase1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
	
	System.out.println(driver.getTitle());
	String title = driver.getTitle();
	//Thread.sleep(3000);
	if (title.equalsIgnoreCase("Online Shopping for Electronics, "
			+ "Apparel, Computers, Books, DVDs & more")) {
		
		System.out.println("this is right title");

	} else {
		System.out.println("sorry this not title");
	}
	
}
}
