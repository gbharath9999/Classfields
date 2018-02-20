package com.Chiselon.ColourClassifieds.modifiedPages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;

public class M_Login_page extends Baseutils
{
	//static WebDriver driver;
	public static Properties prop;
	public static String login_button,username_text,password_text,login_submit,logout_button;

	public M_Login_page(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	private static void testdata()
	{
		login_button="//a[text()='Log in']";
		username_text="//input[@name='username']";
		password_text="//input[@name='password']";
		login_submit="//input[@value='Log in']" ;
		logout_button="//a[text()='Log out']";
		
	}

		
	public static WebDriver login()
	{
		try
		{
			
		Baseutils.click(driver, login_button);
		Baseutils.sendkeys(driver, username_text,prop.getProperty("emailid"));
		Baseutils.sendkeys(driver, password_text,prop.getProperty("password"));
		Baseutils.click(driver, login_submit);
		System.out.println("navigated to homepage");
		
		}
		catch(Exception e)
		{
			System.out.println("invalid data----->"+e.getMessage());
			
		}
		return driver;
		
		
	}
	
	public static WebDriver logout()
	{
		try
		{
		Baseutils.click(driver, logout_button);
		System.out.println("navigated to frontpage");
		
		}
		catch(Exception e)
		{
			System.out.println("logout method failed---->"+ e.getMessage());
			
		}
		return driver;
	}

}
