package com.class3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.driver.chrom","C:\\Users\\Nena\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
	}

}
