package com.Chiselon.ColourClassifieds.modifiedPages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;

public class M_Registeration_page 
{
	WebDriver driver;
	public Properties prop;
	//public Properties configprop;
	
	public static String register_button,email_address,fullname,password,confirmpassword,register_condition,register_submit;
	
	private static void testdata()
	{
		register_button="//a[text()='Register']";
				email_address="//input[@id='email']";
				fullname="//input[@name='name']";
				password="//input[@name='passwd']";
				confirmpassword="//input[@name='passwd2']";
				register_condition="//input[@name='agree_cond']";
				register_submit="//input[@name='submit']";

	}

	
	public M_Registeration_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void register()
	{
		try
		{
			Baseutils.click(driver, register_button);
			System.out.println("clicked on register");
			Baseutils.sendkeys(driver, email_address, prop.getProperty("emailaddress"));
			
			Baseutils.sendkeys(driver, fullname, prop.getProperty("fullname"));
			Baseutils.sendkeys(driver, password, prop.getProperty("password"));
			Baseutils.sendkeys(driver, confirmpassword, prop.getProperty("confirmpassword"));
			Baseutils.click(driver, register_condition);
			Baseutils.click(driver, register_submit);
			
			System.out.println("registeration completed successfully");
	
		}
		catch(Exception e)
		{
			System.out.println("reg method failed------->"+e.getMessage());
		}
		
	}

}
