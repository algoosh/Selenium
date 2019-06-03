package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GroupTask2 extends CommonMethods {
/*Open browser and go to 
 * “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
 * 2.Login to the application3.Create an Order
 * 4.Verify order of that person is 
 * displayed in the table “List of All Orders”
 * 5.Click on edit of that specific order
 * 6.Verify each order details
 * 7.Update street address
 * 8.Verify in the table that street has been updated
 * 9.Close browser*/
	public static void main(String[] args) {
		setUpDriver("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.findElement(By.cssSelector("input#ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.cssSelector("input#ctl00_MainContent_password")).sendKeys("test");
driver.findElement(By.cssSelector("input[type='submit']")).click();

driver.findElement(By.linkText("Order")).click();
driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_txtName")).sendKeys("Candy");
driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("White Street");
driver.findElement(By.cssSelector("input[name='ctl00$MainContent$fmwOrder$TextBox3']")).sendKeys("FairFax");
driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Green");
driver.findElement(By.cssSelector("input[name='ctl00$MainContent$fmwOrder$TextBox5']")).sendKeys("21345");
driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList")).click();
List<WebElement>item=driver.findElements(By.cssSelector("table.SampleTable"));
//for()

//WebElement actual=driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList"));
//Select card_name=new Select(actual);
//card_name.selectByVisibleText("MasterCard");

//driver.findElement(By.cssSelector("input[type='radio']")).sendKeys("MasterCard");
driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("333");
driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("05/15");
driver.findElement(By.xpath("//a[text()='Process']")).click();



//driver.close();
	}

}
