package com.chiselon.classifieds.pages;
import org.testng.annotations.Test;

import com.chiselon.classifieds.pages.Xcel_Login;
import com.chiselon.classifieds.utilities.Baseutils;

public class Xcel_browseAds extends Baseutils
{
	@Test
	public void BrowseAd() throws Exception
	{
	String file ="C:\\Users\\sampa\\manasaProject\\Classifieds\\data.xlsx";
	Exceldata(file, "login");
		
	String Browse_Ad = sheet.getRow(38).getCell(1).toString();
	
	Xcel_Login.login();
    System.out.println("logged in successfully");
    
    press(Browse_Ad);
    
    }

}
