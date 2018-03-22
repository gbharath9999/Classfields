package com.chiselon.colourclassifieds.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class latestadpage 
{
	private static int i;
	static WebDriver driver;
	//public static  List<WebElement> adddatecolumn;
	public latestadpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.XPATH,using="//a[@title='Latest ads']")
	private static WebElement latestadbutton;
	
	@FindAll(@FindBy(how= How.XPATH,using="((//table)[5]//tr/td[2])"))
	private static List<WebElement> titlecolumn;
	
	@FindAll(@FindBy(how=How.XPATH,using="((//table)[5]//tr/td[3])"))
	public static List<WebElement> adddatecolum;
	
	
	public List<WebElement> titlecolumn()
	{
		
		return titlecolumn;
	}
	
	public List<WebElement> adddatecolumn()
	{
		
		return adddatecolum;
	}
	
	public int latadssize()
	{
		driver.get("http://localhost/colour/latestads.php");
		return adddatecolum.size();
	}
	
	public int lateadssize()
	{
		driver.get("http://localhost/colour/latestads.php");
		return titlecolumn.size();
	}
	
	
}

