package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class iframe extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");

		/*way 1 NAME
		 *  driver.switchTo().frame("iframe_a"); Thread.sleep(3000);
		 * driver.findElement(By.cssSelector("input#name")).sendKeys("Olga");
		 */
/* way 2 WEBELEMENT
		WebElement x = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(x);

		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("Olga");*/
		
		// way 3 INDEX  be careful if they add more frames
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input#name")).sendKeys("Olga");

		// driver.close();
	}
}
