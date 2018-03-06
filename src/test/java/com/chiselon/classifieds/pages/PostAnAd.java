package com.chiselon.classifieds.pages;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

 public class  PostAnAd extends Baseutils
 {
		@Test
		public void newAd() throws Exception
		{
			prop = Testprop();
			Login.login();
			press(prop.getProperty("newAd"));
			System.out.println("opened post an ad page");
			//press(prop.getProperty("Auto-xpath"));
			press(prop.getProperty("plus-xpath"));
			press(prop.getProperty("4Wheeler"));
			System.out.println("clicked on subpage");
			send(prop.getProperty("Title"),prop.getProperty("Name"));
			System.out.println("title entered");
			send(prop.getProperty("descript"),prop.getProperty("intro"));
			System.out.println("description of ad given");
			press(prop.getProperty("regist"));
		}
				
			
 }

