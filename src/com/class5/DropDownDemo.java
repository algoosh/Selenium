package com.class5;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Nena/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
WebElement cnt=driver.findElement(By.id("continents"));
Select obj=new Select(cnt);
obj.selectByIndex(6);
Thread.sleep(6000);

obj.selectByVisibleText("North America");
Thread.sleep(6000);

List<WebElement> allOptions=obj.getOptions();
System.out.println(allOptions.size());

Thread.sleep(5000);
driver.quit();

///yes!

		/*WebElement continentDD = driver.findElement(By.id("continents"));
		Select obj=new Select(continentDD);//passing webelement 
		//select by index
		obj.selectByIndex(3);//Australia
		
		
		Thread.sleep(5000);
		//select by visibleText
		obj.selectByVisibleText("North America");
		Thread.sleep(5000);
		//get allOptions
		List<WebElement> allOptions=obj.getOptions();
		System.out.println(allOptions.size());
		
		
		Thread.sleep(5000);
		driver.quit();*/
	}}
