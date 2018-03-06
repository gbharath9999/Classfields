package com.chiselon.classifieds.pages;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class Login extends Baseutils
{
	@Test
	public static void login() throws Exception
	{
		prop = Testprop();
		
		openbrowser(prop.getProperty("browser1"));
		driver.get(prop.getProperty("site-url"));
		press(prop.getProperty("login-xpath"));
		send(prop.getProperty("mailid-xpath"),prop.getProperty("email-value"));
		send(prop.getProperty("LoginPassword-xpath"),prop.getProperty("password-value"));
		press(prop.getProperty("loginbuttom-xpath"));
		
		
		
		
	}

}
