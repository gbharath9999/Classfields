package com.chiselon.classifieds.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class Xcel_PostAd extends Baseutils
{
	@Test
	public void post() throws Exception
	{
	String file ="C:\\Users\\sampa\\manasaProject\\Classifieds\\data.xlsx";
	Exceldata(file, "login");
	
	String newAd = sheet.getRow(10).getCell(4).toString();
    String TwoWheeler = sheet.getRow(11).getCell(4).toString();
    String plus_path = sheet.getRow(12).getCell(4).toString();
    
    String Title = sheet.getRow(13).getCell(4).toString();
    String Name = sheet.getRow(16).getCell(4).toString();
    
    String descrip = sheet.getRow(14).getCell(4).toString();
    String intro = sheet.getRow(17).getCell(4).toString();	
    
    String regist = sheet.getRow(15).getCell(4).toString();	
    
    String photo_opt = sheet.getRow(13).getCell(6).toString();
    String choose_file = sheet.getRow(14).getCell(6).toString();
    String upload_opt =sheet.getRow(15).getCell(6).toString();
    String finishAd_opt = sheet.getRow(16).getCell(6).toString();
    
    
    Xcel_Login.login();
    System.out.println("logged in successfully");
    
    press(newAd);
    press(plus_path);
    press(TwoWheeler);
    send(Title,Name);
    send(descrip,intro);
    press(regist);
    press(photo_opt);
	System.out.println("opened photo");
	press(choose_file);
	System.out.println("click file location");
	
    
    String path = "C:\\Users\\sampa\\Desktop\\download (1).jpg";
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
