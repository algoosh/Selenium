package com.class12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class BrokenLinks extends CommonMethods {
	String url = "http://newtours.demoaut.com/";

	@BeforeMethod
	public void startBrowser() {
		setUpDriver("chrome", url);
	}

	@Test
	public void brokenLinksVerification() {
		// grab all elements
		List<WebElement> links = driver.findElements(By.xpath("//img[@src='/images/hdr_links.gif']"));
		System.out.println(links.size());
	}
}
