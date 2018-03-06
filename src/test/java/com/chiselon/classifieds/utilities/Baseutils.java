package com.chiselon.classifieds.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Baseutils
{
	public static  Properties prop;
	public static WebDriver driver;
	public static FileInputStream fis;
	public static XSSFWorkbook wk;
	public static XSSFSheet sheet;
	
	public static  WebDriver openbrowser(String browsername)
	{
		try
		{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sampa\\manasaProject\\git\\ColourClassifieds\\Drivers\\chromedriver.exe");
			Baseutils.driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sampa\\manasaProject\\git\\ColourClassifieds\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\sampa\\manasaProject\\git\\ColourClassifieds\\Drivers\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
		{
			System.out.println(browsername+" "+"browser is in valid");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("openbrowser failed---->"+e.getMessage());
		}
		return driver;
	}
	
	
	public static void press(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
	public static void send(String path, String value)
	{
		try
		{
		driver.findElement(By.xpath(path)).sendKeys(value);
		}catch (Exception e)
		{

			System.out.println("send keys method failed--->"+e.getMessage());
		}
		return;
	
	}
	
  
	public static void geturl(String urlvalue)
	{
			driver.get(urlvalue);
	}
		    
   	public static Properties Testprop() throws Exception
   	{
	   FileInputStream fis = new FileInputStream("C:\\Users\\sampa\\manasaProject\\Classifieds\\data.properties");
	   Properties prop = new Properties();
	   prop.load(fis);
	   return prop;
	}
   	public static XSSFSheet Exceldata(String file,String sheetname) throws Exception
   	{
   		fis = new FileInputStream(file);
   		wk = new XSSFWorkbook(fis);
   		sheet = wk.getSheet(sheetname);
		return sheet;
   	}	
	
}
