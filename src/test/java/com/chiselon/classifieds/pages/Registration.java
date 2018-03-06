package com.chiselon.classifieds.pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class Registration extends Baseutils
{
	@Test
	public void register() throws Exception
	{
		prop = Testprop();
		 
		openbrowser(prop.getProperty("browser1"));
		driver.get(prop.getProperty("site-url"));
		
		press(prop.getProperty("register-Xpath"));
		send(prop.getProperty("email-Xpath"), prop.getProperty("email-value"));
		send(prop.getProperty("fulname-Xpath"), prop.getProperty("fulname-value"));
		send(prop.getProperty("password-Xpath"),prop.getProperty("password-value"));
		send(prop.getProperty("confrimpassword-Xpath"),prop.getProperty("confrimpassword-value"));
		press(prop.getProperty("agreee-Xpath"));
		press(prop.getProperty("submit-Xpath"));
	
	
	}
	
	
}
