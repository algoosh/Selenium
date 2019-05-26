package com.class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;
/*task
Ahead to https://jqueryui.com/droppable/
handle the frame
drag and drop
close browser*/
public class dragAndDrop extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome","https://jqueryui.com/droppable/");
		WebElement frm=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frm);
		WebElement drg=driver.findElement(By.cssSelector("div#draggable"));
		WebElement drp=driver.findElement(By.cssSelector("div#droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drg, drp).perform();
		Thread.sleep(5000);
		driver.close();
		
		/*setUpDriver("chrome", "https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();*/

	}//YESSSSS!

}