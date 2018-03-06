package com.chiselon.classifieds.pages;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class FavAd extends Baseutils
{
	@Test
	public void fav() throws Exception
	{
		prop = Testprop();
		
		Login.login();
		System.out.println("login succesfully");
		
		press(prop.getProperty("myfav-xpath"));
			
	}
	

}
