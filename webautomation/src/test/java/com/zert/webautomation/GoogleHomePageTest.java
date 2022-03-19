package com.zert.webautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleHomePageTest {
	
@Test

	public void homePageTest() {
	// Set Driver Manager before creating chrome driver instance
    WebDriverManager.chromedriver().setup();
//Initialize driver
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.quit(); 			
		
	}

}
