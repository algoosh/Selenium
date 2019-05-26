package com.class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
/*TC 2: Select and Deselect values
Open chrome browser
Go to “http://uitestpractice.com/”
Click on “Select” tab
Verify how many options available in the first drop down and then select
 “United states of America”
Verify how many options available in the second drop down and then select all.
Deselect China from the second drop down
Quit browser (edited) */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");


	}

}
