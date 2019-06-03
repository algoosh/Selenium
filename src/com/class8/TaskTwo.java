package com.class8;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;
/*Task Two
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Handle the drag and drop
Close the browser*/
public class TaskTwo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("chrome","http://uitestpractice.com/Students/Index");
WebElement act=driver.findElement(By.xpath("//a[text()='Actions']"));
act.click();
Thread.sleep(2000);

	WebElement drg=driver.findElement(By.xpath("//div[@style='position: relative;']"));
	WebElement drp=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
	Actions a1=new Actions(driver);
	a1.clickAndHold(drg).moveToElement(drp).release(drg).perform();
	Thread.sleep(2000);
	driver.close();
	
	//YEEESSSS!

		/*setUpDriver("Chrome","http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
	WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
	WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
	Actions action = new Actions(driver);
	action.clickAndHold(drag).moveToElement(drop).release(drag).perform();
	Thread.sleep(2000);
	driver.close();
		*/
		
	}

}