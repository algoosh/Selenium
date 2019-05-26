package com.class6;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
 * TC 1: Amazon Department List Verification Open chrome browser Go to
 * “http://amazon.com/” Verify how many department options available. Print each
 * department Select Computers Quit browser
 */
public class Task1Reveiw {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nena\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://amazon.com/");
Thread.sleep(2000);
WebElement dd=driver.findElement(By.id("searchDropdownBox"));
dd.click();
Select aa=new Select(dd);
List<WebElement> allOPtions=aa.getOptions();
System.out.println("The total number of Departments is "+allOPtions.size());
Thread.sleep(3000);
Iterator<WebElement> it=allOPtions.iterator();
while(it.hasNext()) {
	String Departments=it.next().getText();

	System.out.println(Departments);
}
aa.selectByValue("search-alias=computers");
Thread.sleep(2000);
driver.quit();
/* WebElement DropB = driver.findElement(By.cssSelector("select#searchDropdownBox"));
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

}
