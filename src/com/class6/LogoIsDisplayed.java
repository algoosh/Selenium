package com.class6;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//if lodo is displayed, if tested is logged in

public class LogoIsDisplayed {
	public static String name="Tester";
	public static String pw="test";
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Nena/Selenium/chromedriver.exe");
WebDriver w=new ChromeDriver();
w.manage().window().fullscreen();
w.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

WebElement y=w.findElement(By.cssSelector("input[id*='username']"));
y.sendKeys("Tom");
y.clear();
y.sendKeys(name);
WebElement y1=w.findElement(By.cssSelector("input[type$='rd']"));
y1.sendKeys("33333");
y1.clear();
y1.sendKeys(pw);
WebElement y2=w.findElement(By.cssSelector("input.button"));
y2.click();
//Thread.sleep(9000);
//w.quit();
boolean isDispl=w.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
if(isDispl) {
	System.out.println("logo is displayed");
}else {
	System.out.println("logo Not displayed");
}
WebElement userN=w.findElement(By.xpath("//div[@class='login_info']"));
String val=userN.getText();
if(val.contains(name)) {
	System.out.println("logged in");
}else {
	System.out.println("not");
	//done
}
	}

}
