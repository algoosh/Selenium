package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TablesHandeling extends CommonMethods {

	public static void main(String[] args) {
		setUpDriver("chrome","https://www.toolsqa.com/automation-practice-form/");
		WebElement lT=driver.findElement(By.linkText("DEMO SITES"));
		lT.click();
		//String name="Automation Practice Table";
		Select lN=new Select(lT);
		lN.selectByVisibleText("Automation Practice Table");
//List<WebElement> h=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr"));
//System.out.println(h.size());
//driver.close();
	}

}
