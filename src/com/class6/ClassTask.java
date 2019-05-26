			package com.class6;
			
			import java.util.Scanner;

import org.openqa.selenium.Alert;
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;

				/*TC 1: JavaScript alert text verification
				Open chrome browser
				Go to “https://www.seleniumeasy.com/test/javascript-alert-box-demo.html”
				Verify 
				1.alert box with text “I am an alert box!” is present
				2.confirm box with text “Press a button!” is present
				3.prompt box with text “Please enter your name” is present
				Quit browser*/
public class ClassTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximizing the web browser
		driver.manage().window().maximize();
		//navigating to the Url
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		//1.finding the alert box and clicking to verify it
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		String alText = al.getText();
		al.dismiss();
		if (alText.contains(alText)) {
			System.out.println(alText + " Is present. Test PASSED");
		}
		//2.finding confirm box
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		Alert co = driver.switchTo().alert();
		Thread.sleep(3000);
		String coText=co.getText();
		co.dismiss();
		if(coText.contains(coText)) {
			System.out.println(coText+" Is present. Test PASSED");
		}
		//3.finding prompt box
		driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']")).click();
		Alert promt=driver.switchTo().alert();
		Thread.sleep(3000);
		String promtText=promt.getText();
		promt.dismiss();
		if(promtText.contains(promtText)) {
			System.out.println(promtText+" Is present. Test PASSED");
		}
	}

}
