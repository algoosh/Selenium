package com.class8;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class TaskThree extends CommonMethods {
	/*Task Three
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click and hold on 1,2,3,4 boxes
Close the browser*/

	 public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome","http://uitestpractice.com/Students/Index");
		WebElement act=driver.findElement(By.xpath("//a[text()='Actions']"));
		act.click();
		WebElement one=driver.findElement(By.xpath("//li[text()='1']"));
		WebElement two=driver.findElement(By.xpath("//li[text()='2']"));
		WebElement three=driver.findElement(By.xpath("//li[text()='3']"));
		WebElement four=driver.findElement(By.xpath("//li[text()='4']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).clickAndHold().moveToElement(four).clickAndHold().build().perform();
		Thread.sleep(8000);
		driver.close();
      
		
		
		/*setUpDriver("Chrome","http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement one = driver.findElement(By.xpath("//li[text()='1']"));
		WebElement two = driver.findElement(By.xpath("//li[text()='2']"));
		WebElement three = driver.findElement(By.xpath("//li[text()='3']"));
		WebElement four = driver.findElement(By.xpath("//li[text()='4']"));
		Actions action = new Actions(driver);
		action.moveToElement(one).clickAndHold().moveToElement(two).clickAndHold().moveToElement(three).clickAndHold().moveToElement(four).build().perform();
*/
	}

}
