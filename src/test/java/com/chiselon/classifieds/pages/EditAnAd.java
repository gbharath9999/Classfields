package com.chiselon.classifieds.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class EditAnAd extends Baseutils
{
	@Test
	public void edit() throws Exception 
	{
		prop = Testprop();
		Login.login();
		
		press(prop.getProperty("edit-xpath"));
		System.out.println("opened edit an ad page");
		
		press(prop.getProperty("pictgif-xpath"));
		System.out.println("opened photo");
		
		press(prop.getProperty("choose-file"));
		System.out.println("click file location");
		
		String path = "C:\\Users\\sampa\\Desktop\\jeeeppppp.jpg";
		StringSelection sel = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		press(prop.getProperty("upload-xpath"));
		press(prop.getProperty("finish-xpath"));
		System.out.println("upload sucessfully");
	}
}
