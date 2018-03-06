package com.chiselon.classifieds.pages;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.chiselon.classifieds.utilities.Baseutils;

public class Xcel_Login extends Baseutils
{
	@Test
	public static void login() throws Exception
	{
		String file ="C:\\Users\\sampa\\manasaProject\\Classifieds\\data.xlsx";
		Exceldata(file, "login");
		
		String browser = sheet.getRow(6).getCell(1).getStringCellValue();
		String url = sheet.getRow(9).getCell(1).getStringCellValue();
		String login_opt = sheet.getRow(1).getCell(1).getStringCellValue();
		String email_xpath = sheet.getRow(2).getCell(1).getStringCellValue();
		String email_value = sheet.getRow(10).getCell(1).getStringCellValue();
		String password_xpath = sheet.getRow(3).getCell(1).getStringCellValue();
		String password_value = sheet.getRow(11).getCell(1).getStringCellValue();
		String submit = sheet.getRow(4).getCell(1).getStringCellValue();
		
		openbrowser(browser);
		System.out.println("browser opend");
		driver.get(url);
		System.out.println("opened site sucessfully");
		press(login_opt);
		System.out.println("opened login page");
		send(email_xpath,email_value);//email
		System.out.println("email passed");
		send(password_xpath,password_value);//Password
		System.out.println("password passed");
		press(submit);//login--submit
		System.out.println("login sucessfully");
	}
	
}
