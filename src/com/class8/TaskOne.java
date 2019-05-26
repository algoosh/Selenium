package com.class8;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com. utils.CommonMethods;
public class TaskOne extends CommonMethods {
/*Task One
Ahead to http://uitestpractice.com/Students/Index
Click on the Actions
Click on the click me !
Handle the alert and click okay
Double Click Double Click Me !
Handle the alert and click okay
Close the browser*/
	public static void main(String[] args) throws InterruptedException {
	/*
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;*/

setUpDriver("chrome","http://uitestpractice.com/Students/Index");

driver.findElement(By.xpath("//a[text()='Actions']")).click();
Thread.sleep(3000);

	WebElement click=driver.findElement(By.xpath("//button[text()='Click Me !']"));
	Actions act=new Actions(driver);

	act.click(click).perform();
	Thread.sleep(3000);
	Alert alOne=driver.switchTo().alert();
	alOne.accept();
	
		WebElement dClick=driver.findElement(By.xpath("//button[text()='Double Click Me !']"));
		Thread.sleep(3000);
		act.doubleClick(dClick).perform();
		
		Alert alTwo=driver.switchTo().alert();
		Thread.sleep(3000);
		alTwo.accept();
		driver.close();
		
		//Yes! Practice
		
	/*setUpDriver("Chrome","http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		
		WebElement clickMe= driver.findElement(By.xpath("//button[text()='Click Me !']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(clickMe).click().perform();
		
		Alert alertOne= driver.switchTo().alert();
		alertOne.accept();
		
		WebElement dc= driver.findElement(By.xpath("//button[text()='Double Click Me !']"));
		action.doubleClick(dc).perform();
		Alert alertTwo= driver.switchTo().alert();
		alertTwo.accept();
          driver .close();
		
	}

}*/	

	}

}
