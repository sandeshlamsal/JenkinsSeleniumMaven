package com.san.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class SeleniumTest {
	WebDriver wd;
	
	@Test
	void OpenBrowser() throws InterruptedException{
		System.out.println("browser opened");
		wd.get("http://www.facebook.com");
	}
	
	@Test
	void test1(){
		Assert.assertTrue(true);
	}
	
	@BeforeTest
	void SetUp(){
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		 wd=new ChromeDriver();		
	}
	
	@AfterTest
	void EndTest(){
		wd.close();
		System.out.println("Browser closed");
	}
	
}
