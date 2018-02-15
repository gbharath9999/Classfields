package com.chiselon.colourclassifieds.pages;

import org.testng.annotations.Test;

import com.chiselon.colourclassifieds.utilites.BaseUtil;

public class RegistrationPage extends BaseUtil
{
	
		@Test    
		public void registration() throws Exception
		{
			
		
		
		
			RegistrationPage registration =new RegistrationPage();
			registration.loadProperties("E:\\chiselon\\workspace_24-jan-2018\\colourclassifieds\\src\\test\\java\\com\\chiselon\\colourclassifieds\\properties\\Config.properties");
			//d.loadProperties(pro.getProperty("properties_filepath"));
			registration.OpenBroswers(pro.getProperty("broswer_type"));
			registration.getUrl(driver,pro.getProperty("colourClassifiedsUrl"));
			registration.click(driver,pro.getProperty( "registration_xpathvalue"));
			registration.sendKeys(driver,pro.getProperty( "emailid_xpathValue"),pro.getProperty( "emailid_sendkeysData"));
			registration.sendKeys(driver,pro.getProperty( "fullname_xpathValue"),pro.getProperty( "fullname_sendkeysData"));
			registration.sendKeys(driver, pro.getProperty("password_xpathValue"),pro.getProperty( "password_sendkeysData")); 
			registration.sendKeys(driver, pro.getProperty("conformpassword_xpathValue"),pro.getProperty( "conformpassword_sendkeysData"));
			registration.click(driver,"agreeCondition_xpathValue");
			registration.closeBroswer(driver);
		
		
		
		
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
}
