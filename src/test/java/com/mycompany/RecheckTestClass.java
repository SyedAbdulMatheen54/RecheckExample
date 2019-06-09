package com.mycompany;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import de.retest.recheck.*;

public class RecheckTestClass {
 
	private WebDriver driver;
	private Recheck re;
	
	@BeforeClass
	public void setUp()
	{
		re = new RecheckImpl();
	    System.setProperty("webdriver.chrome.driver", "D:\\Study Materials\\Selenium\\Driver2\\Chrome\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@Test
	  public void google() throws Exception 
	{
	    re.startTest();
	    driver.get("http://google.com");
	    re.check(driver, "open");
	    re.capTest();
	}
	@AfterClass
	  public void tearDown() 
	{
	    driver.quit();
	    re.cap();
	}
}
