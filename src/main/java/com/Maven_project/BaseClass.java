package com.Maven_project;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver; 
	
	public static WebDriver browserLaunch(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32 (1)");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			}	
       return driver;
       }
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void passInput(WebElement element,String input) {
		element.sendKeys(input);
    }
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void Selectbyvalue(WebElement element,String input)
	{
		Select s=new Select(element);
        s.selectByValue(input);
	}
	public static void SelectbyIndex(WebElement element,int input)
	{
		Select s=new Select(element);
		s.selectByIndex(input);
	}
	public static void SelectbyVisibleText(WebElement element,String input) {
		Select s=new Select(element);
		s.selectByVisibleText(input);
	}
	public static void clear(WebElement element)
	{	
		element.clear();
	}
	public static void Screenshot(String location) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File des=new File(location);
	    FileUtils.copyFile(src, des);
		
	}
	}
	
	
