package com.chiselon.colourclassifieds.pages;



import org.testng.annotations.Test;

import com.chiselon.colourclassifieds.utilites.BaseUtil;

public class RegistrationPage extends BaseUtil
{
	
	
	public static String colourClassifiedsUrl="http://localhost/colour/";
	public static String broswer_type="chrome";
	public static String registration_xpathvalue="//td[@id='register']/a";
	public static String emailid_xpathValue="//input[@id='email']";
	public static String emailid_sendkeysData="rashikanna@gmail.com";
	public static String fullname_xpathValue="//input[@name='name']";
	public static String fullname_sendkeysData="rashi kanna"; 
	public static String password_xpathValue="//input[@name='passwd']";
	public static String password_sendkeysData="abc@123456";
	public static String conformpassword_xpathValue="//input[@name='passwd2']";
	public static String conformpassword_sendkeysData="abc@123456";
	public static String agreeCondition_xpathValue="(//input[@type='checkbox'])[3]";
	public static String registerbutton_xpathValue="//input[@value='Register']";
	public static String properties_filepath="E:\\chiselon\\workspace_24-jan-2018\\colourclassifieds\\src\\test\\java\\com\\chiselon\\colourclassifieds\\properties\\Config.properties";
	
		@Test    
		public void registration() throws Exception
		{
			
			RegistrationPage registration =new RegistrationPage();
			registration.loadProperties("E:\\chiselon\\workspace_24-jan-2018\\colourclassifieds\\src\\test\\java\\com\\chiselon\\colourclassifieds\\properties\\Config.properties");
			//d.loadProperties(pro.getProperty("properties_filepath"));
			registration.OpenBroswers(broswer_type);
			registration.getUrl(driver,colourClassifiedsUrl);
			registration.click(driver,registration_xpathvalue);
			registration.sendKeys(driver,emailid_xpathValue,emailid_sendkeysData);
			registration.sendKeys(driver,fullname_xpathValue,fullname_sendkeysData);
			registration.sendKeys(driver,password_xpathValue,password_sendkeysData); 
			registration.sendKeys(driver,conformpassword_xpathValue,conformpassword_sendkeysData);
			registration.click(driver,agreeCondition_xpathValue);
			Thread.sleep(5000);
			registration.closeBroswer(driver);
		
		}
    	
    	
}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
