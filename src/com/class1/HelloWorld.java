package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	public static void main(String[] args) {
		
	
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Nena\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.yahoo.com");*/
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com");
		driver.navigate().to("https://www.google.com");
			driver.navigate().back();
			//Thread.sleep(1000);
			driver.navigate().to("https://www.amazon");
			
			
			
			
		
}

}
