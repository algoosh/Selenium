package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherVersionLipnin {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","/Users/Nena/Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.navigate().to("http://newtours.demoaut.com/");
     Thread.sleep(3000);
     driver.findElement(By.cssSelector("a[href*='yregis']")).click();
    // driver.findElement(By.cssSelector("a[href*='rywe']")).click();
     driver.findElement(By.cssSelector("input[name*='rst']")).sendKeys("bob");
     driver.findElement(By.cssSelector("input[name*='rs']")).sendKeys("Well");
     driver.findElement(By.cssSelector("input[name^='ph']")).sendKeys("123123");
     driver.findElement(By.cssSelector("input#userName")).sendKeys("test");
     driver.findElement(By.cssSelector("input[name*=ess1]")).sendKeys("RedStreet");
     driver.findElement(By.cssSelector("input[name$='ty']")).sendKeys("Sterling");
     driver.findElement(By.cssSelector("input[name$='te']")).sendKeys("VA");
     driver.findElement(By.cssSelector("input[name*='tal']")).sendKeys("3333");
     driver.findElement(By.cssSelector("select[name$='try']")).sendKeys("USA");
     driver.findElement(By.cssSelector("input#email")).sendKeys("AN");
     driver.findElement(By.cssSelector("input[name='password']")).sendKeys("55555");
     driver.findElement(By.cssSelector("input[name*='firm']")).sendKeys("55555");
     driver.findElement(By.cssSelector("input[name*='reg']")).click();
//     driver.findElement(By.cssSelector("a[href*='yregis']")).click();
//     Thread.sleep(3000);
//     driver.findElement(By.cssSelector("input[name^='first'")).sendKeys("Artem");
//     driver.findElement(By.cssSelector("input[name='lastName'")).sendKeys("Lepinskyi");
//     driver.findElement(By.cssSelector("input[name^='ph'")).sendKeys("3334445522");
//     driver.findElement(By.cssSelector("input#userName")).sendKeys("mr.lepinskiy@mail.ru");
//     driver.findElement(By.cssSelector("input[name='address1'")).sendKeys("New York");
//     driver.findElement(By.cssSelector("input[name^='ci'")).sendKeys("Brooklyn");
//     driver.findElement(By.cssSelector("input[name^='st'")).sendKeys("New York");
//     driver.findElement(By.cssSelector("input[name$='Code'")).sendKeys("11230");
//     driver.findElement(By.cssSelector("select[name='country'")).sendKeys("UNITED STATES");
//     driver.findElement(By.cssSelector("input#email")).sendKeys("mr.lepinskiy@mail.ru");
//     driver.findElement(By.cssSelector("input[name*='pas'")).sendKeys("123456789");
//     driver.findElement(By.cssSelector("input[name*='confirm'")).sendKeys("123456789");
//     driver.findElement(By.cssSelector("input[name^='reg'")).click();
//     Thread.sleep(3000);
//     driver.quit();

 }}