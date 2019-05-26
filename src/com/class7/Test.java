package com.class7;

import com.utils.CommonMethods;

public class Test extends CommonMethods {

	public static void main(String[] args) {
		CommonMethods.setUpDriver("firefox", "http://google.com");
		driver.close();
	}

}
