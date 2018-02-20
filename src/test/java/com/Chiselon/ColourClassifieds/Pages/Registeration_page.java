package com.Chiselon.ColourClassifieds.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;

public class Registeration_page 
{
	WebDriver driver;
	public Properties prop;
	public Properties configprop;

	
	public Registeration_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void register()
	{
		try
		{
			Baseutils.click(driver, configprop.getProperty("register_button"));
			System.out.println("clicked on register");
			Baseutils.sendkeys(driver, configprop.getProperty("email_address"), prop.getProperty("emailaddress"));
			Baseutils.sendkeys(driver, configprop.getProperty("fullname"), prop.getProperty("fullname"));
			Baseutils.sendkeys(driver, configprop.getProperty("password"), prop.getProperty("password"));
			Baseutils.sendkeys(driver, configprop.getProperty("confirmpassword"), prop.getProperty("confirmpassword"));
			Baseutils.click(driver, configprop.getProperty("register_condition"));
			Baseutils.click(driver, configprop.getProperty("register_submit"));
			
			System.out.println("registeration completed successfully");
	
		}
		catch(Exception e)
		{
			System.out.println("reg method failed------->"+e.getMessage());
		}
		
	}

}
