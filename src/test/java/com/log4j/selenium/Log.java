package com.log4j.selenium;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Log {
	@Test
	public void loger()
	{
	         Logger logger=Logger.getLogger("Google");
	        PropertyConfigurator.configure("Log4j.properties");
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	        logger.info("Browser Opened");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        logger.info("Implicit wait given");
	        driver.get("https://www.google.co.in/");
	        logger.info("Url opened");
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	        logger.info("keyword type");  
	}
}
