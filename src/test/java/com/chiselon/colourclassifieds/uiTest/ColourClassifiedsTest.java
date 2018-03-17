package com.chiselon.colourclassifieds.uiTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.chiselon.colourclassifieds.pages.RegistrationPage;
import com.chiselon.colourclassifieds.utilites.Base;

public class ColourClassifiedsTest
	{
	WebDriver driver=Base.OpenBroswers("chrome");
	RegistrationPage register=new RegistrationPage(driver);
	
	@Test(priority=1)
	public void colourClassifiedsRegistration(){
		register.navigateToRegisterPage();
		register.enterRegisterationFields();
		register.setHideEmailbox();
		Assert.assertEquals(register.RgstnSuccessfulValidationmsg(),"Registration successful");
	}
	
	/*
	@Test(priority=2)
	public void colourClassifiedsLogin(){
		
	}
	
	*/
	
	

	}
