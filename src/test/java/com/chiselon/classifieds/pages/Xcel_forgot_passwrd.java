package com.chiselon.classifieds.pages;

import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class Xcel_forgot_passwrd extends Baseutils 
{
	@Test
	public static void change() throws Exception
	{
		String file ="C:\\Users\\sampa\\manasaProject\\Classifieds\\data.xlsx";
		Exceldata(file, "login");
		
		String browser = sheet.getRow(6).getCell(1).getStringCellValue();
		String url = sheet.getRow(9).getCell(1).getStringCellValue();
		
		String email_path = sheet.getRow(55).getCell(1).toString();
	    String email_value = sheet.getRow(56).getCell(1).toString();
		String login_opt = sheet.getRow(1).getCell(1).getStringCellValue();
	    
	    String send_2_path = sheet.getRow(57).getCell(1).toString();
	   
	    openbrowser(browser);
		System.out.println("browser opend");
		driver.get(url);
		press(login_opt);
		System.out.println("opened login page");
		
		System.out.println("opened site sucessfully");
		send(email_path,email_value);//email address
		System.out.println("email-id passed");
		press(send_2_path);//button
		System.out.println("send to me clicked");
		
	}
	

}
