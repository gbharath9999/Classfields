package com.chiselon.colourclassifieds.utilites;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseUtil
{
public static WebDriver driver;
public  static FileInputStream file;
public  static Properties pro;
	
	public static WebDriver OpenBroswers(String broswer) 
	{
		System.out.println("------------------");
		try 
		{
			if (broswer.trim().equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
				driver = new ChromeDriver();

			}
			else if (broswer.trim().equalsIgnoreCase("Firefox")) 
			{
				driver = new FirefoxDriver();
			}
			else 
			{
				System.setProperty("webdriver.ie.driver","E:\\chiselon\\workspace_24-jan-2018\\Classfieds\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		}
		catch (Exception e)
		{
			System.out.println("Error found boswer not valid---> " + e.getMessage());
		}

		return driver;
	}
	
	public static WebDriver getUrl(WebDriver driver,String UrlValue)
	{	
		try
		{
		driver.get(UrlValue);
		//return driver;
		}
		catch(Exception e)
		{
		System.out.println("getUrl method failed--->"+e.getMessage());
		}
		return driver;
	}
	public static void click(WebDriver driver,String xpathValue)
	{
		try
		{
		driver.findElement(By.xpath(xpathValue)).click();
		//return driver;
		}
		catch(Exception e)
		{
		System.out.println("click method failed---->"+e.getMessage());
		}
		//return driver;
	}
	public static  WebDriver sendKeys(WebDriver driver,String xpathValue,String sendskeysData)
	{
		try
		{
		driver.findElement(By.xpath(xpathValue)).clear();
		driver.findElement(By.xpath(xpathValue)).sendKeys(sendskeysData);
		}
		catch(Exception e)
		{
		System.out.println("sendKeys method failed---->"+e.getMessage());
		}
		return driver;
		
	}
	public static void closeBroswer(WebDriver driver)
	{	
		System.out.println("---close---");
		try
		{
		driver.close();
		}
		catch(Exception e)
		{
		System.out.println("close method failed---->"+e.getMessage());
		}
		//return driver;
		
	}
	public static Properties loadProperties(String Filepath)
	{	
		try
		{
		//pro.get("properties_filepath");
		file=new FileInputStream(Filepath);
		pro=new Properties();
		pro.load(file);
		}
		catch(Exception e)
		{
		System.out.println("properties method failed---->"+e.getMessage());
		}
		return pro; //Properties pro=new Properties(); and am returning properties values for further usage
		
	}
	
}
