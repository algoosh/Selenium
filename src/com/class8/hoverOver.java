package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class hoverOver extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome","https://www.toolsqa.com");
		
WebElement hoverOver=driver.findElement(By.xpath("//span[text()='DEMO SITES']"));
Actions ac=new Actions(driver);
ac.moveToElement(hoverOver).click().perform();
driver.findElement(By.xpath("//span[text()='Automation Practice Table']")).click();
Thread.sleep(3000);
driver.close();
//Done, did myself, just practice it!!!

	}

}
