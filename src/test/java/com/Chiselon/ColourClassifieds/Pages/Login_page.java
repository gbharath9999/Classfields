package com.Chiselon.ColourClassifieds.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;

public class Login_page extends Baseutils
{
	/*public WebDriver Login_page1(WebDriver driver)
	{
		Login_page.driver=driver;
		return driver;
	}*/
	
	
	public void login(WebDriver driver)
	{
		try
		{
			
		Baseutils.click(driver,prop.getProperty("login_button"));
		Baseutils.sendkeys(driver,prop.getProperty("username_text"),prop.getProperty("emailid"));
		Baseutils.sendkeys(driver,prop.getProperty("password_text"),prop.getProperty("password"));
		Baseutils.click(driver,prop.getProperty("submit_login"));
		System.out.println("navigated to homepage");
		}
		catch(Exception e)
		{
			System.out.println("invalid data----->"+e.getMessage());
		}
		
	}
	
	public void logout(WebDriver driver)
	{
		try
		{
		Baseutils.click(driver,prop.getProperty("logout_button"));
		System.out.println("navigated to frontpage");
		}
		catch(Exception e)
		{
			System.out.println("logout method failed---->"+ e.getMessage()); 
		}
	}

}
