package com.chiselon.classifieds.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class Xcel_editAd extends Baseutils
{ 
	@Test
	public static void Xcel_edit() throws Exception
	{
		String file ="C:\\Users\\sampa\\manasaProject\\Classifieds\\data.xlsx";
		Exceldata(file, "login");
		
		String edit_ad = sheet.getRow(20).getCell(4).toString();
	    String photo_opt = sheet.getRow(22).getCell(4).toString();
	    String choose_file = sheet.getRow(23).getCell(4).toString();
	    String upload_opt = sheet.getRow(24).getCell(4).toString();
	    String finishAd_opt = sheet.getRow(25).getCell(4).toString();		
		
	    Xcel_Login.login();
	    System.out.println("logged in successfully");
	    
		press(edit_ad);
		System.out.println("opened edit an ad page");
		press(photo_opt);
		System.out.println("opened photo");
		press(choose_file);
		System.out.println("click file location");
		
		String path = "C:\\Users\\sampa\\Desktop\\images (1).jpg";
		StringSelection sel = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		Robot robo = new Robot();		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	
		press(upload_opt);
		System.out.println("clicked on upload button");
		
		press(finishAd_opt);	
		System.out.println("upload sucessfully");
		}
}
