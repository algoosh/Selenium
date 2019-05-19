package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class anotherOne {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.id("customer.firstName")).sendKeys("badayaga");
		Thread.sleep(5000);
		driver.findElement(By.id ("customer.firstName")).sendKeys("Badyaga1");
//		// driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	      Thread.sleep(3000);By.id(secret_sauce")
////	      //Thread.sleep(2000);
//	      driver.findElement(By.id("secret_sauce")).
//K
////	      driver.findElement(By.id("password")).sendKeys("secret_sauce");
////	      Thread.sleep(2000);
////	      driver.findElement(By.className("btn_action")).click();
////	      driver.close();*/
	}

}