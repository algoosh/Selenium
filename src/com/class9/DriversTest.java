package com.class9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.CommonMethods;

public class DriversTest extends CommonMethods{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();//ctr shift o
	}

}
