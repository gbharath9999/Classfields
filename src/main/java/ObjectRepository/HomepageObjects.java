package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageObjects
{
	public WebDriver driver;

	By logon=By.xpath("//a[text()='Log in']");
	By logout= By.xpath("//a[text()='Log out']");
	
	public HomepageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public WebElement logonclick()
	{
		return driver.findElement(logon);
		
	}
	
	public WebElement logoutclick()
	{
		return driver.findElement(logout);
	}
	
}
