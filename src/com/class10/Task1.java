package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Task1 extends CommonMethods {
/*Table headers and rows verification
Open chrome browser
Go to “https://the-internet.herokuapp.com/”
Click on “Click on the “Sortable Data Tables” link
Verify tables consist of 4 rows and 6 columns
Print name of all column headers
Print data of all rows*/
	public static void main(String[] args) {
		setUpDriver("chrome","https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List<WebElement> cells=driver.findElements(By.cssSelector("table#table1 tbody tr td"));
		
		for(WebElement cell:cells) {
			String cellText=cell.getText();
			System.out.println(cellText);
		}

	}
//for(int i=1;i<cells.size())
}
