package com.chiselon.classifieds.pages;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class SelectAnAd extends Baseutils
{
	@Test
	public void select() throws Exception
	{
		String front_xpath = sheet.getRow(30).getCell(4).toString();
	    String categories_xpath = sheet.getRow(31).getCell(4).toString();
	    String automobile = sheet.getRow(32).getCell(4).toString();
	    String wheeler =sheet.getRow(33).getCell(4).toString();
		String name = sheet.getRow(34).getCell(4).toString();
	
		Xcel_Login.login();
	    System.out.println("logged in successfully");
	    
	    press(front_xpath);
	    press(categories_xpath);
	    press(automobile);
	    press(wheeler);
	    press(name);
		
	}

	
}
