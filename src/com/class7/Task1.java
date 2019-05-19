package com.class7;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	/*
	 * TC 1: Amazon Department List Verification Open chrome browser Go to
	 * “http://amazon.com/” Verify how many department options available. Print each
	 * department Select Computers Quit browser
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com/");

		WebElement dd = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"));
		Select sel = new Select(dd);
		List<WebElement> opt = sel.getOptions();
		System.out.println("The list of all dd options is " + opt.size());
		Iterator<WebElement> it = opt.iterator();
		while (it.hasNext())
			;
		System.out.println(it.next().getText());
		
//Classmate version
	}
/* WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement DropB = driver.findElement(By.cssSelector("select#searchDropdownBox"));
        Select Ss = new Select(DropB);
        
        List<WebElement> allOptions = Ss.getOptions();
        System.out.println(allOptions.size());
//        Iterator<WebElement> DepText=allOptions.iterator();
//        while(DepText.hasNext()) {
//            String Departments =DepText.next().getText();
//            System.out.println(Departments);
//        }
        for(WebElement ele:allOptions) {
            System.out.println(ele.getText());
        }
        
        Ss.selectByValue("search-alias=computers");
        Thread.sleep(3000);
        driver.quit();*/
}
