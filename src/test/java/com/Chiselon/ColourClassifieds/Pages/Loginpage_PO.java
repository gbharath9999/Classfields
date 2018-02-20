package com.Chiselon.ColourClassifieds.Pages;

import org.testng.annotations.Test;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;

import ObjectRepository.LoginPageObjects;

public class Loginpage_PO extends Baseutils
{

	@Test
	public static void Login()
	{
		
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.username().sendKeys("lnv@gmail.com");
		lp.password().sendKeys("1234567");
		lp.submit().click();
		
	}
	
	
	
	
	
	
	
}
