package testingbaba_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.list.SetUniqueList;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Loginpage;

public class WindowHandle extends Baselibrary
{

	Loginpage ob;
	@BeforeClass
	public void getLunchUrL_testingbaba()
	{
		getLunchURL("https://testingbaba.com/old/");
		ob= new Loginpage();
	}
	
	@Test(priority = 0)
	public void getTitle_testingbaba()
	{
		ob.getTitle_testingbaba();
	}
	@Test(priority = 1)
	public void clickonclosebtn() throws InterruptedException 
	{ 
		Thread.sleep(1000);
		ob.clickonclosebtn();
}
	@Test(priority = 2)
	
	public void clickonpracticebtn() 
	{
		ob.clickonpracticebtn();

		}
    
@Test(priority = 4)
	
	public void clickonAlertsbtn() 
	{
		ob.clickonAlertsbtn();

		}
@Test(priority = 5)

public void clickonAlerts() throws InterruptedException 
{
	ob.clickonAlerts();

	driver.findElement(By.xpath("//a[text()=\"browser windows\"]")).click();
	Thread.sleep(1000);
	
     driver.findElement(By.xpath("//a[@href=\"https://www.google.co.in/\"]")).click();
       Set<String>	handle=driver.getWindowHandles();
       List<String> listhandle=new ArrayList<>(handle);
       driver.switchTo().window(listhandle.get(1));
       driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys("hi");
       
	}
//@Test(priority = 6)
//public void clickonPromtbtn() throws InterruptedException
//{
//	ob.clickonPromtbtn();
//	Thread.sleep(5000);
//	driver.switchTo().alert().sendKeys("harshit");
//	driver.switchTo().alert().accept();
//}

//public void clickonConfirmbox() 
//{
//	ob.clickonConfirmbox();
//	driver.switchTo().alert().dismiss();
//}
//public void clickonClickbtn() 
//{
//	ob.clickonClickbtn();
//	driver.switchTo().alert().accept();
//}
}
