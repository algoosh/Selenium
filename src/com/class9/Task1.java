package com.class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*TC 1: Verify element is present
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Dynamic Loading” link
Click on “Example 1...” and click on “Start”
Verify element with text “Hello World!” is displayed
Close the browser*/

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/");
driver.findElement(By.linkText("Dynamic Loading")).click();

driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
driver.findElement(By.xpath("//button[text()='Start']")).click();
WebElement word=driver.findElement(By.xpath("//h4[text()='Hello World!']"));

WebDriverWait wait=new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
if(word.isDisplayed()) {
	System.out.println("is displayed");
}else {
	System.out.println("Not");
}

//Actions act=new Actions(driver);
//act.contextClick(ho).perform();

	}

}
