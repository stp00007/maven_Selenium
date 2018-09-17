package com.learn.selenium;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DemoForMaven {
	@Test
	public void sample() throws InterruptedException, IOException, AWTException { 
		//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		//		WebDriver driver=new ChromeDriver();
		//		driver.get("https://www.google.com");
		//		String str = driver.getTitle();
		//		System.out.println(str);
		//		Thread.sleep(2000);
		//		driver.close();
		/*    
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Report/Result.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest logger = extent.createTest("DemoForMarven");
		logger.log(Status.INFO, "Login To google");
		logger.log(Status.PASS, "Title verified");
		extent.flush();
		ExtentTest logger2 = extent.createTest("DemoForMarven");
		logger2.log(Status.FAIL, "Title Verified");


		logger2.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg").build());

		logger.pass("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg").build());

		// This will add another test in report
		extent.flush();
		 */


		//		extent.flush();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

	}


}
