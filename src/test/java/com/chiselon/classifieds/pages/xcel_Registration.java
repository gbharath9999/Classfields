package com.chiselon.classifieds.pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class xcel_Registration extends Baseutils
{
	@Test
	public void registration() throws Exception
	{
		String file ="C:\\Users\\sampa\\manasaProject\\Classifieds\\data.xlsx";
		Exceldata(file, "login");
		
		String browswer_path = sheet.getRow(20).getCell(1).toString();
		String url_path = sheet.getRow(23).getCell(1).toString();
		String register_opt = sheet.getRow(24).getCell(1).toString();
	    
		String email$path = sheet.getRow(25).getCell(1).toString();
	    String email$value = sheet.getRow(31).getCell(1).toString();

	    String fullname_path = sheet.getRow(26).getCell(1).toString();
	    String fullname_value = sheet.getRow(32).getCell(1).toString();
	    
	    String password_path = sheet.getRow(27).getCell(1).toString();
	    String password_value = sheet.getRow(33).getCell(1).toString();

	    String confrim_password = sheet.getRow(28).getCell(1).toString();
	    String password_confirm = sheet.getRow(34).getCell(1).toString();			

	    
	    String Agree_path = sheet.getRow(29).getCell(1).getStringCellValue();
		String submit = sheet.getRow(30).getCell(1).toString();
		
	    openbrowser(browswer_path);
	    driver.get(url_path);
		press(register_opt);
		System.out.println("opened register page");
		send(email$path,email$value);//email
		System.out.println("email adress passed");
		send(fullname_path,fullname_value);//full name
		System.out.println("fullname passed");
		send(password_path,password_value);//password
		System.out.println("password passed");
		send(confrim_password,password_confirm);//confrmPassword
		System.out.println("confrimpassword passed");
		press(Agree_path);//agree
		System.out.println("Agree condition clicked");
		press(submit);//register--submit
		System.out.println("Registered sucessfully");
	}
}
