package com.Chiselon.ColourClassifieds.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.Page;

public class Baseutils 
{
	
	public static WebDriver driver;
	public static FileInputStream file;
	//public static FileInputStream file1;
	public static Properties prop;
	//public static Properties configprop;
	
	
	public static Properties testdata(String propertiesfile)
	{
		try
		{
	    file =new FileInputStream(propertiesfile);
		prop=new Properties();
		prop.load(file);
		return prop;
		
		
		}
		catch (Exception e)
		{

			System.out.println("Test data method failed------>"+e.getMessage());
			return null;
		}
		
	}
	
	public static  WebDriver openbrowser(String Browservalue)
	{
		try
		{
		if(Browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			Baseutils.driver= new ChromeDriver();
		}
		else if(Browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver.exe");
			driver= new FirefoxDriver();
			
		}
		else if(Browservalue.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "Drivers//IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
		{
			System.out.println(Browservalue+" "+"browser is in valid");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("openbrowser failed---->"+e.getMessage());
		}
		return driver;
	}
	public static WebDriver closebrowser(WebDriver driver)
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			System.out.println("closebrowsert failed"+ e.getMessage());
		}
		return null;
	}
	public static WebDriver geturl(WebDriver driver,String urlvalue)
	{
		try
		{
			driver.get(urlvalue);
		}
		catch(Exception e)
		{
			System.out.println("url not found----->"+e.getMessage());
		}
		return driver;
	}
	
	
	public static WebDriver click(WebDriver driver,String xpathvalue)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).click();
			
		}
		catch(Exception e)
		{
			System.out.println("xpath failed");
			System.out.println(e.getMessage());
		}
		return driver;
		
	}
	
	public static WebDriver sendkeys(WebDriver driver,String xpathvalue,String keyvalue)
	{
		try
		{
			driver.findElement(By.xpath(xpathvalue)).clear();
			driver.findElement(By.xpath(xpathvalue)).sendKeys(keyvalue);
		}
		catch(Exception e)
		{
			System.out.println("sendkeys method failed");
			System.out.println(e.getMessage());
		}
		return driver;
		
	}
	
	/*public static Properties testdataconfig(String congpropertiespath) 
	{
		try{
			
		
		file1 =new FileInputStream(congpropertiespath);
		configprop=new Properties(); 
		configprop.load(file1);
		}catch (Exception e) 
		{
			System.out.println("testdataconfig----->"+e.getMessage());
		}
		return configprop;
		
	}
*/

}
