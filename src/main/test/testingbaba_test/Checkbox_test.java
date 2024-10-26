package testingbaba_test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.Checkbox_pages;
import testingbaba_pages.Loginpage;
import testingbaba_pages.Practice_testbox;

public class Checkbox_test extends Baselibrary
{

	Loginpage ob;
	Practice_testbox pt;
	Checkbox_pages ct;
	@BeforeClass
	public void getLunchUrL_testingbaba() throws IOException
	{
		getLunchURL("https://testingbaba.com/old/");
		ob= new Loginpage();
		pt= new Practice_testbox();
		ct=new Checkbox_pages();
	}
	@Test(priority = 0)
	public void getTitle_testingbaba()
	{
		ob.getTitle_testingbaba();
	}
	@Test(priority = 1)
	public void clickonclosebtn() throws InterruptedException 
	{ Thread.sleep(1000);
		
		ob.clickonclosebtn();
	}
	@Test(priority = 2)
	public void clickonpracticebtn() throws InterruptedException 
	{Thread.sleep(1000);
	    ob.clickonpracticebtn();	
	}
	
	@Test(priority = 3)
	public void clickonelements() throws InterruptedException
	{Thread.sleep(1000);
	    pt.clickonelements();
	}
	@Test(priority = 4)
	public void clickoncheckboxbtn() throws InterruptedException 
	{  Thread.sleep(1000);
		ct.clickoncheckboxbtn();
	}
	@Test(priority = 5)
	public void selectmobilebtn() throws InterruptedException 
	{  Thread.sleep(1000);
		ct.selectmobilebtn();
	}
	@Test(priority = 6)
	public void selectlaptopbtn() throws InterruptedException 
	{   Thread.sleep(1000);
		ct.selectlaptopbtn();
	}
	@Test(priority = 7)
	public void selectdesktopbtn() throws IOException 
	{  
		ct.selectdesktopbtn(); 

	}
}
