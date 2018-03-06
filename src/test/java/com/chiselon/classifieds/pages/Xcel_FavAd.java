package com.chiselon.classifieds.pages;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class Xcel_FavAd extends Baseutils
{
	@Test
	public void FavoriteAD() throws Exception
	{
	String file ="C:\\Users\\sampa\\manasaProject\\Classifieds\\data.xlsx";
	Exceldata(file, "login");
	
	String latestAD = sheet.getRow(47).getCell(1).toString();
    String Adpath = sheet.getRow(48).getCell(1).toString();
    String add2_xpath = sheet.getRow(49).getCell(1).toString();
    String myfav_xpath = sheet.getRow(50).getCell(1).toString();
	
    Xcel_Login.login();
    System.out.println("logged in successfully");
    
    press(latestAD);
    press(Adpath);
    press(add2_xpath);
    press(myfav_xpath);
    
	
	}
}
    
    
    
    
    