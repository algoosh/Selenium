package com.class10;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class StaticWebTableDemo extends CommonMethods{
	

	public static void main(String[] args) throws InterruptedException {
		
		//-------------------------------------------------------------------------------------------------
		/*setUpDriver("chrome","https://www.toolsqa.com/automation-practice-table/");
	 driver.manage().window().fullscreen();
	 WebElement el=driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr[3]"));
	  System.out.println(el.getText());*/
//-----------------------------------------------------------------------------------------------
		
	 setUpDriver("chrome","https://www.toolsqa.com/automation-practice-table/");
	 List<WebElement> rows=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
	 System.out.println("Number of rows is "+rows.size());
	 
	System.out.println("Way of printing rows all INFO");
	Iterator<WebElement> it=rows.iterator();
	while (it.hasNext()) {
	System.out.println(it.next().getText());
	}
	
	List<WebElement> comn=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
	System.out.println("The size of all colomns is"+comn.size());
	Iterator<WebElement> it1=comn.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next().getText());
	}
	 driver.close();
	
//---------------------------------------------------------------------------------------------------
		//setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-table/");
		//GET NUMBER OF ROWS
		/*List <WebElement> rows=driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
		System.out.println("Number of rows ="+rows.size());
		
		System.out.println("-----------ROW DATA-----------------");
		Iterator<WebElement> it=rows.iterator();
		while(it.hasNext()) {
			String rowText=it.next().getText();
			System.out.println(rowText);
			}
			driver.close();
		*/
//----------------------------------------------------------------------------------------------
		
		//GET NUMBER OF COLUMNS
	/*	List <WebElement> cols=driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
		System.out.println("Number of colums ="+cols.size());
		
		System.out.println("-----------COLUMNS HEADERS-----------------");
		for (WebElement col: cols) {
			String colText=col.getText();
			System.out.println(colText);
		}

		Thread.sleep(3000);
		driver.quit();*/
		
	}}

