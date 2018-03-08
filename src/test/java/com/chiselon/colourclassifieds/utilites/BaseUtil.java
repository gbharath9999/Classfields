package com.chiselon.colourclassifieds.utilites;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseUtil
{
public static WebDriver driver;
public  static FileInputStream file;
public  static Properties pro;
public  static FileInputStream file1;
public  static XSSFWorkbook workbook;
public static XSSFSheet sheet;
public static Select select;
	
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}
	
	public static void getUrl(WebDriver driver,String UrlValue)
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
		//return driver;
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
	public static XSSFSheet excel(String filepath,String sheetname)
	{
		try
		{
			 file1 = new FileInputStream(filepath);
			 workbook = new XSSFWorkbook(file1);
			 sheet = workbook.getSheet(sheetname);
		}
		catch (Exception e) 
		{
				System.out.println("excel method failed--->"+e);
		}
		return sheet;
		
	}
	public static Select ByValue(WebDriver driver ,String xpathValue ,String value )
	{
		try
		{
			select = new Select(driver.findElement(By.xpath(xpathValue)));
			select.selectByValue(value);
		}
		catch (Exception e) 
		{
			System.out.println("Select byValue method failed---->"+e.getMessage());
		}
		return select;
	}
	
	public static Select ByVisibleText(WebDriver driver ,String xpathValue ,String textvalue )
	{
		try
		{
			select = new Select(driver.findElement(By.xpath(xpathValue)));
			select.selectByVisibleText(textvalue);
		}
		catch (Exception e) 
		{
			System.out.println("Select byVisibleText method failed---->"+e.getMessage());
		}
		return select;
	}
	public static Select ByIndex(WebDriver driver ,String xpathValue ,int number )
	{
		try
		{
			select = new Select(driver.findElement(By.xpath(xpathValue)));
			select.selectByIndex(number);
		}
		catch (Exception e) 
		{
			System.out.println("Select byIndex method failed---->"+e.getMessage());
		}
		return select;
	}
	public static WebDriver webElement(WebDriver driver,String xpathValue)
	{
		try
		{
			driver.findElement(By.xpath(xpathValue));
		}
		catch (Exception e) 
		{
			System.out.println("webElement method failed---->"+e.getMessage());
		}
		return driver;
	}
	public static WebDriver webElements(WebDriver driver,String xpathValue)
	{
		try
		{
			driver.findElements(By.xpath(xpathValue));
		}
		catch (Exception e) 
		{
			System.out.println("webElements method failed---->"+e.getMessage());
		}
		return driver;
	}
	
	
}
