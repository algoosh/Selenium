package com.class7;

import com.utils.CommonMethods;

public class windows extends CommonMethods {

	public static void main(String[] args) {
		CommonMethods.setUpDriver("chrome", "http://uitestpractice.com/Students/Switchto");
String parent=driver.getTitle();
String parentId=driver.getWindowHandle();
System.out.println("title is "+parent+" "+" ID is "+parentId);

	}

}
