package com.class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC 1: Swag Labs Positive login:
Open chrome browser
Go to “https://www.saucedemo.com/”
Enter valid username and valid password and click login
Verify robot icon is displayed
Verify “Products” text is available next to the robot icon
---------------------------------------------------------------------------*/

public class ClassTask1 {
	public static String userName = "standard_user";
	public static String password = "secret_sauce";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement pass=driver.findElement(By.cssSelector("input[type='text']"));
		pass.sendKeys(userName);
		WebElement pass1=driver.findElement(By.cssSelector("input[id='password']"));
		pass1.sendKeys(password);
		WebElement pass2=driver.findElement(By.cssSelector("input[type='submit']"));
		pass2.submit();
		//till this point is correct
		
		boolean logo=driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		if(logo) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("not");
		}
		WebElement text=driver.findElement(By.xpath("//div[@class='product_label']"));//stores in text
		boolean pr=text.isDisplayed();//is text true?
		 String current=text.getText();//if yes then returns text=.getText();
		String expected="Products";//we have expected value of "Productes;
		if(pr&&current.equals(expected)) {//if text and currenbt equals expected then ptint out
			System.out.println("yes");
		}else {
			System.out.println("not");
		}
		//done!!!!
		
		
		
//		
//		//boolean isDisplayed=driver.findElement(userName)
//		//WebElement welcome = driver.findElement(By.xpath("//div[@class='login_info']"));
//		WebElement welcome = driver.findElement(By.xpath("input[type='text']"));
//		String value = welcome.getText();
//
//		if (value.contains(userName)) {
//			System.out.println(userName + " is logged in. Test case PASS");
//		} else {
//			System.out.println(userName + " is NOT logged in. Test case FAIL");
//		}
//		Thread.sleep(3000);
	}

}
