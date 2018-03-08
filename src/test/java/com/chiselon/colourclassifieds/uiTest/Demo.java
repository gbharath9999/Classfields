package com.chiselon.colourclassifieds.uiTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.chiselon.colourclassifieds.utilites.BaseUtil;

public class Demo extends BaseUtil
{
	@Test
	public void table() throws Exception 
	{
		Login_Excel.login();
		BaseUtil.click(driver, "//a[@title='Front page']");
		/*WebElement a = driver.findElement(By.xpath("(//table)[7]"));
		String text = a.getText();
		System.out.println(text);*/
		int size = driver.findElements(By.xpath("(//td[@class='category']/a)")).size();
		System.out.println(size);
		
		for(int i=1 ; i<=size ; i++ )
		{
			String textvalue = driver.findElement(By.xpath("(//td[@class='category']/a)["+i+"]")).getText();
			//System.out.println(textvalue);	
			if(textvalue.trim().equalsIgnoreCase("Business-Related (1)"))
			{
				BaseUtil.click(driver,"(//td[@class='category']/a)["+i+"]");
				break;
			}
				Thread.sleep(5000);
				driver.navigate().back();
		}
	
	
	
	}
}
