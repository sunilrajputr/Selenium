package com.sunil.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloGoogle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		
		WebDriver wb = new ChromeDriver();
		
		wb.get("http://www.google.com");
		
		wb.close();
	}

}
