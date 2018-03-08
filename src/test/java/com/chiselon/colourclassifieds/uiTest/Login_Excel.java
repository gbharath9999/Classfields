package com.chiselon.colourclassifieds.uiTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.chiselon.colourclassifieds.utilites.BaseUtil;

public class Login_Excel extends BaseUtil
{
	//static WebDriver driver;
	@Test
	public static void login() {
		// TODO Auto-generated method stub
	
		String filepath = "E:\\chiselon\\workspace_24-jan-2018\\colourclassifieds\\TestData.xlsx";
		BaseUtil.excel(filepath, "sheet1");
		String Login_username = sheet.getRow(14).getCell(1).toString();
		String Login_password = sheet.getRow(15).getCell(1).toString();
		String broswer_type = sheet.getRow(2).getCell(1).toString();
		String colourClassifiedsUrl = sheet.getRow(1).getCell(1).toString();
		String login_xpathvalue = sheet.getRow(16).getCell(1).toString();
		String login_username_xpathvalue = sheet.getRow(17).getCell(1).toString();
		String login_password_xpathValue = sheet.getRow(18).getCell(1).toString();
		String Login_username_Data = sheet.getRow(14).getCell(1).toString();
		String Login_password_Data = sheet.getRow(15).getCell(1).toString();
		String login_loginButton = sheet.getRow(19).getCell(1).toString();
		

		BaseUtil.OpenBroswers(broswer_type);
		BaseUtil.getUrl(driver, colourClassifiedsUrl);
		BaseUtil.click(driver, login_xpathvalue);
		BaseUtil.sendKeys(driver, login_username_xpathvalue, Login_username_Data);
		BaseUtil.sendKeys(driver, login_password_xpathValue, Login_password_Data);
		BaseUtil.click(driver,login_loginButton);
		
	
	
	
	}
}