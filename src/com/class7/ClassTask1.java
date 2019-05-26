package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.CommonMethods;

public class ClassTask1 extends CommonMethods {
/*TC 1: ToolsQA Frame verification
Open chrome browser
Go to “https://www.toolsqa.com/iframe-practice-page/”
Click on “Guest Blog” link inside first frame
Verify element “Interactions” is present in second frame
Navigate to Home Page
Quit browser*/
	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome","https://www.toolsqa.com/iframe-practice-page/");
		//title[text()='IFrame practice page']
		driver.switchTo().frame("IF1");
		driver.findElement(By.xpath("//a[text()='Git Log']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("IF2");
		boolean w=driver.findElement(By.xpath("//h3[text()='Interactions']")).isDisplayed();
		if(w) {
			driver.switchTo().defaultContent();
			driver.close();
		}
	}

}
