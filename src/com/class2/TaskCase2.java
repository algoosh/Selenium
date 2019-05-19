package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 2: Syntax Page URL Verification:
Open chrome browser
Navigate to “https://www.syntaxtechs.com/”
Navigate to “https://www.google.com/”
Navigate back to Syntax Technologies Page
Refresh current page
Verify url contains “Syntax”*/
public class TaskCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.syntaxtechs.com");
		driver.get("https://www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (currentUrl.contains(currentUrl)) {
			System.out.println("this is right page");
		}else {
			System.out.println("this is wrong page");
		}
		

	}

}
