package com.Chiselon.ColourClassifieds.UItest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import com.Chiselon.ColourClassifieds.Utilities.Baseutils;
import com.Chiselon.ColourClassifieds.modifiedPages.M_Login_page;
import com.Chiselon.ColourClassifieds.modifiedPages.M_Registeration_page;

import ObjectRepository.HomepageObjects;
import ObjectRepository.LoginPageObjects;

public class Colourclassifieds_test extends Baseutils

{
	
	@Test
	public void test() 
	{
		
		System.out.println(System.getProperty("user.dir"));
		testdata(System.getProperty("user.dir")+"\\"+"src\\test\\Testdata\\Testdata.properties");
		System.out.println(prop.getProperty("browser1"));
		driver=Baseutils.openbrowser(prop.getProperty("browser1"));
		driver.manage().window().maximize();
		Baseutils.geturl(driver, prop.getProperty("browser_url"));
		HomepageObjects hp=new HomepageObjects(driver);
		hp.logonclick().click();
		LoginPageObjects lp1=new LoginPageObjects(driver);
		lp1.username().sendKeys(prop.getProperty("emailid"));
		lp1.password().sendKeys(prop.getProperty("password"));
		lp1.submit().click();
		hp.logoutclick().click();
		
	}
	

}
