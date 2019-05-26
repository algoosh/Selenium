package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods{
/*Table headers and rows verification

Open chrome browser
Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
Login to the application
Verify customer “Susan McLaren” is present in the table
Click on customer details
Update customers last name
Verify updated customers name is displayed in table
Close browser*/
	public static void main(String[] args) {
		
		setUpDriver("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Annah");
driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("123");
driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();

driver.close();

	}

}
