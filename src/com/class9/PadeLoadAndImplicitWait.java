package com.class9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PadeLoadAndImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();//ctr shift o

driver.get("http://cnn.com");
//driver.findElement(arg0)

	}

}
